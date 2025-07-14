package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * Detailed status of each operation
 */

@Schema(name = "UserOperationDetailedResponse", description = "Detailed status of each operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserOperationDetailedResponse {

  private String email;

  /**
   * idp under creation/update
   */
  public enum IdpEnum {
    SAML("SAML"),
    
    OPENID("OpenID"),
    
    TABLEAUIDWITHMFA("TableauIDWithMFA"),
    
    DEFAULT("DEFAULT");

    private String value;

    IdpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdpEnum fromValue(String value) {
      for (IdpEnum b : IdpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdpEnum idp;

  private String idpConfigurationId;

  private String lineNumber;

  /**
   * linkRole under creation/update/deletion
   */
  public enum LinkRoleEnum {
    LINK_ADMIN("LINK_ADMIN");

    private String value;

    LinkRoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LinkRoleEnum fromValue(String value) {
      for (LinkRoleEnum b : LinkRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LinkRoleEnum linkRole;

  /**
   * response code of the operation
   */
  public enum OpCodeEnum {
    USER_CREATED_WITH_ASSIGNED_ROLE("USER_CREATED_WITH_ASSIGNED_ROLE"),
    
    USER_CREATED_WITH_ASSIGNED_UNLICENSED("USER_CREATED_WITH_ASSIGNED_UNLICENSED"),
    
    USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED("USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED"),
    
    USER_ADDED_WITH_ASSIGNED_ROLE("USER_ADDED_WITH_ASSIGNED_ROLE"),
    
    USER_ADDED_WITH_ASSIGNED_UNLICENSED("USER_ADDED_WITH_ASSIGNED_UNLICENSED"),
    
    USER_ADDED_AS_UNLICENSED("USER_ADDED_AS_UNLICENSED"),
    
    SITE_ROLE_ASSIGNED("SITE_ROLE_ASSIGNED"),
    
    USER_ROLE_UNCHANGED_GLSI_MIN_ROLE("USER_ROLE_UNCHANGED_GLSI_MIN_ROLE"),
    
    USER_ROLE_UNCHANGED_SITE_LICENSE_EXHAUSTED("USER_ROLE_UNCHANGED_SITE_LICENSE_EXHAUSTED"),
    
    USER_IDP_UPDATED("USER_IDP_UPDATED"),
    
    USER_INVALID_AUTHENTICATION_SETTING("USER_INVALID_AUTHENTICATION_SETTING"),
    
    SITE_ROLE_REMOVED_USER_DELETED("SITE_ROLE_REMOVED_USER_DELETED"),
    
    SITE_ROLE_REMOVED("SITE_ROLE_REMOVED"),
    
    USER_UNLICENSED_OWNS_CONTENT("USER_UNLICENSED_OWNS_CONTENT"),
    
    USER_OR_ROLE_ALREADY_IN_EXPECTED_STATE("USER_OR_ROLE_ALREADY_IN_EXPECTED_STATE"),
    
    USER_CREATED_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED("USER_CREATED_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_UPON_RETRY_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED("USER_ADDED_UPON_RETRY_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_UPON_RETRY_AS_UNLICENSED_WITH_EMAIL_DISABLED("USER_ADDED_UPON_RETRY_AS_UNLICENSED_WITH_EMAIL_DISABLED"),
    
    USER_CREATED_WITH_ASSIGNED_UNLICENSED_WITH_EMAIL_DISABLED("USER_CREATED_WITH_ASSIGNED_UNLICENSED_WITH_EMAIL_DISABLED"),
    
    USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED_WITH_EMAIL_DISABLED("USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED("USER_ADDED_WITH_ASSIGNED_ROLE_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_DISPLAY_NAME_UPDATED_WITH_EMAIL_DISABLED("USER_ADDED_DISPLAY_NAME_UPDATED_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_WITH_ASSIGNED_UNLICENSED_WITH_EMAIL_DISABLED("USER_ADDED_WITH_ASSIGNED_UNLICENSED_WITH_EMAIL_DISABLED"),
    
    USER_ADDED_AS_UNLICENSED_WITH_EMAIL_DISABLED("USER_ADDED_AS_UNLICENSED_WITH_EMAIL_DISABLED"),
    
    USER_DISPLAY_NAME_UPDATED_WITH_EMAIL_DISABLED("USER_DISPLAY_NAME_UPDATED_WITH_EMAIL_DISABLED"),
    
    USER_DISPLAY_NAME_UPDATED_SITE_ROLE_ASSIGNED_WITH_EMAIL_DISABLED("USER_DISPLAY_NAME_UPDATED_SITE_ROLE_ASSIGNED_WITH_EMAIL_DISABLED"),
    
    SITE_ROLE_ASSIGNED_WITH_EMAIL_DISABLED("SITE_ROLE_ASSIGNED_WITH_EMAIL_DISABLED"),
    
    USER_EMAIL_UPDATED("USER_EMAIL_UPDATED"),
    
    USER_ADDED_WITH_ASSIGNED_ROLE_EMAIL_UPDATED("USER_ADDED_WITH_ASSIGNED_ROLE_EMAIL_UPDATED"),
    
    USER_SYSTEM_USER_WITH_EMAIL_ADDRESS_ALREADY_EXISTS("USER_SYSTEM_USER_WITH_EMAIL_ADDRESS_ALREADY_EXISTS"),
    
    USER_SITE_ROLE_UNCHANGED_EMAIL_UPDATED("USER_SITE_ROLE_UNCHANGED_EMAIL_UPDATED"),
    
    USER_SITE_ROLE_CHANGED_EMAIL_UPDATED("USER_SITE_ROLE_CHANGED_EMAIL_UPDATED"),
    
    USER_DISPLAY_NAME_ROLE_EMAIL_UPDATED("USER_DISPLAY_NAME_ROLE_EMAIL_UPDATED"),
    
    USER_DISPLAY_NAME_ROLE_UPDATED_EMAIL_UNCHANGED("USER_DISPLAY_NAME_ROLE_UPDATED_EMAIL_UNCHANGED"),
    
    USER_DISPLAY_NAME_UPDATED_ROLE_EMAIL_UNCHANGED("USER_DISPLAY_NAME_UPDATED_ROLE_EMAIL_UNCHANGED"),
    
    USER_SITE_ROLE_EMAIL_UNCHANGED("USER_SITE_ROLE_EMAIL_UNCHANGED"),
    
    USER_SITE_ROLE_UPDATED_EMAIL_UNCHANGED("USER_SITE_ROLE_UPDATED_EMAIL_UNCHANGED"),
    
    USER_CREATED_WITH_LINK_ROLE("USER_CREATED_WITH_LINK_ROLE"),
    
    LINK_ROLE_ADDED_TO_USER("LINK_ROLE_ADDED_TO_USER"),
    
    LINK_ROLE_UPDATED_IN_USER("LINK_ROLE_UPDATED_IN_USER"),
    
    LINK_ROLE_DELETED_FROM_USER("LINK_ROLE_DELETED_FROM_USER"),
    
    BAD_REQUEST("BAD_REQUEST"),
    
    NO_AUTHENTICATION_CREDENTIALS("NO_AUTHENTICATION_CREDENTIALS"),
    
    NOT_AUTHENTICATED("NOT_AUTHENTICATED"),
    
    FORBIDDEN("FORBIDDEN"),
    
    USER_NOT_SUPPORTED_GUEST_OPERATION("USER_NOT_SUPPORTED_GUEST_OPERATION"),
    
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED"),
    
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    
    USER_CANNOT_ASSIGN_UNLICENSED_ROLE("USER_CANNOT_ASSIGN_UNLICENSED_ROLE"),
    
    INVALID_SITE_ROLE("INVALID_SITE_ROLE"),
    
    DELETION_FAILED("DELETION_FAILED"),
    
    LICENSING_UPDATE_ON_SELF_FORBIDDEN("LICENSING_UPDATE_ON_SELF_FORBIDDEN"),
    
    SITE_NOT_FOUND("SITE_NOT_FOUND"),
    
    USER_NOT_FOUND("USER_NOT_FOUND"),
    
    GROUP_NOT_FOUND("GROUP_NOT_FOUND"),
    
    USE_CONFLICT("USE_CONFLICT"),
    
    USER_ASSET_CONFLICT("USER_ASSET_CONFLICT"),
    
    GUEST_USER_CONFLICT("GUEST_USER_CONFLICT"),
    
    LICENSING_CONFLICT("LICENSING_CONFLICT"),
    
    INTERNAL_ERROR("INTERNAL_ERROR"),
    
    DUPLICATE_RECORD("DUPLICATE_RECORD"),
    
    USER_CSV_PARAM_NOT_TEXT("USER_CSV_PARAM_NOT_TEXT"),
    
    USER_CSV_PARAMETER_TOO_LONG("USER_CSV_PARAMETER_TOO_LONG"),
    
    USER_INVALID_USER_NAME("USER_INVALID_USER_NAME"),
    
    INVALID_IDP("INVALID_IDP"),
    
    IDP_FIELDS_ARE_NULL("IDP_FIELDS_ARE_NULL"),
    
    MISSING_LINE_NUMBER("MISSING_LINE_NUMBER"),
    
    USER_INVALID_EMAIL_ADDRESS("USER_INVALID_EMAIL_ADDRESS"),
    
    USER_CSV_INVALID_LICENSE("USER_CSV_INVALID_LICENSE"),
    
    USER_CSV_INVALID_ADMIN_LEVEL("USER_CSV_INVALID_ADMIN_LEVEL"),
    
    USER_CSV_INVALID_PUBLISHER("USER_CSV_INVALID_PUBLISHER"),
    
    WRONG_PARAMS_FOR_ADMIN("WRONG_PARAMS_FOR_ADMIN"),
    
    WRONG_PARAMS_FOR_EXPLORER("WRONG_PARAMS_FOR_EXPLORER"),
    
    WRONG_PARAMS_FOR_VIEWER("WRONG_PARAMS_FOR_VIEWER"),
    
    WRONG_PARAMS_FOR_UNLICENSED("WRONG_PARAMS_FOR_UNLICENSED"),
    
    WRONG_PARAMS_FOR_LINK_ADMIN("WRONG_PARAMS_FOR_LINK_ADMIN"),
    
    INVALID_LICENSE_COMBINATION("INVALID_LICENSE_COMBINATION"),
    
    BLANK_CSV_RECORD("BLANK_CSV_RECORD"),
    
    LANGUAGE_LOCALE_UPDATED_IN_USER("LANGUAGE_LOCALE_UPDATED_IN_USER"),
    
    USER_SERVICE_NO_SITE_ROLE_FOUND("USER_SERVICE_NO_SITE_ROLE_FOUND"),
    
    USER_SERVICE_NO_SITE_ROLE_FOUND_FOR_SITEID("USER_SERVICE_NO_SITE_ROLE_FOUND_FOR_SITEID"),
    
    USER_SERVICE_SITE_ROLE_NOT_ACTIVE("USER_SERVICE_SITE_ROLE_NOT_ACTIVE"),
    
    USER_SERVICE_UNKNOWN_REQUEST("USER_SERVICE_UNKNOWN_REQUEST"),
    
    USER_SERVICE_AUTHENTICATION_SETTING_DISABLED("USER_SERVICE_AUTHENTICATION_SETTING_DISABLED"),
    
    USER_SERVICE_USER_CREATE_UPDATE_WITH_BLOCKED_EMAIL_DOMAIN("USER_SERVICE_USER_CREATE_UPDATE_WITH_BLOCKED_EMAIL_DOMAIN"),
    
    E_400_USR_SVC_2006("E_400_USR_SVC_2006"),
    
    E_400_USR_SVC_2009("E_400_USR_SVC_2009"),
    
    E_400_USR_SVC_2010("E_400_USR_SVC_2010"),
    
    E_400_USR_SVC_2012("E_400_USR_SVC_2012"),
    
    E_400_USR_SVC_2017("E_400_USR_SVC_2017"),
    
    E_400_USR_SVC_4031("E_400_USR_SVC_4031"),
    
    E_400_USR_SVC_4033("E_400_USR_SVC_4033"),
    
    E_400_USR_SVC_4023("E_400_USR_SVC_4023"),
    
    E_403_USR_SVC_2016("E_403_USR_SVC_2016"),
    
    E_403_USR_SVC_2017("E_403_USR_SVC_2017"),
    
    E_403_USR_SVC_2018("E_403_USR_SVC_2018"),
    
    E_403_USR_SVC_2019("E_403_USR_SVC_2019"),
    
    E_403_USR_SVC_2022("E_403_USR_SVC_2022"),
    
    E_403_USR_SVC_2023("E_403_USR_SVC_2023"),
    
    E_404_USR_SVC_2020("E_404_USR_SVC_2020"),
    
    E_404_USR_SVC_2022("E_404_USR_SVC_2022"),
    
    E_405_USR_SVC_2025("E_405_USR_SVC_2025"),
    
    E_405_USR_SVC_2024("E_405_USR_SVC_2024"),
    
    E_409_USR_SVC_2025("E_409_USR_SVC_2025"),
    
    E_500_USR_SVC_3901("E_500_USR_SVC_3901"),
    
    E_500_USR_SVC_3902("E_500_USR_SVC_3902"),
    
    E_500_USR_SVC_4000("E_500_USR_SVC_4000"),
    
    E_400_USR_SVC_4001("E_400_USR_SVC_4001"),
    
    E_400_USR_SVC_4020("E_400_USR_SVC_4020"),
    
    E_400_USR_SVC_4022("E_400_USR_SVC_4022"),
    
    E_400_USR_SVC_4016("E_400_USR_SVC_4016"),
    
    E_400_USR_SVC_4024("E_400_USR_SVC_4024"),
    
    E_400_USR_SVC_4025("E_400_USR_SVC_4025"),
    
    E_400_USR_SVC_4026("E_400_USR_SVC_4026"),
    
    E_400_USR_SVC_4027("E_400_USR_SVC_4027"),
    
    E_404_USR_SVC_4601("E_404_USR_SVC_4601"),
    
    E_400_USR_SVC_4602("E_400_USR_SVC_4602"),
    
    E_500_USR_SVC_4603("E_500_USR_SVC_4603"),
    
    E_404_USR_SVC_4604("E_404_USR_SVC_4604"),
    
    E_404_USR_SVC_4701("E_404_USR_SVC_4701"),
    
    E_500_USR_SVC_4702("E_500_USR_SVC_4702"),
    
    E_409_USR_SVC_4703("E_409_USR_SVC_4703"),
    
    E_500_USR_SVC_4801("E_500_USR_SVC_4801"),
    
    E_404_USR_SVC_4802("E_404_USR_SVC_4802"),
    
    E_500_USR_SVC_5101("E_500_USR_SVC_5101");

    private String value;

    OpCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpCodeEnum fromValue(String value) {
      for (OpCodeEnum b : OpCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpCodeEnum opCode;

  /**
   * operation type to performed for update/delete
   */
  public enum OpTypeEnum {
    CREATE_USER_SITE_ROLE("CREATE_USER_SITE_ROLE"),
    
    UPDATE_SITE_ROLE("UPDATE_SITE_ROLE"),
    
    DELETE_SITE_ROLE("DELETE_SITE_ROLE"),
    
    ADD_SITE_ROLE("ADD_SITE_ROLE"),
    
    RESTORE_SITE_ROLE("RESTORE_SITE_ROLE"),
    
    UNMERGE_SITE_ROLE("UNMERGE_SITE_ROLE"),
    
    SUSPEND_SITE_ROLE("SUSPEND_SITE_ROLE"),
    
    MERGE_SITE_ROLE("MERGE_SITE_ROLE"),
    
    UPDATE_USER_DETAILS("UPDATE_USER_DETAILS"),
    
    MERGE_SITE_ROLE_WITHOUT_SAGA("MERGE_SITE_ROLE_WITHOUT_SAGA"),
    
    CREATE_USER_LINK_ROLE("CREATE_USER_LINK_ROLE"),
    
    ADD_LINK_ROLE("ADD_LINK_ROLE"),
    
    DELETE_LINK_ROLE("DELETE_LINK_ROLE"),
    
    UPDATE_LINK_ROLE("UPDATE_LINK_ROLE"),
    
    UPDATE_LANGUAGE_OR_LOCALE("UPDATE_LANGUAGE_OR_LOCALE");

    private String value;

    OpTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpTypeEnum fromValue(String value) {
      for (OpTypeEnum b : OpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpTypeEnum opType;

  private String serverSiteUserId;

  private String siteId;

  /**
   * siteRole under creation/update/deletion
   */
  public enum SiteRoleEnum {
    SITEADMINISTRATOREXPLORER("SiteAdministratorExplorer"),
    
    SUPPORTUSER("SupportUser"),
    
    EXPLORERCANPUBLISH("ExplorerCanPublish"),
    
    EXPLORER("Explorer"),
    
    UNLICENSED("Unlicensed"),
    
    VIEWER("Viewer"),
    
    CREATOR("Creator"),
    
    SITEADMINISTRATORCREATOR("SiteAdministratorCreator");

    private String value;

    SiteRoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SiteRoleEnum fromValue(String value) {
      for (SiteRoleEnum b : SiteRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SiteRoleEnum siteRole;

  /**
   * status of a single user operation
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    SUCCESSFUL("SUCCESSFUL"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private UUID tenantId;

  private UUID userId;

  private String userName;

  /**
   * Default constructor
   * @deprecated Use {@link UserOperationDetailedResponse#UserOperationDetailedResponse(StatusEnum)}
   */
  @Deprecated
  public UserOperationDetailedResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserOperationDetailedResponse(StatusEnum status) {
    this.status = status;
  }

  public UserOperationDetailedResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email under update
   * @return email
  */
  
  @Schema(name = "email", description = "email under update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserOperationDetailedResponse idp(IdpEnum idp) {
    this.idp = idp;
    return this;
  }

  /**
   * idp under creation/update
   * @return idp
  */
  
  @Schema(name = "idp", description = "idp under creation/update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idp")
  public IdpEnum getIdp() {
    return idp;
  }

  public void setIdp(IdpEnum idp) {
    this.idp = idp;
  }

  public UserOperationDetailedResponse idpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
    return this;
  }

  /**
   * identifier of idp configuration
   * @return idpConfigurationId
  */
  
  @Schema(name = "idpConfigurationId", description = "identifier of idp configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationId")
  public String getIdpConfigurationId() {
    return idpConfigurationId;
  }

  public void setIdpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
  }

  public UserOperationDetailedResponse lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * line number for the record in csv for bulk import via PoD
   * @return lineNumber
  */
  
  @Schema(name = "lineNumber", description = "line number for the record in csv for bulk import via PoD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineNumber")
  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  public UserOperationDetailedResponse linkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
    return this;
  }

  /**
   * linkRole under creation/update/deletion
   * @return linkRole
  */
  
  @Schema(name = "linkRole", description = "linkRole under creation/update/deletion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkRole")
  public LinkRoleEnum getLinkRole() {
    return linkRole;
  }

  public void setLinkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
  }

  public UserOperationDetailedResponse opCode(OpCodeEnum opCode) {
    this.opCode = opCode;
    return this;
  }

  /**
   * response code of the operation
   * @return opCode
  */
  
  @Schema(name = "opCode", description = "response code of the operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opCode")
  public OpCodeEnum getOpCode() {
    return opCode;
  }

  public void setOpCode(OpCodeEnum opCode) {
    this.opCode = opCode;
  }

  public UserOperationDetailedResponse opType(OpTypeEnum opType) {
    this.opType = opType;
    return this;
  }

  /**
   * operation type to performed for update/delete
   * @return opType
  */
  
  @Schema(name = "opType", description = "operation type to performed for update/delete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opType")
  public OpTypeEnum getOpType() {
    return opType;
  }

  public void setOpType(OpTypeEnum opType) {
    this.opType = opType;
  }

  public UserOperationDetailedResponse serverSiteUserId(String serverSiteUserId) {
    this.serverSiteUserId = serverSiteUserId;
    return this;
  }

  /**
   * userId of site in cloud
   * @return serverSiteUserId
  */
  
  @Schema(name = "serverSiteUserId", description = "userId of site in cloud", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverSiteUserId")
  public String getServerSiteUserId() {
    return serverSiteUserId;
  }

  public void setServerSiteUserId(String serverSiteUserId) {
    this.serverSiteUserId = serverSiteUserId;
  }

  public UserOperationDetailedResponse siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * identifier for the site of the operation.
   * @return siteId
  */
  
  @Schema(name = "siteId", description = "identifier for the site of the operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteId")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public UserOperationDetailedResponse siteRole(SiteRoleEnum siteRole) {
    this.siteRole = siteRole;
    return this;
  }

  /**
   * siteRole under creation/update/deletion
   * @return siteRole
  */
  
  @Schema(name = "siteRole", description = "siteRole under creation/update/deletion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRole")
  public SiteRoleEnum getSiteRole() {
    return siteRole;
  }

  public void setSiteRole(SiteRoleEnum siteRole) {
    this.siteRole = siteRole;
  }

  public UserOperationDetailedResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status of a single user operation
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "status of a single user operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UserOperationDetailedResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant identifier
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "Tenant identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public UserOperationDetailedResponse userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * userId of the user under update/deletion
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", description = "userId of the user under update/deletion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public UserOperationDetailedResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * identifier for the user created/updated
   * @return userName
  */
  
  @Schema(name = "userName", description = "identifier for the user created/updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOperationDetailedResponse userOperationDetailedResponse = (UserOperationDetailedResponse) o;
    return Objects.equals(this.email, userOperationDetailedResponse.email) &&
        Objects.equals(this.idp, userOperationDetailedResponse.idp) &&
        Objects.equals(this.idpConfigurationId, userOperationDetailedResponse.idpConfigurationId) &&
        Objects.equals(this.lineNumber, userOperationDetailedResponse.lineNumber) &&
        Objects.equals(this.linkRole, userOperationDetailedResponse.linkRole) &&
        Objects.equals(this.opCode, userOperationDetailedResponse.opCode) &&
        Objects.equals(this.opType, userOperationDetailedResponse.opType) &&
        Objects.equals(this.serverSiteUserId, userOperationDetailedResponse.serverSiteUserId) &&
        Objects.equals(this.siteId, userOperationDetailedResponse.siteId) &&
        Objects.equals(this.siteRole, userOperationDetailedResponse.siteRole) &&
        Objects.equals(this.status, userOperationDetailedResponse.status) &&
        Objects.equals(this.tenantId, userOperationDetailedResponse.tenantId) &&
        Objects.equals(this.userId, userOperationDetailedResponse.userId) &&
        Objects.equals(this.userName, userOperationDetailedResponse.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idp, idpConfigurationId, lineNumber, linkRole, opCode, opType, serverSiteUserId, siteId, siteRole, status, tenantId, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOperationDetailedResponse {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    linkRole: ").append(toIndentedString(linkRole)).append("\n");
    sb.append("    opCode: ").append(toIndentedString(opCode)).append("\n");
    sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
    sb.append("    serverSiteUserId: ").append(toIndentedString(serverSiteUserId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteRole: ").append(toIndentedString(siteRole)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

