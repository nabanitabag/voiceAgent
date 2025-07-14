package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SuspendTenantRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SuspendTenantRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime suspendedDateTime;

  /**
   * Default constructor
   * @deprecated Use {@link SuspendTenantRequest#SuspendTenantRequest(OffsetDateTime)}
   */
  @Deprecated
  public SuspendTenantRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuspendTenantRequest(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
  }

  public SuspendTenantRequest suspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
    return this;
  }

  /**
   * Get suspendedDateTime
   * @return suspendedDateTime
  */
  @NotNull @Valid 
  @Schema(name = "suspendedDateTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("suspendedDateTime")
  public OffsetDateTime getSuspendedDateTime() {
    return suspendedDateTime;
  }

  public void setSuspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspendTenantRequest suspendTenantRequest = (SuspendTenantRequest) o;
    return Objects.equals(this.suspendedDateTime, suspendTenantRequest.suspendedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspendedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspendTenantRequest {\n");
    sb.append("    suspendedDateTime: ").append(toIndentedString(suspendedDateTime)).append("\n");
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

