package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * The limit of number of users with licenses for the viewer role for the site.
 */

@Schema(name = "UserQuota", description = "The limit of number of users with licenses for the viewer role for the site.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserQuota {

  private Integer capacity;

  private Boolean isDefaultCloudLimit;

  public UserQuota capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * The effective limit of number of users with licenses for the role for the site.
   * @return capacity
  */
  
  @Schema(name = "capacity", description = "The effective limit of number of users with licenses for the role for the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public UserQuota isDefaultCloudLimit(Boolean isDefaultCloudLimit) {
    this.isDefaultCloudLimit = isDefaultCloudLimit;
    return this;
  }

  /**
   * If true, the limit to the number of users is the default cloud limit value. If false, a custom limit has been set.
   * @return isDefaultCloudLimit
  */
  
  @Schema(name = "isDefaultCloudLimit", description = "If true, the limit to the number of users is the default cloud limit value. If false, a custom limit has been set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefaultCloudLimit")
  public Boolean getIsDefaultCloudLimit() {
    return isDefaultCloudLimit;
  }

  public void setIsDefaultCloudLimit(Boolean isDefaultCloudLimit) {
    this.isDefaultCloudLimit = isDefaultCloudLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQuota userQuota = (UserQuota) o;
    return Objects.equals(this.capacity, userQuota.capacity) &&
        Objects.equals(this.isDefaultCloudLimit, userQuota.isDefaultCloudLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, isDefaultCloudLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQuota {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    isDefaultCloudLimit: ").append(toIndentedString(isDefaultCloudLimit)).append("\n");
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

