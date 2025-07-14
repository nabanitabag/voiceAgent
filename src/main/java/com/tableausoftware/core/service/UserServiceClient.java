package com.tableausoftware.core.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tableausoftware.core.constants.APIRoutes;
import com.tableausoftware.core.dto.request.ImportExternalUsersRequest;
import com.tableausoftware.core.dto.response.ImportExternalUsersResponse;
import io.restassured.RestAssured;
import com.tableausoftware.core.model.*;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import java.util.*;

import static com.tableausoftware.core.constants.APIRoutes.*;
import static com.tableausoftware.core.model.PatchUserSiteRoleDTO.IdpEnum.TABLEAUIDWITHMFA;

@Component
public class UserServiceClient {

    private static final ObjectMapper OBJECT_MAPPER;
    private static final String IMPORT_EXTERNAL_USERS_ENDPOINT = "/vizportal/api/web/v1/importExternalUsers";
    private final UUID tenantId = UUID.fromString("f83bf730-8e51-4f56-928d-d6fd0c409485");
    private final UUID siteId = UUID.fromString("3cefc306-e72c-4ec3-9a45-d792616f31de");
    private String baseURL = "https://gateway-user-us-west-2.link-test.manage.online.dev.tabint.net";
    private String siteBaseURL = "https://10az.online.tableau.com/vizportal/api/web/v1/importExternalUsers";
    private String cookie = "X-Tableau-Auth-Cookie=QdssdLcXOABLt8uxh9cfR6ALfVUVN0UT82iRQ3GSnkU; " +
            "X-Tableau-Session-Id=46cb6ca5-ebf0-4848-98b8-f54cfed879f2; X-CSRF-Auth-Cookie=cR0gKCKXXtSuFw8__d9y_jUkc0RWHzblFAUD8Td-UIY;" +
            "JSESSIONID=D2A69C48C502AEC876ACCBA74ACCCB4B";
    private String csrfAuth = "cR0gKCKXXtSuFw8__d9y_jUkc0RWHzblFAUD8Td-UIY";

    public Map<String, String> getHeaders() {
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("cookie", cookie);
        headersMap.put("X-Csrf-Auth", csrfAuth);
        headersMap.put("Content-Type", "application/json");
        return headersMap;
    }

    public Map<String, String> getVPCHeaders() {
        Map<String, String> headers = new HashMap<>();

        headers.put("accept", "application/json, text/plain, */*");
        headers.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
        headers.put("content-type", "application/json;charset=UTF-8");
        headers.put("origin", "https://10az.online.tableau.com");
        headers.put("priority", "u=1, i");
        headers.put("referer", "https://10az.online.tableau.com/");
        headers.put("sec-ch-ua", "\"Google Chrome\";v=\"137\", \"Chromium\";v=\"137\", \"Not/A)Brand\";v=\"24\"");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("sec-ch-ua-platform", "\"macOS\"");
        headers.put("sec-fetch-dest", "empty");
        headers.put("sec-fetch-mode", "cors");
        headers.put("sec-fetch-site", "same-origin");
        headers.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        headers.put("x-xsrf-token", "4aohnp8xQSDXxyjSIinJppuTisZLBLR8");
        headers.put("cookie", "_gcl_au=1.1.957605565.1750839425.1381373366.1750839430.1750839439; OptanonConsent=isGpcEnabled=0&datestamp=Wed+Jun+25+2025+13%3A47%3A19+GMT%2B0530+(India+Standard+Time)&version=202401.2.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=c87ef241-8c44-4cbb-b3c5-8f4bdda9b096&interactionCount=1&landingPath=https%3A%2F%2Fidentity.idp.tableau.com%2Flogin%3Fstate%3DhKFo2SA2TDltOFFFdHl3bl9nWnlqOVlZSlRzTlU3UkJQY0R3eKFupWxvZ2luo3RpZNkgNzVUalVIR2tRb0h4akxJMFp3TTlNNTRiSEhDd0JRa06jY2lk2SA1TFozVENJd1B6dFJrdUhUdWtrTEpvY0FncHIwdWFtMg%26client%3D5LZ3TCIwPztRkuHTukkLJocAgpr0uam2%26protocol%3Doauth2%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520email%26redirect_uri%3Dhttps%253A%252F%252Fsso.online.tableau.com%252Fpublic%252Foidc%252Flogin%26nonce%3DhA5Lg1iZi9JWMTYV-WKws-csrBXupCd6F1o4V1dUoYk%26login_hint%3Dhemesh.gupta%2540salesforce.com&groups=1%3A1%2C3%3A1%2C2%3A1%2C4%3A1; workgroup_session_id=Qt_G2DQ_Tty10DAVxbO0ow|BJAdHjXmB31ed5z496W8kPd2WtnAikU9|68109078-6239-4a7b-b6ed-38d416293e45; XSRF-TOKEN=4aohnp8xQSDXxyjSIinJppuTisZLBLR8");
        return headers;
    }

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    public Response fireCreateUserAndReturnOnJobSuccess(CreateUserRequestDTO createUserRequestDTO) {
        return RestAssured.given()
                .headers(getHeaders())
                .contentType("application/json")
                .body(createUserRequestDTO)
                .log().ifValidationFails()
                .when()
                .post(baseURL + String.format(USERS_V1, tenantId))
                .then()
                .log().ifValidationFails()
                .extract()
                .response();
    }

