package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.TermsAndConditions;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * TenantResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TenantResponse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateTime;

  private String encodeUri;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastDestinationMergedDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateDateTime;

  private String org62RecordId;

  /**
   * Status of the tenant - could be active/suspended/inactive
   */
  public enum StatusEnum {
    UNKNOWN("Unknown"),
    
    ACTIVE("Active"),
    
    LOCKED("Locked"),
    
    MERGED("Merged"),
    
    SUSPENDED("Suspended"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private UUID tenantId;

  private String tenantName;

  private TermsAndConditions termsAndConditions;

  /**
   * Default constructor
   * @deprecated Use {@link TenantResponse#TenantResponse(String)}
   */
  @Deprecated
  public TenantResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TenantResponse(String tenantName) {
    this.tenantName = tenantName;
  }

  public TenantResponse createDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * Timestamp of tenant entity creation
   * @return createDateTime
  */
  @Valid 
  @Schema(name = "createDateTime", description = "Timestamp of tenant entity creation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDateTime")
  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public TenantResponse encodeUri(String encodeUri) {
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

  public TenantResponse lastDestinationMergedDateTime(OffsetDateTime lastDestinationMergedDateTime) {
    this.lastDestinationMergedDateTime = lastDestinationMergedDateTime;
    return this;
  }

  /**
   * The timestamp for the most recent merge of another tenant into this one.
   * @return lastDestinationMergedDateTime
  */
  @Valid 
  @Schema(name = "lastDestinationMergedDateTime", description = "The timestamp for the most recent merge of another tenant into this one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastDestinationMergedDateTime")
  public OffsetDateTime getLastDestinationMergedDateTime() {
    return lastDestinationMergedDateTime;
  }

  public void setLastDestinationMergedDateTime(OffsetDateTime lastDestinationMergedDateTime) {
    this.lastDestinationMergedDateTime = lastDestinationMergedDateTime;
  }

  public TenantResponse lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  /**
   * Timestamp of last update of tenant entity
   * @return lastUpdateDateTime
  */
  @Valid 
  @Schema(name = "lastUpdateDateTime", description = "Timestamp of last update of tenant entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateDateTime")
  public OffsetDateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public TenantResponse org62RecordId(String org62RecordId) {
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

  public TenantResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the tenant - could be active/suspended/inactive
   * @return status
  */
  
  @Schema(name = "status", description = "Status of the tenant - could be active/suspended/inactive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TenantResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Unique ID of the tenant
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "Unique ID of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public TenantResponse tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Name of the tenant
   * @return tenantName
  */
  @NotNull 
  @Schema(name = "tenantName", description = "Name of the tenant", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public TenantResponse termsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Get termsAndConditions
   * @return termsAndConditions
  */
  @Valid 
  @Schema(name = "termsAndConditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsAndConditions")
  public TermsAndConditions getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantResponse tenantResponse = (TenantResponse) o;
    return Objects.equals(this.createDateTime, tenantResponse.createDateTime) &&
        Objects.equals(this.encodeUri, tenantResponse.encodeUri) &&
        Objects.equals(this.lastDestinationMergedDateTime, tenantResponse.lastDestinationMergedDateTime) &&
        Objects.equals(this.lastUpdateDateTime, tenantResponse.lastUpdateDateTime) &&
        Objects.equals(this.org62RecordId, tenantResponse.org62RecordId) &&
        Objects.equals(this.status, tenantResponse.status) &&
        Objects.equals(this.tenantId, tenantResponse.tenantId) &&
        Objects.equals(this.tenantName, tenantResponse.tenantName) &&
        Objects.equals(this.termsAndConditions, tenantResponse.termsAndConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDateTime, encodeUri, lastDestinationMergedDateTime, lastUpdateDateTime, org62RecordId, status, tenantId, tenantName, termsAndConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantResponse {\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    encodeUri: ").append(toIndentedString(encodeUri)).append("\n");
    sb.append("    lastDestinationMergedDateTime: ").append(toIndentedString(lastDestinationMergedDateTime)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    org62RecordId: ").append(toIndentedString(org62RecordId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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

