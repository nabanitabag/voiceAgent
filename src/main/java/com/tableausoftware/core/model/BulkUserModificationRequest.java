package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.UserModificationRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BulkUserModificationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class BulkUserModificationRequest {

  @Valid
  private List<@Valid UserModificationRequest> users = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link BulkUserModificationRequest#BulkUserModificationRequest(List<@Valid UserModificationRequest>)}
   */
  @Deprecated
  public BulkUserModificationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkUserModificationRequest(List<@Valid UserModificationRequest> users) {
    this.users = users;
  }

  public BulkUserModificationRequest users(List<@Valid UserModificationRequest> users) {
    this.users = users;
    return this;
  }

  public BulkUserModificationRequest addUsersItem(UserModificationRequest usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * list of users to be modified
   * @return users
  */
  @NotNull @Valid 
  @Schema(name = "users", description = "list of users to be modified", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("users")
  public List<@Valid UserModificationRequest> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid UserModificationRequest> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUserModificationRequest bulkUserModificationRequest = (BulkUserModificationRequest) o;
    return Objects.equals(this.users, bulkUserModificationRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUserModificationRequest {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

