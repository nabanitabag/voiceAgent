package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.Owner;

import java.util.Objects;

/**
 * Project
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class Project {

  private String contentPermissions;

  private String description;

  private String id;

  private String name;

  private Owner owner;

  private String parentProjectId;

  public Project contentPermissions(String contentPermissions) {
    this.contentPermissions = contentPermissions;
    return this;
  }

  /**
   * Get contentPermissions
   * @return contentPermissions
  */
  
  @Schema(name = "contentPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentPermissions")
  public String getContentPermissions() {
    return contentPermissions;
  }

  public void setContentPermissions(String contentPermissions) {
    this.contentPermissions = contentPermissions;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project owner(Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public Project parentProjectId(String parentProjectId) {
    this.parentProjectId = parentProjectId;
    return this;
  }

  /**
   * Get parentProjectId
   * @return parentProjectId
  */
  
  @Schema(name = "parentProjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentProjectId")
  public String getParentProjectId() {
    return parentProjectId;
  }

  public void setParentProjectId(String parentProjectId) {
    this.parentProjectId = parentProjectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.contentPermissions, project.contentPermissions) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.owner, project.owner) &&
        Objects.equals(this.parentProjectId, project.parentProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentPermissions, description, id, name, owner, parentProjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    contentPermissions: ").append(toIndentedString(contentPermissions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentProjectId: ").append(toIndentedString(parentProjectId)).append("\n");
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

