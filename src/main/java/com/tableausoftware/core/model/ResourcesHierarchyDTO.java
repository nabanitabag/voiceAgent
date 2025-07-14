package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;
import java.util.UUID;

/**
 * parent hierarchy of resource
 */

@Schema(name = "ResourcesHierarchyDTO", description = "parent hierarchy of resource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ResourcesHierarchyDTO {

  private UUID id;

  private String name;

  private String uri;

  public ResourcesHierarchyDTO id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the parent resource
   * @return id
  */
  @Valid 
  @Schema(name = "id", description = "Id of the parent resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ResourcesHierarchyDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the parent resource
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the parent resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourcesHierarchyDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI of the parent resource
   * @return uri
  */
  
  @Schema(name = "uri", description = "URI of the parent resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesHierarchyDTO resourcesHierarchyDTO = (ResourcesHierarchyDTO) o;
    return Objects.equals(this.id, resourcesHierarchyDTO.id) &&
        Objects.equals(this.name, resourcesHierarchyDTO.name) &&
        Objects.equals(this.uri, resourcesHierarchyDTO.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesHierarchyDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

