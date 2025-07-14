package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UpdatePrivateConnectionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UpdatePrivateConnectionRequest {

  private String description;

  private String name;

  private String region;

  @Valid
  private List<String> siteLuids;

  public UpdatePrivateConnectionRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Size(max = 250) 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatePrivateConnectionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(max = 80) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatePrivateConnectionRequest region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public UpdatePrivateConnectionRequest siteLuids(List<String> siteLuids) {
    this.siteLuids = siteLuids;
    return this;
  }

  public UpdatePrivateConnectionRequest addSiteLuidsItem(String siteLuidsItem) {
    if (this.siteLuids == null) {
      this.siteLuids = new ArrayList<>();
    }
    this.siteLuids.add(siteLuidsItem);
    return this;
  }

  /**
   * Get siteLuids
   * @return siteLuids
  */
  
  @Schema(name = "siteLuids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteLuids")
  public List<String> getSiteLuids() {
    return siteLuids;
  }

  public void setSiteLuids(List<String> siteLuids) {
    this.siteLuids = siteLuids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePrivateConnectionRequest updatePrivateConnectionRequest = (UpdatePrivateConnectionRequest) o;
    return Objects.equals(this.description, updatePrivateConnectionRequest.description) &&
        Objects.equals(this.name, updatePrivateConnectionRequest.name) &&
        Objects.equals(this.region, updatePrivateConnectionRequest.region) &&
        Objects.equals(this.siteLuids, updatePrivateConnectionRequest.siteLuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, region, siteLuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrivateConnectionRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    siteLuids: ").append(toIndentedString(siteLuids)).append("\n");
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

