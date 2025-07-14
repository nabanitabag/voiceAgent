package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.RegionData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RegionsData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class RegionsData {

  @Valid
  private List<@Valid RegionData> regions;

  public RegionsData regions(List<@Valid RegionData> regions) {
    this.regions = regions;
    return this;
  }

  public RegionsData addRegionsItem(RegionData regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions
   * @return regions
  */
  @Valid 
  @Schema(name = "regions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regions")
  public List<@Valid RegionData> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid RegionData> regions) {
    this.regions = regions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionsData regionsData = (RegionsData) o;
    return Objects.equals(this.regions, regionsData.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionsData {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

