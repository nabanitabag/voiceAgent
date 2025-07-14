package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.UserSiteRoleResponseDTO;

import java.util.Objects;
import java.util.UUID;

/**
 * TransactionStatusResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TransactionStatusResponse {

  /**
   * result code
   */
  public enum PResultCodeEnum {
    USER_CREATED_WITH_ASSIGNED_ROLE("USER_CREATED_WITH_ASSIGNED_ROLE"),
    
    USER_ADDED_UPON_RETRY_WITH_ASSIGNED_ROLE("USER_ADDED_UPON_RETRY_WITH_ASSIGNED_ROLE"),
    
    USER_ADDED_UPON_RETRY_AS_UNLICENSED("USER_ADDED_UPON_RETRY_AS_UNLICENSED"),
    
    USER_CREATED_WITH_ASSIGNED_UNLICENSED("USER_CREATED_WITH_ASSIGNED_UNLICENSED"),
    
    USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED("USER_CREATED_AS_UNLICENSED_SITE_LICENSE_EXHAUSTED"),
    
    USER_ADDED_WITH_ASSIGNED_ROLE("USER_ADDED_WITH_ASSIGNED_ROLE"),
    
    USER_ADDED_DISPLAY_NAME_UPDATED("USER_ADDED_DISPLAY_NAME_UPDATED"),
    
    USER_ADDED_WITH_ASSIGNED_UNLICENSED("USER_ADDED_WITH_ASSIGNED_UNLICENSED"),
    
    USER_ADDED_AS_UNLICENSED("USER_ADDED_AS_UNLICENSED"),
    
    USER_DISPLAY_NAME_UPDATED("USER_DISPLAY_NAME_UPDATED"),
    
    USER_DISPLAY_NAME_UPDATED_SITE_ROLE_ASSIGNED("USER_DISPLAY_NAME_UPDATED_SITE_ROLE_ASSIGNED"),
    
    SITE_ROLE_ASSIGNED("SITE_ROLE_ASSIGNED"),
    
    LINK_USERID_TENANT_MAPPING_FAILED("LINK_USERID_TENANT_MAPPING_FAILED"),
    
    USER_ROLE_UNCHANGED_GLSI_MIN_ROLE("USER_ROLE_UNCHANGED_GLSI_MIN_ROLE"),
    
    USER_ROLE_UNCHANGED_SITE_LICENSE_EXHAUSTED("USER_ROLE_UNCHANGED_SITE_LICENSE_EXHAUSTED"),
    
    USER_IDP_UPDATED("USER_IDP_UPDATED"),
    
    USER_INVALID_AUTHENTICATION_SETTING("USER_INVALID_AUTHENTICATION_SETTING"),
    
    SITE_ROLE_REMOVED_USER_DELETED("SITE_ROLE_REMOVED_USER_DELETED"),
    
    SITE_ROLE_REMOVED("SITE_ROLE_REMOVED"),
    
    USER_NOT_SYNCED_IN_TCM_AND_POD("USER_NOT_SYNCED_IN_TCM_AND_POD"),
    
    USER_UNLICENSED_OWNS_CONTENT("USER_UNLICENSED_OWNS_CONTENT"),
    
    USER_OR_ROLE_ALREADY_IN_EXPECTED_STATE("USER_OR_ROLE_ALREADY_IN_EXPECTED_STATE"),
    
    USER_ADDED_WITH_ASSIGNED_ROLE_EMAIL_UPDATED("USER_ADDED_WITH_ASSIGNED_ROLE_EMAIL_UPDATED"),
    
    USER_EMAIL_UPDATED("USER_EMAIL_UPDATED"),
    
    USER_INVALID_EMAIL_ADDRESS("USER_INVALID_EMAIL_ADDRESS"),
    
    USER_SYSTEM_USER_WITH_EMAIL_ADDRESS_ALREADY_EXISTS("USER_SYSTEM_USER_WITH_EMAIL_ADDRESS_ALREADY_EXISTS"),
    
    USER_SITE_ROLE_UNCHANGED_EMAIL_UPDATED("USER_SITE_ROLE_UNCHANGED_EMAIL_UPDATED"),
    
    USER_SITE_ROLE_CHANGED_EMAIL_UPDATED("USER_SITE_ROLE_CHANGED_EMAIL_UPDATED"),
    
    USER_DISPLAY_NAME_ROLE_EMAIL_UPDATED("USER_DISPLAY_NAME_ROLE_EMAIL_UPDATED"),
    
    USER_DISPLAY_NAME_ROLE_UPDATED_EMAIL_UNCHANGED("USER_DISPLAY_NAME_ROLE_UPDATED_EMAIL_UNCHANGED"),
    
    USER_DISPLAY_NAME_UPDATED_ROLE_EMAIL_UNCHANGED("USER_DISPLAY_NAME_UPDATED_ROLE_EMAIL_UNCHANGED"),
    
    USER_SITE_ROLE_EMAIL_UNCHANGED("USER_SITE_ROLE_EMAIL_UNCHANGED"),
    
    USER_SITE_ROLE_UPDATED_EMAIL_UNCHANGED("USER_SITE_ROLE_UPDATED_EMAIL_UNCHANGED"),
    
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
    
    RATE_LIMIT_EXCEEDED("RATE_LIMIT_EXCEEDED"),
    
    UNKNOWN_ERROR_CODE("UNKNOWN_ERROR_CODE");

    private String value;

    PResultCodeEnum(String value) {
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
    public static PResultCodeEnum fromValue(String value) {
      for (PResultCodeEnum b : PResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PResultCodeEnum pResultCode;

  private String podResultPayload;

  private String resultDescription;

  private UserSiteRoleResponseDTO siteRole;

  /**
   * Transaction Status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
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

  private UUID userId;

  /**
   * Default constructor
   * @deprecated Use {@link TransactionStatusResponse#TransactionStatusResponse(StatusEnum)}
   */
  @Deprecated
  public TransactionStatusResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransactionStatusResponse(StatusEnum status) {
    this.status = status;
  }

  public TransactionStatusResponse pResultCode(PResultCodeEnum pResultCode) {
    this.pResultCode = pResultCode;
    return this;
  }

  /**
   * result code
   * @return pResultCode
  */
  
  @Schema(name = "pResultCode", description = "result code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pResultCode")
  public PResultCodeEnum getpResultCode() {
    return pResultCode;
  }

  public void setpResultCode(PResultCodeEnum pResultCode) {
    this.pResultCode = pResultCode;
  }

  public TransactionStatusResponse podResultPayload(String podResultPayload) {
    this.podResultPayload = podResultPayload;
    return this;
  }

  /**
   * PoD response
   * @return podResultPayload
  */
  
  @Schema(name = "podResultPayload", description = "PoD response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podResultPayload")
  public String getPodResultPayload() {
    return podResultPayload;
  }

  public void setPodResultPayload(String podResultPayload) {
    this.podResultPayload = podResultPayload;
  }

  public TransactionStatusResponse resultDescription(String resultDescription) {
    this.resultDescription = resultDescription;
    return this;
  }

  /**
   * description for pResultCode
   * @return resultDescription
  */
  
  @Schema(name = "resultDescription", description = "description for pResultCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultDescription")
  public String getResultDescription() {
    return resultDescription;
  }

  public void setResultDescription(String resultDescription) {
    this.resultDescription = resultDescription;
  }

  public TransactionStatusResponse siteRole(UserSiteRoleResponseDTO siteRole) {
    this.siteRole = siteRole;
    return this;
  }

  /**
   * Get siteRole
   * @return siteRole
  */
  @Valid 
  @Schema(name = "siteRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRole")
  public UserSiteRoleResponseDTO getSiteRole() {
    return siteRole;
  }

  public void setSiteRole(UserSiteRoleResponseDTO siteRole) {
    this.siteRole = siteRole;
  }

  public TransactionStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Transaction Status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Transaction Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TransactionStatusResponse userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * added/updated user's CDS userId
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", description = "added/updated user's CDS userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) o;
    return Objects.equals(this.pResultCode, transactionStatusResponse.pResultCode) &&
        Objects.equals(this.podResultPayload, transactionStatusResponse.podResultPayload) &&
        Objects.equals(this.resultDescription, transactionStatusResponse.resultDescription) &&
        Objects.equals(this.siteRole, transactionStatusResponse.siteRole) &&
        Objects.equals(this.status, transactionStatusResponse.status) &&
        Objects.equals(this.userId, transactionStatusResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pResultCode, podResultPayload, resultDescription, siteRole, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatusResponse {\n");
    sb.append("    pResultCode: ").append(toIndentedString(pResultCode)).append("\n");
    sb.append("    podResultPayload: ").append(toIndentedString(podResultPayload)).append("\n");
    sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
    sb.append("    siteRole: ").append(toIndentedString(siteRole)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

