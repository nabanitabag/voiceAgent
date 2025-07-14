package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import com.tableausoftware.core.model.UBPRole;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UsageBasedPricing
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UsageBasedPricing {

  @Valid
  private List<@Valid UBPRole> roles = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link UsageBasedPricing#UsageBasedPricing(List<@Valid UBPRole>)}
   */
  @Deprecated
  public UsageBasedPricing() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageBasedPricing(List<@Valid UBPRole> roles) {
    this.roles = roles;
  }

  public UsageBasedPricing roles(List<@Valid UBPRole> roles) {
    this.roles = roles;
    return this;
  }

  public UsageBasedPricing addRolesItem(UBPRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @NotNull @Valid @Size(min = 1, max = 1) 
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roles")
  public List<@Valid UBPRole> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid UBPRole> roles) {
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
    UsageBasedPricing usageBasedPricing = (UsageBasedPricing) o;
    return Objects.equals(this.roles, usageBasedPricing.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBasedPricing {\n");
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