    public List<UserDTO> getUsers() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("excludeRoles", "false");

//        RequestSpecification requestSpecification = RestAssured.given();
//        // Add query parameters
//        if (queryParams != null && !queryParams.isEmpty()) {
//            requestSpecification.queryParams(queryParams);
//        }
//
//        Response response = requestSpecification.get(baseURL);
//
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // JavaTimeModule to parse Java Date Time Format of attributes in response
//            objectMapper.registerModule(new JavaTimeModule());
//
//            return objectMapper.readValue(response.getBody().asString(),  GetUsersResponseDTO.class);
//        } catch (Exception e) {
//            throw new ParsingException(e.getMessage());
//        }

        return RestAssured.given()
                .headers(getHeaders())
                .queryParams(queryParams)
                .contentType("application/json")
                .log().ifValidationFails()
                .when()
                .get(baseURL + String.format(USERS_V1, tenantId))
                .then()
                .log().ifValidationFails()
                .extract()
                .response()
                .as(GetUsersResponseDTO.class).getUsers();
    }

    public Response getUserByUserName(String userName) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("excludeRoles", "true");
        queryParams.put("userName", userName);

        return RestAssured.given()
                .headers(getHeaders())
                .queryParams(queryParams)
                .contentType("application/json")
                .log().ifValidationFails()
                .when()
                .get(baseURL + String.format(USERS_V1, tenantId))
                .then()
                .log().ifValidationFails()
                .extract()
                .response();
    }

    public Response fireDeleteUser(UUID userId) {
        return RestAssured.given()
                .headers(getHeaders())
                .contentType("application/json")
                .log().ifValidationFails()
                .when()
                .delete(baseURL + String.format(USERS_BY_ID_V1, tenantId, userId))
                .then()
                .log().ifValidationFails()
                .extract()
                .response();
    }

    public BulkUserOpDetails pollJobAndReturnOnCompletion(int timeBetweenPollsInMs,
                                                          int maxPollsAllowed,
                                                          UUID jobId) throws JsonProcessingException {
        if (jobId == null) {
            return null;
        }
        int idx = 1;
        while (idx <= maxPollsAllowed) {
            try {
                Thread.sleep(timeBetweenPollsInMs);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Polling job status for : " + jobId);
            String serverUrl = baseURL + String.format(BULK_USER_OPERATION_DETAILS_V1, jobId) + "?showDetailed=True";
            Response response = RestAssured.given().headers(getHeaders()).when().get(serverUrl).then().statusCode(200).extract().response();
            BulkUserOpDetails jobDetails = OBJECT_MAPPER.readValue(response.getBody().asString(), BulkUserOpDetails.class);
            if (List.of(BulkUserOpDetails.StatusEnum.FAILED, BulkUserOpDetails.StatusEnum.SUCCESSFUL).contains(jobDetails.getStatus())) {
                return jobDetails;
            }
            idx++;
        }
        System.out.println("Polled job for max number of times configured. Job is still running! JobId :" + jobId);
        return null;
    }

    public Response fireUpdateUserAndReturnOnJobSuccess(UUID userId, UUID siteId){
        //com.tableau.userservice.exceptions.DbConcurrentModificationException","exception_message":"Transaction cancelled, please refer cancellation reasons for specific reasons [ConditionalCheckFailed, None] (Service: DynamoDb, Status Code: 400, Request ID: KNV9JV9I357QSKIULN52PCV8VFVV4KQNSO5AEMVJF66Q9ASUAAJG)","stacktrace":"com.tableau.userservice.exceptions.DbConcurrentModificationException: Transaction cancelled, please refer cancellation reasons for specific reasons [ConditionalCheckFailed, None] (Service: DynamoDb, Status Code: 400, Request ID: KNV9JV9I357QSKIULN52PCV8VFVV4KQNSO5AEMVJF66Q9ASUAAJG)\n\tat com.tableau.userservice.repository.DdbUserRepo.executeTxWithMultipleItemTypes(DdbUserRepo.java:1041)\n\tat com.tableau.u
        PatchUserRequestDTO patchUserRequest = new PatchUserRequestDTO();
        patchUserRequest.setSiteRoles(List.of(
                preparePatchSiteRoleRequest(siteId, PatchUserSiteRoleDTO.SiteOpEnum.DELETE_SITE_ROLE)));
        return RestAssured.given()
                .headers(getHeaders())
                .contentType("application/json")
                .body(patchUserRequest)
                .when()
                .patch(baseURL + String.format(APIRoutes.USERS_BY_ID_V1, tenantId, userId))
                .then()
                .extract()
                .response();
    }

    /**
     * Import external users using the Tableau vizportal API
     * @param userNames List of usernames to import
     * @param siteRole The site role to assign (e.g., "ExplorerCanPublish", "Explorer", "Viewer")
     * @param authSetting The authentication setting (e.g., "TABID_WITH_MFA", "SAML", "OpenID")
     * @return ImportExternalUsersResponse containing the result of the import operation
     * @throws JsonProcessingException if there's an error processing JSON
     */
    public ImportExternalUsersResponse importExternalUsers(List<String> userNames,
                                                          String siteRole, 
                                                          String authSetting) throws JsonProcessingException {
        
        // Create the request parameters
        ImportExternalUsersRequest.ImportParams params = new ImportExternalUsersRequest.ImportParams();
        params.setUserNames(userNames);
        params.setSiteRole(siteRole);
        params.setAuthSetting(authSetting);
        
        // Create the request body
        ImportExternalUsersRequest request = new ImportExternalUsersRequest();
        request.setMethod("importExternalUsers");
        request.setParams(params);
        
        return RestAssured.given()
                .headers(getVPCHeaders())
                .contentType("application/json;charset=UTF-8")
                .body(request)
                .log().ifValidationFails()
                .when()
                .post(siteBaseURL + IMPORT_EXTERNAL_USERS_ENDPOINT)
                .then()
                .log().ifValidationFails()
                .extract()
                .response()
                .as(ImportExternalUsersResponse.class);
    }

    /**
     * Convenience method to import a single external user
     *
     * @param userName The username to import
     * @param siteRole The site role to assign
     * @param authSetting The authentication setting
     * @return ImportExternalUsersResponse containing the result of the import operation
     * @throws JsonProcessingException if there's an error processing JSON
     */
    public ImportExternalUsersResponse importExternalUser(String userName,
                                                         String siteRole, 
                                                         String authSetting) throws JsonProcessingException {
        return importExternalUsers(Arrays.asList(userName), siteRole, authSetting);
    }

    public static PatchUserSiteRoleDTO preparePatchSiteRoleRequest(UUID siteId, PatchUserSiteRoleDTO.SiteOpEnum siteOp) {
        PatchUserSiteRoleDTO patchUserSiteRoleDTO = new PatchUserSiteRoleDTO();
        patchUserSiteRoleDTO.setSiteId(siteId);
        patchUserSiteRoleDTO.setNotifyUser(true);
        patchUserSiteRoleDTO.setSiteOp(siteOp);
        return patchUserSiteRoleDTO;
    }
}
