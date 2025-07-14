package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * UpdateSiteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UpdateSiteResponse {

  private Integer adminInsightsPublishFrequency;

  private String adminMode;

  private Boolean allowSubscriptionAttachments;

  private String askDataMode;

  private Boolean attributeCaptureEnabled;

  private Boolean authoringEnabled;

  private Boolean autoExtractRefreshMonitoringEnabled;

  private Boolean autoFlowRunMonitoringEnabled;

  private Boolean autoSuspendRefreshEnabled;

  private Integer autoSuspendRefreshInactivityWindow;

  private Boolean blockNonExtractEnabled;

  private Boolean cacheWarmupEnabled;

  private Boolean catalogObfuscationEnabled;

  private Boolean catalogingEnabled;

  private Boolean cmekEnabled;

  private Boolean commentingEnabled;

  private Boolean commentingMentionsEnabled;

  private Boolean contentMigrationToolEnabled;

  private String contentUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateTime;

  private String customSubscriptionEmail;

  private Boolean customSubscriptionEmailEnabled;

  private String customSubscriptionFooter;

  private Boolean customSubscriptionFooterEnabled;

  private String dataAccelerationMode;

  private Boolean dataAlertsEnabled;

  private Boolean dataOrientationEnabled;

  private Boolean dataStoryEnabled;

  private Boolean derivedPermissionsEnabled;

  private Boolean disableSubscriptions;

  private Boolean dqwSubscriptionsEnabled;

  private Boolean easEnabled;

  private Boolean editingFlowsEnabled;

  private Boolean einsteinInFlowEnabled;

  private Boolean explainDataEnabled;

  private String extractEncryptionMode;

  private Boolean flowAutoSaveEnabled;

  private Boolean flowOutputSubscriptionsDataAsEmailAttachmentEnabled;

  private Boolean flowOutputSubscriptionsDataInEmailBodyEnabled;

  private Boolean flowOutputSubscriptionsEnabled;

  private Boolean flowParametersAnyTypeEnabled;

  private Boolean flowParametersEnabled;

  private Boolean flowParametersSystemTypeEnabled;

  private Boolean flowsEnabled;

  private Boolean generativeAiDataCatalog;

  private Boolean generativeAiEnabled;

  private Boolean generativeAiPrep;

  private Boolean generativeAiPulse;

  private Boolean generativeAiWebAuthoring;

  private Boolean groupAssertionsConnectedAppsEnabled;

  private Boolean groupAssertionsEnabled;

  private Boolean groupAssertionsOIDCEnabled;

  private Boolean groupAssertionsSAMLEnabled;

  private Boolean groupSetsEnabled;

  private Boolean guestAccessEnabled;

  private String id;

  private String idpConfigurationIdForScim;

  private PodInstance instance;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateDateTime;

  private Boolean linkedTaskRunNowEnabled;

  private Boolean linkedTaskSchedulingEnabled;

  private String location;

  private Boolean loginBasedLicenseManagementEnabled;

  private Integer maxServiceTokenLimitPerUser;

  private Boolean metricsContentTypeEnabled;

  private Boolean mfaEnforcementExemption;

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

  private Boolean mobileBiometricsEnabled;

  private String name;

  private Boolean namedSharingEnabled;

  private Boolean notifySiteAdminsOnThrottle;

  private Boolean personalSpaceEnabled;

  private String personalSpaceStorageQuota;

  private Boolean publishToSalesforceEnabled;

  private Boolean pulseEnabled;

  private String pulseGroupId;

  private Boolean pulsePersonalizedRankingEnabled;

  private Integer refreshTokenAbsoluteExpiry;

  private Boolean requestAccessEnabled;

  private Boolean revisionHistoryEnabled;

  private String revisionLimit;

  private Boolean runNowEnabled;

  private Boolean schedulingFlowsEnabled;

  private Boolean selfServiceScheduleForRefreshEnabled;

  @Valid
  private List<@Valid EmbeddingSettingsType> settings;

  private Boolean sheetImageEnabled;

  private Boolean siteInviteEmailEnabled;

  private Boolean sitePromptedLoginFlowEnabled;

  @Valid
  private List<@Valid SiteSettingType> siteSettings;

  private String state;

  /**
   * Gets or Sets status
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

  private String storageQuota;

  private StorageUsed storageUsed;

  private Boolean subscribeOthersEnabled;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime suspendedDateTime;

  private Integer tagLimit;

  private UUID tenantId;

  private Integer tierCreatorCapacity;

  private Integer tierExplorerCapacity;

  private Integer tierViewerCapacity;

  private String timeZone;

  private Usage usage;

  private Boolean useDefaultTimeZone;

  private String userQuota;

  private String userVisibilityMode;

  private Boolean webExtractionEnabled;

  private Boolean webZoneContentEnabled;

  private Boolean workflowExtensionEnabled;

  public UpdateSiteResponse adminInsightsPublishFrequency(Integer adminInsightsPublishFrequency) {
    this.adminInsightsPublishFrequency = adminInsightsPublishFrequency;
    return this;
  }

  /**
   * xs:int: adminInsightsPublishFrequency
   * @return adminInsightsPublishFrequency
  */
  
  @Schema(name = "adminInsightsPublishFrequency", description = "xs:int: adminInsightsPublishFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminInsightsPublishFrequency")
  public Integer getAdminInsightsPublishFrequency() {
    return adminInsightsPublishFrequency;
  }

  public void setAdminInsightsPublishFrequency(Integer adminInsightsPublishFrequency) {
    this.adminInsightsPublishFrequency = adminInsightsPublishFrequency;
  }

  public UpdateSiteResponse adminMode(String adminMode) {
    this.adminMode = adminMode;
    return this;
  }

  /**
   * (Optional) Specify ContentAndUsers to allow site administrators to use the server interface and tabcmd commands to add and remove users. (Specifying this option does not give site administrators permissions to manage users using the REST API.) Specify ContentOnly to prevent site administrators from adding or removing users. (Server administrators can always add or remove users.)Note: You cannot set adminMode to ContentOnly and also set userQuota. The default value is ContentAndUsers.
   * @return adminMode
  */
  
  @Schema(name = "adminMode", description = "(Optional) Specify ContentAndUsers to allow site administrators to use the server interface and tabcmd commands to add and remove users. (Specifying this option does not give site administrators permissions to manage users using the REST API.) Specify ContentOnly to prevent site administrators from adding or removing users. (Server administrators can always add or remove users.)Note: You cannot set adminMode to ContentOnly and also set userQuota. The default value is ContentAndUsers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminMode")
  public String getAdminMode() {
    return adminMode;
  }

  public void setAdminMode(String adminMode) {
    this.adminMode = adminMode;
  }

  public UpdateSiteResponse allowSubscriptionAttachments(Boolean allowSubscriptionAttachments) {
    this.allowSubscriptionAttachments = allowSubscriptionAttachments;
    return this;
  }

  /**
   * (Optional) If true, and subscription to attachments is enabled on the server, then users can create subscriptions that send an email with images of a workbook or view in a PDF attachment. The default value is true. If subscription to attachments is disabled in the server settings, then making this value true will have no effect. Default is true.
   * @return allowSubscriptionAttachments
  */
  
  @Schema(name = "allowSubscriptionAttachments", description = "(Optional) If true, and subscription to attachments is enabled on the server, then users can create subscriptions that send an email with images of a workbook or view in a PDF attachment. The default value is true. If subscription to attachments is disabled in the server settings, then making this value true will have no effect. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowSubscriptionAttachments")
  public Boolean getAllowSubscriptionAttachments() {
    return allowSubscriptionAttachments;
  }

  public void setAllowSubscriptionAttachments(Boolean allowSubscriptionAttachments) {
    this.allowSubscriptionAttachments = allowSubscriptionAttachments;
  }

  public UpdateSiteResponse askDataMode(String askDataMode) {
    this.askDataMode = askDataMode;
    return this;
  }

  /**
   * The mode of the ask data feature on the site. Can be set to one of two values: DisabledByDefault - Enables creation of Ask Data lenses for all published data sources. Data sources do not have lenses created automatically.DisabledAlways - Disables Ask Data lenses and related content throughout the site. Preserves information about lenses and data source indexes, which are restored if Ask Data is re-enabled. Default value is DisabledByDefault. For more information, see Disable or Enable Ask Data for a Site(Link opens in a new window).
   * @return askDataMode
  */
  
  @Schema(name = "askDataMode", description = "The mode of the ask data feature on the site. Can be set to one of two values: DisabledByDefault - Enables creation of Ask Data lenses for all published data sources. Data sources do not have lenses created automatically.DisabledAlways - Disables Ask Data lenses and related content throughout the site. Preserves information about lenses and data source indexes, which are restored if Ask Data is re-enabled. Default value is DisabledByDefault. For more information, see Disable or Enable Ask Data for a Site(Link opens in a new window).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("askDataMode")
  public String getAskDataMode() {
    return askDataMode;
  }

  public void setAskDataMode(String askDataMode) {
    this.askDataMode = askDataMode;
  }

  public UpdateSiteResponse attributeCaptureEnabled(Boolean attributeCaptureEnabled) {
    this.attributeCaptureEnabled = attributeCaptureEnabled;
    return this;
  }

  /**
   * xs:boolean: attributeCaptureEnabled
   * @return attributeCaptureEnabled
  */
  
  @Schema(name = "attributeCaptureEnabled", description = "xs:boolean: attributeCaptureEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeCaptureEnabled")
  public Boolean getAttributeCaptureEnabled() {
    return attributeCaptureEnabled;
  }

  public void setAttributeCaptureEnabled(Boolean attributeCaptureEnabled) {
    this.attributeCaptureEnabled = attributeCaptureEnabled;
  }

  public UpdateSiteResponse authoringEnabled(Boolean authoringEnabled) {
    this.authoringEnabled = authoringEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, web authoring is enabled. Default value is true.
   * @return authoringEnabled
  */
  
  @Schema(name = "authoringEnabled", description = "(Optional, boolean) If true, web authoring is enabled. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authoringEnabled")
  public Boolean getAuthoringEnabled() {
    return authoringEnabled;
  }

  public void setAuthoringEnabled(Boolean authoringEnabled) {
    this.authoringEnabled = authoringEnabled;
  }

  public UpdateSiteResponse autoExtractRefreshMonitoringEnabled(Boolean autoExtractRefreshMonitoringEnabled) {
    this.autoExtractRefreshMonitoringEnabled = autoExtractRefreshMonitoringEnabled;
    return this;
  }

  /**
   * xs:boolean: autoExtractRefreshMonitoringEnabled
   * @return autoExtractRefreshMonitoringEnabled
  */
  
  @Schema(name = "autoExtractRefreshMonitoringEnabled", description = "xs:boolean: autoExtractRefreshMonitoringEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoExtractRefreshMonitoringEnabled")
  public Boolean getAutoExtractRefreshMonitoringEnabled() {
    return autoExtractRefreshMonitoringEnabled;
  }

  public void setAutoExtractRefreshMonitoringEnabled(Boolean autoExtractRefreshMonitoringEnabled) {
    this.autoExtractRefreshMonitoringEnabled = autoExtractRefreshMonitoringEnabled;
  }

  public UpdateSiteResponse autoFlowRunMonitoringEnabled(Boolean autoFlowRunMonitoringEnabled) {
    this.autoFlowRunMonitoringEnabled = autoFlowRunMonitoringEnabled;
    return this;
  }

  /**
   * xs:boolean: autoFlowRunMonitoringEnabled
   * @return autoFlowRunMonitoringEnabled
  */
  
  @Schema(name = "autoFlowRunMonitoringEnabled", description = "xs:boolean: autoFlowRunMonitoringEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoFlowRunMonitoringEnabled")
  public Boolean getAutoFlowRunMonitoringEnabled() {
    return autoFlowRunMonitoringEnabled;
  }

  public void setAutoFlowRunMonitoringEnabled(Boolean autoFlowRunMonitoringEnabled) {
    this.autoFlowRunMonitoringEnabled = autoFlowRunMonitoringEnabled;
  }

  public UpdateSiteResponse autoSuspendRefreshEnabled(Boolean autoSuspendRefreshEnabled) {
    this.autoSuspendRefreshEnabled = autoSuspendRefreshEnabled;
    return this;
  }

  /**
   * (Optional) Tableau can automatically suspend extract refresh tasks for inactive workbooks to save resources. SpecifyÂ trueÂ to enable or falseÂ to disable. Default isÂ true.
   * @return autoSuspendRefreshEnabled
  */
  
  @Schema(name = "autoSuspendRefreshEnabled", description = "(Optional) Tableau can automatically suspend extract refresh tasks for inactive workbooks to save resources. SpecifyÂ trueÂ to enable or falseÂ to disable. Default isÂ true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSuspendRefreshEnabled")
  public Boolean getAutoSuspendRefreshEnabled() {
    return autoSuspendRefreshEnabled;
  }

  public void setAutoSuspendRefreshEnabled(Boolean autoSuspendRefreshEnabled) {
    this.autoSuspendRefreshEnabled = autoSuspendRefreshEnabled;
  }

  public UpdateSiteResponse autoSuspendRefreshInactivityWindow(Integer autoSuspendRefreshInactivityWindow) {
    this.autoSuspendRefreshInactivityWindow = autoSuspendRefreshInactivityWindow;
    return this;
  }

  /**
   * (Optional) An integer between 7 and 100 to indicate the number of days to wait before automatically suspending extract refresh tasks for inactive workbooks. The default is 30.
   * @return autoSuspendRefreshInactivityWindow
  */
  
  @Schema(name = "autoSuspendRefreshInactivityWindow", description = "(Optional) An integer between 7 and 100 to indicate the number of days to wait before automatically suspending extract refresh tasks for inactive workbooks. The default is 30.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSuspendRefreshInactivityWindow")
  public Integer getAutoSuspendRefreshInactivityWindow() {
    return autoSuspendRefreshInactivityWindow;
  }

  public void setAutoSuspendRefreshInactivityWindow(Integer autoSuspendRefreshInactivityWindow) {
    this.autoSuspendRefreshInactivityWindow = autoSuspendRefreshInactivityWindow;
  }

  public UpdateSiteResponse blockNonExtractEnabled(Boolean blockNonExtractEnabled) {
    this.blockNonExtractEnabled = blockNonExtractEnabled;
    return this;
  }

  /**
   * Get blockNonExtractEnabled
   * @return blockNonExtractEnabled
  */
  
  @Schema(name = "blockNonExtractEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockNonExtractEnabled")
  public Boolean getBlockNonExtractEnabled() {
    return blockNonExtractEnabled;
  }

  public void setBlockNonExtractEnabled(Boolean blockNonExtractEnabled) {
    this.blockNonExtractEnabled = blockNonExtractEnabled;
  }

  public UpdateSiteResponse cacheWarmupEnabled(Boolean cacheWarmupEnabled) {
    this.cacheWarmupEnabled = cacheWarmupEnabled;
    return this;
  }

  /**
   * This attribute is removed in API 3.19 and later (Tableau Cloud September 2021). For current methods to improve Tableau performance see, View Acceleration(Link opens in a new window). (Optional) Set this value to true to enable cache warm up to improve workbook load time. Set the value to false to disable cache warmup. Default is true.
   * @return cacheWarmupEnabled
  */
  
  @Schema(name = "cacheWarmupEnabled", description = "This attribute is removed in API 3.19 and later (Tableau Cloud September 2021). For current methods to improve Tableau performance see, View Acceleration(Link opens in a new window). (Optional) Set this value to true to enable cache warm up to improve workbook load time. Set the value to false to disable cache warmup. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheWarmupEnabled")
  public Boolean getCacheWarmupEnabled() {
    return cacheWarmupEnabled;
  }

  public void setCacheWarmupEnabled(Boolean cacheWarmupEnabled) {
    this.cacheWarmupEnabled = cacheWarmupEnabled;
  }

  public UpdateSiteResponse catalogObfuscationEnabled(Boolean catalogObfuscationEnabled) {
    this.catalogObfuscationEnabled = catalogObfuscationEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, catalog obfuscation is enabled on the site. Default value is true.
   * @return catalogObfuscationEnabled
  */
  
  @Schema(name = "catalogObfuscationEnabled", description = "(Optional, boolean) If true, catalog obfuscation is enabled on the site. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogObfuscationEnabled")
  public Boolean getCatalogObfuscationEnabled() {
    return catalogObfuscationEnabled;
  }

  public void setCatalogObfuscationEnabled(Boolean catalogObfuscationEnabled) {
    this.catalogObfuscationEnabled = catalogObfuscationEnabled;
  }

  public UpdateSiteResponse catalogingEnabled(Boolean catalogingEnabled) {
    this.catalogingEnabled = catalogingEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, data catalog is enabled for the site. Default value is true.
   * @return catalogingEnabled
  */
  
  @Schema(name = "catalogingEnabled", description = "(Optional, boolean) If true, data catalog is enabled for the site. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogingEnabled")
  public Boolean getCatalogingEnabled() {
    return catalogingEnabled;
  }

  public void setCatalogingEnabled(Boolean catalogingEnabled) {
    this.catalogingEnabled = catalogingEnabled;
  }

  public UpdateSiteResponse cmekEnabled(Boolean cmekEnabled) {
    this.cmekEnabled = cmekEnabled;
    return this;
  }

  /**
   * xs:boolean: cmekEnabled
   * @return cmekEnabled
  */
  
  @Schema(name = "cmekEnabled", description = "xs:boolean: cmekEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmekEnabled")
  public Boolean getCmekEnabled() {
    return cmekEnabled;
  }

  public void setCmekEnabled(Boolean cmekEnabled) {
    this.cmekEnabled = cmekEnabled;
  }

  public UpdateSiteResponse commentingEnabled(Boolean commentingEnabled) {
    this.commentingEnabled = commentingEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to enable and false to disable the ability for user comments on views in the site. Default is true.
   * @return commentingEnabled
  */
  
  @Schema(name = "commentingEnabled", description = "(Optional) Specify true to enable and false to disable the ability for user comments on views in the site. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentingEnabled")
  public Boolean getCommentingEnabled() {
    return commentingEnabled;
  }

  public void setCommentingEnabled(Boolean commentingEnabled) {
    this.commentingEnabled = commentingEnabled;
  }

  public UpdateSiteResponse commentingMentionsEnabled(Boolean commentingMentionsEnabled) {
    this.commentingMentionsEnabled = commentingMentionsEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, mentions for commenting are enabled. Default value is true.
   * @return commentingMentionsEnabled
  */
  
  @Schema(name = "commentingMentionsEnabled", description = "(Optional, boolean) If true, mentions for commenting are enabled. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentingMentionsEnabled")
  public Boolean getCommentingMentionsEnabled() {
    return commentingMentionsEnabled;
  }

  public void setCommentingMentionsEnabled(Boolean commentingMentionsEnabled) {
    this.commentingMentionsEnabled = commentingMentionsEnabled;
  }

  public UpdateSiteResponse contentMigrationToolEnabled(Boolean contentMigrationToolEnabled) {
    this.contentMigrationToolEnabled = contentMigrationToolEnabled;
    return this;
  }

  /**
   * xs:boolean: contentMigrationToolEnabled
   * @return contentMigrationToolEnabled
  */
  
  @Schema(name = "contentMigrationToolEnabled", description = "xs:boolean: contentMigrationToolEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentMigrationToolEnabled")
  public Boolean getContentMigrationToolEnabled() {
    return contentMigrationToolEnabled;
  }

  public void setContentMigrationToolEnabled(Boolean contentMigrationToolEnabled) {
    this.contentMigrationToolEnabled = contentMigrationToolEnabled;
  }

  public UpdateSiteResponse contentUrl(String contentUrl) {
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

  public UpdateSiteResponse createDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * Get createDateTime
   * @return createDateTime
  */
  @Valid 
  @Schema(name = "createDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDateTime")
  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public UpdateSiteResponse customSubscriptionEmail(String customSubscriptionEmail) {
    this.customSubscriptionEmail = customSubscriptionEmail;
    return this;
  }

  /**
   * A valid custom email that will be sent if customSubscriptionEmailEnabled is set to true. Default value is false.
   * @return customSubscriptionEmail
  */
  
  @Schema(name = "customSubscriptionEmail", description = "A valid custom email that will be sent if customSubscriptionEmailEnabled is set to true. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionEmail")
  public String getCustomSubscriptionEmail() {
    return customSubscriptionEmail;
  }

  public void setCustomSubscriptionEmail(String customSubscriptionEmail) {
    this.customSubscriptionEmail = customSubscriptionEmail;
  }

  public UpdateSiteResponse customSubscriptionEmailEnabled(Boolean customSubscriptionEmailEnabled) {
    this.customSubscriptionEmailEnabled = customSubscriptionEmailEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, sending custom subscription email is enabled. If set to false after being set true, the current custom subscription email is voided. Default value is false.
   * @return customSubscriptionEmailEnabled
  */
  
  @Schema(name = "customSubscriptionEmailEnabled", description = "(Optional, boolean) If true, sending custom subscription email is enabled. If set to false after being set true, the current custom subscription email is voided. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionEmailEnabled")
  public Boolean getCustomSubscriptionEmailEnabled() {
    return customSubscriptionEmailEnabled;
  }

  public void setCustomSubscriptionEmailEnabled(Boolean customSubscriptionEmailEnabled) {
    this.customSubscriptionEmailEnabled = customSubscriptionEmailEnabled;
  }

  public UpdateSiteResponse customSubscriptionFooter(String customSubscriptionFooter) {
    this.customSubscriptionFooter = customSubscriptionFooter;
    return this;
  }

  /**
   * A custom subscription footer that will be added to subscription and data alerts if customSubscriptionFooterEnabled is set to true. Default value is false.
   * @return customSubscriptionFooter
  */
  
  @Schema(name = "customSubscriptionFooter", description = "A custom subscription footer that will be added to subscription and data alerts if customSubscriptionFooterEnabled is set to true. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionFooter")
  public String getCustomSubscriptionFooter() {
    return customSubscriptionFooter;
  }

  public void setCustomSubscriptionFooter(String customSubscriptionFooter) {
    this.customSubscriptionFooter = customSubscriptionFooter;
  }

  public UpdateSiteResponse customSubscriptionFooterEnabled(Boolean customSubscriptionFooterEnabled) {
    this.customSubscriptionFooterEnabled = customSubscriptionFooterEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, a custom footer will be included on subscription and data alert emails. If set to false after being set true, the current custom subscription footer is voided. Default value is false.
   * @return customSubscriptionFooterEnabled
  */
  
  @Schema(name = "customSubscriptionFooterEnabled", description = "(Optional, boolean) If true, a custom footer will be included on subscription and data alert emails. If set to false after being set true, the current custom subscription footer is voided. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionFooterEnabled")
  public Boolean getCustomSubscriptionFooterEnabled() {
    return customSubscriptionFooterEnabled;
  }

  public void setCustomSubscriptionFooterEnabled(Boolean customSubscriptionFooterEnabled) {
    this.customSubscriptionFooterEnabled = customSubscriptionFooterEnabled;
  }

  public UpdateSiteResponse dataAccelerationMode(String dataAccelerationMode) {
    this.dataAccelerationMode = dataAccelerationMode;
    return this;
  }

  /**
   * xs:string: dataAccelerationMode
   * @return dataAccelerationMode
  */
  
  @Schema(name = "dataAccelerationMode", description = "xs:string: dataAccelerationMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAccelerationMode")
  public String getDataAccelerationMode() {
    return dataAccelerationMode;
  }

  public void setDataAccelerationMode(String dataAccelerationMode) {
    this.dataAccelerationMode = dataAccelerationMode;
  }

  public UpdateSiteResponse dataAlertsEnabled(Boolean dataAlertsEnabled) {
    this.dataAlertsEnabled = dataAlertsEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, data alerts are enabled on the site. Default value is true.
   * @return dataAlertsEnabled
  */
  
  @Schema(name = "dataAlertsEnabled", description = "(Optional, boolean) If true, data alerts are enabled on the site. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAlertsEnabled")
  public Boolean getDataAlertsEnabled() {
    return dataAlertsEnabled;
  }

  public void setDataAlertsEnabled(Boolean dataAlertsEnabled) {
    this.dataAlertsEnabled = dataAlertsEnabled;
  }

  public UpdateSiteResponse dataOrientationEnabled(Boolean dataOrientationEnabled) {
    this.dataOrientationEnabled = dataOrientationEnabled;
    return this;
  }

  /**
   * xs:boolean: dataOrientationEnabled
   * @return dataOrientationEnabled
  */
  
  @Schema(name = "dataOrientationEnabled", description = "xs:boolean: dataOrientationEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOrientationEnabled")
  public Boolean getDataOrientationEnabled() {
    return dataOrientationEnabled;
  }

  public void setDataOrientationEnabled(Boolean dataOrientationEnabled) {
    this.dataOrientationEnabled = dataOrientationEnabled;
  }

  public UpdateSiteResponse dataStoryEnabled(Boolean dataStoryEnabled) {
    this.dataStoryEnabled = dataStoryEnabled;
    return this;
  }

  /**
   * xs:boolean: dataStoryEnabled
   * @return dataStoryEnabled
  */
  
  @Schema(name = "dataStoryEnabled", description = "xs:boolean: dataStoryEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataStoryEnabled")
  public Boolean getDataStoryEnabled() {
    return dataStoryEnabled;
  }

  public void setDataStoryEnabled(Boolean dataStoryEnabled) {
    this.dataStoryEnabled = dataStoryEnabled;
  }

  public UpdateSiteResponse derivedPermissionsEnabled(Boolean derivedPermissionsEnabled) {
    this.derivedPermissionsEnabled = derivedPermissionsEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, derived permissions are enabled for the site. Default value is false.
   * @return derivedPermissionsEnabled
  */
  
  @Schema(name = "derivedPermissionsEnabled", description = "(Optional, boolean) If true, derived permissions are enabled for the site. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("derivedPermissionsEnabled")
  public Boolean getDerivedPermissionsEnabled() {
    return derivedPermissionsEnabled;
  }

  public void setDerivedPermissionsEnabled(Boolean derivedPermissionsEnabled) {
    this.derivedPermissionsEnabled = derivedPermissionsEnabled;
  }

  public UpdateSiteResponse disableSubscriptions(Boolean disableSubscriptions) {
    this.disableSubscriptions = disableSubscriptions;
    return this;
  }

  /**
   * (Optional) Specify true to prevent users from being able to subscribe to workbooks on the specified site. The default is false.
   * @return disableSubscriptions
  */
  
  @Schema(name = "disableSubscriptions", description = "(Optional) Specify true to prevent users from being able to subscribe to workbooks on the specified site. The default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableSubscriptions")
  public Boolean getDisableSubscriptions() {
    return disableSubscriptions;
  }

  public void setDisableSubscriptions(Boolean disableSubscriptions) {
    this.disableSubscriptions = disableSubscriptions;
  }

  public UpdateSiteResponse dqwSubscriptionsEnabled(Boolean dqwSubscriptionsEnabled) {
    this.dqwSubscriptionsEnabled = dqwSubscriptionsEnabled;
    return this;
  }

  /**
   * (Optional, boolean) Set this attribute to false to exclude data quality warnings (DQWs) from subscription emails. By default, this attribute is set to true. For more information about this site setting, see one of the following topics:For Tableau Cloud, see Disable or Enable Explain Data for a Site(Link opens in a new window).For Tableau Server, see Disable or Enable Explain Data for a Site(Link opens in a new window).
   * @return dqwSubscriptionsEnabled
  */
  
  @Schema(name = "dqwSubscriptionsEnabled", description = "(Optional, boolean) Set this attribute to false to exclude data quality warnings (DQWs) from subscription emails. By default, this attribute is set to true. For more information about this site setting, see one of the following topics:For Tableau Cloud, see Disable or Enable Explain Data for a Site(Link opens in a new window).For Tableau Server, see Disable or Enable Explain Data for a Site(Link opens in a new window).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dqwSubscriptionsEnabled")
  public Boolean getDqwSubscriptionsEnabled() {
    return dqwSubscriptionsEnabled;
  }

  public void setDqwSubscriptionsEnabled(Boolean dqwSubscriptionsEnabled) {
    this.dqwSubscriptionsEnabled = dqwSubscriptionsEnabled;
  }

  public UpdateSiteResponse easEnabled(Boolean easEnabled) {
    this.easEnabled = easEnabled;
    return this;
  }

  /**
   * xs:boolean: easEnabled
   * @return easEnabled
  */
  
  @Schema(name = "easEnabled", description = "xs:boolean: easEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("easEnabled")
  public Boolean getEasEnabled() {
    return easEnabled;
  }

  public void setEasEnabled(Boolean easEnabled) {
    this.easEnabled = easEnabled;
  }

  public UpdateSiteResponse editingFlowsEnabled(Boolean editingFlowsEnabled) {
    this.editingFlowsEnabled = editingFlowsEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to enable and false to disable editing flows for a site. For more information on flows, see Enable and Configure Tableau Prep Conductor(Link opens in a new window).The default is set to true which means editing flows is enabled by default. For more information, see Implication of disabling Tableau Prep Conductor.
   * @return editingFlowsEnabled
  */
  
  @Schema(name = "editingFlowsEnabled", description = "(Optional) Specify true to enable and false to disable editing flows for a site. For more information on flows, see Enable and Configure Tableau Prep Conductor(Link opens in a new window).The default is set to true which means editing flows is enabled by default. For more information, see Implication of disabling Tableau Prep Conductor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editingFlowsEnabled")
  public Boolean getEditingFlowsEnabled() {
    return editingFlowsEnabled;
  }

  public void setEditingFlowsEnabled(Boolean editingFlowsEnabled) {
    this.editingFlowsEnabled = editingFlowsEnabled;
  }

  public UpdateSiteResponse einsteinInFlowEnabled(Boolean einsteinInFlowEnabled) {
    this.einsteinInFlowEnabled = einsteinInFlowEnabled;
    return this;
  }

  /**
   * xs:boolean: einsteinInFlowEnabled
   * @return einsteinInFlowEnabled
  */
  
  @Schema(name = "einsteinInFlowEnabled", description = "xs:boolean: einsteinInFlowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("einsteinInFlowEnabled")
  public Boolean getEinsteinInFlowEnabled() {
    return einsteinInFlowEnabled;
  }

  public void setEinsteinInFlowEnabled(Boolean einsteinInFlowEnabled) {
    this.einsteinInFlowEnabled = einsteinInFlowEnabled;
  }

  public UpdateSiteResponse explainDataEnabled(Boolean explainDataEnabled) {
    this.explainDataEnabled = explainDataEnabled;
    return this;
  }

  /**
   * (Optional, boolean) Set this attribute to false to disable Explain Data capabilities for a site. By default, this attribute is set to true. For more information about this site setting, see one of the following topics:For Tableau Cloud, see Disable or Enable Explain Data for a Site(Link opens in a new window).For Tableau Server, see Disable or Enable Explain Data for a Site(Link opens in a new window).
   * @return explainDataEnabled
  */
  
  @Schema(name = "explainDataEnabled", description = "(Optional, boolean) Set this attribute to false to disable Explain Data capabilities for a site. By default, this attribute is set to true. For more information about this site setting, see one of the following topics:For Tableau Cloud, see Disable or Enable Explain Data for a Site(Link opens in a new window).For Tableau Server, see Disable or Enable Explain Data for a Site(Link opens in a new window).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explainDataEnabled")
  public Boolean getExplainDataEnabled() {
    return explainDataEnabled;
  }

  public void setExplainDataEnabled(Boolean explainDataEnabled) {
    this.explainDataEnabled = explainDataEnabled;
  }

  public UpdateSiteResponse extractEncryptionMode(String extractEncryptionMode) {
    this.extractEncryptionMode = extractEncryptionMode;
    return this;
  }

  /**
   * (Optional) Specify enforced, enabled, or disabled. Default is disabled. For more information, see Extract and Encryption Methods.
   * @return extractEncryptionMode
  */
  
  @Schema(name = "extractEncryptionMode", description = "(Optional) Specify enforced, enabled, or disabled. Default is disabled. For more information, see Extract and Encryption Methods.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extractEncryptionMode")
  public String getExtractEncryptionMode() {
    return extractEncryptionMode;
  }

  public void setExtractEncryptionMode(String extractEncryptionMode) {
    this.extractEncryptionMode = extractEncryptionMode;
  }

  public UpdateSiteResponse flowAutoSaveEnabled(Boolean flowAutoSaveEnabled) {
    this.flowAutoSaveEnabled = flowAutoSaveEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, flow auto save is enabled on the site. Default value is true.
   * @return flowAutoSaveEnabled
  */
  
  @Schema(name = "flowAutoSaveEnabled", description = "(Optional, boolean) If true, flow auto save is enabled on the site. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowAutoSaveEnabled")
  public Boolean getFlowAutoSaveEnabled() {
    return flowAutoSaveEnabled;
  }

  public void setFlowAutoSaveEnabled(Boolean flowAutoSaveEnabled) {
    this.flowAutoSaveEnabled = flowAutoSaveEnabled;
  }

  public UpdateSiteResponse flowOutputSubscriptionsDataAsEmailAttachmentEnabled(Boolean flowOutputSubscriptionsDataAsEmailAttachmentEnabled) {
    this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled = flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
    return this;
  }

  /**
   * xs:boolean: flowOutputSubscriptionsDataAsEmailAttachmentEnabled
   * @return flowOutputSubscriptionsDataAsEmailAttachmentEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsDataAsEmailAttachmentEnabled", description = "xs:boolean: flowOutputSubscriptionsDataAsEmailAttachmentEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsDataAsEmailAttachmentEnabled")
  public Boolean getFlowOutputSubscriptionsDataAsEmailAttachmentEnabled() {
    return flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
  }

  public void setFlowOutputSubscriptionsDataAsEmailAttachmentEnabled(Boolean flowOutputSubscriptionsDataAsEmailAttachmentEnabled) {
    this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled = flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
  }

  public UpdateSiteResponse flowOutputSubscriptionsDataInEmailBodyEnabled(Boolean flowOutputSubscriptionsDataInEmailBodyEnabled) {
    this.flowOutputSubscriptionsDataInEmailBodyEnabled = flowOutputSubscriptionsDataInEmailBodyEnabled;
    return this;
  }

  /**
   * xs:boolean: flowOutputSubscriptionsDataInEmailBodyEnabled
   * @return flowOutputSubscriptionsDataInEmailBodyEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsDataInEmailBodyEnabled", description = "xs:boolean: flowOutputSubscriptionsDataInEmailBodyEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsDataInEmailBodyEnabled")
  public Boolean getFlowOutputSubscriptionsDataInEmailBodyEnabled() {
    return flowOutputSubscriptionsDataInEmailBodyEnabled;
  }

  public void setFlowOutputSubscriptionsDataInEmailBodyEnabled(Boolean flowOutputSubscriptionsDataInEmailBodyEnabled) {
    this.flowOutputSubscriptionsDataInEmailBodyEnabled = flowOutputSubscriptionsDataInEmailBodyEnabled;
  }

  public UpdateSiteResponse flowOutputSubscriptionsEnabled(Boolean flowOutputSubscriptionsEnabled) {
    this.flowOutputSubscriptionsEnabled = flowOutputSubscriptionsEnabled;
    return this;
  }

  /**
   * xs:boolean: flowOutputSubscriptionsEnabled
   * @return flowOutputSubscriptionsEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsEnabled", description = "xs:boolean: flowOutputSubscriptionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsEnabled")
  public Boolean getFlowOutputSubscriptionsEnabled() {
    return flowOutputSubscriptionsEnabled;
  }

  public void setFlowOutputSubscriptionsEnabled(Boolean flowOutputSubscriptionsEnabled) {
    this.flowOutputSubscriptionsEnabled = flowOutputSubscriptionsEnabled;
  }

  public UpdateSiteResponse flowParametersAnyTypeEnabled(Boolean flowParametersAnyTypeEnabled) {
    this.flowParametersAnyTypeEnabled = flowParametersAnyTypeEnabled;
    return this;
  }

  /**
   * xs:boolean: flowParametersAnyTypeEnabled
   * @return flowParametersAnyTypeEnabled
  */
  
  @Schema(name = "flowParametersAnyTypeEnabled", description = "xs:boolean: flowParametersAnyTypeEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersAnyTypeEnabled")
  public Boolean getFlowParametersAnyTypeEnabled() {
    return flowParametersAnyTypeEnabled;
  }

  public void setFlowParametersAnyTypeEnabled(Boolean flowParametersAnyTypeEnabled) {
    this.flowParametersAnyTypeEnabled = flowParametersAnyTypeEnabled;
  }

  public UpdateSiteResponse flowParametersEnabled(Boolean flowParametersEnabled) {
    this.flowParametersEnabled = flowParametersEnabled;
    return this;
  }

  /**
   * xs:boolean: flowParametersEnabled
   * @return flowParametersEnabled
  */
  
  @Schema(name = "flowParametersEnabled", description = "xs:boolean: flowParametersEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersEnabled")
  public Boolean getFlowParametersEnabled() {
    return flowParametersEnabled;
  }

  public void setFlowParametersEnabled(Boolean flowParametersEnabled) {
    this.flowParametersEnabled = flowParametersEnabled;
  }

  public UpdateSiteResponse flowParametersSystemTypeEnabled(Boolean flowParametersSystemTypeEnabled) {
    this.flowParametersSystemTypeEnabled = flowParametersSystemTypeEnabled;
    return this;
  }

  /**
   * xs:boolean: flowParametersSystemTypeEnabled
   * @return flowParametersSystemTypeEnabled
  */
  
  @Schema(name = "flowParametersSystemTypeEnabled", description = "xs:boolean: flowParametersSystemTypeEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersSystemTypeEnabled")
  public Boolean getFlowParametersSystemTypeEnabled() {
    return flowParametersSystemTypeEnabled;
  }

  public void setFlowParametersSystemTypeEnabled(Boolean flowParametersSystemTypeEnabled) {
    this.flowParametersSystemTypeEnabled = flowParametersSystemTypeEnabled;
  }

  public UpdateSiteResponse flowsEnabled(Boolean flowsEnabled) {
    this.flowsEnabled = flowsEnabled;
    return this;
  }

  /**
   * The flowsEnabled attribute is deprecated as of API version 3.10.
   * @return flowsEnabled
  */
  
  @Schema(name = "flowsEnabled", description = "The flowsEnabled attribute is deprecated as of API version 3.10.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowsEnabled")
  public Boolean getFlowsEnabled() {
    return flowsEnabled;
  }

  public void setFlowsEnabled(Boolean flowsEnabled) {
    this.flowsEnabled = flowsEnabled;
  }

  public UpdateSiteResponse generativeAiDataCatalog(Boolean generativeAiDataCatalog) {
    this.generativeAiDataCatalog = generativeAiDataCatalog;
    return this;
  }

  /**
   * Get generativeAiDataCatalog
   * @return generativeAiDataCatalog
  */
  
  @Schema(name = "generativeAiDataCatalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generativeAiDataCatalog")
  public Boolean getGenerativeAiDataCatalog() {
    return generativeAiDataCatalog;
  }

  public void setGenerativeAiDataCatalog(Boolean generativeAiDataCatalog) {
    this.generativeAiDataCatalog = generativeAiDataCatalog;
  }

  public UpdateSiteResponse generativeAiEnabled(Boolean generativeAiEnabled) {
    this.generativeAiEnabled = generativeAiEnabled;
    return this;
  }

  /**
   * Get generativeAiEnabled
   * @return generativeAiEnabled
  */
  
  @Schema(name = "generativeAiEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generativeAiEnabled")
  public Boolean getGenerativeAiEnabled() {
    return generativeAiEnabled;
  }

  public void setGenerativeAiEnabled(Boolean generativeAiEnabled) {
    this.generativeAiEnabled = generativeAiEnabled;
  }

  public UpdateSiteResponse generativeAiPrep(Boolean generativeAiPrep) {
    this.generativeAiPrep = generativeAiPrep;
    return this;
  }

  /**
   * Get generativeAiPrep
   * @return generativeAiPrep
  */
  
  @Schema(name = "generativeAiPrep", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generativeAiPrep")
  public Boolean getGenerativeAiPrep() {
    return generativeAiPrep;
  }

  public void setGenerativeAiPrep(Boolean generativeAiPrep) {
    this.generativeAiPrep = generativeAiPrep;
  }

  public UpdateSiteResponse generativeAiPulse(Boolean generativeAiPulse) {
    this.generativeAiPulse = generativeAiPulse;
    return this;
  }

  /**
   * Get generativeAiPulse
   * @return generativeAiPulse
  */
  
  @Schema(name = "generativeAiPulse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generativeAiPulse")
  public Boolean getGenerativeAiPulse() {
    return generativeAiPulse;
  }

  public void setGenerativeAiPulse(Boolean generativeAiPulse) {
    this.generativeAiPulse = generativeAiPulse;
  }

  public UpdateSiteResponse generativeAiWebAuthoring(Boolean generativeAiWebAuthoring) {
    this.generativeAiWebAuthoring = generativeAiWebAuthoring;
    return this;
  }

  /**
   * Get generativeAiWebAuthoring
   * @return generativeAiWebAuthoring
  */
  
  @Schema(name = "generativeAiWebAuthoring", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generativeAiWebAuthoring")
  public Boolean getGenerativeAiWebAuthoring() {
    return generativeAiWebAuthoring;
  }

  public void setGenerativeAiWebAuthoring(Boolean generativeAiWebAuthoring) {
    this.generativeAiWebAuthoring = generativeAiWebAuthoring;
  }

  public UpdateSiteResponse groupAssertionsConnectedAppsEnabled(Boolean groupAssertionsConnectedAppsEnabled) {
    this.groupAssertionsConnectedAppsEnabled = groupAssertionsConnectedAppsEnabled;
    return this;
  }

  /**
   * Get groupAssertionsConnectedAppsEnabled
   * @return groupAssertionsConnectedAppsEnabled
  */
  
  @Schema(name = "groupAssertionsConnectedAppsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupAssertionsConnectedAppsEnabled")
  public Boolean getGroupAssertionsConnectedAppsEnabled() {
    return groupAssertionsConnectedAppsEnabled;
  }

  public void setGroupAssertionsConnectedAppsEnabled(Boolean groupAssertionsConnectedAppsEnabled) {
    this.groupAssertionsConnectedAppsEnabled = groupAssertionsConnectedAppsEnabled;
  }

  public UpdateSiteResponse groupAssertionsEnabled(Boolean groupAssertionsEnabled) {
    this.groupAssertionsEnabled = groupAssertionsEnabled;
    return this;
  }

  /**
   * Get groupAssertionsEnabled
   * @return groupAssertionsEnabled
  */
  
  @Schema(name = "groupAssertionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupAssertionsEnabled")
  public Boolean getGroupAssertionsEnabled() {
    return groupAssertionsEnabled;
  }

  public void setGroupAssertionsEnabled(Boolean groupAssertionsEnabled) {
    this.groupAssertionsEnabled = groupAssertionsEnabled;
  }

  public UpdateSiteResponse groupAssertionsOIDCEnabled(Boolean groupAssertionsOIDCEnabled) {
    this.groupAssertionsOIDCEnabled = groupAssertionsOIDCEnabled;
    return this;
  }

  /**
   * Get groupAssertionsOIDCEnabled
   * @return groupAssertionsOIDCEnabled
  */
  
  @Schema(name = "groupAssertionsOIDCEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupAssertionsOIDCEnabled")
  public Boolean getGroupAssertionsOIDCEnabled() {
    return groupAssertionsOIDCEnabled;
  }

  public void setGroupAssertionsOIDCEnabled(Boolean groupAssertionsOIDCEnabled) {
    this.groupAssertionsOIDCEnabled = groupAssertionsOIDCEnabled;
  }

  public UpdateSiteResponse groupAssertionsSAMLEnabled(Boolean groupAssertionsSAMLEnabled) {
    this.groupAssertionsSAMLEnabled = groupAssertionsSAMLEnabled;
    return this;
  }

  /**
   * Get groupAssertionsSAMLEnabled
   * @return groupAssertionsSAMLEnabled
  */
  
  @Schema(name = "groupAssertionsSAMLEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupAssertionsSAMLEnabled")
  public Boolean getGroupAssertionsSAMLEnabled() {
    return groupAssertionsSAMLEnabled;
  }

  public void setGroupAssertionsSAMLEnabled(Boolean groupAssertionsSAMLEnabled) {
    this.groupAssertionsSAMLEnabled = groupAssertionsSAMLEnabled;
  }

  public UpdateSiteResponse groupSetsEnabled(Boolean groupSetsEnabled) {
    this.groupSetsEnabled = groupSetsEnabled;
    return this;
  }

  /**
   * Get groupSetsEnabled
   * @return groupSetsEnabled
  */
  
  @Schema(name = "groupSetsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupSetsEnabled")
  public Boolean getGroupSetsEnabled() {
    return groupSetsEnabled;
  }

  public void setGroupSetsEnabled(Boolean groupSetsEnabled) {
    this.groupSetsEnabled = groupSetsEnabled;
  }

  public UpdateSiteResponse guestAccessEnabled(Boolean guestAccessEnabled) {
    this.guestAccessEnabled = guestAccessEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to enable and false to disable the ability for guests, users without specific site access permission, to access the site. Default is false.
   * @return guestAccessEnabled
  */
  
  @Schema(name = "guestAccessEnabled", description = "(Optional) Specify true to enable and false to disable the ability for guests, users without specific site access permission, to access the site. Default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guestAccessEnabled")
  public Boolean getGuestAccessEnabled() {
    return guestAccessEnabled;
  }

  public void setGuestAccessEnabled(Boolean guestAccessEnabled) {
    this.guestAccessEnabled = guestAccessEnabled;
  }

  public UpdateSiteResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * resourceIdType: id
   * @return id
  */
  
  @Schema(name = "id", description = "resourceIdType: id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateSiteResponse idpConfigurationIdForScim(String idpConfigurationIdForScim) {
    this.idpConfigurationIdForScim = idpConfigurationIdForScim;
    return this;
  }

  /**
   * Get idpConfigurationIdForScim
   * @return idpConfigurationIdForScim
  */
  
  @Schema(name = "idpConfigurationIdForScim", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationIdForScim")
  public String getIdpConfigurationIdForScim() {
    return idpConfigurationIdForScim;
  }

  public void setIdpConfigurationIdForScim(String idpConfigurationIdForScim) {
    this.idpConfigurationIdForScim = idpConfigurationIdForScim;
  }

  public UpdateSiteResponse instance(PodInstance instance) {
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

  public UpdateSiteResponse lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  /**
   * Get lastUpdateDateTime
   * @return lastUpdateDateTime
  */
  @Valid 
  @Schema(name = "lastUpdateDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateDateTime")
  public OffsetDateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public UpdateSiteResponse linkedTaskRunNowEnabled(Boolean linkedTaskRunNowEnabled) {
    this.linkedTaskRunNowEnabled = linkedTaskRunNowEnabled;
    return this;
  }

  /**
   * xs:boolean: linkedTaskRunNowEnabled
   * @return linkedTaskRunNowEnabled
  */
  
  @Schema(name = "linkedTaskRunNowEnabled", description = "xs:boolean: linkedTaskRunNowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedTaskRunNowEnabled")
  public Boolean getLinkedTaskRunNowEnabled() {
    return linkedTaskRunNowEnabled;
  }

  public void setLinkedTaskRunNowEnabled(Boolean linkedTaskRunNowEnabled) {
    this.linkedTaskRunNowEnabled = linkedTaskRunNowEnabled;
  }

  public UpdateSiteResponse linkedTaskSchedulingEnabled(Boolean linkedTaskSchedulingEnabled) {
    this.linkedTaskSchedulingEnabled = linkedTaskSchedulingEnabled;
    return this;
  }

  /**
   * xs:boolean: linkedTaskSchedulingEnabled
   * @return linkedTaskSchedulingEnabled
  */
  
  @Schema(name = "linkedTaskSchedulingEnabled", description = "xs:boolean: linkedTaskSchedulingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedTaskSchedulingEnabled")
  public Boolean getLinkedTaskSchedulingEnabled() {
    return linkedTaskSchedulingEnabled;
  }

  public void setLinkedTaskSchedulingEnabled(Boolean linkedTaskSchedulingEnabled) {
    this.linkedTaskSchedulingEnabled = linkedTaskSchedulingEnabled;
  }

  public UpdateSiteResponse location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UpdateSiteResponse loginBasedLicenseManagementEnabled(Boolean loginBasedLicenseManagementEnabled) {
    this.loginBasedLicenseManagementEnabled = loginBasedLicenseManagementEnabled;
    return this;
  }

  /**
   * xs:boolean: loginBasedLicenseManagementEnabled
   * @return loginBasedLicenseManagementEnabled
  */
  
  @Schema(name = "loginBasedLicenseManagementEnabled", description = "xs:boolean: loginBasedLicenseManagementEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginBasedLicenseManagementEnabled")
  public Boolean getLoginBasedLicenseManagementEnabled() {
    return loginBasedLicenseManagementEnabled;
  }

  public void setLoginBasedLicenseManagementEnabled(Boolean loginBasedLicenseManagementEnabled) {
    this.loginBasedLicenseManagementEnabled = loginBasedLicenseManagementEnabled;
  }

  public UpdateSiteResponse maxServiceTokenLimitPerUser(Integer maxServiceTokenLimitPerUser) {
    this.maxServiceTokenLimitPerUser = maxServiceTokenLimitPerUser;
    return this;
  }

  /**
   * Get maxServiceTokenLimitPerUser
   * @return maxServiceTokenLimitPerUser
  */
  
  @Schema(name = "maxServiceTokenLimitPerUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxServiceTokenLimitPerUser")
  public Integer getMaxServiceTokenLimitPerUser() {
    return maxServiceTokenLimitPerUser;
  }

  public void setMaxServiceTokenLimitPerUser(Integer maxServiceTokenLimitPerUser) {
    this.maxServiceTokenLimitPerUser = maxServiceTokenLimitPerUser;
  }

  public UpdateSiteResponse metricsContentTypeEnabled(Boolean metricsContentTypeEnabled) {
    this.metricsContentTypeEnabled = metricsContentTypeEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, the metrics content type is enabled on the server. Default value is true.
   * @return metricsContentTypeEnabled
  */
  
  @Schema(name = "metricsContentTypeEnabled", description = "(Optional, boolean) If true, the metrics content type is enabled on the server. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metricsContentTypeEnabled")
  public Boolean getMetricsContentTypeEnabled() {
    return metricsContentTypeEnabled;
  }

  public void setMetricsContentTypeEnabled(Boolean metricsContentTypeEnabled) {
    this.metricsContentTypeEnabled = metricsContentTypeEnabled;
  }

  public UpdateSiteResponse mfaEnforcementExemption(Boolean mfaEnforcementExemption) {
    this.mfaEnforcementExemption = mfaEnforcementExemption;
    return this;
  }

  /**
   * xs:boolean: mfaEnforcementExemption
   * @return mfaEnforcementExemption
  */
  
  @Schema(name = "mfaEnforcementExemption", description = "xs:boolean: mfaEnforcementExemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mfaEnforcementExemption")
  public Boolean getMfaEnforcementExemption() {
    return mfaEnforcementExemption;
  }

  public void setMfaEnforcementExemption(Boolean mfaEnforcementExemption) {
    this.mfaEnforcementExemption = mfaEnforcementExemption;
  }

  public UpdateSiteResponse migrationStatus(MigrationStatusEnum migrationStatus) {
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

  public UpdateSiteResponse mobileBiometricsEnabled(Boolean mobileBiometricsEnabled) {
    this.mobileBiometricsEnabled = mobileBiometricsEnabled;
    return this;
  }

  /**
   * xs:boolean: mobileBiometricsEnabled
   * @return mobileBiometricsEnabled
  */
  
  @Schema(name = "mobileBiometricsEnabled", description = "xs:boolean: mobileBiometricsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileBiometricsEnabled")
  public Boolean getMobileBiometricsEnabled() {
    return mobileBiometricsEnabled;
  }

  public void setMobileBiometricsEnabled(Boolean mobileBiometricsEnabled) {
    this.mobileBiometricsEnabled = mobileBiometricsEnabled;
  }

  public UpdateSiteResponse name(String name) {
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

  public UpdateSiteResponse namedSharingEnabled(Boolean namedSharingEnabled) {
    this.namedSharingEnabled = namedSharingEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, named sharing is enabled. Default value is true.
   * @return namedSharingEnabled
  */
  
  @Schema(name = "namedSharingEnabled", description = "(Optional, boolean) If true, named sharing is enabled. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedSharingEnabled")
  public Boolean getNamedSharingEnabled() {
    return namedSharingEnabled;
  }

  public void setNamedSharingEnabled(Boolean namedSharingEnabled) {
    this.namedSharingEnabled = namedSharingEnabled;
  }

  public UpdateSiteResponse notifySiteAdminsOnThrottle(Boolean notifySiteAdminsOnThrottle) {
    this.notifySiteAdminsOnThrottle = notifySiteAdminsOnThrottle;
    return this;
  }

  /**
   * (Optional, boolean) If true, site admins will be notified if their background jobs are being throttled. Default value is false.
   * @return notifySiteAdminsOnThrottle
  */
  
  @Schema(name = "notifySiteAdminsOnThrottle", description = "(Optional, boolean) If true, site admins will be notified if their background jobs are being throttled. Default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifySiteAdminsOnThrottle")
  public Boolean getNotifySiteAdminsOnThrottle() {
    return notifySiteAdminsOnThrottle;
  }

  public void setNotifySiteAdminsOnThrottle(Boolean notifySiteAdminsOnThrottle) {
    this.notifySiteAdminsOnThrottle = notifySiteAdminsOnThrottle;
  }

  public UpdateSiteResponse personalSpaceEnabled(Boolean personalSpaceEnabled) {
    this.personalSpaceEnabled = personalSpaceEnabled;
    return this;
  }

  /**
   * xs:boolean: personalSpaceEnabled
   * @return personalSpaceEnabled
  */
  
  @Schema(name = "personalSpaceEnabled", description = "xs:boolean: personalSpaceEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalSpaceEnabled")
  public Boolean getPersonalSpaceEnabled() {
    return personalSpaceEnabled;
  }

  public void setPersonalSpaceEnabled(Boolean personalSpaceEnabled) {
    this.personalSpaceEnabled = personalSpaceEnabled;
  }

  public UpdateSiteResponse personalSpaceStorageQuota(String personalSpaceStorageQuota) {
    this.personalSpaceStorageQuota = personalSpaceStorageQuota;
    return this;
  }

  /**
   * xs:string: personalSpaceStorageQuota
   * @return personalSpaceStorageQuota
  */
  
  @Schema(name = "personalSpaceStorageQuota", description = "xs:string: personalSpaceStorageQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalSpaceStorageQuota")
  public String getPersonalSpaceStorageQuota() {
    return personalSpaceStorageQuota;
  }

  public void setPersonalSpaceStorageQuota(String personalSpaceStorageQuota) {
    this.personalSpaceStorageQuota = personalSpaceStorageQuota;
  }

  public UpdateSiteResponse publishToSalesforceEnabled(Boolean publishToSalesforceEnabled) {
    this.publishToSalesforceEnabled = publishToSalesforceEnabled;
    return this;
  }

  /**
   * xs:boolean: publishToSalesforceEnabled
   * @return publishToSalesforceEnabled
  */
  
  @Schema(name = "publishToSalesforceEnabled", description = "xs:boolean: publishToSalesforceEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishToSalesforceEnabled")
  public Boolean getPublishToSalesforceEnabled() {
    return publishToSalesforceEnabled;
  }

  public void setPublishToSalesforceEnabled(Boolean publishToSalesforceEnabled) {
    this.publishToSalesforceEnabled = publishToSalesforceEnabled;
  }

  public UpdateSiteResponse pulseEnabled(Boolean pulseEnabled) {
    this.pulseEnabled = pulseEnabled;
    return this;
  }

  /**
   * Get pulseEnabled
   * @return pulseEnabled
  */
  
  @Schema(name = "pulseEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulseEnabled")
  public Boolean getPulseEnabled() {
    return pulseEnabled;
  }

  public void setPulseEnabled(Boolean pulseEnabled) {
    this.pulseEnabled = pulseEnabled;
  }

  public UpdateSiteResponse pulseGroupId(String pulseGroupId) {
    this.pulseGroupId = pulseGroupId;
    return this;
  }

  /**
   * Get pulseGroupId
   * @return pulseGroupId
  */
  
  @Schema(name = "pulseGroupId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulseGroupId")
  public String getPulseGroupId() {
    return pulseGroupId;
  }

  public void setPulseGroupId(String pulseGroupId) {
    this.pulseGroupId = pulseGroupId;
  }

  public UpdateSiteResponse pulsePersonalizedRankingEnabled(Boolean pulsePersonalizedRankingEnabled) {
    this.pulsePersonalizedRankingEnabled = pulsePersonalizedRankingEnabled;
    return this;
  }

  /**
   * Get pulsePersonalizedRankingEnabled
   * @return pulsePersonalizedRankingEnabled
  */
  
  @Schema(name = "pulsePersonalizedRankingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePersonalizedRankingEnabled")
  public Boolean getPulsePersonalizedRankingEnabled() {
    return pulsePersonalizedRankingEnabled;
  }

  public void setPulsePersonalizedRankingEnabled(Boolean pulsePersonalizedRankingEnabled) {
    this.pulsePersonalizedRankingEnabled = pulsePersonalizedRankingEnabled;
  }

  public UpdateSiteResponse refreshTokenAbsoluteExpiry(Integer refreshTokenAbsoluteExpiry) {
    this.refreshTokenAbsoluteExpiry = refreshTokenAbsoluteExpiry;
    return this;
  }

  /**
   * xs:integer: refreshTokenAbsoluteExpiry
   * @return refreshTokenAbsoluteExpiry
  */
  
  @Schema(name = "refreshTokenAbsoluteExpiry", description = "xs:integer: refreshTokenAbsoluteExpiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshTokenAbsoluteExpiry")
  public Integer getRefreshTokenAbsoluteExpiry() {
    return refreshTokenAbsoluteExpiry;
  }

  public void setRefreshTokenAbsoluteExpiry(Integer refreshTokenAbsoluteExpiry) {
    this.refreshTokenAbsoluteExpiry = refreshTokenAbsoluteExpiry;
  }

  public UpdateSiteResponse requestAccessEnabled(Boolean requestAccessEnabled) {
    this.requestAccessEnabled = requestAccessEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to allow users send access request emails to content or project owners. Specify false if you do not want users to be able to request access. The default is false.
   * @return requestAccessEnabled
  */
  
  @Schema(name = "requestAccessEnabled", description = "(Optional) Specify true to allow users send access request emails to content or project owners. Specify false if you do not want users to be able to request access. The default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestAccessEnabled")
  public Boolean getRequestAccessEnabled() {
    return requestAccessEnabled;
  }

  public void setRequestAccessEnabled(Boolean requestAccessEnabled) {
    this.requestAccessEnabled = requestAccessEnabled;
  }

  public UpdateSiteResponse revisionHistoryEnabled(Boolean revisionHistoryEnabled) {
    this.revisionHistoryEnabled = revisionHistoryEnabled;
    return this;
  }

  /**
   * (Optional) true if the site maintains revisions for changes to workbooks and data sources; otherwise, false. The default is false.
   * @return revisionHistoryEnabled
  */
  
  @Schema(name = "revisionHistoryEnabled", description = "(Optional) true if the site maintains revisions for changes to workbooks and data sources; otherwise, false. The default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revisionHistoryEnabled")
  public Boolean getRevisionHistoryEnabled() {
    return revisionHistoryEnabled;
  }

  public void setRevisionHistoryEnabled(Boolean revisionHistoryEnabled) {
    this.revisionHistoryEnabled = revisionHistoryEnabled;
  }

  public UpdateSiteResponse revisionLimit(String revisionLimit) {
    this.revisionLimit = revisionLimit;
    return this;
  }

  /**
   * revisionLimitType: revisionLimit
   * @return revisionLimit
  */
  
  @Schema(name = "revisionLimit", description = "revisionLimitType: revisionLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revisionLimit")
  public String getRevisionLimit() {
    return revisionLimit;
  }

  public void setRevisionLimit(String revisionLimit) {
    this.revisionLimit = revisionLimit;
  }

  public UpdateSiteResponse runNowEnabled(Boolean runNowEnabled) {
    this.runNowEnabled = runNowEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, run now for schedules is enabled which allows non-administrators to run schedules manually. Default value is true.
   * @return runNowEnabled
  */
  
  @Schema(name = "runNowEnabled", description = "(Optional, boolean) If true, run now for schedules is enabled which allows non-administrators to run schedules manually. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runNowEnabled")
  public Boolean getRunNowEnabled() {
    return runNowEnabled;
  }

  public void setRunNowEnabled(Boolean runNowEnabled) {
    this.runNowEnabled = runNowEnabled;
  }

  public UpdateSiteResponse schedulingFlowsEnabled(Boolean schedulingFlowsEnabled) {
    this.schedulingFlowsEnabled = schedulingFlowsEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to enable and false to disable scheduling flows for a site. For more information on flows, see Enable and Configure Tableau Prep Conductor(Link opens in a new window).The default is set to true which means scheduling flows is enabled by default. For more information, see Implication of disabling Tableau Prep Conductor.
   * @return schedulingFlowsEnabled
  */
  
  @Schema(name = "schedulingFlowsEnabled", description = "(Optional) Specify true to enable and false to disable scheduling flows for a site. For more information on flows, see Enable and Configure Tableau Prep Conductor(Link opens in a new window).The default is set to true which means scheduling flows is enabled by default. For more information, see Implication of disabling Tableau Prep Conductor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedulingFlowsEnabled")
  public Boolean getSchedulingFlowsEnabled() {
    return schedulingFlowsEnabled;
  }

  public void setSchedulingFlowsEnabled(Boolean schedulingFlowsEnabled) {
    this.schedulingFlowsEnabled = schedulingFlowsEnabled;
  }

  public UpdateSiteResponse selfServiceScheduleForRefreshEnabled(Boolean selfServiceScheduleForRefreshEnabled) {
    this.selfServiceScheduleForRefreshEnabled = selfServiceScheduleForRefreshEnabled;
    return this;
  }

  /**
   * xs:boolean: selfServiceScheduleForRefreshEnabled
   * @return selfServiceScheduleForRefreshEnabled
  */
  
  @Schema(name = "selfServiceScheduleForRefreshEnabled", description = "xs:boolean: selfServiceScheduleForRefreshEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfServiceScheduleForRefreshEnabled")
  public Boolean getSelfServiceScheduleForRefreshEnabled() {
    return selfServiceScheduleForRefreshEnabled;
  }

  public void setSelfServiceScheduleForRefreshEnabled(Boolean selfServiceScheduleForRefreshEnabled) {
    this.selfServiceScheduleForRefreshEnabled = selfServiceScheduleForRefreshEnabled;
  }

  public UpdateSiteResponse settings(List<@Valid EmbeddingSettingsType> settings) {
    this.settings = settings;
    return this;
  }

  public UpdateSiteResponse addSettingsItem(EmbeddingSettingsType settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settings")
  public List<@Valid EmbeddingSettingsType> getSettings() {
    return settings;
  }

  public void setSettings(List<@Valid EmbeddingSettingsType> settings) {
    this.settings = settings;
  }

  public UpdateSiteResponse sheetImageEnabled(Boolean sheetImageEnabled) {
    this.sheetImageEnabled = sheetImageEnabled;
    return this;
  }

  /**
   * xs:boolean: sheetImageEnabled
   * @return sheetImageEnabled
  */
  
  @Schema(name = "sheetImageEnabled", description = "xs:boolean: sheetImageEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sheetImageEnabled")
  public Boolean getSheetImageEnabled() {
    return sheetImageEnabled;
  }

  public void setSheetImageEnabled(Boolean sheetImageEnabled) {
    this.sheetImageEnabled = sheetImageEnabled;
  }

  public UpdateSiteResponse siteInviteEmailEnabled(Boolean siteInviteEmailEnabled) {
    this.siteInviteEmailEnabled = siteInviteEmailEnabled;
    return this;
  }

  /**
   * xs:boolean: siteInviteEmailEnabled
   * @return siteInviteEmailEnabled
  */
  
  @Schema(name = "siteInviteEmailEnabled", description = "xs:boolean: siteInviteEmailEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteInviteEmailEnabled")
  public Boolean getSiteInviteEmailEnabled() {
    return siteInviteEmailEnabled;
  }

  public void setSiteInviteEmailEnabled(Boolean siteInviteEmailEnabled) {
    this.siteInviteEmailEnabled = siteInviteEmailEnabled;
  }

  public UpdateSiteResponse sitePromptedLoginFlowEnabled(Boolean sitePromptedLoginFlowEnabled) {
    this.sitePromptedLoginFlowEnabled = sitePromptedLoginFlowEnabled;
    return this;
  }

  /**
   * xs:boolean: sitePromptedLoginFlowEnabled
   * @return sitePromptedLoginFlowEnabled
  */
  
  @Schema(name = "sitePromptedLoginFlowEnabled", description = "xs:boolean: sitePromptedLoginFlowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sitePromptedLoginFlowEnabled")
  public Boolean getSitePromptedLoginFlowEnabled() {
    return sitePromptedLoginFlowEnabled;
  }

  public void setSitePromptedLoginFlowEnabled(Boolean sitePromptedLoginFlowEnabled) {
    this.sitePromptedLoginFlowEnabled = sitePromptedLoginFlowEnabled;
  }

  public UpdateSiteResponse siteSettings(List<@Valid SiteSettingType> siteSettings) {
    this.siteSettings = siteSettings;
    return this;
  }

  public UpdateSiteResponse addSiteSettingsItem(SiteSettingType siteSettingsItem) {
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

  public UpdateSiteResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * xs:string: state
   * @return state
  */
  
  @Schema(name = "state", description = "xs:string: state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UpdateSiteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UpdateSiteResponse storageQuota(String storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

  /**
   * (Optional) The maximum amount of space for the new site, in megabytes. If you set a quota and the site exceeds it, publishers will be prevented from uploading new content until the site is under the limit again.
   * @return storageQuota
  */
  
  @Schema(name = "storageQuota", description = "(Optional) The maximum amount of space for the new site, in megabytes. If you set a quota and the site exceeds it, publishers will be prevented from uploading new content until the site is under the limit again.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageQuota")
  public String getStorageQuota() {
    return storageQuota;
  }

  public void setStorageQuota(String storageQuota) {
    this.storageQuota = storageQuota;
  }

  public UpdateSiteResponse storageUsed(StorageUsed storageUsed) {
    this.storageUsed = storageUsed;
    return this;
  }

  /**
   * Get storageUsed
   * @return storageUsed
  */
  @Valid 
  @Schema(name = "storageUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageUsed")
  public StorageUsed getStorageUsed() {
    return storageUsed;
  }

  public void setStorageUsed(StorageUsed storageUsed) {
    this.storageUsed = storageUsed;
  }

  public UpdateSiteResponse subscribeOthersEnabled(Boolean subscribeOthersEnabled) {
    this.subscribeOthersEnabled = subscribeOthersEnabled;
    return this;
  }

  /**
   * (Optional) Specify true to enable and false to disable the ability for view owners to subscribe other users to a view. Default is true.
   * @return subscribeOthersEnabled
  */
  
  @Schema(name = "subscribeOthersEnabled", description = "(Optional) Specify true to enable and false to disable the ability for view owners to subscribe other users to a view. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscribeOthersEnabled")
  public Boolean getSubscribeOthersEnabled() {
    return subscribeOthersEnabled;
  }

  public void setSubscribeOthersEnabled(Boolean subscribeOthersEnabled) {
    this.subscribeOthersEnabled = subscribeOthersEnabled;
  }

  public UpdateSiteResponse suspendedDateTime(OffsetDateTime suspendedDateTime) {
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

  public UpdateSiteResponse tagLimit(Integer tagLimit) {
    this.tagLimit = tagLimit;
    return this;
  }

  /**
   * xs:integer: tagLimit
   * @return tagLimit
  */
  
  @Schema(name = "tagLimit", description = "xs:integer: tagLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagLimit")
  public Integer getTagLimit() {
    return tagLimit;
  }

  public void setTagLimit(Integer tagLimit) {
    this.tagLimit = tagLimit;
  }

  public UpdateSiteResponse tenantId(UUID tenantId) {
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

  public UpdateSiteResponse tierCreatorCapacity(Integer tierCreatorCapacity) {
    this.tierCreatorCapacity = tierCreatorCapacity;
    return this;
  }

  /**
   * siteCapacityType: tierCreatorCapacity
   * @return tierCreatorCapacity
  */
  
  @Schema(name = "tierCreatorCapacity", description = "siteCapacityType: tierCreatorCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierCreatorCapacity")
  public Integer getTierCreatorCapacity() {
    return tierCreatorCapacity;
  }

  public void setTierCreatorCapacity(Integer tierCreatorCapacity) {
    this.tierCreatorCapacity = tierCreatorCapacity;
  }

  public UpdateSiteResponse tierExplorerCapacity(Integer tierExplorerCapacity) {
    this.tierExplorerCapacity = tierExplorerCapacity;
    return this;
  }

  /**
   * siteCapacityType: tierExplorerCapacity
   * @return tierExplorerCapacity
  */
  
  @Schema(name = "tierExplorerCapacity", description = "siteCapacityType: tierExplorerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierExplorerCapacity")
  public Integer getTierExplorerCapacity() {
    return tierExplorerCapacity;
  }

  public void setTierExplorerCapacity(Integer tierExplorerCapacity) {
    this.tierExplorerCapacity = tierExplorerCapacity;
  }

  public UpdateSiteResponse tierViewerCapacity(Integer tierViewerCapacity) {
    this.tierViewerCapacity = tierViewerCapacity;
    return this;
  }

  /**
   * siteCapacityType: tierViewerCapacity
   * @return tierViewerCapacity
  */
  
  @Schema(name = "tierViewerCapacity", description = "siteCapacityType: tierViewerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierViewerCapacity")
  public Integer getTierViewerCapacity() {
    return tierViewerCapacity;
  }

  public void setTierViewerCapacity(Integer tierViewerCapacity) {
    this.tierViewerCapacity = tierViewerCapacity;
  }

  public UpdateSiteResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * (Optional, string) Use this attribute to specify a time zone other than the Server time zone at run time. Only canonical names in the official IANA database are supported. You can find the list of the canonical time zone names on wikipedia.
   * @return timeZone
  */
  
  @Schema(name = "timeZone", description = "(Optional, string) Use this attribute to specify a time zone other than the Server time zone at run time. Only canonical names in the official IANA database are supported. You can find the list of the canonical time zone names on wikipedia.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public UpdateSiteResponse usage(Usage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public Usage getUsage() {
    return usage;
  }

  public void setUsage(Usage usage) {
    this.usage = usage;
  }

  public UpdateSiteResponse useDefaultTimeZone(Boolean useDefaultTimeZone) {
    this.useDefaultTimeZone = useDefaultTimeZone;
    return this;
  }

  /**
   * Optional, boolean) Set this to true, if you want the time-zone attribute use the Server time Zone at run time. This attribute is set to official IANA name.Â If this is set to false, the time-zone value must be specified.
   * @return useDefaultTimeZone
  */
  
  @Schema(name = "useDefaultTimeZone", description = "Optional, boolean) Set this to true, if you want the time-zone attribute use the Server time Zone at run time. This attribute is set to official IANA name.Â If this is set to false, the time-zone value must be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useDefaultTimeZone")
  public Boolean getUseDefaultTimeZone() {
    return useDefaultTimeZone;
  }

  public void setUseDefaultTimeZone(Boolean useDefaultTimeZone) {
    this.useDefaultTimeZone = useDefaultTimeZone;
  }

  public UpdateSiteResponse userQuota(String userQuota) {
    this.userQuota = userQuota;
    return this;
  }

  /**
   * xs:string: userQuota
   * @return userQuota
  */
  
  @Schema(name = "userQuota", description = "xs:string: userQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userQuota")
  public String getUserQuota() {
    return userQuota;
  }

  public void setUserQuota(String userQuota) {
    this.userQuota = userQuota;
  }

  public UpdateSiteResponse userVisibilityMode(String userVisibilityMode) {
    this.userVisibilityMode = userVisibilityMode;
    return this;
  }

  /**
   * (Optional, string) When the value is FULL users can see the user of other site users. If the value is LIMITED User information on the site is not visible to other users. Default value is FULL. For more information, see User Visibility(Link opens in a new window).
   * @return userVisibilityMode
  */
  
  @Schema(name = "userVisibilityMode", description = "(Optional, string) When the value is FULL users can see the user of other site users. If the value is LIMITED User information on the site is not visible to other users. Default value is FULL. For more information, see User Visibility(Link opens in a new window).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userVisibilityMode")
  public String getUserVisibilityMode() {
    return userVisibilityMode;
  }

  public void setUserVisibilityMode(String userVisibilityMode) {
    this.userVisibilityMode = userVisibilityMode;
  }

  public UpdateSiteResponse webExtractionEnabled(Boolean webExtractionEnabled) {
    this.webExtractionEnabled = webExtractionEnabled;
    return this;
  }

  /**
   * (Optional, boolean) If true, web extraction is enabled on the site. Default value is true.
   * @return webExtractionEnabled
  */
  
  @Schema(name = "webExtractionEnabled", description = "(Optional, boolean) If true, web extraction is enabled on the site. Default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webExtractionEnabled")
  public Boolean getWebExtractionEnabled() {
    return webExtractionEnabled;
  }

  public void setWebExtractionEnabled(Boolean webExtractionEnabled) {
    this.webExtractionEnabled = webExtractionEnabled;
  }

  public UpdateSiteResponse webZoneContentEnabled(Boolean webZoneContentEnabled) {
    this.webZoneContentEnabled = webZoneContentEnabled;
    return this;
  }

  /**
   * xs:boolean: webZoneContentEnabled
   * @return webZoneContentEnabled
  */
  
  @Schema(name = "webZoneContentEnabled", description = "xs:boolean: webZoneContentEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webZoneContentEnabled")
  public Boolean getWebZoneContentEnabled() {
    return webZoneContentEnabled;
  }

  public void setWebZoneContentEnabled(Boolean webZoneContentEnabled) {
    this.webZoneContentEnabled = webZoneContentEnabled;
  }

  public UpdateSiteResponse workflowExtensionEnabled(Boolean workflowExtensionEnabled) {
    this.workflowExtensionEnabled = workflowExtensionEnabled;
    return this;
  }

  /**
   * xs:boolean: workflowExtensionEnabled
   * @return workflowExtensionEnabled
  */
  
  @Schema(name = "workflowExtensionEnabled", description = "xs:boolean: workflowExtensionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowExtensionEnabled")
  public Boolean getWorkflowExtensionEnabled() {
    return workflowExtensionEnabled;
  }

  public void setWorkflowExtensionEnabled(Boolean workflowExtensionEnabled) {
    this.workflowExtensionEnabled = workflowExtensionEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSiteResponse updateSiteResponse = (UpdateSiteResponse) o;
    return Objects.equals(this.adminInsightsPublishFrequency, updateSiteResponse.adminInsightsPublishFrequency) &&
        Objects.equals(this.adminMode, updateSiteResponse.adminMode) &&
        Objects.equals(this.allowSubscriptionAttachments, updateSiteResponse.allowSubscriptionAttachments) &&
        Objects.equals(this.askDataMode, updateSiteResponse.askDataMode) &&
        Objects.equals(this.attributeCaptureEnabled, updateSiteResponse.attributeCaptureEnabled) &&
        Objects.equals(this.authoringEnabled, updateSiteResponse.authoringEnabled) &&
        Objects.equals(this.autoExtractRefreshMonitoringEnabled, updateSiteResponse.autoExtractRefreshMonitoringEnabled) &&
        Objects.equals(this.autoFlowRunMonitoringEnabled, updateSiteResponse.autoFlowRunMonitoringEnabled) &&
        Objects.equals(this.autoSuspendRefreshEnabled, updateSiteResponse.autoSuspendRefreshEnabled) &&
        Objects.equals(this.autoSuspendRefreshInactivityWindow, updateSiteResponse.autoSuspendRefreshInactivityWindow) &&
        Objects.equals(this.blockNonExtractEnabled, updateSiteResponse.blockNonExtractEnabled) &&
        Objects.equals(this.cacheWarmupEnabled, updateSiteResponse.cacheWarmupEnabled) &&
        Objects.equals(this.catalogObfuscationEnabled, updateSiteResponse.catalogObfuscationEnabled) &&
        Objects.equals(this.catalogingEnabled, updateSiteResponse.catalogingEnabled) &&
        Objects.equals(this.cmekEnabled, updateSiteResponse.cmekEnabled) &&
        Objects.equals(this.commentingEnabled, updateSiteResponse.commentingEnabled) &&
        Objects.equals(this.commentingMentionsEnabled, updateSiteResponse.commentingMentionsEnabled) &&
        Objects.equals(this.contentMigrationToolEnabled, updateSiteResponse.contentMigrationToolEnabled) &&
        Objects.equals(this.contentUrl, updateSiteResponse.contentUrl) &&
        Objects.equals(this.createDateTime, updateSiteResponse.createDateTime) &&
        Objects.equals(this.customSubscriptionEmail, updateSiteResponse.customSubscriptionEmail) &&
        Objects.equals(this.customSubscriptionEmailEnabled, updateSiteResponse.customSubscriptionEmailEnabled) &&
        Objects.equals(this.customSubscriptionFooter, updateSiteResponse.customSubscriptionFooter) &&
        Objects.equals(this.customSubscriptionFooterEnabled, updateSiteResponse.customSubscriptionFooterEnabled) &&
        Objects.equals(this.dataAccelerationMode, updateSiteResponse.dataAccelerationMode) &&
        Objects.equals(this.dataAlertsEnabled, updateSiteResponse.dataAlertsEnabled) &&
        Objects.equals(this.dataOrientationEnabled, updateSiteResponse.dataOrientationEnabled) &&
        Objects.equals(this.dataStoryEnabled, updateSiteResponse.dataStoryEnabled) &&
        Objects.equals(this.derivedPermissionsEnabled, updateSiteResponse.derivedPermissionsEnabled) &&
        Objects.equals(this.disableSubscriptions, updateSiteResponse.disableSubscriptions) &&
        Objects.equals(this.dqwSubscriptionsEnabled, updateSiteResponse.dqwSubscriptionsEnabled) &&
        Objects.equals(this.easEnabled, updateSiteResponse.easEnabled) &&
        Objects.equals(this.editingFlowsEnabled, updateSiteResponse.editingFlowsEnabled) &&
        Objects.equals(this.einsteinInFlowEnabled, updateSiteResponse.einsteinInFlowEnabled) &&
        Objects.equals(this.explainDataEnabled, updateSiteResponse.explainDataEnabled) &&
        Objects.equals(this.extractEncryptionMode, updateSiteResponse.extractEncryptionMode) &&
        Objects.equals(this.flowAutoSaveEnabled, updateSiteResponse.flowAutoSaveEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled, updateSiteResponse.flowOutputSubscriptionsDataAsEmailAttachmentEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsDataInEmailBodyEnabled, updateSiteResponse.flowOutputSubscriptionsDataInEmailBodyEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsEnabled, updateSiteResponse.flowOutputSubscriptionsEnabled) &&
        Objects.equals(this.flowParametersAnyTypeEnabled, updateSiteResponse.flowParametersAnyTypeEnabled) &&
        Objects.equals(this.flowParametersEnabled, updateSiteResponse.flowParametersEnabled) &&
        Objects.equals(this.flowParametersSystemTypeEnabled, updateSiteResponse.flowParametersSystemTypeEnabled) &&
        Objects.equals(this.flowsEnabled, updateSiteResponse.flowsEnabled) &&
        Objects.equals(this.generativeAiDataCatalog, updateSiteResponse.generativeAiDataCatalog) &&
        Objects.equals(this.generativeAiEnabled, updateSiteResponse.generativeAiEnabled) &&
        Objects.equals(this.generativeAiPrep, updateSiteResponse.generativeAiPrep) &&
        Objects.equals(this.generativeAiPulse, updateSiteResponse.generativeAiPulse) &&
        Objects.equals(this.generativeAiWebAuthoring, updateSiteResponse.generativeAiWebAuthoring) &&
        Objects.equals(this.groupAssertionsConnectedAppsEnabled, updateSiteResponse.groupAssertionsConnectedAppsEnabled) &&
        Objects.equals(this.groupAssertionsEnabled, updateSiteResponse.groupAssertionsEnabled) &&
        Objects.equals(this.groupAssertionsOIDCEnabled, updateSiteResponse.groupAssertionsOIDCEnabled) &&
        Objects.equals(this.groupAssertionsSAMLEnabled, updateSiteResponse.groupAssertionsSAMLEnabled) &&
        Objects.equals(this.groupSetsEnabled, updateSiteResponse.groupSetsEnabled) &&
        Objects.equals(this.guestAccessEnabled, updateSiteResponse.guestAccessEnabled) &&
        Objects.equals(this.id, updateSiteResponse.id) &&
        Objects.equals(this.idpConfigurationIdForScim, updateSiteResponse.idpConfigurationIdForScim) &&
        Objects.equals(this.instance, updateSiteResponse.instance) &&
        Objects.equals(this.lastUpdateDateTime, updateSiteResponse.lastUpdateDateTime) &&
        Objects.equals(this.linkedTaskRunNowEnabled, updateSiteResponse.linkedTaskRunNowEnabled) &&
        Objects.equals(this.linkedTaskSchedulingEnabled, updateSiteResponse.linkedTaskSchedulingEnabled) &&
        Objects.equals(this.location, updateSiteResponse.location) &&
        Objects.equals(this.loginBasedLicenseManagementEnabled, updateSiteResponse.loginBasedLicenseManagementEnabled) &&
        Objects.equals(this.maxServiceTokenLimitPerUser, updateSiteResponse.maxServiceTokenLimitPerUser) &&
        Objects.equals(this.metricsContentTypeEnabled, updateSiteResponse.metricsContentTypeEnabled) &&
        Objects.equals(this.mfaEnforcementExemption, updateSiteResponse.mfaEnforcementExemption) &&
        Objects.equals(this.migrationStatus, updateSiteResponse.migrationStatus) &&
        Objects.equals(this.mobileBiometricsEnabled, updateSiteResponse.mobileBiometricsEnabled) &&
        Objects.equals(this.name, updateSiteResponse.name) &&
        Objects.equals(this.namedSharingEnabled, updateSiteResponse.namedSharingEnabled) &&
        Objects.equals(this.notifySiteAdminsOnThrottle, updateSiteResponse.notifySiteAdminsOnThrottle) &&
        Objects.equals(this.personalSpaceEnabled, updateSiteResponse.personalSpaceEnabled) &&
        Objects.equals(this.personalSpaceStorageQuota, updateSiteResponse.personalSpaceStorageQuota) &&
        Objects.equals(this.publishToSalesforceEnabled, updateSiteResponse.publishToSalesforceEnabled) &&
        Objects.equals(this.pulseEnabled, updateSiteResponse.pulseEnabled) &&
        Objects.equals(this.pulseGroupId, updateSiteResponse.pulseGroupId) &&
        Objects.equals(this.pulsePersonalizedRankingEnabled, updateSiteResponse.pulsePersonalizedRankingEnabled) &&
        Objects.equals(this.refreshTokenAbsoluteExpiry, updateSiteResponse.refreshTokenAbsoluteExpiry) &&
        Objects.equals(this.requestAccessEnabled, updateSiteResponse.requestAccessEnabled) &&
        Objects.equals(this.revisionHistoryEnabled, updateSiteResponse.revisionHistoryEnabled) &&
        Objects.equals(this.revisionLimit, updateSiteResponse.revisionLimit) &&
        Objects.equals(this.runNowEnabled, updateSiteResponse.runNowEnabled) &&
        Objects.equals(this.schedulingFlowsEnabled, updateSiteResponse.schedulingFlowsEnabled) &&
        Objects.equals(this.selfServiceScheduleForRefreshEnabled, updateSiteResponse.selfServiceScheduleForRefreshEnabled) &&
        Objects.equals(this.settings, updateSiteResponse.settings) &&
        Objects.equals(this.sheetImageEnabled, updateSiteResponse.sheetImageEnabled) &&
        Objects.equals(this.siteInviteEmailEnabled, updateSiteResponse.siteInviteEmailEnabled) &&
        Objects.equals(this.sitePromptedLoginFlowEnabled, updateSiteResponse.sitePromptedLoginFlowEnabled) &&
        Objects.equals(this.siteSettings, updateSiteResponse.siteSettings) &&
        Objects.equals(this.state, updateSiteResponse.state) &&
        Objects.equals(this.status, updateSiteResponse.status) &&
        Objects.equals(this.storageQuota, updateSiteResponse.storageQuota) &&
        Objects.equals(this.storageUsed, updateSiteResponse.storageUsed) &&
        Objects.equals(this.subscribeOthersEnabled, updateSiteResponse.subscribeOthersEnabled) &&
        Objects.equals(this.suspendedDateTime, updateSiteResponse.suspendedDateTime) &&
        Objects.equals(this.tagLimit, updateSiteResponse.tagLimit) &&
        Objects.equals(this.tenantId, updateSiteResponse.tenantId) &&
        Objects.equals(this.tierCreatorCapacity, updateSiteResponse.tierCreatorCapacity) &&
        Objects.equals(this.tierExplorerCapacity, updateSiteResponse.tierExplorerCapacity) &&
        Objects.equals(this.tierViewerCapacity, updateSiteResponse.tierViewerCapacity) &&
        Objects.equals(this.timeZone, updateSiteResponse.timeZone) &&
        Objects.equals(this.usage, updateSiteResponse.usage) &&
        Objects.equals(this.useDefaultTimeZone, updateSiteResponse.useDefaultTimeZone) &&
        Objects.equals(this.userQuota, updateSiteResponse.userQuota) &&
        Objects.equals(this.userVisibilityMode, updateSiteResponse.userVisibilityMode) &&
        Objects.equals(this.webExtractionEnabled, updateSiteResponse.webExtractionEnabled) &&
        Objects.equals(this.webZoneContentEnabled, updateSiteResponse.webZoneContentEnabled) &&
        Objects.equals(this.workflowExtensionEnabled, updateSiteResponse.workflowExtensionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminInsightsPublishFrequency, adminMode, allowSubscriptionAttachments, askDataMode, attributeCaptureEnabled, authoringEnabled, autoExtractRefreshMonitoringEnabled, autoFlowRunMonitoringEnabled, autoSuspendRefreshEnabled, autoSuspendRefreshInactivityWindow, blockNonExtractEnabled, cacheWarmupEnabled, catalogObfuscationEnabled, catalogingEnabled, cmekEnabled, commentingEnabled, commentingMentionsEnabled, contentMigrationToolEnabled, contentUrl, createDateTime, customSubscriptionEmail, customSubscriptionEmailEnabled, customSubscriptionFooter, customSubscriptionFooterEnabled, dataAccelerationMode, dataAlertsEnabled, dataOrientationEnabled, dataStoryEnabled, derivedPermissionsEnabled, disableSubscriptions, dqwSubscriptionsEnabled, easEnabled, editingFlowsEnabled, einsteinInFlowEnabled, explainDataEnabled, extractEncryptionMode, flowAutoSaveEnabled, flowOutputSubscriptionsDataAsEmailAttachmentEnabled, flowOutputSubscriptionsDataInEmailBodyEnabled, flowOutputSubscriptionsEnabled, flowParametersAnyTypeEnabled, flowParametersEnabled, flowParametersSystemTypeEnabled, flowsEnabled, generativeAiDataCatalog, generativeAiEnabled, generativeAiPrep, generativeAiPulse, generativeAiWebAuthoring, groupAssertionsConnectedAppsEnabled, groupAssertionsEnabled, groupAssertionsOIDCEnabled, groupAssertionsSAMLEnabled, groupSetsEnabled, guestAccessEnabled, id, idpConfigurationIdForScim, instance, lastUpdateDateTime, linkedTaskRunNowEnabled, linkedTaskSchedulingEnabled, location, loginBasedLicenseManagementEnabled, maxServiceTokenLimitPerUser, metricsContentTypeEnabled, mfaEnforcementExemption, migrationStatus, mobileBiometricsEnabled, name, namedSharingEnabled, notifySiteAdminsOnThrottle, personalSpaceEnabled, personalSpaceStorageQuota, publishToSalesforceEnabled, pulseEnabled, pulseGroupId, pulsePersonalizedRankingEnabled, refreshTokenAbsoluteExpiry, requestAccessEnabled, revisionHistoryEnabled, revisionLimit, runNowEnabled, schedulingFlowsEnabled, selfServiceScheduleForRefreshEnabled, settings, sheetImageEnabled, siteInviteEmailEnabled, sitePromptedLoginFlowEnabled, siteSettings, state, status, storageQuota, storageUsed, subscribeOthersEnabled, suspendedDateTime, tagLimit, tenantId, tierCreatorCapacity, tierExplorerCapacity, tierViewerCapacity, timeZone, usage, useDefaultTimeZone, userQuota, userVisibilityMode, webExtractionEnabled, webZoneContentEnabled, workflowExtensionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSiteResponse {\n");
    sb.append("    adminInsightsPublishFrequency: ").append(toIndentedString(adminInsightsPublishFrequency)).append("\n");
    sb.append("    adminMode: ").append(toIndentedString(adminMode)).append("\n");
    sb.append("    allowSubscriptionAttachments: ").append(toIndentedString(allowSubscriptionAttachments)).append("\n");
    sb.append("    askDataMode: ").append(toIndentedString(askDataMode)).append("\n");
    sb.append("    attributeCaptureEnabled: ").append(toIndentedString(attributeCaptureEnabled)).append("\n");
    sb.append("    authoringEnabled: ").append(toIndentedString(authoringEnabled)).append("\n");
    sb.append("    autoExtractRefreshMonitoringEnabled: ").append(toIndentedString(autoExtractRefreshMonitoringEnabled)).append("\n");
    sb.append("    autoFlowRunMonitoringEnabled: ").append(toIndentedString(autoFlowRunMonitoringEnabled)).append("\n");
    sb.append("    autoSuspendRefreshEnabled: ").append(toIndentedString(autoSuspendRefreshEnabled)).append("\n");
    sb.append("    autoSuspendRefreshInactivityWindow: ").append(toIndentedString(autoSuspendRefreshInactivityWindow)).append("\n");
    sb.append("    blockNonExtractEnabled: ").append(toIndentedString(blockNonExtractEnabled)).append("\n");
    sb.append("    cacheWarmupEnabled: ").append(toIndentedString(cacheWarmupEnabled)).append("\n");
    sb.append("    catalogObfuscationEnabled: ").append(toIndentedString(catalogObfuscationEnabled)).append("\n");
    sb.append("    catalogingEnabled: ").append(toIndentedString(catalogingEnabled)).append("\n");
    sb.append("    cmekEnabled: ").append(toIndentedString(cmekEnabled)).append("\n");
    sb.append("    commentingEnabled: ").append(toIndentedString(commentingEnabled)).append("\n");
    sb.append("    commentingMentionsEnabled: ").append(toIndentedString(commentingMentionsEnabled)).append("\n");
    sb.append("    contentMigrationToolEnabled: ").append(toIndentedString(contentMigrationToolEnabled)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    customSubscriptionEmail: ").append(toIndentedString(customSubscriptionEmail)).append("\n");
    sb.append("    customSubscriptionEmailEnabled: ").append(toIndentedString(customSubscriptionEmailEnabled)).append("\n");
    sb.append("    customSubscriptionFooter: ").append(toIndentedString(customSubscriptionFooter)).append("\n");
    sb.append("    customSubscriptionFooterEnabled: ").append(toIndentedString(customSubscriptionFooterEnabled)).append("\n");
    sb.append("    dataAccelerationMode: ").append(toIndentedString(dataAccelerationMode)).append("\n");
    sb.append("    dataAlertsEnabled: ").append(toIndentedString(dataAlertsEnabled)).append("\n");
    sb.append("    dataOrientationEnabled: ").append(toIndentedString(dataOrientationEnabled)).append("\n");
    sb.append("    dataStoryEnabled: ").append(toIndentedString(dataStoryEnabled)).append("\n");
    sb.append("    derivedPermissionsEnabled: ").append(toIndentedString(derivedPermissionsEnabled)).append("\n");
    sb.append("    disableSubscriptions: ").append(toIndentedString(disableSubscriptions)).append("\n");
    sb.append("    dqwSubscriptionsEnabled: ").append(toIndentedString(dqwSubscriptionsEnabled)).append("\n");
    sb.append("    easEnabled: ").append(toIndentedString(easEnabled)).append("\n");
    sb.append("    editingFlowsEnabled: ").append(toIndentedString(editingFlowsEnabled)).append("\n");
    sb.append("    einsteinInFlowEnabled: ").append(toIndentedString(einsteinInFlowEnabled)).append("\n");
    sb.append("    explainDataEnabled: ").append(toIndentedString(explainDataEnabled)).append("\n");
    sb.append("    extractEncryptionMode: ").append(toIndentedString(extractEncryptionMode)).append("\n");
    sb.append("    flowAutoSaveEnabled: ").append(toIndentedString(flowAutoSaveEnabled)).append("\n");
    sb.append("    flowOutputSubscriptionsDataAsEmailAttachmentEnabled: ").append(toIndentedString(flowOutputSubscriptionsDataAsEmailAttachmentEnabled)).append("\n");
    sb.append("    flowOutputSubscriptionsDataInEmailBodyEnabled: ").append(toIndentedString(flowOutputSubscriptionsDataInEmailBodyEnabled)).append("\n");
    sb.append("    flowOutputSubscriptionsEnabled: ").append(toIndentedString(flowOutputSubscriptionsEnabled)).append("\n");
    sb.append("    flowParametersAnyTypeEnabled: ").append(toIndentedString(flowParametersAnyTypeEnabled)).append("\n");
    sb.append("    flowParametersEnabled: ").append(toIndentedString(flowParametersEnabled)).append("\n");
    sb.append("    flowParametersSystemTypeEnabled: ").append(toIndentedString(flowParametersSystemTypeEnabled)).append("\n");
    sb.append("    flowsEnabled: ").append(toIndentedString(flowsEnabled)).append("\n");
    sb.append("    generativeAiDataCatalog: ").append(toIndentedString(generativeAiDataCatalog)).append("\n");
    sb.append("    generativeAiEnabled: ").append(toIndentedString(generativeAiEnabled)).append("\n");
    sb.append("    generativeAiPrep: ").append(toIndentedString(generativeAiPrep)).append("\n");
    sb.append("    generativeAiPulse: ").append(toIndentedString(generativeAiPulse)).append("\n");
    sb.append("    generativeAiWebAuthoring: ").append(toIndentedString(generativeAiWebAuthoring)).append("\n");
    sb.append("    groupAssertionsConnectedAppsEnabled: ").append(toIndentedString(groupAssertionsConnectedAppsEnabled)).append("\n");
    sb.append("    groupAssertionsEnabled: ").append(toIndentedString(groupAssertionsEnabled)).append("\n");
    sb.append("    groupAssertionsOIDCEnabled: ").append(toIndentedString(groupAssertionsOIDCEnabled)).append("\n");
    sb.append("    groupAssertionsSAMLEnabled: ").append(toIndentedString(groupAssertionsSAMLEnabled)).append("\n");
    sb.append("    groupSetsEnabled: ").append(toIndentedString(groupSetsEnabled)).append("\n");
    sb.append("    guestAccessEnabled: ").append(toIndentedString(guestAccessEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idpConfigurationIdForScim: ").append(toIndentedString(idpConfigurationIdForScim)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    linkedTaskRunNowEnabled: ").append(toIndentedString(linkedTaskRunNowEnabled)).append("\n");
    sb.append("    linkedTaskSchedulingEnabled: ").append(toIndentedString(linkedTaskSchedulingEnabled)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    loginBasedLicenseManagementEnabled: ").append(toIndentedString(loginBasedLicenseManagementEnabled)).append("\n");
    sb.append("    maxServiceTokenLimitPerUser: ").append(toIndentedString(maxServiceTokenLimitPerUser)).append("\n");
    sb.append("    metricsContentTypeEnabled: ").append(toIndentedString(metricsContentTypeEnabled)).append("\n");
    sb.append("    mfaEnforcementExemption: ").append(toIndentedString(mfaEnforcementExemption)).append("\n");
    sb.append("    migrationStatus: ").append(toIndentedString(migrationStatus)).append("\n");
    sb.append("    mobileBiometricsEnabled: ").append(toIndentedString(mobileBiometricsEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namedSharingEnabled: ").append(toIndentedString(namedSharingEnabled)).append("\n");
    sb.append("    notifySiteAdminsOnThrottle: ").append(toIndentedString(notifySiteAdminsOnThrottle)).append("\n");
    sb.append("    personalSpaceEnabled: ").append(toIndentedString(personalSpaceEnabled)).append("\n");
    sb.append("    personalSpaceStorageQuota: ").append(toIndentedString(personalSpaceStorageQuota)).append("\n");
    sb.append("    publishToSalesforceEnabled: ").append(toIndentedString(publishToSalesforceEnabled)).append("\n");
    sb.append("    pulseEnabled: ").append(toIndentedString(pulseEnabled)).append("\n");
    sb.append("    pulseGroupId: ").append(toIndentedString(pulseGroupId)).append("\n");
    sb.append("    pulsePersonalizedRankingEnabled: ").append(toIndentedString(pulsePersonalizedRankingEnabled)).append("\n");
    sb.append("    refreshTokenAbsoluteExpiry: ").append(toIndentedString(refreshTokenAbsoluteExpiry)).append("\n");
    sb.append("    requestAccessEnabled: ").append(toIndentedString(requestAccessEnabled)).append("\n");
    sb.append("    revisionHistoryEnabled: ").append(toIndentedString(revisionHistoryEnabled)).append("\n");
    sb.append("    revisionLimit: ").append(toIndentedString(revisionLimit)).append("\n");
    sb.append("    runNowEnabled: ").append(toIndentedString(runNowEnabled)).append("\n");
    sb.append("    schedulingFlowsEnabled: ").append(toIndentedString(schedulingFlowsEnabled)).append("\n");
    sb.append("    selfServiceScheduleForRefreshEnabled: ").append(toIndentedString(selfServiceScheduleForRefreshEnabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    sheetImageEnabled: ").append(toIndentedString(sheetImageEnabled)).append("\n");
    sb.append("    siteInviteEmailEnabled: ").append(toIndentedString(siteInviteEmailEnabled)).append("\n");
    sb.append("    sitePromptedLoginFlowEnabled: ").append(toIndentedString(sitePromptedLoginFlowEnabled)).append("\n");
    sb.append("    siteSettings: ").append(toIndentedString(siteSettings)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    storageUsed: ").append(toIndentedString(storageUsed)).append("\n");
    sb.append("    subscribeOthersEnabled: ").append(toIndentedString(subscribeOthersEnabled)).append("\n");
    sb.append("    suspendedDateTime: ").append(toIndentedString(suspendedDateTime)).append("\n");
    sb.append("    tagLimit: ").append(toIndentedString(tagLimit)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tierCreatorCapacity: ").append(toIndentedString(tierCreatorCapacity)).append("\n");
    sb.append("    tierExplorerCapacity: ").append(toIndentedString(tierExplorerCapacity)).append("\n");
    sb.append("    tierViewerCapacity: ").append(toIndentedString(tierViewerCapacity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    useDefaultTimeZone: ").append(toIndentedString(useDefaultTimeZone)).append("\n");
    sb.append("    userQuota: ").append(toIndentedString(userQuota)).append("\n");
    sb.append("    userVisibilityMode: ").append(toIndentedString(userVisibilityMode)).append("\n");
    sb.append("    webExtractionEnabled: ").append(toIndentedString(webExtractionEnabled)).append("\n");
    sb.append("    webZoneContentEnabled: ").append(toIndentedString(webZoneContentEnabled)).append("\n");
    sb.append("    workflowExtensionEnabled: ").append(toIndentedString(workflowExtensionEnabled)).append("\n");
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

