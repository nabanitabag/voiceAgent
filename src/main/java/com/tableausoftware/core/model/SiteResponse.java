package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.PodInstance;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * SiteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SiteResponse {

  private String contentUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateTime;

  private Integer creatorCapacity;

  private Boolean creatorCapacityIsDefaultCloudLimit;

  private Integer explorerCapacity;

  private Boolean explorerCapacityIsDefaultCloudLimit;

  private PodInstance instance;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateDateTime;

  private String location;

  /**
   * The status of an operation to migrate users to a site.
   */
  public enum MigrationStatusEnum {
    NOTSTARTED("NotStarted"),
    
    ZEUSMIGRATIONCOMPLETE("ZeusMigrationComplete"),
    
    USERMIGRATIONSTARTED("UserMigrationStarted"),
    
    USERMIGRATIONCOMPLETE("UserMigrationComplete"),
    
    UNKNOWN("Unknown");

    private String value;

    MigrationStatusEnum(String value) {
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
    public static MigrationStatusEnum fromValue(String value) {
      for (MigrationStatusEnum b : MigrationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MigrationStatusEnum migrationStatus;

  private String name;

  private UUID siteUUID;

  /**
   * The status of the site.
   */
  public enum StatusEnum {
    UNKNOWN("Unknown"),
    
    ACTIVE("Active"),
    
    MOVED("Moved"),
    
    DELETED("Deleted"),
    
    SUSPENDED("Suspended");

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

  private Long storageQuota;

  private Long storageUsed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime suspendedDateTime;

  private UUID tenantId;

  private Integer viewerCapacity;

  private Boolean viewerCapacityIsDefaultCloudLimit;

  public SiteResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * Subdomain name of the site's URL
   * @return contentUrl
  */
  
  @Schema(name = "contentUrl", description = "Subdomain name of the site's URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public SiteResponse createDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * The date and time when the site was created.
   * @return createDateTime
  */
  @Valid 
  @Schema(name = "createDateTime", description = "The date and time when the site was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDateTime")
  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public SiteResponse creatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
    return this;
  }

  /**
   * License capacity for creator, 'tierCreatorCapacity' in Pod's Site attributes
   * @return creatorCapacity
  */
  
  @Schema(name = "creatorCapacity", description = "License capacity for creator, 'tierCreatorCapacity' in Pod's Site attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacity")
  public Integer getCreatorCapacity() {
    return creatorCapacity;
  }

  public void setCreatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
  }

  public SiteResponse creatorCapacityIsDefaultCloudLimit(Boolean creatorCapacityIsDefaultCloudLimit) {
    this.creatorCapacityIsDefaultCloudLimit = creatorCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.
   * @return creatorCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "creatorCapacityIsDefaultCloudLimit", description = "True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacityIsDefaultCloudLimit")
  public Boolean getCreatorCapacityIsDefaultCloudLimit() {
    return creatorCapacityIsDefaultCloudLimit;
  }

  public void setCreatorCapacityIsDefaultCloudLimit(Boolean creatorCapacityIsDefaultCloudLimit) {
    this.creatorCapacityIsDefaultCloudLimit = creatorCapacityIsDefaultCloudLimit;
  }

  public SiteResponse explorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
    return this;
  }

  /**
   * License capacity for explorer, 'tierExplorerCapacity' in Pod's Site attributes
   * @return explorerCapacity
  */
  
  @Schema(name = "explorerCapacity", description = "License capacity for explorer, 'tierExplorerCapacity' in Pod's Site attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacity")
  public Integer getExplorerCapacity() {
    return explorerCapacity;
  }

  public void setExplorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
  }

  public SiteResponse explorerCapacityIsDefaultCloudLimit(Boolean explorerCapacityIsDefaultCloudLimit) {
    this.explorerCapacityIsDefaultCloudLimit = explorerCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.
   * @return explorerCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "explorerCapacityIsDefaultCloudLimit", description = "True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacityIsDefaultCloudLimit")
  public Boolean getExplorerCapacityIsDefaultCloudLimit() {
    return explorerCapacityIsDefaultCloudLimit;
  }

  public void setExplorerCapacityIsDefaultCloudLimit(Boolean explorerCapacityIsDefaultCloudLimit) {
    this.explorerCapacityIsDefaultCloudLimit = explorerCapacityIsDefaultCloudLimit;
  }

  public SiteResponse instance(PodInstance instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
  */
  @Valid 
  @Schema(name = "instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public PodInstance getInstance() {
    return instance;
  }

  public void setInstance(PodInstance instance) {
    this.instance = instance;
  }

  public SiteResponse lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  /**
   * The date and time when the site was last updated.
   * @return lastUpdateDateTime
  */
  @Valid 
  @Schema(name = "lastUpdateDateTime", description = "The date and time when the site was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateDateTime")
  public OffsetDateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public SiteResponse location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The unique identifier of the Tableau region of the site.
   * @return location
  */
  
  @Schema(name = "location", description = "The unique identifier of the Tableau region of the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SiteResponse migrationStatus(MigrationStatusEnum migrationStatus) {
    this.migrationStatus = migrationStatus;
    return this;
  }

  /**
   * The status of an operation to migrate users to a site.
   * @return migrationStatus
  */
  
  @Schema(name = "migrationStatus", description = "The status of an operation to migrate users to a site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("migrationStatus")
  public MigrationStatusEnum getMigrationStatus() {
    return migrationStatus;
  }

  public void setMigrationStatus(MigrationStatusEnum migrationStatus) {
    this.migrationStatus = migrationStatus;
  }

  public SiteResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the site
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SiteResponse siteUUID(UUID siteUUID) {
    this.siteUUID = siteUUID;
    return this;
  }

  /**
   * site LUID
   * @return siteUUID
  */
  @Valid 
  @Schema(name = "siteUUID", description = "site LUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteUUID")
  public UUID getSiteUUID() {
    return siteUUID;
  }

  public void setSiteUUID(UUID siteUUID) {
    this.siteUUID = siteUUID;
  }

  public SiteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the site.
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SiteResponse storageQuota(Long storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

  /**
   * The quota for site storage, in MB.
   * @return storageQuota
  */
  
  @Schema(name = "storageQuota", description = "The quota for site storage, in MB.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageQuota")
  public Long getStorageQuota() {
    return storageQuota;
  }

  public void setStorageQuota(Long storageQuota) {
    this.storageQuota = storageQuota;
  }

  public SiteResponse storageUsed(Long storageUsed) {
    this.storageUsed = storageUsed;
    return this;
  }

  /**
   * The amount of storage currently in use, in MB.
   * @return storageUsed
  */
  
  @Schema(name = "storageUsed", description = "The amount of storage currently in use, in MB.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageUsed")
  public Long getStorageUsed() {
    return storageUsed;
  }

  public void setStorageUsed(Long storageUsed) {
    this.storageUsed = storageUsed;
  }

  public SiteResponse suspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
    return this;
  }

  /**
   * The date and time when the site was suspended.
   * @return suspendedDateTime
  */
  @Valid 
  @Schema(name = "suspendedDateTime", description = "The date and time when the site was suspended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspendedDateTime")
  public OffsetDateTime getSuspendedDateTime() {
    return suspendedDateTime;
  }

  public void setSuspendedDateTime(OffsetDateTime suspendedDateTime) {
    this.suspendedDateTime = suspendedDateTime;
  }

  public SiteResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant ID
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "Tenant ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public SiteResponse viewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
    return this;
  }

  /**
   * License capacity for viewer, 'tierViewerCapacity' in Pod's Site attributes
   * @return viewerCapacity
  */
  
  @Schema(name = "viewerCapacity", description = "License capacity for viewer, 'tierViewerCapacity' in Pod's Site attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewerCapacity")
  public Integer getViewerCapacity() {
    return viewerCapacity;
  }

  public void setViewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
  }

  public SiteResponse viewerCapacityIsDefaultCloudLimit(Boolean viewerCapacityIsDefaultCloudLimit) {
    this.viewerCapacityIsDefaultCloudLimit = viewerCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.
   * @return viewerCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "viewerCapacityIsDefaultCloudLimit", description = "True indicates that the license capacity has been set to the default cloud limit value; false indicates that it has ben manually set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewerCapacityIsDefaultCloudLimit")
  public Boolean getViewerCapacityIsDefaultCloudLimit() {
    return viewerCapacityIsDefaultCloudLimit;
  }

  public void setViewerCapacityIsDefaultCloudLimit(Boolean viewerCapacityIsDefaultCloudLimit) {
    this.viewerCapacityIsDefaultCloudLimit = viewerCapacityIsDefaultCloudLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteResponse siteResponse = (SiteResponse) o;
    return Objects.equals(this.contentUrl, siteResponse.contentUrl) &&
        Objects.equals(this.createDateTime, siteResponse.createDateTime) &&
        Objects.equals(this.creatorCapacity, siteResponse.creatorCapacity) &&
        Objects.equals(this.creatorCapacityIsDefaultCloudLimit, siteResponse.creatorCapacityIsDefaultCloudLimit) &&
        Objects.equals(this.explorerCapacity, siteResponse.explorerCapacity) &&
        Objects.equals(this.explorerCapacityIsDefaultCloudLimit, siteResponse.explorerCapacityIsDefaultCloudLimit) &&
        Objects.equals(this.instance, siteResponse.instance) &&
        Objects.equals(this.lastUpdateDateTime, siteResponse.lastUpdateDateTime) &&
        Objects.equals(this.location, siteResponse.location) &&
        Objects.equals(this.migrationStatus, siteResponse.migrationStatus) &&
        Objects.equals(this.name, siteResponse.name) &&
        Objects.equals(this.siteUUID, siteResponse.siteUUID) &&
        Objects.equals(this.status, siteResponse.status) &&
        Objects.equals(this.storageQuota, siteResponse.storageQuota) &&
        Objects.equals(this.storageUsed, siteResponse.storageUsed) &&
        Objects.equals(this.suspendedDateTime, siteResponse.suspendedDateTime) &&
        Objects.equals(this.tenantId, siteResponse.tenantId) &&
        Objects.equals(this.viewerCapacity, siteResponse.viewerCapacity) &&
        Objects.equals(this.viewerCapacityIsDefaultCloudLimit, siteResponse.viewerCapacityIsDefaultCloudLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl, createDateTime, creatorCapacity, creatorCapacityIsDefaultCloudLimit, explorerCapacity, explorerCapacityIsDefaultCloudLimit, instance, lastUpdateDateTime, location, migrationStatus, name, siteUUID, status, storageQuota, storageUsed, suspendedDateTime, tenantId, viewerCapacity, viewerCapacityIsDefaultCloudLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteResponse {\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    creatorCapacity: ").append(toIndentedString(creatorCapacity)).append("\n");
    sb.append("    creatorCapacityIsDefaultCloudLimit: ").append(toIndentedString(creatorCapacityIsDefaultCloudLimit)).append("\n");
    sb.append("    explorerCapacity: ").append(toIndentedString(explorerCapacity)).append("\n");
    sb.append("    explorerCapacityIsDefaultCloudLimit: ").append(toIndentedString(explorerCapacityIsDefaultCloudLimit)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    migrationStatus: ").append(toIndentedString(migrationStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteUUID: ").append(toIndentedString(siteUUID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    storageUsed: ").append(toIndentedString(storageUsed)).append("\n");
    sb.append("    suspendedDateTime: ").append(toIndentedString(suspendedDateTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    viewerCapacity: ").append(toIndentedString(viewerCapacity)).append("\n");
    sb.append("    viewerCapacityIsDefaultCloudLimit: ").append(toIndentedString(viewerCapacityIsDefaultCloudLimit)).append("\n");
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

