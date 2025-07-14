package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.PodInstance;
import com.tableausoftware.core.model.PodSite;
import com.tableausoftware.core.model.SiteSettingType;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * CreateSiteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CreateSiteResponse {

  private String contentUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateTime;

  private Integer creatorCapacity;

  private Boolean creatorCapacityIsDefaultCloudLimit;

  private Integer explorerCapacity;

  private Boolean explorerCapacityIsDefaultCloudLimit;

  private PodSite fromPodSiteAttributes;

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

  @Valid
  private List<@Valid SiteSettingType> siteSettings;

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

  public CreateSiteResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The subdomain name of the site's URL. This value can contain only characters that are upper or lower case alphabetic characters, numbers, hyphens (-), or underscores (_). If you provide unsupported special characters, Tableau creates the site content URL by omitting those characters from the string. For example, if you provide the site URL as \"test.site\", Tableau converts it to \"testsite\" and returns this new URL in the response.
   * @return contentUrl
  */
  
  @Schema(name = "contentUrl", description = "The subdomain name of the site's URL. This value can contain only characters that are upper or lower case alphabetic characters, numbers, hyphens (-), or underscores (_). If you provide unsupported special characters, Tableau creates the site content URL by omitting those characters from the string. For example, if you provide the site URL as \"test.site\", Tableau converts it to \"testsite\" and returns this new URL in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public CreateSiteResponse createDateTime(OffsetDateTime createDateTime) {
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

  public CreateSiteResponse creatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
    return this;
  }

  /**
   * The limit to the number of users licensed with the creator role on the site. Only present in the response body if those quotas have been set for the site.
   * @return creatorCapacity
  */
  
  @Schema(name = "creatorCapacity", description = "The limit to the number of users licensed with the creator role on the site. Only present in the response body if those quotas have been set for the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacity")
  public Integer getCreatorCapacity() {
    return creatorCapacity;
  }

  public void setCreatorCapacity(Integer creatorCapacity) {
    this.creatorCapacity = creatorCapacity;
  }

  public CreateSiteResponse creatorCapacityIsDefaultCloudLimit(Boolean creatorCapacityIsDefaultCloudLimit) {
    this.creatorCapacityIsDefaultCloudLimit = creatorCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * If true, the limit to the number of users licensed with the creator role is the default cloud limit value. If false, a custom limit has been set.
   * @return creatorCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "creatorCapacityIsDefaultCloudLimit", description = "If true, the limit to the number of users licensed with the creator role is the default cloud limit value. If false, a custom limit has been set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorCapacityIsDefaultCloudLimit")
  public Boolean getCreatorCapacityIsDefaultCloudLimit() {
    return creatorCapacityIsDefaultCloudLimit;
  }

  public void setCreatorCapacityIsDefaultCloudLimit(Boolean creatorCapacityIsDefaultCloudLimit) {
    this.creatorCapacityIsDefaultCloudLimit = creatorCapacityIsDefaultCloudLimit;
  }

  public CreateSiteResponse explorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
    return this;
  }

  /**
   * The limit to the number of users licensed with the explorer role on the site. Only present in the response body if those quotas have been set for the site.
   * @return explorerCapacity
  */
  
  @Schema(name = "explorerCapacity", description = "The limit to the number of users licensed with the explorer role on the site. Only present in the response body if those quotas have been set for the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacity")
  public Integer getExplorerCapacity() {
    return explorerCapacity;
  }

  public void setExplorerCapacity(Integer explorerCapacity) {
    this.explorerCapacity = explorerCapacity;
  }

  public CreateSiteResponse explorerCapacityIsDefaultCloudLimit(Boolean explorerCapacityIsDefaultCloudLimit) {
    this.explorerCapacityIsDefaultCloudLimit = explorerCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * If true, the limit to the number of users licensed with the explorer role is the default cloud limit value. If false, a custom limit has been set.
   * @return explorerCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "explorerCapacityIsDefaultCloudLimit", description = "If true, the limit to the number of users licensed with the explorer role is the default cloud limit value. If false, a custom limit has been set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explorerCapacityIsDefaultCloudLimit")
  public Boolean getExplorerCapacityIsDefaultCloudLimit() {
    return explorerCapacityIsDefaultCloudLimit;
  }

  public void setExplorerCapacityIsDefaultCloudLimit(Boolean explorerCapacityIsDefaultCloudLimit) {
    this.explorerCapacityIsDefaultCloudLimit = explorerCapacityIsDefaultCloudLimit;
  }

  public CreateSiteResponse fromPodSiteAttributes(PodSite fromPodSiteAttributes) {
    this.fromPodSiteAttributes = fromPodSiteAttributes;
    return this;
  }

  /**
   * Get fromPodSiteAttributes
   * @return fromPodSiteAttributes
  */
  @Valid 
  @Schema(name = "fromPodSiteAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromPodSiteAttributes")
  public PodSite getFromPodSiteAttributes() {
    return fromPodSiteAttributes;
  }

  public void setFromPodSiteAttributes(PodSite fromPodSiteAttributes) {
    this.fromPodSiteAttributes = fromPodSiteAttributes;
  }

  public CreateSiteResponse instance(PodInstance instance) {
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

  public CreateSiteResponse lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
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

  public CreateSiteResponse location(String location) {
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

  public CreateSiteResponse migrationStatus(MigrationStatusEnum migrationStatus) {
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

  public CreateSiteResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * xs:string: name
   * @return name
  */
  
  @Schema(name = "name", description = "xs:string: name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSiteResponse siteSettings(List<@Valid SiteSettingType> siteSettings) {
    this.siteSettings = siteSettings;
    return this;
  }

  public CreateSiteResponse addSiteSettingsItem(SiteSettingType siteSettingsItem) {
    if (this.siteSettings == null) {
      this.siteSettings = new ArrayList<>();
    }
    this.siteSettings.add(siteSettingsItem);
    return this;
  }

  /**
   * Get siteSettings
   * @return siteSettings
  */
  @Valid 
  @Schema(name = "siteSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteSettings")
  public List<@Valid SiteSettingType> getSiteSettings() {
    return siteSettings;
  }

  public void setSiteSettings(List<@Valid SiteSettingType> siteSettings) {
    this.siteSettings = siteSettings;
  }

  public CreateSiteResponse siteUUID(UUID siteUUID) {
    this.siteUUID = siteUUID;
    return this;
  }

  /**
   * The LUID of the site.
   * @return siteUUID
  */
  @Valid 
  @Schema(name = "siteUUID", description = "The LUID of the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteUUID")
  public UUID getSiteUUID() {
    return siteUUID;
  }

  public void setSiteUUID(UUID siteUUID) {
    this.siteUUID = siteUUID;
  }

  public CreateSiteResponse status(StatusEnum status) {
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

  public CreateSiteResponse storageQuota(Long storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

  /**
   * (Optional) The maximum amount of space for the new site, in megabytes. If you set a quota and the site exceeds it, publishers will be prevented from uploading new content until the site is under the limit again.
   * @return storageQuota
  */
  
  @Schema(name = "storageQuota", description = "(Optional) The maximum amount of space for the new site, in megabytes. If you set a quota and the site exceeds it, publishers will be prevented from uploading new content until the site is under the limit again.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageQuota")
  public Long getStorageQuota() {
    return storageQuota;
  }

  public void setStorageQuota(Long storageQuota) {
    this.storageQuota = storageQuota;
  }

  public CreateSiteResponse storageUsed(Long storageUsed) {
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

  public CreateSiteResponse suspendedDateTime(OffsetDateTime suspendedDateTime) {
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

  public CreateSiteResponse tenantId(UUID tenantId) {
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

  public CreateSiteResponse viewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
    return this;
  }

  /**
   * The limit to the number of users licensed with the viewer role on the site. Only present in the response body if those quotas have been set for the site.
   * @return viewerCapacity
  */
  
  @Schema(name = "viewerCapacity", description = "The limit to the number of users licensed with the viewer role on the site. Only present in the response body if those quotas have been set for the site.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewerCapacity")
  public Integer getViewerCapacity() {
    return viewerCapacity;
  }

  public void setViewerCapacity(Integer viewerCapacity) {
    this.viewerCapacity = viewerCapacity;
  }

  public CreateSiteResponse viewerCapacityIsDefaultCloudLimit(Boolean viewerCapacityIsDefaultCloudLimit) {
    this.viewerCapacityIsDefaultCloudLimit = viewerCapacityIsDefaultCloudLimit;
    return this;
  }

  /**
   * If true, the limit to the number of users licensed with the viewer role is the default cloud limit value. If false, a custom limit has been set.
   * @return viewerCapacityIsDefaultCloudLimit
  */
  
  @Schema(name = "viewerCapacityIsDefaultCloudLimit", description = "If true, the limit to the number of users licensed with the viewer role is the default cloud limit value. If false, a custom limit has been set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateSiteResponse createSiteResponse = (CreateSiteResponse) o;
    return Objects.equals(this.contentUrl, createSiteResponse.contentUrl) &&
        Objects.equals(this.createDateTime, createSiteResponse.createDateTime) &&
        Objects.equals(this.creatorCapacity, createSiteResponse.creatorCapacity) &&
        Objects.equals(this.creatorCapacityIsDefaultCloudLimit, createSiteResponse.creatorCapacityIsDefaultCloudLimit) &&
        Objects.equals(this.explorerCapacity, createSiteResponse.explorerCapacity) &&
        Objects.equals(this.explorerCapacityIsDefaultCloudLimit, createSiteResponse.explorerCapacityIsDefaultCloudLimit) &&
        Objects.equals(this.fromPodSiteAttributes, createSiteResponse.fromPodSiteAttributes) &&
        Objects.equals(this.instance, createSiteResponse.instance) &&
        Objects.equals(this.lastUpdateDateTime, createSiteResponse.lastUpdateDateTime) &&
        Objects.equals(this.location, createSiteResponse.location) &&
        Objects.equals(this.migrationStatus, createSiteResponse.migrationStatus) &&
        Objects.equals(this.name, createSiteResponse.name) &&
        Objects.equals(this.siteSettings, createSiteResponse.siteSettings) &&
        Objects.equals(this.siteUUID, createSiteResponse.siteUUID) &&
        Objects.equals(this.status, createSiteResponse.status) &&
        Objects.equals(this.storageQuota, createSiteResponse.storageQuota) &&
        Objects.equals(this.storageUsed, createSiteResponse.storageUsed) &&
        Objects.equals(this.suspendedDateTime, createSiteResponse.suspendedDateTime) &&
        Objects.equals(this.tenantId, createSiteResponse.tenantId) &&
        Objects.equals(this.viewerCapacity, createSiteResponse.viewerCapacity) &&
        Objects.equals(this.viewerCapacityIsDefaultCloudLimit, createSiteResponse.viewerCapacityIsDefaultCloudLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl, createDateTime, creatorCapacity, creatorCapacityIsDefaultCloudLimit, explorerCapacity, explorerCapacityIsDefaultCloudLimit, fromPodSiteAttributes, instance, lastUpdateDateTime, location, migrationStatus, name, siteSettings, siteUUID, status, storageQuota, storageUsed, suspendedDateTime, tenantId, viewerCapacity, viewerCapacityIsDefaultCloudLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSiteResponse {\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    creatorCapacity: ").append(toIndentedString(creatorCapacity)).append("\n");
    sb.append("    creatorCapacityIsDefaultCloudLimit: ").append(toIndentedString(creatorCapacityIsDefaultCloudLimit)).append("\n");
    sb.append("    explorerCapacity: ").append(toIndentedString(explorerCapacity)).append("\n");
    sb.append("    explorerCapacityIsDefaultCloudLimit: ").append(toIndentedString(explorerCapacityIsDefaultCloudLimit)).append("\n");
    sb.append("    fromPodSiteAttributes: ").append(toIndentedString(fromPodSiteAttributes)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    migrationStatus: ").append(toIndentedString(migrationStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteSettings: ").append(toIndentedString(siteSettings)).append("\n");
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

