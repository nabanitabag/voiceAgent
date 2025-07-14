package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.Project;

import java.util.Objects;

/**
 * CreateSampleProjectOnSiteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CreateSampleProjectOnSiteResponse {

  private Project project;

  public CreateSampleProjectOnSiteResponse project(Project project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSampleProjectOnSiteResponse createSampleProjectOnSiteResponse = (CreateSampleProjectOnSiteResponse) o;
    return Objects.equals(this.project, createSampleProjectOnSiteResponse.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSampleProjectOnSiteResponse {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

