package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * CreateSiteRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CreateSiteRequest {

  private String contentUrl;

  private String name;

  private UUID podUUID;

  private UUID regionUUID;

  /**
   * Default constructor
   * @deprecated Use {@link CreateSiteRequest#CreateSiteRequest(String, String)}
   */
  @Deprecated
  public CreateSiteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSiteRequest(String contentUrl, String name) {
    this.contentUrl = contentUrl;
    this.name = name;
  }

  public CreateSiteRequest contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The subdomain name of the site's URL. This value can contain only characters that are upper or lower case alphabetic characters, numbers, hyphens (-), or underscores (_). If you provide unsupported special characters, Tableau creates the site content URL by omitting those characters from the string. For example, if you provide the site URL as \"test.site\", Tableau converts it to \"testsite\" and returns this new URL in the response.
   * @return contentUrl
  */
  @NotNull 
  @Schema(name = "contentUrl", description = "The subdomain name of the site's URL. This value can contain only characters that are upper or lower case alphabetic characters, numbers, hyphens (-), or underscores (_). If you provide unsupported special characters, Tableau creates the site content URL by omitting those characters from the string. For example, if you provide the site URL as \"test.site\", Tableau converts it to \"testsite\" and returns this new URL in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public CreateSiteRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * xs:string: name, site name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "xs:string: name, site name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSiteRequest podUUID(UUID podUUID) {
    this.podUUID = podUUID;
    return this;
  }

  /**
   * The Unique ID of Tableau pod where the site should be created. Provide this or the regionUUID. Use the [List Locations](#tag/Tenant-Methods/operation/getLocations) method to get the pod IDs.
   * @return podUUID
  */
  @Valid 
  @Schema(name = "podUUID", description = "The Unique ID of Tableau pod where the site should be created. Provide this or the regionUUID. Use the [List Locations](#tag/Tenant-Methods/operation/getLocations) method to get the pod IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podUUID")
  public UUID getPodUUID() {
    return podUUID;
  }

  public void setPodUUID(UUID podUUID) {
    this.podUUID = podUUID;
  }

  public CreateSiteRequest regionUUID(UUID regionUUID) {
    this.regionUUID = regionUUID;
    return this;
  }

  /**
   * Unique ID of region where the site should be created
   * @return regionUUID
  */
  @Valid 
  @Schema(name = "regionUUID", description = "Unique ID of region where the site should be created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionUUID")
  public UUID getRegionUUID() {
    return regionUUID;
  }

  public void setRegionUUID(UUID regionUUID) {
    this.regionUUID = regionUUID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSiteRequest createSiteRequest = (CreateSiteRequest) o;
    return Objects.equals(this.contentUrl, createSiteRequest.contentUrl) &&
        Objects.equals(this.name, createSiteRequest.name) &&
        Objects.equals(this.podUUID, createSiteRequest.podUUID) &&
        Objects.equals(this.regionUUID, createSiteRequest.regionUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl, name, podUUID, regionUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSiteRequest {\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podUUID: ").append(toIndentedString(podUUID)).append("\n");
    sb.append("    regionUUID: ").append(toIndentedString(regionUUID)).append("\n");
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

