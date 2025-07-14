package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * TenantLicenseAggregateRsDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TenantLicenseAggregateRsDTO {

  private Integer creators;

  private Integer explorers;

  private Integer unlicensed;

  private Integer viewers;

  /**
   * Default constructor
   * @deprecated Use {@link TenantLicenseAggregateRsDTO#TenantLicenseAggregateRsDTO(Integer, Integer, Integer, Integer)}
   */
  @Deprecated
  public TenantLicenseAggregateRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TenantLicenseAggregateRsDTO(Integer creators, Integer explorers, Integer unlicensed, Integer viewers) {
    this.creators = creators;
    this.explorers = explorers;
    this.unlicensed = unlicensed;
    this.viewers = viewers;
  }

  public TenantLicenseAggregateRsDTO creators(Integer creators) {
    this.creators = creators;
    return this;
  }

  /**
   * count of creators
   * @return creators
  */
  @NotNull 
  @Schema(name = "creators", description = "count of creators", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creators")
  public Integer getCreators() {
    return creators;
  }

  public void setCreators(Integer creators) {
    this.creators = creators;
  }

  public TenantLicenseAggregateRsDTO explorers(Integer explorers) {
    this.explorers = explorers;
    return this;
  }

  /**
   * count of explorers
   * @return explorers
  */
  @NotNull 
  @Schema(name = "explorers", description = "count of explorers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("explorers")
  public Integer getExplorers() {
    return explorers;
  }

  public void setExplorers(Integer explorers) {
    this.explorers = explorers;
  }

  public TenantLicenseAggregateRsDTO unlicensed(Integer unlicensed) {
    this.unlicensed = unlicensed;
    return this;
  }

  /**
   * count of unlicensed users
   * @return unlicensed
  */
  @NotNull 
  @Schema(name = "unlicensed", description = "count of unlicensed users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unlicensed")
  public Integer getUnlicensed() {
    return unlicensed;
  }

  public void setUnlicensed(Integer unlicensed) {
    this.unlicensed = unlicensed;
  }

  public TenantLicenseAggregateRsDTO viewers(Integer viewers) {
    this.viewers = viewers;
    return this;
  }

  /**
   * count of viewers
   * @return viewers
  */
  @NotNull 
  @Schema(name = "viewers", description = "count of viewers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewers")
  public Integer getViewers() {
    return viewers;
  }

  public void setViewers(Integer viewers) {
    this.viewers = viewers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantLicenseAggregateRsDTO tenantLicenseAggregateRsDTO = (TenantLicenseAggregateRsDTO) o;
    return Objects.equals(this.creators, tenantLicenseAggregateRsDTO.creators) &&
        Objects.equals(this.explorers, tenantLicenseAggregateRsDTO.explorers) &&
        Objects.equals(this.unlicensed, tenantLicenseAggregateRsDTO.unlicensed) &&
        Objects.equals(this.viewers, tenantLicenseAggregateRsDTO.viewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creators, explorers, unlicensed, viewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantLicenseAggregateRsDTO {\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    explorers: ").append(toIndentedString(explorers)).append("\n");
    sb.append("    unlicensed: ").append(toIndentedString(unlicensed)).append("\n");
    sb.append("    viewers: ").append(toIndentedString(viewers)).append("\n");
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

