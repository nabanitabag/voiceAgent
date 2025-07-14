package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * TenantIdsToCheckResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TenantIdsToCheckResponse {

  private String nextPageToken;

  @Valid
  private List<UUID> tenantIds = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link TenantIdsToCheckResponse#TenantIdsToCheckResponse(List<UUID>)}
   */
  @Deprecated
  public TenantIdsToCheckResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TenantIdsToCheckResponse(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public TenantIdsToCheckResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Get nextPageToken
   * @return nextPageToken
  */
  
  @Schema(name = "nextPageToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public TenantIdsToCheckResponse tenantIds(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
    return this;
  }

  public TenantIdsToCheckResponse addTenantIdsItem(UUID tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new ArrayList<>();
    }
    this.tenantIds.add(tenantIdsItem);
    return this;
  }

  /**
   * Get tenantIds
   * @return tenantIds
  */
  @NotNull @Valid 
  @Schema(name = "tenantIds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantIds")
  public List<UUID> getTenantIds() {
    return tenantIds;
  }

  public void setTenantIds(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantIdsToCheckResponse tenantIdsToCheckResponse = (TenantIdsToCheckResponse) o;
    return Objects.equals(this.nextPageToken, tenantIdsToCheckResponse.nextPageToken) &&
        Objects.equals(this.tenantIds, tenantIdsToCheckResponse.tenantIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tenantIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantIdsToCheckResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    tenantIds: ").append(toIndentedString(tenantIds)).append("\n");
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

