package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * SessionsForTenantResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SessionsForTenantResponse {

  private Integer patCount;

  private Integer sessionCount;

  public SessionsForTenantResponse patCount(Integer patCount) {
    this.patCount = patCount;
    return this;
  }

  /**
   * Get patCount
   * @return patCount
  */
  
  @Schema(name = "patCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patCount")
  public Integer getPatCount() {
    return patCount;
  }

  public void setPatCount(Integer patCount) {
    this.patCount = patCount;
  }

  public SessionsForTenantResponse sessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

  /**
   * Get sessionCount
   * @return sessionCount
  */
  
  @Schema(name = "sessionCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionCount")
  public Integer getSessionCount() {
    return sessionCount;
  }

  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionsForTenantResponse sessionsForTenantResponse = (SessionsForTenantResponse) o;
    return Objects.equals(this.patCount, sessionsForTenantResponse.patCount) &&
        Objects.equals(this.sessionCount, sessionsForTenantResponse.sessionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patCount, sessionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionsForTenantResponse {\n");
    sb.append("    patCount: ").append(toIndentedString(patCount)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
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

