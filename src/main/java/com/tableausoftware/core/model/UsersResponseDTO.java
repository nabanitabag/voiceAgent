package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UsersResponseDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UsersResponseDTO {

  @Valid
  private List<@Valid UserDTO> users;

  public UsersResponseDTO users(List<@Valid UserDTO> users) {
    this.users = users;
    return this;
  }

  public UsersResponseDTO addUsersItem(UserDTO usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Collection of users with roles and other info
   * @return users
  */
  @Valid 
  @Schema(name = "users", description = "Collection of users with roles and other info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<@Valid UserDTO> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid UserDTO> users) {
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
    UsersResponseDTO usersResponseDTO = (UsersResponseDTO) o;
    return Objects.equals(this.users, usersResponseDTO.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponseDTO {\n");
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

