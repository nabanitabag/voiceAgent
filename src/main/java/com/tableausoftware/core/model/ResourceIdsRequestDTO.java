package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResourceIdsRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ResourceIdsRequestDTO {

  private Boolean requireMultipleIDPs;

  @Valid
  private List<String> resourceIds = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link ResourceIdsRequestDTO#ResourceIdsRequestDTO(List<String>)}
   */
  @Deprecated
  public ResourceIdsRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceIdsRequestDTO(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public ResourceIdsRequestDTO requireMultipleIDPs(Boolean requireMultipleIDPs) {
    this.requireMultipleIDPs = requireMultipleIDPs;
    return this;
  }

  /**
   * If true, returns the authentication configurations on the site when the capability for multiple authentication methods is enabled.
   * @return requireMultipleIDPs
  */
  
  @Schema(name = "requireMultipleIDPs", description = "If true, returns the authentication configurations on the site when the capability for multiple authentication methods is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requireMultipleIDPs")
  public Boolean getRequireMultipleIDPs() {
    return requireMultipleIDPs;
  }

  public void setRequireMultipleIDPs(Boolean requireMultipleIDPs) {
    this.requireMultipleIDPs = requireMultipleIDPs;
  }

  public ResourceIdsRequestDTO resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public ResourceIdsRequestDTO addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

  /**
   * list of resourceIds to fetch resource authentication configuration of
   * @return resourceIds
  */
  @NotNull 
  @Schema(name = "resourceIds", description = "list of resourceIds to fetch resource authentication configuration of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resourceIds")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceIdsRequestDTO resourceIdsRequestDTO = (ResourceIdsRequestDTO) o;
    return Objects.equals(this.requireMultipleIDPs, resourceIdsRequestDTO.requireMultipleIDPs) &&
        Objects.equals(this.resourceIds, resourceIdsRequestDTO.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireMultipleIDPs, resourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceIdsRequestDTO {\n");
    sb.append("    requireMultipleIDPs: ").append(toIndentedString(requireMultipleIDPs)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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

