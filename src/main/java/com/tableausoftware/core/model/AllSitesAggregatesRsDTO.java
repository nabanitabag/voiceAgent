package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.SiteAggregateRsDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AllSitesAggregatesRsDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class AllSitesAggregatesRsDTO {

  @Valid
  private List<@Valid SiteAggregateRsDTO> allSites = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link AllSitesAggregatesRsDTO#AllSitesAggregatesRsDTO(List<@Valid SiteAggregateRsDTO>)}
   */
  @Deprecated
  public AllSitesAggregatesRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AllSitesAggregatesRsDTO(List<@Valid SiteAggregateRsDTO> allSites) {
    this.allSites = allSites;
  }

  public AllSitesAggregatesRsDTO allSites(List<@Valid SiteAggregateRsDTO> allSites) {
    this.allSites = allSites;
    return this;
  }

  public AllSitesAggregatesRsDTO addAllSitesItem(SiteAggregateRsDTO allSitesItem) {
    if (this.allSites == null) {
      this.allSites = new ArrayList<>();
    }
    this.allSites.add(allSitesItem);
    return this;
  }

  /**
   * List of allSites license aggregates
   * @return allSites
  */
  @NotNull @Valid 
  @Schema(name = "allSites", description = "List of allSites license aggregates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allSites")
  public List<@Valid SiteAggregateRsDTO> getAllSites() {
    return allSites;
  }

  public void setAllSites(List<@Valid SiteAggregateRsDTO> allSites) {
    this.allSites = allSites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllSitesAggregatesRsDTO allSitesAggregatesRsDTO = (AllSitesAggregatesRsDTO) o;
    return Objects.equals(this.allSites, allSitesAggregatesRsDTO.allSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allSites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllSitesAggregatesRsDTO {\n");
    sb.append("    allSites: ").append(toIndentedString(allSites)).append("\n");
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

