package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * PersonalAccessToken
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PersonalAccessToken {

  private String token;

  /**
   * Default constructor
   * @deprecated Use {@link PersonalAccessToken#PersonalAccessToken(String)}
   */
  @Deprecated
  public PersonalAccessToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalAccessToken(String token) {
    this.token = token;
  }

  public PersonalAccessToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The personal access token (PAT).
   * @return token
  */
  @NotNull 
  @Schema(name = "token", description = "The personal access token (PAT).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalAccessToken personalAccessToken = (PersonalAccessToken) o;
    return Objects.equals(this.token, personalAccessToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalAccessToken {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

