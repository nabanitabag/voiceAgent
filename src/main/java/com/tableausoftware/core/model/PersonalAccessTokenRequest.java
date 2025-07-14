package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * PersonalAccessTokenRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PersonalAccessTokenRequest {

  private Integer absoluteExpiryInDays;

  private String tokenName;

  /**
   * Default constructor
   * @deprecated Use {@link PersonalAccessTokenRequest#PersonalAccessTokenRequest(String)}
   */
  @Deprecated
  public PersonalAccessTokenRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalAccessTokenRequest(String tokenName) {
    this.tokenName = tokenName;
  }

  public PersonalAccessTokenRequest absoluteExpiryInDays(Integer absoluteExpiryInDays) {
    this.absoluteExpiryInDays = absoluteExpiryInDays;
    return this;
  }

  /**
   * Number of days the PAT is valid for. Default value is 180 days; maximum value is 365 days. For security purposes, we recommend setting a value that is no more than 180 days.
   * @return absoluteExpiryInDays
  */
  
  @Schema(name = "absoluteExpiryInDays", description = "Number of days the PAT is valid for. Default value is 180 days; maximum value is 365 days. For security purposes, we recommend setting a value that is no more than 180 days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("absoluteExpiryInDays")
  public Integer getAbsoluteExpiryInDays() {
    return absoluteExpiryInDays;
  }

  public void setAbsoluteExpiryInDays(Integer absoluteExpiryInDays) {
    this.absoluteExpiryInDays = absoluteExpiryInDays;
  }

  public PersonalAccessTokenRequest tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

  /**
   * Name of the PAT. PAT name must be unique.
   * @return tokenName
  */
  @NotNull 
  @Schema(name = "tokenName", description = "Name of the PAT. PAT name must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tokenName")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalAccessTokenRequest personalAccessTokenRequest = (PersonalAccessTokenRequest) o;
    return Objects.equals(this.absoluteExpiryInDays, personalAccessTokenRequest.absoluteExpiryInDays) &&
        Objects.equals(this.tokenName, personalAccessTokenRequest.tokenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteExpiryInDays, tokenName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalAccessTokenRequest {\n");
    sb.append("    absoluteExpiryInDays: ").append(toIndentedString(absoluteExpiryInDays)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
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

