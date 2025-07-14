package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ValidateSiteNameResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ValidateSiteNameResponse {

  private String contentUrl;

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ValidateSiteNameResponse#ValidateSiteNameResponse(String, String)}
   */
  @Deprecated
  public ValidateSiteNameResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidateSiteNameResponse(String contentUrl, String name) {
    this.contentUrl = contentUrl;
    this.name = name;
  }

  public ValidateSiteNameResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * normalized content_url generate from the name, only contains valid characters and all lower case
   * @return contentUrl
  */
  @NotNull 
  @Schema(name = "contentUrl", description = "normalized content_url generate from the name, only contains valid characters and all lower case", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public ValidateSiteNameResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * normalized site name: removed the leading/trailing spaces and merged the consecutive spaces
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "normalized site name: removed the leading/trailing spaces and merged the consecutive spaces", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateSiteNameResponse validateSiteNameResponse = (ValidateSiteNameResponse) o;
    return Objects.equals(this.contentUrl, validateSiteNameResponse.contentUrl) &&
        Objects.equals(this.name, validateSiteNameResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateSiteNameResponse {\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

