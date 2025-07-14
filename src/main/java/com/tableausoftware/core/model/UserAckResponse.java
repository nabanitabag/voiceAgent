package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * UserAckResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserAckResponse {

  private UUID jobId;

  private UUID tenantId;

  private String transactionId;

  private UUID userId;

  /**
   * Default constructor
   * @deprecated Use {@link UserAckResponse#UserAckResponse(UUID)}
   */
  @Deprecated
  public UserAckResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAckResponse(UUID jobId) {
    this.jobId = jobId;
  }

  public UserAckResponse jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Identifier of the job for the asynchronous operation
   * @return jobId
  */
  @NotNull @Valid 
  @Schema(name = "jobId", description = "Identifier of the job for the asynchronous operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public UserAckResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Unique ID of the tenant
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "Unique ID of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public UserAckResponse transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * transactionId for querying whether user is created or updated
   * @return transactionId
  */
  
  @Schema(name = "transactionId", description = "transactionId for querying whether user is created or updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public UserAckResponse userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique ID of the user created by user service
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", description = "Unique ID of the user created by user service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserAckResponse userAckResponse = (UserAckResponse) o;
    return Objects.equals(this.jobId, userAckResponse.jobId) &&
        Objects.equals(this.tenantId, userAckResponse.tenantId) &&
        Objects.equals(this.transactionId, userAckResponse.transactionId) &&
        Objects.equals(this.userId, userAckResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, tenantId, transactionId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAckResponse {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

