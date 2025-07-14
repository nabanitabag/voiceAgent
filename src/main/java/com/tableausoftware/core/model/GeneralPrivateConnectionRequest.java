package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * GeneralPrivateConnectionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GeneralPrivateConnectionRequest {

  private String privateConnectionId;

  private String tenantId;

  /**
   * Default constructor
   * @deprecated Use {@link GeneralPrivateConnectionRequest#GeneralPrivateConnectionRequest(String)}
   */
  @Deprecated
  public GeneralPrivateConnectionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeneralPrivateConnectionRequest(String privateConnectionId) {
    this.privateConnectionId = privateConnectionId;
  }

  public GeneralPrivateConnectionRequest privateConnectionId(String privateConnectionId) {
    this.privateConnectionId = privateConnectionId;
    return this;
  }

  /**
   * Get privateConnectionId
   * @return privateConnectionId
  */
  @NotNull 
  @Schema(name = "privateConnectionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("privateConnectionId")
  public String getPrivateConnectionId() {
    return privateConnectionId;
  }

  public void setPrivateConnectionId(String privateConnectionId) {
    this.privateConnectionId = privateConnectionId;
  }

  public GeneralPrivateConnectionRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralPrivateConnectionRequest generalPrivateConnectionRequest = (GeneralPrivateConnectionRequest) o;
    return Objects.equals(this.privateConnectionId, generalPrivateConnectionRequest.privateConnectionId) &&
        Objects.equals(this.tenantId, generalPrivateConnectionRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateConnectionId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralPrivateConnectionRequest {\n");
    sb.append("    privateConnectionId: ").append(toIndentedString(privateConnectionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

