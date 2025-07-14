package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;
import java.util.UUID;

/**
 * Optional attributes for bulk ops. eg JobId
 */

@Schema(name = "BulkOpAttributes", description = "Optional attributes for bulk ops. eg JobId")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class BulkOpAttributes {

  /**
   * bulk operation being performed
   */
  public enum BulkOpTypeEnum {
    BULK_USER_IMPORT("BULK_USER_IMPORT"),
    
    SITE_BULK_USER_IMPORT("SITE_BULK_USER_IMPORT"),
    
    MERGE_TENANTS("MERGE_TENANTS"),
    
    UNLICENSE_USERS_BY_ROLE("UNLICENSE_USERS_BY_ROLE"),
    
    RESTORE_TENANT("RESTORE_TENANT"),
    
    UPDATE_LAST_LOGIN_TIME("UPDATE_LAST_LOGIN_TIME"),
    
    MIGRATE_SITE_USERS("MIGRATE_SITE_USERS"),
    
    SITE_SUSPENDED("SITE_SUSPENDED"),
    
    TENANT_DELETED("TENANT_DELETED"),
    
    SITE_RESTORED("SITE_RESTORED"),
    
    SITE_DELETED("SITE_DELETED"),
    
    BULK_USER_MODIFICATION("BULK_USER_MODIFICATION"),
    
    BULK_USER_DELETE("BULK_USER_DELETE"),
    
    MULTI_ROLE_USER_DELETE("MULTI_ROLE_USER_DELETE"),
    
    SINGLE_ROLE_USER_MODIFY("SINGLE_ROLE_USER_MODIFY"),
    
    MULTI_ROLE_USER_MODIFY("MULTI_ROLE_USER_MODIFY"),
    
    SET_TTL_IN_TENANT("SET_TTL_IN_TENANT"),
    
    UNMERGE_TENANTS("UNMERGE_TENANTS"),
    
    UPDATE_EMAIL("UPDATE_EMAIL"),
    
    RESYNC_USERS("RESYNC_USERS");

    private String value;

    BulkOpTypeEnum(String value) {
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
    public static BulkOpTypeEnum fromValue(String value) {
      for (BulkOpTypeEnum b : BulkOpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BulkOpTypeEnum bulkOpType;

  private UUID jobId;

  private UUID srcLinkUserId;

  private UUID srcTenantId;

  public BulkOpAttributes bulkOpType(BulkOpTypeEnum bulkOpType) {
    this.bulkOpType = bulkOpType;
    return this;
  }

  /**
   * bulk operation being performed
   * @return bulkOpType
  */
  
  @Schema(name = "bulkOpType", description = "bulk operation being performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkOpType")
  public BulkOpTypeEnum getBulkOpType() {
    return bulkOpType;
  }

  public void setBulkOpType(BulkOpTypeEnum bulkOpType) {
    this.bulkOpType = bulkOpType;
  }

  public BulkOpAttributes jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * jobId for the bulk job being performed
   * @return jobId
  */
  @Valid 
  @Schema(name = "jobId", description = "jobId for the bulk job being performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public BulkOpAttributes srcLinkUserId(UUID srcLinkUserId) {
    this.srcLinkUserId = srcLinkUserId;
    return this;
  }

  /**
   * user id of the user in source tenant
   * @return srcLinkUserId
  */
  @Valid 
  @Schema(name = "srcLinkUserId", description = "user id of the user in source tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srcLinkUserId")
  public UUID getSrcLinkUserId() {
    return srcLinkUserId;
  }

  public void setSrcLinkUserId(UUID srcLinkUserId) {
    this.srcLinkUserId = srcLinkUserId;
  }

  public BulkOpAttributes srcTenantId(UUID srcTenantId) {
    this.srcTenantId = srcTenantId;
    return this;
  }

  /**
   * tenant id of the source tenant that is to be unmerged in a unmerge-tenants bulk operation
   * @return srcTenantId
  */
  @Valid 
  @Schema(name = "srcTenantId", description = "tenant id of the source tenant that is to be unmerged in a unmerge-tenants bulk operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srcTenantId")
  public UUID getSrcTenantId() {
    return srcTenantId;
  }

  public void setSrcTenantId(UUID srcTenantId) {
    this.srcTenantId = srcTenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOpAttributes bulkOpAttributes = (BulkOpAttributes) o;
    return Objects.equals(this.bulkOpType, bulkOpAttributes.bulkOpType) &&
        Objects.equals(this.jobId, bulkOpAttributes.jobId) &&
        Objects.equals(this.srcLinkUserId, bulkOpAttributes.srcLinkUserId) &&
        Objects.equals(this.srcTenantId, bulkOpAttributes.srcTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOpType, jobId, srcLinkUserId, srcTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOpAttributes {\n");
    sb.append("    bulkOpType: ").append(toIndentedString(bulkOpType)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    srcLinkUserId: ").append(toIndentedString(srcLinkUserId)).append("\n");
    sb.append("    srcTenantId: ").append(toIndentedString(srcTenantId)).append("\n");
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

