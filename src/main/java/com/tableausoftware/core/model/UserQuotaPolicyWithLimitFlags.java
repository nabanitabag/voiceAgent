package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.UserQuota;

import java.util.Objects;

/**
 * UserQuotaPolicyWithLimitFlags
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserQuotaPolicyWithLimitFlags {

  private UserQuota creatorCapacity;

  private UserQuota explorerCapacity;

  private UserQuota viewerCapacity;

  public UserQuotaPolicyWithLimitFlags creatorCapacity(UserQuota creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
    return this;
  }

  /**
   * Get creatorCapacity
   * @return creatorCapacity
  */
  @Valid 
  @Schema(name = "creatorCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacity")
  public UserQuota getCreatorCapacity() {
    return creatorCapacity;
  }

  public void setCreatorCapacity(UserQuota creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
  }

  public UserQuotaPolicyWithLimitFlags explorerCapacity(UserQuota explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
    return this;
  }

  /**
   * Get explorerCapacity
   * @return explorerCapacity
  */
  @Valid 
  @Schema(name = "explorerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacity")
  public UserQuota getExplorerCapacity() {
    return explorerCapacity;
  }

  public void setExplorerCapacity(UserQuota explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
  }

  public UserQuotaPolicyWithLimitFlags viewerCapacity(UserQuota viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
    return this;
  }

  /**
   * Get viewerCapacity
   * @return viewerCapacity
  */
  @Valid 
  @Schema(name = "viewerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewerCapacity")
  public UserQuota getViewerCapacity() {
    return viewerCapacity;
  }

  public void setViewerCapacity(UserQuota viewerCapacity) {
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
    UserQuotaPolicyWithLimitFlags userQuotaPolicyWithLimitFlags = (UserQuotaPolicyWithLimitFlags) o;
    return Objects.equals(this.creatorCapacity, userQuotaPolicyWithLimitFlags.creatorCapacity) &&
        Objects.equals(this.explorerCapacity, userQuotaPolicyWithLimitFlags.explorerCapacity) &&
        Objects.equals(this.viewerCapacity, userQuotaPolicyWithLimitFlags.viewerCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorCapacity, explorerCapacity, viewerCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQuotaPolicyWithLimitFlags {\n");
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

