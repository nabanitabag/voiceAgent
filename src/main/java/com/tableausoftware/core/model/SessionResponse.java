package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.ClientRequestResponse;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SessionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SessionResponse {

  private ClientRequestResponse client;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expireDateTime;

  private String key;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateDateTime;

  private Boolean valid;

  public SessionResponse client(ClientRequestResponse client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @Valid 
  @Schema(name = "client", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client")
  public ClientRequestResponse getClient() {
    return client;
  }

  public void setClient(ClientRequestResponse client) {
    this.client = client;
  }

  public SessionResponse createDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * The creation date and time of the session.
   * @return createDateTime
  */
  @Valid 
  @Schema(name = "createDateTime", description = "The creation date and time of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDateTime")
  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public SessionResponse expireDateTime(OffsetDateTime expireDateTime) {
    this.expireDateTime = expireDateTime;
    return this;
  }

  /**
   * The expiration date and time of the session.
   * @return expireDateTime
  */
  @Valid 
  @Schema(name = "expireDateTime", description = "The expiration date and time of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireDateTime")
  public OffsetDateTime getExpireDateTime() {
    return expireDateTime;
  }

  public void setExpireDateTime(OffsetDateTime expireDateTime) {
    this.expireDateTime = expireDateTime;
  }

  public SessionResponse key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique ID of the session.
   * @return key
  */
  
  @Schema(name = "key", description = "The unique ID of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SessionResponse lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  /**
   * The last update date and time of the session.
   * @return lastUpdateDateTime
  */
  @Valid 
  @Schema(name = "lastUpdateDateTime", description = "The last update date and time of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateDateTime")
  public OffsetDateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public SessionResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponse sessionResponse = (SessionResponse) o;
    return Objects.equals(this.client, sessionResponse.client) &&
        Objects.equals(this.createDateTime, sessionResponse.createDateTime) &&
        Objects.equals(this.expireDateTime, sessionResponse.expireDateTime) &&
        Objects.equals(this.key, sessionResponse.key) &&
        Objects.equals(this.lastUpdateDateTime, sessionResponse.lastUpdateDateTime) &&
        Objects.equals(this.valid, sessionResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, createDateTime, expireDateTime, key, lastUpdateDateTime, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponse {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

