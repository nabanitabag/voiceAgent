package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * UserFullNameChangeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserFullNameChangeResponse {

  private UUID userId;

  /**
   * Default constructor
   * @deprecated Use {@link UserFullNameChangeResponse#UserFullNameChangeResponse(UUID)}
   */
  @Deprecated
  public UserFullNameChangeResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserFullNameChangeResponse(UUID userId) {
    this.userId = userId;
  }

  public UserFullNameChangeResponse userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique ID of the user created by user service
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", description = "Unique ID of the user created by user service", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UserFullNameChangeResponse userFullNameChangeResponse = (UserFullNameChangeResponse) o;
    return Objects.equals(this.userId, userFullNameChangeResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFullNameChangeResponse {\n");
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

