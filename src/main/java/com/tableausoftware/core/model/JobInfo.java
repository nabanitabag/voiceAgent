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
 * List of conflicting jobs
 */

@Schema(name = "JobInfo", description = "List of conflicting jobs")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class JobInfo {

  /**
   * Gets or Sets bulkOpType
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

  public JobInfo bulkOpType(BulkOpTypeEnum bulkOpType) {
    this.bulkOpType = bulkOpType;
    return this;
  }

  /**
   * Get bulkOpType
   * @return bulkOpType
  */
  
  @Schema(name = "bulkOpType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkOpType")
  public BulkOpTypeEnum getBulkOpType() {
    return bulkOpType;
  }

  public void setBulkOpType(BulkOpTypeEnum bulkOpType) {
    this.bulkOpType = bulkOpType;
  }

  public JobInfo jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @Valid 
  @Schema(name = "jobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobInfo jobInfo = (JobInfo) o;
    return Objects.equals(this.bulkOpType, jobInfo.bulkOpType) &&
        Objects.equals(this.jobId, jobInfo.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOpType, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInfo {\n");
    sb.append("    bulkOpType: ").append(toIndentedString(bulkOpType)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

