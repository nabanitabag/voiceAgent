package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.Entitlements;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * TenantEntitlementsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TenantEntitlementsResponse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deleteRequestedDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deletedDateTime;

  private Entitlements entitlements;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime mergedFromDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime suspendRequestedDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime suspendedDateTime;

  private UUID tenantId;

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
   * @deprecated Use {@link TenantEntitlementsResponse#TenantEntitlementsResponse(Entitlements, UUID)}
   */
  @Deprecated
  public TenantEntitlementsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TenantEntitlementsResponse(Entitlements entitlements, UUID tenantId) {
    this.entitlements = entitlements;
    this.tenantId = tenantId;
  }

  public TenantEntitlementsResponse createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Get createdDateTime
   * @return createdDateTime
  */
  @Valid 
  @Schema(name = "createdDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDateTime")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public TenantEntitlementsResponse deleteRequestedDateTime(OffsetDateTime deleteRequestedDateTime) {
    this.deleteRequestedDateTime = deleteRequestedDateTime;
    return this;
  }

  /**
   * Get deleteRequestedDateTime
   * @return deleteRequestedDateTime
  */
  @Valid 
  @Schema(name = "deleteRequestedDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteRequestedDateTime")
  public OffsetDateTime getDeleteRequestedDateTime() {
    return deleteRequestedDateTime;
  }

  public void setDeleteRequestedDateTime(OffsetDateTime deleteRequestedDateTime) {
    this.deleteRequestedDateTime = deleteRequestedDateTime;
  }

  public TenantEntitlementsResponse deletedDateTime(OffsetDateTime deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
    return this;
  }

  /**
   * Get deletedDateTime
   * @return deletedDateTime
  */
  @Valid 
  @Schema(name = "deletedDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedDateTime")
  public OffsetDateTime getDeletedDateTime() {
    return deletedDateTime;
  }

  public void setDeletedDateTime(OffsetDateTime deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
  }

  public TenantEntitlementsResponse entitlements(Entitlements entitlements) {
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

  public TenantEntitlementsResponse mergedFromDateTime(OffsetDateTime mergedFromDateTime) {
    this.mergedFromDateTime = mergedFromDateTime;
    return this;
  }

  /**
   * Get mergedFromDateTime
   * @return mergedFromDateTime
  */
  @Valid 
  @Schema(name = "mergedFromDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mergedFromDateTime")
  public OffsetDateTime getMergedFromDateTime() {
    return mergedFromDateTime;
  }

  public void setMergedFromDateTime(OffsetDateTime mergedFromDateTime) {
    this.mergedFromDateTime = mergedFromDateTime;
  }

  public TenantEntitlementsResponse suspendRequestedDateTime(OffsetDateTime suspendRequestedDateTime) {
    this.suspendRequestedDateTime = suspendRequestedDateTime;
    return this;
  }

  /**
   * Get suspendRequestedDateTime
   * @return suspendRequestedDateTime
  */
  @Valid 
  @Schema(name = "suspendRequestedDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspendRequestedDateTime")
  public OffsetDateTime getSuspendRequestedDateTime() {
    return suspendRequestedDateTime;
  }

  public void setSuspendRequestedDateTime(OffsetDateTime suspendRequestedDateTime) {
    this.suspendRequestedDateTime = suspendRequestedDateTime;
  }

  public TenantEntitlementsResponse suspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
    return this;
  }

  /**
   * Get suspendedDateTime
   * @return suspendedDateTime
  */
  @Valid 
  @Schema(name = "suspendedDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspendedDateTime")
  public OffsetDateTime getSuspendedDateTime() {
    return suspendedDateTime;
  }

  public void setSuspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
  }

  public TenantEntitlementsResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  @NotNull @Valid 
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public TenantEntitlementsResponse tenantTypeName(TenantTypeNameEnum tenantTypeName) {
    this.tenantTypeName = tenantTypeName;
    return this;
  }

  /**
   * Get tenantTypeName
   * @return tenantTypeName
  */
  
  @Schema(name = "tenantTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TenantEntitlementsResponse tenantEntitlementsResponse = (TenantEntitlementsResponse) o;
    return Objects.equals(this.createdDateTime, tenantEntitlementsResponse.createdDateTime) &&
        Objects.equals(this.deleteRequestedDateTime, tenantEntitlementsResponse.deleteRequestedDateTime) &&
        Objects.equals(this.deletedDateTime, tenantEntitlementsResponse.deletedDateTime) &&
        Objects.equals(this.entitlements, tenantEntitlementsResponse.entitlements) &&
        Objects.equals(this.mergedFromDateTime, tenantEntitlementsResponse.mergedFromDateTime) &&
        Objects.equals(this.suspendRequestedDateTime, tenantEntitlementsResponse.suspendRequestedDateTime) &&
        Objects.equals(this.suspendedDateTime, tenantEntitlementsResponse.suspendedDateTime) &&
        Objects.equals(this.tenantId, tenantEntitlementsResponse.tenantId) &&
        Objects.equals(this.tenantTypeName, tenantEntitlementsResponse.tenantTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDateTime, deleteRequestedDateTime, deletedDateTime, entitlements, mergedFromDateTime, suspendRequestedDateTime, suspendedDateTime, tenantId, tenantTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantEntitlementsResponse {\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    deleteRequestedDateTime: ").append(toIndentedString(deleteRequestedDateTime)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    mergedFromDateTime: ").append(toIndentedString(mergedFromDateTime)).append("\n");
    sb.append("    suspendRequestedDateTime: ").append(toIndentedString(suspendRequestedDateTime)).append("\n");
    sb.append("    suspendedDateTime: ").append(toIndentedString(suspendedDateTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

