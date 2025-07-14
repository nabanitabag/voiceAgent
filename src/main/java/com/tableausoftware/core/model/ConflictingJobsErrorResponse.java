package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.JobInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The response object for conflicting jobs error
 */

@Schema(name = "ConflictingJobsErrorResponse", description = "The response object for conflicting jobs error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ConflictingJobsErrorResponse {

  @Valid
  private List<@Valid JobInfo> conflictingJobs = new ArrayList<>();

  private String errorCode;

  private String message;

  private String reason;

  /**
   * Default constructor
   * @deprecated Use {@link ConflictingJobsErrorResponse#ConflictingJobsErrorResponse(List<@Valid JobInfo>, String)}
   */
  @Deprecated
  public ConflictingJobsErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConflictingJobsErrorResponse(List<@Valid JobInfo> conflictingJobs, String message) {
    this.conflictingJobs = conflictingJobs;
    this.message = message;
  }

  public ConflictingJobsErrorResponse conflictingJobs(List<@Valid JobInfo> conflictingJobs) {
    this.conflictingJobs = conflictingJobs;
    return this;
  }

  public ConflictingJobsErrorResponse addConflictingJobsItem(JobInfo conflictingJobsItem) {
    if (this.conflictingJobs == null) {
      this.conflictingJobs = new ArrayList<>();
    }
    this.conflictingJobs.add(conflictingJobsItem);
    return this;
  }

  /**
   * List of conflicting jobs
   * @return conflictingJobs
  */
  @NotNull @Valid 
  @Schema(name = "conflictingJobs", description = "List of conflicting jobs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conflictingJobs")
  public List<@Valid JobInfo> getConflictingJobs() {
    return conflictingJobs;
  }

  public void setConflictingJobs(List<@Valid JobInfo> conflictingJobs) {
    this.conflictingJobs = conflictingJobs;
  }

  public ConflictingJobsErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * errorCode
   * @return errorCode
  */
  
  @Schema(name = "errorCode", description = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ConflictingJobsErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * error message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConflictingJobsErrorResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason
   * @return reason
  */
  
  @Schema(name = "reason", description = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConflictingJobsErrorResponse conflictingJobsErrorResponse = (ConflictingJobsErrorResponse) o;
    return Objects.equals(this.conflictingJobs, conflictingJobsErrorResponse.conflictingJobs) &&
        Objects.equals(this.errorCode, conflictingJobsErrorResponse.errorCode) &&
        Objects.equals(this.message, conflictingJobsErrorResponse.message) &&
        Objects.equals(this.reason, conflictingJobsErrorResponse.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictingJobs, errorCode, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConflictingJobsErrorResponse {\n");
    sb.append("    conflictingJobs: ").append(toIndentedString(conflictingJobs)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

