package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * UserQuotaPolicy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserQuotaPolicy {

  private Integer creatorCapacity;

  private Integer explorerCapacity;

  private Integer viewerCapacity;

  public UserQuotaPolicy creatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
    return this;
  }

  /**
   * Get creatorCapacity
   * @return creatorCapacity
  */
  
  @Schema(name = "creatorCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacity")
  public Integer getCreatorCapacity() {
    return creatorCapacity;
  }

  public void setCreatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
  }

  public UserQuotaPolicy explorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
    return this;
  }

  /**
   * Get explorerCapacity
   * @return explorerCapacity
  */
  
  @Schema(name = "explorerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacity")
  public Integer getExplorerCapacity() {
    return explorerCapacity;
  }

  public void setExplorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
  }

  public UserQuotaPolicy viewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
    return this;
  }

  /**
   * Get viewerCapacity
   * @return viewerCapacity
  */
  
  @Schema(name = "viewerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewerCapacity")
  public Integer getViewerCapacity() {
    return viewerCapacity;
  }

  public void setViewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQuotaPolicy userQuotaPolicy = (UserQuotaPolicy) o;
    return Objects.equals(this.creatorCapacity, userQuotaPolicy.creatorCapacity) &&
        Objects.equals(this.explorerCapacity, userQuotaPolicy.explorerCapacity) &&
        Objects.equals(this.viewerCapacity, userQuotaPolicy.viewerCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorCapacity, explorerCapacity, viewerCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQuotaPolicy {\n");
    sb.append("    creatorCapacity: ").append(toIndentedString(creatorCapacity)).append("\n");
    sb.append("    explorerCapacity: ").append(toIndentedString(explorerCapacity)).append("\n");
    sb.append("    viewerCapacity: ").append(toIndentedString(viewerCapacity)).append("\n");
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

