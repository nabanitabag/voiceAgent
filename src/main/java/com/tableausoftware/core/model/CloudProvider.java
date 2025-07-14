package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * The cloud provider of the pod instance.
 */

@Schema(name = "CloudProvider", description = "The cloud provider of the pod instance.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CloudProvider {

  private String name;

  private String region;

  public CloudProvider name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the cloud provider.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the cloud provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudProvider region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The unique identifier of the region of the cloud provider.
   * @return region
  */
  
  @Schema(name = "region", description = "The unique identifier of the region of the cloud provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProvider cloudProvider = (CloudProvider) o;
    return Objects.equals(this.name, cloudProvider.name) &&
        Objects.equals(this.region, cloudProvider.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProvider {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

