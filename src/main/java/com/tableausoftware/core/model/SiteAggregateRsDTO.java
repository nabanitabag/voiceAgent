package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * List of allSites license aggregates
 */

@Schema(name = "SiteAggregateRsDTO", description = "List of allSites license aggregates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SiteAggregateRsDTO {

  private Integer creators;

  private Integer explorers;

  private Integer siteAdminCount;

  private UUID siteId;

  private Integer unlicensed;

  private Integer userCount;

  private Integer viewers;

  /**
   * Default constructor
   * @deprecated Use {@link SiteAggregateRsDTO#SiteAggregateRsDTO(Integer, Integer, Integer, UUID, Integer, Integer, Integer)}
   */
  @Deprecated
  public SiteAggregateRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SiteAggregateRsDTO(Integer creators, Integer explorers, Integer siteAdminCount, UUID siteId, Integer unlicensed, Integer userCount, Integer viewers) {
    this.creators = creators;
    this.explorers = explorers;
    this.siteAdminCount = siteAdminCount;
    this.siteId = siteId;
    this.unlicensed = unlicensed;
    this.userCount = userCount;
    this.viewers = viewers;
  }

  public SiteAggregateRsDTO creators(Integer creators) {
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

  public SiteAggregateRsDTO explorers(Integer explorers) {
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

  public SiteAggregateRsDTO siteAdminCount(Integer siteAdminCount) {
    this.siteAdminCount = siteAdminCount;
    return this;
  }

  /**
   * count of site admins
   * @return siteAdminCount
  */
  @NotNull 
  @Schema(name = "siteAdminCount", description = "count of site admins", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteAdminCount")
  public Integer getSiteAdminCount() {
    return siteAdminCount;
  }

  public void setSiteAdminCount(Integer siteAdminCount) {
    this.siteAdminCount = siteAdminCount;
  }

  public SiteAggregateRsDTO siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * site's identifier in a tenant
   * @return siteId
  */
  @NotNull @Valid 
  @Schema(name = "siteId", description = "site's identifier in a tenant", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteId")
  public UUID getSiteId() {
    return siteId;
  }

  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  public SiteAggregateRsDTO unlicensed(Integer unlicensed) {
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

  public SiteAggregateRsDTO userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * count of users
   * @return userCount
  */
  @NotNull 
  @Schema(name = "userCount", description = "count of users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public SiteAggregateRsDTO viewers(Integer viewers) {
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
    SiteAggregateRsDTO siteAggregateRsDTO = (SiteAggregateRsDTO) o;
    return Objects.equals(this.creators, siteAggregateRsDTO.creators) &&
        Objects.equals(this.explorers, siteAggregateRsDTO.explorers) &&
        Objects.equals(this.siteAdminCount, siteAggregateRsDTO.siteAdminCount) &&
        Objects.equals(this.siteId, siteAggregateRsDTO.siteId) &&
        Objects.equals(this.unlicensed, siteAggregateRsDTO.unlicensed) &&
        Objects.equals(this.userCount, siteAggregateRsDTO.userCount) &&
        Objects.equals(this.viewers, siteAggregateRsDTO.viewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creators, explorers, siteAdminCount, siteId, unlicensed, userCount, viewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteAggregateRsDTO {\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    explorers: ").append(toIndentedString(explorers)).append("\n");
    sb.append("    siteAdminCount: ").append(toIndentedString(siteAdminCount)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    unlicensed: ").append(toIndentedString(unlicensed)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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

