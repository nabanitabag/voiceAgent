package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * BulkUserOpAckResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class BulkUserOpAckResponse {

  private UUID jobId;

  /**
   * Default constructor
   * @deprecated Use {@link BulkUserOpAckResponse#BulkUserOpAckResponse(UUID)}
   */
  @Deprecated
  public BulkUserOpAckResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkUserOpAckResponse(UUID jobId) {
    this.jobId = jobId;
  }

  public BulkUserOpAckResponse jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * identifier for the job created or being retried
   * @return jobId
  */
  @NotNull @Valid 
  @Schema(name = "jobId", description = "identifier for the job created or being retried", requiredMode = Schema.RequiredMode.REQUIRED)
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
    BulkUserOpAckResponse bulkUserOpAckResponse = (BulkUserOpAckResponse) o;
    return Objects.equals(this.jobId, bulkUserOpAckResponse.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUserOpAckResponse {\n");
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

