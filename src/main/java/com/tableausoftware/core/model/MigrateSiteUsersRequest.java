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
 * MigrateSiteUsersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class MigrateSiteUsersRequest {

  /**
   * Name of the stage of the bulk operation
   */
  public enum BulkOpStageEnum {
    INITIATE("INITIATE"),
    
    PROCESS("PROCESS"),
    
    POST_PROCESS("POST_PROCESS");

    private String value;

    BulkOpStageEnum(String value) {
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
    public static BulkOpStageEnum fromValue(String value) {
      for (BulkOpStageEnum b : BulkOpStageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BulkOpStageEnum bulkOpStage;

  private UUID jobId;

  private UUID siteId;

  /**
   * Default constructor
   * @deprecated Use {@link MigrateSiteUsersRequest#MigrateSiteUsersRequest(UUID)}
   */
  @Deprecated
  public MigrateSiteUsersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MigrateSiteUsersRequest(UUID siteId) {
    this.siteId = siteId;
  }

  public MigrateSiteUsersRequest bulkOpStage(BulkOpStageEnum bulkOpStage) {
    this.bulkOpStage = bulkOpStage;
    return this;
  }

  /**
   * Name of the stage of the bulk operation
   * @return bulkOpStage
  */
  
  @Schema(name = "bulkOpStage", description = "Name of the stage of the bulk operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkOpStage")
  public BulkOpStageEnum getBulkOpStage() {
    return bulkOpStage;
  }

  public void setBulkOpStage(BulkOpStageEnum bulkOpStage) {
    this.bulkOpStage = bulkOpStage;
  }

  public MigrateSiteUsersRequest jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * migrate site users jobId
   * @return jobId
  */
  @Valid 
  @Schema(name = "jobId", description = "migrate site users jobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public MigrateSiteUsersRequest siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * identifier of the site from which users are being imported into this tenant
   * @return siteId
  */
  @NotNull @Valid 
  @Schema(name = "siteId", description = "identifier of the site from which users are being imported into this tenant", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteId")
  public UUID getSiteId() {
    return siteId;
  }

  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateSiteUsersRequest migrateSiteUsersRequest = (MigrateSiteUsersRequest) o;
    return Objects.equals(this.bulkOpStage, migrateSiteUsersRequest.bulkOpStage) &&
        Objects.equals(this.jobId, migrateSiteUsersRequest.jobId) &&
        Objects.equals(this.siteId, migrateSiteUsersRequest.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOpStage, jobId, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateSiteUsersRequest {\n");
    sb.append("    bulkOpStage: ").append(toIndentedString(bulkOpStage)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

