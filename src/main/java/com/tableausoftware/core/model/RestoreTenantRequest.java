package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * Placeholder containing the tenantId and timestamp at which restore is intended for tenant
 */

@Schema(name = "RestoreTenantRequest", description = "Placeholder containing the tenantId and timestamp at which restore is intended for tenant")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class RestoreTenantRequest {

  private UUID tenantId;

  private Long timestampToRestoreFrom;

  /**
   * Default constructor
   * @deprecated Use {@link RestoreTenantRequest#RestoreTenantRequest(UUID, Long)}
   */
  @Deprecated
  public RestoreTenantRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RestoreTenantRequest(UUID tenantId, Long timestampToRestoreFrom) {
    this.tenantId = tenantId;
    this.timestampToRestoreFrom = timestampToRestoreFrom;
  }

  public RestoreTenantRequest tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * identifier of the tenant, whose users will be restored
   * @return tenantId
  */
  @NotNull @Valid 
  @Schema(name = "tenantId", description = "identifier of the tenant, whose users will be restored", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public RestoreTenantRequest timestampToRestoreFrom(Long timestampToRestoreFrom) {
    this.timestampToRestoreFrom = timestampToRestoreFrom;
    return this;
  }

  /**
   * timestamp for which we want the restore of
   * @return timestampToRestoreFrom
  */
  @NotNull 
  @Schema(name = "timestampToRestoreFrom", description = "timestamp for which we want the restore of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestampToRestoreFrom")
  public Long getTimestampToRestoreFrom() {
    return timestampToRestoreFrom;
  }

  public void setTimestampToRestoreFrom(Long timestampToRestoreFrom) {
    this.timestampToRestoreFrom = timestampToRestoreFrom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreTenantRequest restoreTenantRequest = (RestoreTenantRequest) o;
    return Objects.equals(this.tenantId, restoreTenantRequest.tenantId) &&
        Objects.equals(this.timestampToRestoreFrom, restoreTenantRequest.timestampToRestoreFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, timestampToRestoreFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreTenantRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    timestampToRestoreFrom: ").append(toIndentedString(timestampToRestoreFrom)).append("\n");
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

