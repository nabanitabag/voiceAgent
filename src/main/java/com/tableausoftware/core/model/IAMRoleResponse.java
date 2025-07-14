package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * IAMRoleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class IAMRoleResponse {

  @Valid
  private Map<String, String> roles = new HashMap<>();

  public IAMRoleResponse roles(Map<String, String> roles) {
    this.roles = roles;
    return this;
  }

  public IAMRoleResponse putRolesItem(String key, String rolesItem) {
    if (this.roles == null) {
      this.roles = new HashMap<>();
    }
    this.roles.put(key, rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public Map<String, String> getRoles() {
    return roles;
  }

  public void setRoles(Map<String, String> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IAMRoleResponse iaMRoleResponse = (IAMRoleResponse) o;
    return Objects.equals(this.roles, iaMRoleResponse.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IAMRoleResponse {\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

