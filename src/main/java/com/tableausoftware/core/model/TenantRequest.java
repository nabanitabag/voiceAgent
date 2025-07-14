package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.Entitlements;

import java.util.Objects;

/**
 * TenantRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TenantRequest {

  private Entitlements entitlements;

  /**
   * Gets or Sets tenantTypeName
   */
  public enum TenantTypeNameEnum {
    PURCHASE("Purchase"),
    
    WWWTRIAL("WwwTrial"),
    
    SFDCTRIAL("SfdcTrial"),
    
    EMPLOYEE("Employee"),
    
    BETA("Beta"),
    
    DEVELOPER("Developer"),
    
    STUDENT("Student"),
    
    CHANNELPARTNER("ChannelPartner"),
    
    CUSTOMERSANDBOX("CustomerSandbox"),
    
    ELITESUPPORT("EliteSupport"),
    
    SALESFORCEOWNED("SalesforceOwned"),
    
    UNDEFINED("Undefined"),
    
    FOUNDATION("Foundation");

    private String value;

    TenantTypeNameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TenantTypeNameEnum fromValue(String value) {
      for (TenantTypeNameEnum b : TenantTypeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TenantTypeNameEnum tenantTypeName;

  /**
   * Default constructor
   * @deprecated Use {@link TenantRequest#TenantRequest(Entitlements, TenantTypeNameEnum)}
   */
  @Deprecated
  public TenantRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TenantRequest(Entitlements entitlements, TenantTypeNameEnum tenantTypeName) {
    this.entitlements = entitlements;
    this.tenantTypeName = tenantTypeName;
  }

  public TenantRequest entitlements(Entitlements entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  /**
   * Get entitlements
   * @return entitlements
  */
  @NotNull @Valid 
  @Schema(name = "entitlements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entitlements")
  public Entitlements getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(Entitlements entitlements) {
    this.entitlements = entitlements;
  }

  public TenantRequest tenantTypeName(TenantTypeNameEnum tenantTypeName) {
    this.tenantTypeName = tenantTypeName;
    return this;
  }

  /**
   * Get tenantTypeName
   * @return tenantTypeName
  */
  @NotNull 
  @Schema(name = "tenantTypeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantTypeName")
  public TenantTypeNameEnum getTenantTypeName() {
    return tenantTypeName;
  }

  public void setTenantTypeName(TenantTypeNameEnum tenantTypeName) {
    this.tenantTypeName = tenantTypeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantRequest tenantRequest = (TenantRequest) o;
    return Objects.equals(this.entitlements, tenantRequest.entitlements) &&
        Objects.equals(this.tenantTypeName, tenantRequest.tenantTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlements, tenantTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantRequest {\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    tenantTypeName: ").append(toIndentedString(tenantTypeName)).append("\n");
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

