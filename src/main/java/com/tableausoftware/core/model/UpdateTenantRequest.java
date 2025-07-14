package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * UpdateTenantRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UpdateTenantRequest {

  private String encodeUri;

  private String org62RecordId;

  private String tenantName;

  public UpdateTenantRequest encodeUri(String encodeUri) {
    this.encodeUri = encodeUri;
    return this;
  }

  /**
   * URL version of tenant name
   * @return encodeUri
  */
  
  @Schema(name = "encodeUri", description = "URL version of tenant name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encodeUri")
  public String getEncodeUri() {
    return encodeUri;
  }

  public void setEncodeUri(String encodeUri) {
    this.encodeUri = encodeUri;
  }

  public UpdateTenantRequest org62RecordId(String org62RecordId) {
    this.org62RecordId = org62RecordId;
    return this;
  }

  /**
   * Org62 tenantId for purchases and Org62 recordId for trials
   * @return org62RecordId
  */
  
  @Schema(name = "org62RecordId", description = "Org62 tenantId for purchases and Org62 recordId for trials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org62RecordId")
  public String getOrg62RecordId() {
    return org62RecordId;
  }

  public void setOrg62RecordId(String org62RecordId) {
    this.org62RecordId = org62RecordId;
  }

  public UpdateTenantRequest tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Name of tenant
   * @return tenantName
  */
  
  @Schema(name = "tenantName", description = "Name of tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTenantRequest updateTenantRequest = (UpdateTenantRequest) o;
    return Objects.equals(this.encodeUri, updateTenantRequest.encodeUri) &&
        Objects.equals(this.org62RecordId, updateTenantRequest.org62RecordId) &&
        Objects.equals(this.tenantName, updateTenantRequest.tenantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodeUri, org62RecordId, tenantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTenantRequest {\n");
    sb.append("    encodeUri: ").append(toIndentedString(encodeUri)).append("\n");
    sb.append("    org62RecordId: ").append(toIndentedString(org62RecordId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

