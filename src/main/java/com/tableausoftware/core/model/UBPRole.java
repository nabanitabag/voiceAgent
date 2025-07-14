package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * UBPRole
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UBPRole {

  private Integer quota;

  private String type;

  /**
   * Default constructor
   * @deprecated Use {@link UBPRole#UBPRole(String)}
   */
  @Deprecated
  public UBPRole() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UBPRole(String type) {
    this.type = type;
  }

  public UBPRole quota(Integer quota) {
    this.quota = quota;
    return this;
  }

  /**
   * Get quota
   * @return quota
  */
  
  @Schema(name = "quota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quota")
  public Integer getQuota() {
    return quota;
  }

  public void setQuota(Integer quota) {
    this.quota = quota;
  }

  public UBPRole type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Pattern(regexp = "^viewer$") 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UBPRole ubPRole = (UBPRole) o;
    return Objects.equals(this.quota, ubPRole.quota) &&
        Objects.equals(this.type, ubPRole.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quota, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UBPRole {\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

