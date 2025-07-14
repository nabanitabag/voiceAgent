package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PatLoginResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PatLoginResponse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime sessionExpiration;

  private String sessionToken;

  private String tenantId;

  private String userId;

  public PatLoginResponse sessionExpiration(OffsetDateTime sessionExpiration) {
    this.sessionExpiration = sessionExpiration;
    return this;
  }

  /**
   * The time when the session will expire in UTC.
   * @return sessionExpiration
  */
  @Valid 
  @Schema(name = "sessionExpiration", description = "The time when the session will expire in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionExpiration")
  public OffsetDateTime getSessionExpiration() {
    return sessionExpiration;
  }

  public void setSessionExpiration(OffsetDateTime sessionExpiration) {
    this.sessionExpiration = sessionExpiration;
  }

  public PatLoginResponse sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * The credentials token you include in the authorization header in subsequent calls.
   * @return sessionToken
  */
  
  @Schema(name = "sessionToken", description = "The credentials token you include in the authorization header in subsequent calls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionToken")
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  public PatLoginResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID of the session.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant ID of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public PatLoginResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the session.
   * @return userId
  */
  
  @Schema(name = "userId", description = "The user ID of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
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
    PatLoginResponse patLoginResponse = (PatLoginResponse) o;
    return Objects.equals(this.sessionExpiration, patLoginResponse.sessionExpiration) &&
        Objects.equals(this.sessionToken, patLoginResponse.sessionToken) &&
        Objects.equals(this.tenantId, patLoginResponse.tenantId) &&
        Objects.equals(this.userId, patLoginResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionExpiration, sessionToken, tenantId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatLoginResponse {\n");
    sb.append("    sessionExpiration: ").append(toIndentedString(sessionExpiration)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

