package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.SiteResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetSiteListingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GetSiteListingResponse {

  private String pageToken;

  @Valid
  private List<@Valid SiteResponse> sites;

  public GetSiteListingResponse pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * The token to retrieve the next page of results.
   * @return pageToken
  */
  
  @Schema(name = "pageToken", description = "The token to retrieve the next page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public GetSiteListingResponse sites(List<@Valid SiteResponse> sites) {
    this.sites = sites;
    return this;
  }

  public GetSiteListingResponse addSitesItem(SiteResponse sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

  /**
   * Get sites
   * @return sites
  */
  @Valid 
  @Schema(name = "sites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sites")
  public List<@Valid SiteResponse> getSites() {
    return sites;
  }

  public void setSites(List<@Valid SiteResponse> sites) {
    this.sites = sites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSiteListingResponse getSiteListingResponse = (GetSiteListingResponse) o;
    return Objects.equals(this.pageToken, getSiteListingResponse.pageToken) &&
        Objects.equals(this.sites, getSiteListingResponse.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, sites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSiteListingResponse {\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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

