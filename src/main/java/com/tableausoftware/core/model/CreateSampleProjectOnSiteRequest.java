package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * CreateSampleProjectOnSiteRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CreateSampleProjectOnSiteRequest {

  private String ownerId;

  /**
   * Default constructor
   * @deprecated Use {@link CreateSampleProjectOnSiteRequest#CreateSampleProjectOnSiteRequest(String)}
   */
  @Deprecated
  public CreateSampleProjectOnSiteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSampleProjectOnSiteRequest(String ownerId) {
    this.ownerId = ownerId;
  }

  public CreateSampleProjectOnSiteRequest ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The LUID of the user that owns the project.
   * @return ownerId
  */
  @NotNull 
  @Schema(name = "ownerId", description = "The LUID of the user that owns the project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSampleProjectOnSiteRequest createSampleProjectOnSiteRequest = (CreateSampleProjectOnSiteRequest) o;
    return Objects.equals(this.ownerId, createSampleProjectOnSiteRequest.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSampleProjectOnSiteRequest {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

