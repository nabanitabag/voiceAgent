package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.EmbeddingSettingsType;
import com.tableausoftware.core.model.SiteSettingType;
import com.tableausoftware.core.model.Usage;
import com.tableausoftware.core.model.UserQuotaPolicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PodSite
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PodSite {

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

  private Boolean linkedTaskRunNowEnabled;

  private Boolean linkedTaskSchedulingEnabled;

  private Boolean loginBasedLicenseManagementEnabled;

  private Integer maxServiceTokenLimitPerUser;

  private Boolean metricsContentTypeEnabled;

  private Boolean mfaEnforcementExemption;

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

  private String storageQuota;

  private String storageUsed;

  private Boolean subscribeOthersEnabled;

  private Integer tagLimit;

  private Integer tierCreatorCapacity;

  private Integer tierExplorerCapacity;

  private Integer tierViewerCapacity;

  private String timeZone;

  private Usage usage;

  private Boolean useDefaultTimeZone;

  private String userQuota;

  private UserQuotaPolicy userQuotaPolicy;

  private String userVisibilityMode;

  private Boolean webExtractionEnabled;

  private Boolean webZoneContentEnabled;

  private Boolean workflowExtensionEnabled;

  public PodSite adminInsightsPublishFrequency(Integer adminInsightsPublishFrequency) {
    this.adminInsightsPublishFrequency = adminInsightsPublishFrequency;
    return this;
  }

  /**
   * Get adminInsightsPublishFrequency
   * @return adminInsightsPublishFrequency
  */
  
  @Schema(name = "adminInsightsPublishFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminInsightsPublishFrequency")
  public Integer getAdminInsightsPublishFrequency() {
    return adminInsightsPublishFrequency;
  }

  public void setAdminInsightsPublishFrequency(Integer adminInsightsPublishFrequency) {
    this.adminInsightsPublishFrequency = adminInsightsPublishFrequency;
  }

  public PodSite adminMode(String adminMode) {
    this.adminMode = adminMode;
    return this;
  }

  /**
   * Get adminMode
   * @return adminMode
  */
  
  @Schema(name = "adminMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminMode")
  public String getAdminMode() {
    return adminMode;
  }

  public void setAdminMode(String adminMode) {
    this.adminMode = adminMode;
  }

  public PodSite allowSubscriptionAttachments(Boolean allowSubscriptionAttachments) {
    this.allowSubscriptionAttachments = allowSubscriptionAttachments;
    return this;
  }

  /**
   * Get allowSubscriptionAttachments
   * @return allowSubscriptionAttachments
  */
  
  @Schema(name = "allowSubscriptionAttachments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowSubscriptionAttachments")
  public Boolean getAllowSubscriptionAttachments() {
    return allowSubscriptionAttachments;
  }

  public void setAllowSubscriptionAttachments(Boolean allowSubscriptionAttachments) {
    this.allowSubscriptionAttachments = allowSubscriptionAttachments;
  }

  public PodSite askDataMode(String askDataMode) {
    this.askDataMode = askDataMode;
    return this;
  }

  /**
   * Get askDataMode
   * @return askDataMode
  */
  
  @Schema(name = "askDataMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("askDataMode")
  public String getAskDataMode() {
    return askDataMode;
  }

  public void setAskDataMode(String askDataMode) {
    this.askDataMode = askDataMode;
  }

  public PodSite attributeCaptureEnabled(Boolean attributeCaptureEnabled) {
    this.attributeCaptureEnabled = attributeCaptureEnabled;
    return this;
  }

  /**
   * Get attributeCaptureEnabled
   * @return attributeCaptureEnabled
  */
  
  @Schema(name = "attributeCaptureEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeCaptureEnabled")
  public Boolean getAttributeCaptureEnabled() {
    return attributeCaptureEnabled;
  }

  public void setAttributeCaptureEnabled(Boolean attributeCaptureEnabled) {
    this.attributeCaptureEnabled = attributeCaptureEnabled;
  }

  public PodSite authoringEnabled(Boolean authoringEnabled) {
    this.authoringEnabled = authoringEnabled;
    return this;
  }

  /**
   * Get authoringEnabled
   * @return authoringEnabled
  */
  
  @Schema(name = "authoringEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authoringEnabled")
  public Boolean getAuthoringEnabled() {
    return authoringEnabled;
  }

  public void setAuthoringEnabled(Boolean authoringEnabled) {
    this.authoringEnabled = authoringEnabled;
  }

  public PodSite autoExtractRefreshMonitoringEnabled(Boolean autoExtractRefreshMonitoringEnabled) {
    this.autoExtractRefreshMonitoringEnabled = autoExtractRefreshMonitoringEnabled;
    return this;
  }

  /**
   * Get autoExtractRefreshMonitoringEnabled
   * @return autoExtractRefreshMonitoringEnabled
  */
  
  @Schema(name = "autoExtractRefreshMonitoringEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoExtractRefreshMonitoringEnabled")
  public Boolean getAutoExtractRefreshMonitoringEnabled() {
    return autoExtractRefreshMonitoringEnabled;
  }

  public void setAutoExtractRefreshMonitoringEnabled(Boolean autoExtractRefreshMonitoringEnabled) {
    this.autoExtractRefreshMonitoringEnabled = autoExtractRefreshMonitoringEnabled;
  }

  public PodSite autoFlowRunMonitoringEnabled(Boolean autoFlowRunMonitoringEnabled) {
    this.autoFlowRunMonitoringEnabled = autoFlowRunMonitoringEnabled;
    return this;
  }

  /**
   * Get autoFlowRunMonitoringEnabled
   * @return autoFlowRunMonitoringEnabled
  */
  
  @Schema(name = "autoFlowRunMonitoringEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoFlowRunMonitoringEnabled")
  public Boolean getAutoFlowRunMonitoringEnabled() {
    return autoFlowRunMonitoringEnabled;
  }

  public void setAutoFlowRunMonitoringEnabled(Boolean autoFlowRunMonitoringEnabled) {
    this.autoFlowRunMonitoringEnabled = autoFlowRunMonitoringEnabled;
  }

  public PodSite autoSuspendRefreshEnabled(Boolean autoSuspendRefreshEnabled) {
    this.autoSuspendRefreshEnabled = autoSuspendRefreshEnabled;
    return this;
  }

  /**
   * Get autoSuspendRefreshEnabled
   * @return autoSuspendRefreshEnabled
  */
  
  @Schema(name = "autoSuspendRefreshEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSuspendRefreshEnabled")
  public Boolean getAutoSuspendRefreshEnabled() {
    return autoSuspendRefreshEnabled;
  }

  public void setAutoSuspendRefreshEnabled(Boolean autoSuspendRefreshEnabled) {
    this.autoSuspendRefreshEnabled = autoSuspendRefreshEnabled;
  }

  public PodSite autoSuspendRefreshInactivityWindow(Integer autoSuspendRefreshInactivityWindow) {
    this.autoSuspendRefreshInactivityWindow = autoSuspendRefreshInactivityWindow;
    return this;
  }

  /**
   * Get autoSuspendRefreshInactivityWindow
   * @return autoSuspendRefreshInactivityWindow
  */
  
  @Schema(name = "autoSuspendRefreshInactivityWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSuspendRefreshInactivityWindow")
  public Integer getAutoSuspendRefreshInactivityWindow() {
    return autoSuspendRefreshInactivityWindow;
  }

  public void setAutoSuspendRefreshInactivityWindow(Integer autoSuspendRefreshInactivityWindow) {
    this.autoSuspendRefreshInactivityWindow = autoSuspendRefreshInactivityWindow;
  }

  public PodSite blockNonExtractEnabled(Boolean blockNonExtractEnabled) {
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

  public PodSite cacheWarmupEnabled(Boolean cacheWarmupEnabled) {
    this.cacheWarmupEnabled = cacheWarmupEnabled;
    return this;
  }

  /**
   * Get cacheWarmupEnabled
   * @return cacheWarmupEnabled
  */
  
  @Schema(name = "cacheWarmupEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheWarmupEnabled")
  public Boolean getCacheWarmupEnabled() {
    return cacheWarmupEnabled;
  }

  public void setCacheWarmupEnabled(Boolean cacheWarmupEnabled) {
    this.cacheWarmupEnabled = cacheWarmupEnabled;
  }

  public PodSite catalogObfuscationEnabled(Boolean catalogObfuscationEnabled) {
    this.catalogObfuscationEnabled = catalogObfuscationEnabled;
    return this;
  }

  /**
   * Get catalogObfuscationEnabled
   * @return catalogObfuscationEnabled
  */
  
  @Schema(name = "catalogObfuscationEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogObfuscationEnabled")
  public Boolean getCatalogObfuscationEnabled() {
    return catalogObfuscationEnabled;
  }

  public void setCatalogObfuscationEnabled(Boolean catalogObfuscationEnabled) {
    this.catalogObfuscationEnabled = catalogObfuscationEnabled;
  }

  public PodSite catalogingEnabled(Boolean catalogingEnabled) {
    this.catalogingEnabled = catalogingEnabled;
    return this;
  }

  /**
   * Get catalogingEnabled
   * @return catalogingEnabled
  */
  
  @Schema(name = "catalogingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogingEnabled")
  public Boolean getCatalogingEnabled() {
    return catalogingEnabled;
  }

  public void setCatalogingEnabled(Boolean catalogingEnabled) {
    this.catalogingEnabled = catalogingEnabled;
  }

  public PodSite cmekEnabled(Boolean cmekEnabled) {
    this.cmekEnabled = cmekEnabled;
    return this;
  }

  /**
   * Get cmekEnabled
   * @return cmekEnabled
  */
  
  @Schema(name = "cmekEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmekEnabled")
  public Boolean getCmekEnabled() {
    return cmekEnabled;
  }

  public void setCmekEnabled(Boolean cmekEnabled) {
    this.cmekEnabled = cmekEnabled;
  }

  public PodSite commentingEnabled(Boolean commentingEnabled) {
    this.commentingEnabled = commentingEnabled;
    return this;
  }

  /**
   * Get commentingEnabled
   * @return commentingEnabled
  */
  
  @Schema(name = "commentingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentingEnabled")
  public Boolean getCommentingEnabled() {
    return commentingEnabled;
  }

  public void setCommentingEnabled(Boolean commentingEnabled) {
    this.commentingEnabled = commentingEnabled;
  }

  public PodSite commentingMentionsEnabled(Boolean commentingMentionsEnabled) {
    this.commentingMentionsEnabled = commentingMentionsEnabled;
    return this;
  }

  /**
   * Get commentingMentionsEnabled
   * @return commentingMentionsEnabled
  */
  
  @Schema(name = "commentingMentionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentingMentionsEnabled")
  public Boolean getCommentingMentionsEnabled() {
    return commentingMentionsEnabled;
  }

  public void setCommentingMentionsEnabled(Boolean commentingMentionsEnabled) {
    this.commentingMentionsEnabled = commentingMentionsEnabled;
  }

  public PodSite contentMigrationToolEnabled(Boolean contentMigrationToolEnabled) {
    this.contentMigrationToolEnabled = contentMigrationToolEnabled;
    return this;
  }

  /**
   * Get contentMigrationToolEnabled
   * @return contentMigrationToolEnabled
  */
  
  @Schema(name = "contentMigrationToolEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentMigrationToolEnabled")
  public Boolean getContentMigrationToolEnabled() {
    return contentMigrationToolEnabled;
  }

  public void setContentMigrationToolEnabled(Boolean contentMigrationToolEnabled) {
    this.contentMigrationToolEnabled = contentMigrationToolEnabled;
  }

  public PodSite contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * Get contentUrl
   * @return contentUrl
  */
  
  @Schema(name = "contentUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public PodSite customSubscriptionEmail(String customSubscriptionEmail) {
    this.customSubscriptionEmail = customSubscriptionEmail;
    return this;
  }

  /**
   * Get customSubscriptionEmail
   * @return customSubscriptionEmail
  */
  
  @Schema(name = "customSubscriptionEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionEmail")
  public String getCustomSubscriptionEmail() {
    return customSubscriptionEmail;
  }

  public void setCustomSubscriptionEmail(String customSubscriptionEmail) {
    this.customSubscriptionEmail = customSubscriptionEmail;
  }

  public PodSite customSubscriptionEmailEnabled(Boolean customSubscriptionEmailEnabled) {
    this.customSubscriptionEmailEnabled = customSubscriptionEmailEnabled;
    return this;
  }

  /**
   * Get customSubscriptionEmailEnabled
   * @return customSubscriptionEmailEnabled
  */
  
  @Schema(name = "customSubscriptionEmailEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionEmailEnabled")
  public Boolean getCustomSubscriptionEmailEnabled() {
    return customSubscriptionEmailEnabled;
  }

  public void setCustomSubscriptionEmailEnabled(Boolean customSubscriptionEmailEnabled) {
    this.customSubscriptionEmailEnabled = customSubscriptionEmailEnabled;
  }

  public PodSite customSubscriptionFooter(String customSubscriptionFooter) {
    this.customSubscriptionFooter = customSubscriptionFooter;
    return this;
  }

  /**
   * Get customSubscriptionFooter
   * @return customSubscriptionFooter
  */
  
  @Schema(name = "customSubscriptionFooter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionFooter")
  public String getCustomSubscriptionFooter() {
    return customSubscriptionFooter;
  }

  public void setCustomSubscriptionFooter(String customSubscriptionFooter) {
    this.customSubscriptionFooter = customSubscriptionFooter;
  }

  public PodSite customSubscriptionFooterEnabled(Boolean customSubscriptionFooterEnabled) {
    this.customSubscriptionFooterEnabled = customSubscriptionFooterEnabled;
    return this;
  }

  /**
   * Get customSubscriptionFooterEnabled
   * @return customSubscriptionFooterEnabled
  */
  
  @Schema(name = "customSubscriptionFooterEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSubscriptionFooterEnabled")
  public Boolean getCustomSubscriptionFooterEnabled() {
    return customSubscriptionFooterEnabled;
  }

  public void setCustomSubscriptionFooterEnabled(Boolean customSubscriptionFooterEnabled) {
    this.customSubscriptionFooterEnabled = customSubscriptionFooterEnabled;
  }

  public PodSite dataAccelerationMode(String dataAccelerationMode) {
    this.dataAccelerationMode = dataAccelerationMode;
    return this;
  }

  /**
   * Get dataAccelerationMode
   * @return dataAccelerationMode
  */
  
  @Schema(name = "dataAccelerationMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAccelerationMode")
  public String getDataAccelerationMode() {
    return dataAccelerationMode;
  }

  public void setDataAccelerationMode(String dataAccelerationMode) {
    this.dataAccelerationMode = dataAccelerationMode;
  }

  public PodSite dataAlertsEnabled(Boolean dataAlertsEnabled) {
    this.dataAlertsEnabled = dataAlertsEnabled;
    return this;
  }

  /**
   * Get dataAlertsEnabled
   * @return dataAlertsEnabled
  */
  
  @Schema(name = "dataAlertsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAlertsEnabled")
  public Boolean getDataAlertsEnabled() {
    return dataAlertsEnabled;
  }

  public void setDataAlertsEnabled(Boolean dataAlertsEnabled) {
    this.dataAlertsEnabled = dataAlertsEnabled;
  }

  public PodSite dataOrientationEnabled(Boolean dataOrientationEnabled) {
    this.dataOrientationEnabled = dataOrientationEnabled;
    return this;
  }

  /**
   * Get dataOrientationEnabled
   * @return dataOrientationEnabled
  */
  
  @Schema(name = "dataOrientationEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOrientationEnabled")
  public Boolean getDataOrientationEnabled() {
    return dataOrientationEnabled;
  }

  public void setDataOrientationEnabled(Boolean dataOrientationEnabled) {
    this.dataOrientationEnabled = dataOrientationEnabled;
  }

  public PodSite dataStoryEnabled(Boolean dataStoryEnabled) {
    this.dataStoryEnabled = dataStoryEnabled;
    return this;
  }

  /**
   * Get dataStoryEnabled
   * @return dataStoryEnabled
  */
  
  @Schema(name = "dataStoryEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataStoryEnabled")
  public Boolean getDataStoryEnabled() {
    return dataStoryEnabled;
  }

  public void setDataStoryEnabled(Boolean dataStoryEnabled) {
    this.dataStoryEnabled = dataStoryEnabled;
  }

  public PodSite derivedPermissionsEnabled(Boolean derivedPermissionsEnabled) {
    this.derivedPermissionsEnabled = derivedPermissionsEnabled;
    return this;
  }

  /**
   * Get derivedPermissionsEnabled
   * @return derivedPermissionsEnabled
  */
  
  @Schema(name = "derivedPermissionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("derivedPermissionsEnabled")
  public Boolean getDerivedPermissionsEnabled() {
    return derivedPermissionsEnabled;
  }

  public void setDerivedPermissionsEnabled(Boolean derivedPermissionsEnabled) {
    this.derivedPermissionsEnabled = derivedPermissionsEnabled;
  }

  public PodSite disableSubscriptions(Boolean disableSubscriptions) {
    this.disableSubscriptions = disableSubscriptions;
    return this;
  }

  /**
   * Get disableSubscriptions
   * @return disableSubscriptions
  */
  
  @Schema(name = "disableSubscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableSubscriptions")
  public Boolean getDisableSubscriptions() {
    return disableSubscriptions;
  }

  public void setDisableSubscriptions(Boolean disableSubscriptions) {
    this.disableSubscriptions = disableSubscriptions;
  }

  public PodSite dqwSubscriptionsEnabled(Boolean dqwSubscriptionsEnabled) {
    this.dqwSubscriptionsEnabled = dqwSubscriptionsEnabled;
    return this;
  }

  /**
   * Get dqwSubscriptionsEnabled
   * @return dqwSubscriptionsEnabled
  */
  
  @Schema(name = "dqwSubscriptionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dqwSubscriptionsEnabled")
  public Boolean getDqwSubscriptionsEnabled() {
    return dqwSubscriptionsEnabled;
  }

  public void setDqwSubscriptionsEnabled(Boolean dqwSubscriptionsEnabled) {
    this.dqwSubscriptionsEnabled = dqwSubscriptionsEnabled;
  }

  public PodSite easEnabled(Boolean easEnabled) {
    this.easEnabled = easEnabled;
    return this;
  }

  /**
   * Get easEnabled
   * @return easEnabled
  */
  
  @Schema(name = "easEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("easEnabled")
  public Boolean getEasEnabled() {
    return easEnabled;
  }

  public void setEasEnabled(Boolean easEnabled) {
    this.easEnabled = easEnabled;
  }

  public PodSite editingFlowsEnabled(Boolean editingFlowsEnabled) {
    this.editingFlowsEnabled = editingFlowsEnabled;
    return this;
  }

  /**
   * Get editingFlowsEnabled
   * @return editingFlowsEnabled
  */
  
  @Schema(name = "editingFlowsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editingFlowsEnabled")
  public Boolean getEditingFlowsEnabled() {
    return editingFlowsEnabled;
  }

  public void setEditingFlowsEnabled(Boolean editingFlowsEnabled) {
    this.editingFlowsEnabled = editingFlowsEnabled;
  }

  public PodSite einsteinInFlowEnabled(Boolean einsteinInFlowEnabled) {
    this.einsteinInFlowEnabled = einsteinInFlowEnabled;
    return this;
  }

  /**
   * Get einsteinInFlowEnabled
   * @return einsteinInFlowEnabled
  */
  
  @Schema(name = "einsteinInFlowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("einsteinInFlowEnabled")
  public Boolean getEinsteinInFlowEnabled() {
    return einsteinInFlowEnabled;
  }

  public void setEinsteinInFlowEnabled(Boolean einsteinInFlowEnabled) {
    this.einsteinInFlowEnabled = einsteinInFlowEnabled;
  }

  public PodSite explainDataEnabled(Boolean explainDataEnabled) {
    this.explainDataEnabled = explainDataEnabled;
    return this;
  }

  /**
   * Get explainDataEnabled
   * @return explainDataEnabled
  */
  
  @Schema(name = "explainDataEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explainDataEnabled")
  public Boolean getExplainDataEnabled() {
    return explainDataEnabled;
  }

  public void setExplainDataEnabled(Boolean explainDataEnabled) {
    this.explainDataEnabled = explainDataEnabled;
  }

  public PodSite extractEncryptionMode(String extractEncryptionMode) {
    this.extractEncryptionMode = extractEncryptionMode;
    return this;
  }

  /**
   * Get extractEncryptionMode
   * @return extractEncryptionMode
  */
  
  @Schema(name = "extractEncryptionMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extractEncryptionMode")
  public String getExtractEncryptionMode() {
    return extractEncryptionMode;
  }

  public void setExtractEncryptionMode(String extractEncryptionMode) {
    this.extractEncryptionMode = extractEncryptionMode;
  }

  public PodSite flowAutoSaveEnabled(Boolean flowAutoSaveEnabled) {
    this.flowAutoSaveEnabled = flowAutoSaveEnabled;
    return this;
  }

  /**
   * Get flowAutoSaveEnabled
   * @return flowAutoSaveEnabled
  */
  
  @Schema(name = "flowAutoSaveEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowAutoSaveEnabled")
  public Boolean getFlowAutoSaveEnabled() {
    return flowAutoSaveEnabled;
  }

  public void setFlowAutoSaveEnabled(Boolean flowAutoSaveEnabled) {
    this.flowAutoSaveEnabled = flowAutoSaveEnabled;
  }

  public PodSite flowOutputSubscriptionsDataAsEmailAttachmentEnabled(Boolean flowOutputSubscriptionsDataAsEmailAttachmentEnabled) {
    this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled = flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
    return this;
  }

  /**
   * Get flowOutputSubscriptionsDataAsEmailAttachmentEnabled
   * @return flowOutputSubscriptionsDataAsEmailAttachmentEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsDataAsEmailAttachmentEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsDataAsEmailAttachmentEnabled")
  public Boolean getFlowOutputSubscriptionsDataAsEmailAttachmentEnabled() {
    return flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
  }

  public void setFlowOutputSubscriptionsDataAsEmailAttachmentEnabled(Boolean flowOutputSubscriptionsDataAsEmailAttachmentEnabled) {
    this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled = flowOutputSubscriptionsDataAsEmailAttachmentEnabled;
  }

  public PodSite flowOutputSubscriptionsDataInEmailBodyEnabled(Boolean flowOutputSubscriptionsDataInEmailBodyEnabled) {
    this.flowOutputSubscriptionsDataInEmailBodyEnabled = flowOutputSubscriptionsDataInEmailBodyEnabled;
    return this;
  }

  /**
   * Get flowOutputSubscriptionsDataInEmailBodyEnabled
   * @return flowOutputSubscriptionsDataInEmailBodyEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsDataInEmailBodyEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsDataInEmailBodyEnabled")
  public Boolean getFlowOutputSubscriptionsDataInEmailBodyEnabled() {
    return flowOutputSubscriptionsDataInEmailBodyEnabled;
  }

  public void setFlowOutputSubscriptionsDataInEmailBodyEnabled(Boolean flowOutputSubscriptionsDataInEmailBodyEnabled) {
    this.flowOutputSubscriptionsDataInEmailBodyEnabled = flowOutputSubscriptionsDataInEmailBodyEnabled;
  }

  public PodSite flowOutputSubscriptionsEnabled(Boolean flowOutputSubscriptionsEnabled) {
    this.flowOutputSubscriptionsEnabled = flowOutputSubscriptionsEnabled;
    return this;
  }

  /**
   * Get flowOutputSubscriptionsEnabled
   * @return flowOutputSubscriptionsEnabled
  */
  
  @Schema(name = "flowOutputSubscriptionsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowOutputSubscriptionsEnabled")
  public Boolean getFlowOutputSubscriptionsEnabled() {
    return flowOutputSubscriptionsEnabled;
  }

  public void setFlowOutputSubscriptionsEnabled(Boolean flowOutputSubscriptionsEnabled) {
    this.flowOutputSubscriptionsEnabled = flowOutputSubscriptionsEnabled;
  }

  public PodSite flowParametersAnyTypeEnabled(Boolean flowParametersAnyTypeEnabled) {
    this.flowParametersAnyTypeEnabled = flowParametersAnyTypeEnabled;
    return this;
  }

  /**
   * Get flowParametersAnyTypeEnabled
   * @return flowParametersAnyTypeEnabled
  */
  
  @Schema(name = "flowParametersAnyTypeEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersAnyTypeEnabled")
  public Boolean getFlowParametersAnyTypeEnabled() {
    return flowParametersAnyTypeEnabled;
  }

  public void setFlowParametersAnyTypeEnabled(Boolean flowParametersAnyTypeEnabled) {
    this.flowParametersAnyTypeEnabled = flowParametersAnyTypeEnabled;
  }

  public PodSite flowParametersEnabled(Boolean flowParametersEnabled) {
    this.flowParametersEnabled = flowParametersEnabled;
    return this;
  }

  /**
   * Get flowParametersEnabled
   * @return flowParametersEnabled
  */
  
  @Schema(name = "flowParametersEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersEnabled")
  public Boolean getFlowParametersEnabled() {
    return flowParametersEnabled;
  }

  public void setFlowParametersEnabled(Boolean flowParametersEnabled) {
    this.flowParametersEnabled = flowParametersEnabled;
  }

  public PodSite flowParametersSystemTypeEnabled(Boolean flowParametersSystemTypeEnabled) {
    this.flowParametersSystemTypeEnabled = flowParametersSystemTypeEnabled;
    return this;
  }

  /**
   * Get flowParametersSystemTypeEnabled
   * @return flowParametersSystemTypeEnabled
  */
  
  @Schema(name = "flowParametersSystemTypeEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowParametersSystemTypeEnabled")
  public Boolean getFlowParametersSystemTypeEnabled() {
    return flowParametersSystemTypeEnabled;
  }

  public void setFlowParametersSystemTypeEnabled(Boolean flowParametersSystemTypeEnabled) {
    this.flowParametersSystemTypeEnabled = flowParametersSystemTypeEnabled;
  }

  public PodSite flowsEnabled(Boolean flowsEnabled) {
    this.flowsEnabled = flowsEnabled;
    return this;
  }

  /**
   * Get flowsEnabled
   * @return flowsEnabled
  */
  
  @Schema(name = "flowsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowsEnabled")
  public Boolean getFlowsEnabled() {
    return flowsEnabled;
  }

  public void setFlowsEnabled(Boolean flowsEnabled) {
    this.flowsEnabled = flowsEnabled;
  }

  public PodSite generativeAiDataCatalog(Boolean generativeAiDataCatalog) {
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

  public PodSite generativeAiEnabled(Boolean generativeAiEnabled) {
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

  public PodSite generativeAiPrep(Boolean generativeAiPrep) {
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

  public PodSite generativeAiPulse(Boolean generativeAiPulse) {
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

  public PodSite generativeAiWebAuthoring(Boolean generativeAiWebAuthoring) {
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

  public PodSite groupAssertionsConnectedAppsEnabled(Boolean groupAssertionsConnectedAppsEnabled) {
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

  public PodSite groupAssertionsEnabled(Boolean groupAssertionsEnabled) {
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

  public PodSite groupAssertionsOIDCEnabled(Boolean groupAssertionsOIDCEnabled) {
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

  public PodSite groupAssertionsSAMLEnabled(Boolean groupAssertionsSAMLEnabled) {
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

  public PodSite groupSetsEnabled(Boolean groupSetsEnabled) {
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

  public PodSite guestAccessEnabled(Boolean guestAccessEnabled) {
    this.guestAccessEnabled = guestAccessEnabled;
    return this;
  }

  /**
   * Get guestAccessEnabled
   * @return guestAccessEnabled
  */
  
  @Schema(name = "guestAccessEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guestAccessEnabled")
  public Boolean getGuestAccessEnabled() {
    return guestAccessEnabled;
  }

  public void setGuestAccessEnabled(Boolean guestAccessEnabled) {
    this.guestAccessEnabled = guestAccessEnabled;
  }

  public PodSite id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PodSite idpConfigurationIdForScim(String idpConfigurationIdForScim) {
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

  public PodSite linkedTaskRunNowEnabled(Boolean linkedTaskRunNowEnabled) {
    this.linkedTaskRunNowEnabled = linkedTaskRunNowEnabled;
    return this;
  }

  /**
   * Get linkedTaskRunNowEnabled
   * @return linkedTaskRunNowEnabled
  */
  
  @Schema(name = "linkedTaskRunNowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedTaskRunNowEnabled")
  public Boolean getLinkedTaskRunNowEnabled() {
    return linkedTaskRunNowEnabled;
  }

  public void setLinkedTaskRunNowEnabled(Boolean linkedTaskRunNowEnabled) {
    this.linkedTaskRunNowEnabled = linkedTaskRunNowEnabled;
  }

  public PodSite linkedTaskSchedulingEnabled(Boolean linkedTaskSchedulingEnabled) {
    this.linkedTaskSchedulingEnabled = linkedTaskSchedulingEnabled;
    return this;
  }

  /**
   * Get linkedTaskSchedulingEnabled
   * @return linkedTaskSchedulingEnabled
  */
  
  @Schema(name = "linkedTaskSchedulingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedTaskSchedulingEnabled")
  public Boolean getLinkedTaskSchedulingEnabled() {
    return linkedTaskSchedulingEnabled;
  }

  public void setLinkedTaskSchedulingEnabled(Boolean linkedTaskSchedulingEnabled) {
    this.linkedTaskSchedulingEnabled = linkedTaskSchedulingEnabled;
  }

  public PodSite loginBasedLicenseManagementEnabled(Boolean loginBasedLicenseManagementEnabled) {
    this.loginBasedLicenseManagementEnabled = loginBasedLicenseManagementEnabled;
    return this;
  }

  /**
   * Get loginBasedLicenseManagementEnabled
   * @return loginBasedLicenseManagementEnabled
  */
  
  @Schema(name = "loginBasedLicenseManagementEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginBasedLicenseManagementEnabled")
  public Boolean getLoginBasedLicenseManagementEnabled() {
    return loginBasedLicenseManagementEnabled;
  }

  public void setLoginBasedLicenseManagementEnabled(Boolean loginBasedLicenseManagementEnabled) {
    this.loginBasedLicenseManagementEnabled = loginBasedLicenseManagementEnabled;
  }

  public PodSite maxServiceTokenLimitPerUser(Integer maxServiceTokenLimitPerUser) {
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

  public PodSite metricsContentTypeEnabled(Boolean metricsContentTypeEnabled) {
    this.metricsContentTypeEnabled = metricsContentTypeEnabled;
    return this;
  }

  /**
   * Get metricsContentTypeEnabled
   * @return metricsContentTypeEnabled
  */
  
  @Schema(name = "metricsContentTypeEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metricsContentTypeEnabled")
  public Boolean getMetricsContentTypeEnabled() {
    return metricsContentTypeEnabled;
  }

  public void setMetricsContentTypeEnabled(Boolean metricsContentTypeEnabled) {
    this.metricsContentTypeEnabled = metricsContentTypeEnabled;
  }

  public PodSite mfaEnforcementExemption(Boolean mfaEnforcementExemption) {
    this.mfaEnforcementExemption = mfaEnforcementExemption;
    return this;
  }

  /**
   * Get mfaEnforcementExemption
   * @return mfaEnforcementExemption
  */
  
  @Schema(name = "mfaEnforcementExemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mfaEnforcementExemption")
  public Boolean getMfaEnforcementExemption() {
    return mfaEnforcementExemption;
  }

  public void setMfaEnforcementExemption(Boolean mfaEnforcementExemption) {
    this.mfaEnforcementExemption = mfaEnforcementExemption;
  }

  public PodSite mobileBiometricsEnabled(Boolean mobileBiometricsEnabled) {
    this.mobileBiometricsEnabled = mobileBiometricsEnabled;
    return this;
  }

  /**
   * Get mobileBiometricsEnabled
   * @return mobileBiometricsEnabled
  */
  
  @Schema(name = "mobileBiometricsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileBiometricsEnabled")
  public Boolean getMobileBiometricsEnabled() {
    return mobileBiometricsEnabled;
  }

  public void setMobileBiometricsEnabled(Boolean mobileBiometricsEnabled) {
    this.mobileBiometricsEnabled = mobileBiometricsEnabled;
  }

  public PodSite name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PodSite namedSharingEnabled(Boolean namedSharingEnabled) {
    this.namedSharingEnabled = namedSharingEnabled;
    return this;
  }

  /**
   * Get namedSharingEnabled
   * @return namedSharingEnabled
  */
  
  @Schema(name = "namedSharingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedSharingEnabled")
  public Boolean getNamedSharingEnabled() {
    return namedSharingEnabled;
  }

  public void setNamedSharingEnabled(Boolean namedSharingEnabled) {
    this.namedSharingEnabled = namedSharingEnabled;
  }

  public PodSite notifySiteAdminsOnThrottle(Boolean notifySiteAdminsOnThrottle) {
    this.notifySiteAdminsOnThrottle = notifySiteAdminsOnThrottle;
    return this;
  }

  /**
   * Get notifySiteAdminsOnThrottle
   * @return notifySiteAdminsOnThrottle
  */
  
  @Schema(name = "notifySiteAdminsOnThrottle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifySiteAdminsOnThrottle")
  public Boolean getNotifySiteAdminsOnThrottle() {
    return notifySiteAdminsOnThrottle;
  }

  public void setNotifySiteAdminsOnThrottle(Boolean notifySiteAdminsOnThrottle) {
    this.notifySiteAdminsOnThrottle = notifySiteAdminsOnThrottle;
  }

  public PodSite personalSpaceEnabled(Boolean personalSpaceEnabled) {
    this.personalSpaceEnabled = personalSpaceEnabled;
    return this;
  }

  /**
   * Get personalSpaceEnabled
   * @return personalSpaceEnabled
  */
  
  @Schema(name = "personalSpaceEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalSpaceEnabled")
  public Boolean getPersonalSpaceEnabled() {
    return personalSpaceEnabled;
  }

  public void setPersonalSpaceEnabled(Boolean personalSpaceEnabled) {
    this.personalSpaceEnabled = personalSpaceEnabled;
  }

  public PodSite personalSpaceStorageQuota(String personalSpaceStorageQuota) {
    this.personalSpaceStorageQuota = personalSpaceStorageQuota;
    return this;
  }

  /**
   * Get personalSpaceStorageQuota
   * @return personalSpaceStorageQuota
  */
  
  @Schema(name = "personalSpaceStorageQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalSpaceStorageQuota")
  public String getPersonalSpaceStorageQuota() {
    return personalSpaceStorageQuota;
  }

  public void setPersonalSpaceStorageQuota(String personalSpaceStorageQuota) {
    this.personalSpaceStorageQuota = personalSpaceStorageQuota;
  }

  public PodSite publishToSalesforceEnabled(Boolean publishToSalesforceEnabled) {
    this.publishToSalesforceEnabled = publishToSalesforceEnabled;
    return this;
  }

  /**
   * Get publishToSalesforceEnabled
   * @return publishToSalesforceEnabled
  */
  
  @Schema(name = "publishToSalesforceEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishToSalesforceEnabled")
  public Boolean getPublishToSalesforceEnabled() {
    return publishToSalesforceEnabled;
  }

  public void setPublishToSalesforceEnabled(Boolean publishToSalesforceEnabled) {
    this.publishToSalesforceEnabled = publishToSalesforceEnabled;
  }

  public PodSite pulseEnabled(Boolean pulseEnabled) {
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

  public PodSite pulseGroupId(String pulseGroupId) {
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

  public PodSite pulsePersonalizedRankingEnabled(Boolean pulsePersonalizedRankingEnabled) {
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

  public PodSite refreshTokenAbsoluteExpiry(Integer refreshTokenAbsoluteExpiry) {
    this.refreshTokenAbsoluteExpiry = refreshTokenAbsoluteExpiry;
    return this;
  }

  /**
   * Get refreshTokenAbsoluteExpiry
   * @return refreshTokenAbsoluteExpiry
  */
  
  @Schema(name = "refreshTokenAbsoluteExpiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshTokenAbsoluteExpiry")
  public Integer getRefreshTokenAbsoluteExpiry() {
    return refreshTokenAbsoluteExpiry;
  }

  public void setRefreshTokenAbsoluteExpiry(Integer refreshTokenAbsoluteExpiry) {
    this.refreshTokenAbsoluteExpiry = refreshTokenAbsoluteExpiry;
  }

  public PodSite requestAccessEnabled(Boolean requestAccessEnabled) {
    this.requestAccessEnabled = requestAccessEnabled;
    return this;
  }

  /**
   * Get requestAccessEnabled
   * @return requestAccessEnabled
  */
  
  @Schema(name = "requestAccessEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestAccessEnabled")
  public Boolean getRequestAccessEnabled() {
    return requestAccessEnabled;
  }

  public void setRequestAccessEnabled(Boolean requestAccessEnabled) {
    this.requestAccessEnabled = requestAccessEnabled;
  }

  public PodSite revisionHistoryEnabled(Boolean revisionHistoryEnabled) {
    this.revisionHistoryEnabled = revisionHistoryEnabled;
    return this;
  }

  /**
   * Get revisionHistoryEnabled
   * @return revisionHistoryEnabled
  */
  
  @Schema(name = "revisionHistoryEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revisionHistoryEnabled")
  public Boolean getRevisionHistoryEnabled() {
    return revisionHistoryEnabled;
  }

  public void setRevisionHistoryEnabled(Boolean revisionHistoryEnabled) {
    this.revisionHistoryEnabled = revisionHistoryEnabled;
  }

  public PodSite revisionLimit(String revisionLimit) {
    this.revisionLimit = revisionLimit;
    return this;
  }

  /**
   * Get revisionLimit
   * @return revisionLimit
  */
  
  @Schema(name = "revisionLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revisionLimit")
  public String getRevisionLimit() {
    return revisionLimit;
  }

  public void setRevisionLimit(String revisionLimit) {
    this.revisionLimit = revisionLimit;
  }

  public PodSite runNowEnabled(Boolean runNowEnabled) {
    this.runNowEnabled = runNowEnabled;
    return this;
  }

  /**
   * Get runNowEnabled
   * @return runNowEnabled
  */
  
  @Schema(name = "runNowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runNowEnabled")
  public Boolean getRunNowEnabled() {
    return runNowEnabled;
  }

  public void setRunNowEnabled(Boolean runNowEnabled) {
    this.runNowEnabled = runNowEnabled;
  }

  public PodSite schedulingFlowsEnabled(Boolean schedulingFlowsEnabled) {
    this.schedulingFlowsEnabled = schedulingFlowsEnabled;
    return this;
  }

  /**
   * Get schedulingFlowsEnabled
   * @return schedulingFlowsEnabled
  */
  
  @Schema(name = "schedulingFlowsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedulingFlowsEnabled")
  public Boolean getSchedulingFlowsEnabled() {
    return schedulingFlowsEnabled;
  }

  public void setSchedulingFlowsEnabled(Boolean schedulingFlowsEnabled) {
    this.schedulingFlowsEnabled = schedulingFlowsEnabled;
  }

  public PodSite selfServiceScheduleForRefreshEnabled(Boolean selfServiceScheduleForRefreshEnabled) {
    this.selfServiceScheduleForRefreshEnabled = selfServiceScheduleForRefreshEnabled;
    return this;
  }

  /**
   * Get selfServiceScheduleForRefreshEnabled
   * @return selfServiceScheduleForRefreshEnabled
  */
  
  @Schema(name = "selfServiceScheduleForRefreshEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfServiceScheduleForRefreshEnabled")
  public Boolean getSelfServiceScheduleForRefreshEnabled() {
    return selfServiceScheduleForRefreshEnabled;
  }

  public void setSelfServiceScheduleForRefreshEnabled(Boolean selfServiceScheduleForRefreshEnabled) {
    this.selfServiceScheduleForRefreshEnabled = selfServiceScheduleForRefreshEnabled;
  }

  public PodSite settings(List<@Valid EmbeddingSettingsType> settings) {
    this.settings = settings;
    return this;
  }

  public PodSite addSettingsItem(EmbeddingSettingsType settingsItem) {
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

  public PodSite sheetImageEnabled(Boolean sheetImageEnabled) {
    this.sheetImageEnabled = sheetImageEnabled;
    return this;
  }

  /**
   * Get sheetImageEnabled
   * @return sheetImageEnabled
  */
  
  @Schema(name = "sheetImageEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sheetImageEnabled")
  public Boolean getSheetImageEnabled() {
    return sheetImageEnabled;
  }

  public void setSheetImageEnabled(Boolean sheetImageEnabled) {
    this.sheetImageEnabled = sheetImageEnabled;
  }

  public PodSite siteInviteEmailEnabled(Boolean siteInviteEmailEnabled) {
    this.siteInviteEmailEnabled = siteInviteEmailEnabled;
    return this;
  }

  /**
   * Get siteInviteEmailEnabled
   * @return siteInviteEmailEnabled
  */
  
  @Schema(name = "siteInviteEmailEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteInviteEmailEnabled")
  public Boolean getSiteInviteEmailEnabled() {
    return siteInviteEmailEnabled;
  }

  public void setSiteInviteEmailEnabled(Boolean siteInviteEmailEnabled) {
    this.siteInviteEmailEnabled = siteInviteEmailEnabled;
  }

  public PodSite sitePromptedLoginFlowEnabled(Boolean sitePromptedLoginFlowEnabled) {
    this.sitePromptedLoginFlowEnabled = sitePromptedLoginFlowEnabled;
    return this;
  }

  /**
   * Get sitePromptedLoginFlowEnabled
   * @return sitePromptedLoginFlowEnabled
  */
  
  @Schema(name = "sitePromptedLoginFlowEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sitePromptedLoginFlowEnabled")
  public Boolean getSitePromptedLoginFlowEnabled() {
    return sitePromptedLoginFlowEnabled;
  }

  public void setSitePromptedLoginFlowEnabled(Boolean sitePromptedLoginFlowEnabled) {
    this.sitePromptedLoginFlowEnabled = sitePromptedLoginFlowEnabled;
  }

  public PodSite siteSettings(List<@Valid SiteSettingType> siteSettings) {
    this.siteSettings = siteSettings;
    return this;
  }

  public PodSite addSiteSettingsItem(SiteSettingType siteSettingsItem) {
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

  public PodSite state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PodSite storageQuota(String storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

  /**
   * Get storageQuota
   * @return storageQuota
  */
  
  @Schema(name = "storageQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageQuota")
  public String getStorageQuota() {
    return storageQuota;
  }

  public void setStorageQuota(String storageQuota) {
    this.storageQuota = storageQuota;
  }

  public PodSite storageUsed(String storageUsed) {
    this.storageUsed = storageUsed;
    return this;
  }

  /**
   * Get storageUsed
   * @return storageUsed
  */
  
  @Schema(name = "storageUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageUsed")
  public String getStorageUsed() {
    return storageUsed;
  }

  public void setStorageUsed(String storageUsed) {
    this.storageUsed = storageUsed;
  }

  public PodSite subscribeOthersEnabled(Boolean subscribeOthersEnabled) {
    this.subscribeOthersEnabled = subscribeOthersEnabled;
    return this;
  }

  /**
   * Get subscribeOthersEnabled
   * @return subscribeOthersEnabled
  */
  
  @Schema(name = "subscribeOthersEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscribeOthersEnabled")
  public Boolean getSubscribeOthersEnabled() {
    return subscribeOthersEnabled;
  }

  public void setSubscribeOthersEnabled(Boolean subscribeOthersEnabled) {
    this.subscribeOthersEnabled = subscribeOthersEnabled;
  }

  public PodSite tagLimit(Integer tagLimit) {
    this.tagLimit = tagLimit;
    return this;
  }

  /**
   * Get tagLimit
   * @return tagLimit
  */
  
  @Schema(name = "tagLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagLimit")
  public Integer getTagLimit() {
    return tagLimit;
  }

  public void setTagLimit(Integer tagLimit) {
    this.tagLimit = tagLimit;
  }

  public PodSite tierCreatorCapacity(Integer tierCreatorCapacity) {
    this.tierCreatorCapacity = tierCreatorCapacity;
    return this;
  }

  /**
   * Get tierCreatorCapacity
   * @return tierCreatorCapacity
  */
  
  @Schema(name = "tierCreatorCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierCreatorCapacity")
  public Integer getTierCreatorCapacity() {
    return tierCreatorCapacity;
  }

  public void setTierCreatorCapacity(Integer tierCreatorCapacity) {
    this.tierCreatorCapacity = tierCreatorCapacity;
  }

  public PodSite tierExplorerCapacity(Integer tierExplorerCapacity) {
    this.tierExplorerCapacity = tierExplorerCapacity;
    return this;
  }

  /**
   * Get tierExplorerCapacity
   * @return tierExplorerCapacity
  */
  
  @Schema(name = "tierExplorerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierExplorerCapacity")
  public Integer getTierExplorerCapacity() {
    return tierExplorerCapacity;
  }

  public void setTierExplorerCapacity(Integer tierExplorerCapacity) {
    this.tierExplorerCapacity = tierExplorerCapacity;
  }

  public PodSite tierViewerCapacity(Integer tierViewerCapacity) {
    this.tierViewerCapacity = tierViewerCapacity;
    return this;
  }

  /**
   * Get tierViewerCapacity
   * @return tierViewerCapacity
  */
  
  @Schema(name = "tierViewerCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierViewerCapacity")
  public Integer getTierViewerCapacity() {
    return tierViewerCapacity;
  }

  public void setTierViewerCapacity(Integer tierViewerCapacity) {
    this.tierViewerCapacity = tierViewerCapacity;
  }

  public PodSite timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public PodSite usage(Usage usage) {
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

  public PodSite useDefaultTimeZone(Boolean useDefaultTimeZone) {
    this.useDefaultTimeZone = useDefaultTimeZone;
    return this;
  }

  /**
   * Get useDefaultTimeZone
   * @return useDefaultTimeZone
  */
  
  @Schema(name = "useDefaultTimeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useDefaultTimeZone")
  public Boolean getUseDefaultTimeZone() {
    return useDefaultTimeZone;
  }

  public void setUseDefaultTimeZone(Boolean useDefaultTimeZone) {
    this.useDefaultTimeZone = useDefaultTimeZone;
  }

  public PodSite userQuota(String userQuota) {
    this.userQuota = userQuota;
    return this;
  }

  /**
   * Get userQuota
   * @return userQuota
  */
  
  @Schema(name = "userQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userQuota")
  public String getUserQuota() {
    return userQuota;
  }

  public void setUserQuota(String userQuota) {
    this.userQuota = userQuota;
  }

  public PodSite userQuotaPolicy(UserQuotaPolicy userQuotaPolicy) {
    this.userQuotaPolicy = userQuotaPolicy;
    return this;
  }

  /**
   * Get userQuotaPolicy
   * @return userQuotaPolicy
  */
  @Valid 
  @Schema(name = "userQuotaPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userQuotaPolicy")
  public UserQuotaPolicy getUserQuotaPolicy() {
    return userQuotaPolicy;
  }

  public void setUserQuotaPolicy(UserQuotaPolicy userQuotaPolicy) {
    this.userQuotaPolicy = userQuotaPolicy;
  }

  public PodSite userVisibilityMode(String userVisibilityMode) {
    this.userVisibilityMode = userVisibilityMode;
    return this;
  }

  /**
   * Get userVisibilityMode
   * @return userVisibilityMode
  */
  
  @Schema(name = "userVisibilityMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userVisibilityMode")
  public String getUserVisibilityMode() {
    return userVisibilityMode;
  }

  public void setUserVisibilityMode(String userVisibilityMode) {
    this.userVisibilityMode = userVisibilityMode;
  }

  public PodSite webExtractionEnabled(Boolean webExtractionEnabled) {
    this.webExtractionEnabled = webExtractionEnabled;
    return this;
  }

  /**
   * Get webExtractionEnabled
   * @return webExtractionEnabled
  */
  
  @Schema(name = "webExtractionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webExtractionEnabled")
  public Boolean getWebExtractionEnabled() {
    return webExtractionEnabled;
  }

  public void setWebExtractionEnabled(Boolean webExtractionEnabled) {
    this.webExtractionEnabled = webExtractionEnabled;
  }

  public PodSite webZoneContentEnabled(Boolean webZoneContentEnabled) {
    this.webZoneContentEnabled = webZoneContentEnabled;
    return this;
  }

  /**
   * Get webZoneContentEnabled
   * @return webZoneContentEnabled
  */
  
  @Schema(name = "webZoneContentEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webZoneContentEnabled")
  public Boolean getWebZoneContentEnabled() {
    return webZoneContentEnabled;
  }

  public void setWebZoneContentEnabled(Boolean webZoneContentEnabled) {
    this.webZoneContentEnabled = webZoneContentEnabled;
  }

  public PodSite workflowExtensionEnabled(Boolean workflowExtensionEnabled) {
    this.workflowExtensionEnabled = workflowExtensionEnabled;
    return this;
  }

  /**
   * Get workflowExtensionEnabled
   * @return workflowExtensionEnabled
  */
  
  @Schema(name = "workflowExtensionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PodSite podSite = (PodSite) o;
    return Objects.equals(this.adminInsightsPublishFrequency, podSite.adminInsightsPublishFrequency) &&
        Objects.equals(this.adminMode, podSite.adminMode) &&
        Objects.equals(this.allowSubscriptionAttachments, podSite.allowSubscriptionAttachments) &&
        Objects.equals(this.askDataMode, podSite.askDataMode) &&
        Objects.equals(this.attributeCaptureEnabled, podSite.attributeCaptureEnabled) &&
        Objects.equals(this.authoringEnabled, podSite.authoringEnabled) &&
        Objects.equals(this.autoExtractRefreshMonitoringEnabled, podSite.autoExtractRefreshMonitoringEnabled) &&
        Objects.equals(this.autoFlowRunMonitoringEnabled, podSite.autoFlowRunMonitoringEnabled) &&
        Objects.equals(this.autoSuspendRefreshEnabled, podSite.autoSuspendRefreshEnabled) &&
        Objects.equals(this.autoSuspendRefreshInactivityWindow, podSite.autoSuspendRefreshInactivityWindow) &&
        Objects.equals(this.blockNonExtractEnabled, podSite.blockNonExtractEnabled) &&
        Objects.equals(this.cacheWarmupEnabled, podSite.cacheWarmupEnabled) &&
        Objects.equals(this.catalogObfuscationEnabled, podSite.catalogObfuscationEnabled) &&
        Objects.equals(this.catalogingEnabled, podSite.catalogingEnabled) &&
        Objects.equals(this.cmekEnabled, podSite.cmekEnabled) &&
        Objects.equals(this.commentingEnabled, podSite.commentingEnabled) &&
        Objects.equals(this.commentingMentionsEnabled, podSite.commentingMentionsEnabled) &&
        Objects.equals(this.contentMigrationToolEnabled, podSite.contentMigrationToolEnabled) &&
        Objects.equals(this.contentUrl, podSite.contentUrl) &&
        Objects.equals(this.customSubscriptionEmail, podSite.customSubscriptionEmail) &&
        Objects.equals(this.customSubscriptionEmailEnabled, podSite.customSubscriptionEmailEnabled) &&
        Objects.equals(this.customSubscriptionFooter, podSite.customSubscriptionFooter) &&
        Objects.equals(this.customSubscriptionFooterEnabled, podSite.customSubscriptionFooterEnabled) &&
        Objects.equals(this.dataAccelerationMode, podSite.dataAccelerationMode) &&
        Objects.equals(this.dataAlertsEnabled, podSite.dataAlertsEnabled) &&
        Objects.equals(this.dataOrientationEnabled, podSite.dataOrientationEnabled) &&
        Objects.equals(this.dataStoryEnabled, podSite.dataStoryEnabled) &&
        Objects.equals(this.derivedPermissionsEnabled, podSite.derivedPermissionsEnabled) &&
        Objects.equals(this.disableSubscriptions, podSite.disableSubscriptions) &&
        Objects.equals(this.dqwSubscriptionsEnabled, podSite.dqwSubscriptionsEnabled) &&
        Objects.equals(this.easEnabled, podSite.easEnabled) &&
        Objects.equals(this.editingFlowsEnabled, podSite.editingFlowsEnabled) &&
        Objects.equals(this.einsteinInFlowEnabled, podSite.einsteinInFlowEnabled) &&
        Objects.equals(this.explainDataEnabled, podSite.explainDataEnabled) &&
        Objects.equals(this.extractEncryptionMode, podSite.extractEncryptionMode) &&
        Objects.equals(this.flowAutoSaveEnabled, podSite.flowAutoSaveEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsDataAsEmailAttachmentEnabled, podSite.flowOutputSubscriptionsDataAsEmailAttachmentEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsDataInEmailBodyEnabled, podSite.flowOutputSubscriptionsDataInEmailBodyEnabled) &&
        Objects.equals(this.flowOutputSubscriptionsEnabled, podSite.flowOutputSubscriptionsEnabled) &&
        Objects.equals(this.flowParametersAnyTypeEnabled, podSite.flowParametersAnyTypeEnabled) &&
        Objects.equals(this.flowParametersEnabled, podSite.flowParametersEnabled) &&
        Objects.equals(this.flowParametersSystemTypeEnabled, podSite.flowParametersSystemTypeEnabled) &&
        Objects.equals(this.flowsEnabled, podSite.flowsEnabled) &&
        Objects.equals(this.generativeAiDataCatalog, podSite.generativeAiDataCatalog) &&
        Objects.equals(this.generativeAiEnabled, podSite.generativeAiEnabled) &&
        Objects.equals(this.generativeAiPrep, podSite.generativeAiPrep) &&
        Objects.equals(this.generativeAiPulse, podSite.generativeAiPulse) &&
        Objects.equals(this.generativeAiWebAuthoring, podSite.generativeAiWebAuthoring) &&
        Objects.equals(this.groupAssertionsConnectedAppsEnabled, podSite.groupAssertionsConnectedAppsEnabled) &&
        Objects.equals(this.groupAssertionsEnabled, podSite.groupAssertionsEnabled) &&
        Objects.equals(this.groupAssertionsOIDCEnabled, podSite.groupAssertionsOIDCEnabled) &&
        Objects.equals(this.groupAssertionsSAMLEnabled, podSite.groupAssertionsSAMLEnabled) &&
        Objects.equals(this.groupSetsEnabled, podSite.groupSetsEnabled) &&
        Objects.equals(this.guestAccessEnabled, podSite.guestAccessEnabled) &&
        Objects.equals(this.id, podSite.id) &&
        Objects.equals(this.idpConfigurationIdForScim, podSite.idpConfigurationIdForScim) &&
        Objects.equals(this.linkedTaskRunNowEnabled, podSite.linkedTaskRunNowEnabled) &&
        Objects.equals(this.linkedTaskSchedulingEnabled, podSite.linkedTaskSchedulingEnabled) &&
        Objects.equals(this.loginBasedLicenseManagementEnabled, podSite.loginBasedLicenseManagementEnabled) &&
        Objects.equals(this.maxServiceTokenLimitPerUser, podSite.maxServiceTokenLimitPerUser) &&
        Objects.equals(this.metricsContentTypeEnabled, podSite.metricsContentTypeEnabled) &&
        Objects.equals(this.mfaEnforcementExemption, podSite.mfaEnforcementExemption) &&
        Objects.equals(this.mobileBiometricsEnabled, podSite.mobileBiometricsEnabled) &&
        Objects.equals(this.name, podSite.name) &&
        Objects.equals(this.namedSharingEnabled, podSite.namedSharingEnabled) &&
        Objects.equals(this.notifySiteAdminsOnThrottle, podSite.notifySiteAdminsOnThrottle) &&
        Objects.equals(this.personalSpaceEnabled, podSite.personalSpaceEnabled) &&
        Objects.equals(this.personalSpaceStorageQuota, podSite.personalSpaceStorageQuota) &&
        Objects.equals(this.publishToSalesforceEnabled, podSite.publishToSalesforceEnabled) &&
        Objects.equals(this.pulseEnabled, podSite.pulseEnabled) &&
        Objects.equals(this.pulseGroupId, podSite.pulseGroupId) &&
        Objects.equals(this.pulsePersonalizedRankingEnabled, podSite.pulsePersonalizedRankingEnabled) &&
        Objects.equals(this.refreshTokenAbsoluteExpiry, podSite.refreshTokenAbsoluteExpiry) &&
        Objects.equals(this.requestAccessEnabled, podSite.requestAccessEnabled) &&
        Objects.equals(this.revisionHistoryEnabled, podSite.revisionHistoryEnabled) &&
        Objects.equals(this.revisionLimit, podSite.revisionLimit) &&
        Objects.equals(this.runNowEnabled, podSite.runNowEnabled) &&
        Objects.equals(this.schedulingFlowsEnabled, podSite.schedulingFlowsEnabled) &&
        Objects.equals(this.selfServiceScheduleForRefreshEnabled, podSite.selfServiceScheduleForRefreshEnabled) &&
        Objects.equals(this.settings, podSite.settings) &&
        Objects.equals(this.sheetImageEnabled, podSite.sheetImageEnabled) &&
        Objects.equals(this.siteInviteEmailEnabled, podSite.siteInviteEmailEnabled) &&
        Objects.equals(this.sitePromptedLoginFlowEnabled, podSite.sitePromptedLoginFlowEnabled) &&
        Objects.equals(this.siteSettings, podSite.siteSettings) &&
        Objects.equals(this.state, podSite.state) &&
        Objects.equals(this.storageQuota, podSite.storageQuota) &&
        Objects.equals(this.storageUsed, podSite.storageUsed) &&
        Objects.equals(this.subscribeOthersEnabled, podSite.subscribeOthersEnabled) &&
        Objects.equals(this.tagLimit, podSite.tagLimit) &&
        Objects.equals(this.tierCreatorCapacity, podSite.tierCreatorCapacity) &&
        Objects.equals(this.tierExplorerCapacity, podSite.tierExplorerCapacity) &&
        Objects.equals(this.tierViewerCapacity, podSite.tierViewerCapacity) &&
        Objects.equals(this.timeZone, podSite.timeZone) &&
        Objects.equals(this.usage, podSite.usage) &&
        Objects.equals(this.useDefaultTimeZone, podSite.useDefaultTimeZone) &&
        Objects.equals(this.userQuota, podSite.userQuota) &&
        Objects.equals(this.userQuotaPolicy, podSite.userQuotaPolicy) &&
        Objects.equals(this.userVisibilityMode, podSite.userVisibilityMode) &&
        Objects.equals(this.webExtractionEnabled, podSite.webExtractionEnabled) &&
        Objects.equals(this.webZoneContentEnabled, podSite.webZoneContentEnabled) &&
        Objects.equals(this.workflowExtensionEnabled, podSite.workflowExtensionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminInsightsPublishFrequency, adminMode, allowSubscriptionAttachments, askDataMode, attributeCaptureEnabled, authoringEnabled, autoExtractRefreshMonitoringEnabled, autoFlowRunMonitoringEnabled, autoSuspendRefreshEnabled, autoSuspendRefreshInactivityWindow, blockNonExtractEnabled, cacheWarmupEnabled, catalogObfuscationEnabled, catalogingEnabled, cmekEnabled, commentingEnabled, commentingMentionsEnabled, contentMigrationToolEnabled, contentUrl, customSubscriptionEmail, customSubscriptionEmailEnabled, customSubscriptionFooter, customSubscriptionFooterEnabled, dataAccelerationMode, dataAlertsEnabled, dataOrientationEnabled, dataStoryEnabled, derivedPermissionsEnabled, disableSubscriptions, dqwSubscriptionsEnabled, easEnabled, editingFlowsEnabled, einsteinInFlowEnabled, explainDataEnabled, extractEncryptionMode, flowAutoSaveEnabled, flowOutputSubscriptionsDataAsEmailAttachmentEnabled, flowOutputSubscriptionsDataInEmailBodyEnabled, flowOutputSubscriptionsEnabled, flowParametersAnyTypeEnabled, flowParametersEnabled, flowParametersSystemTypeEnabled, flowsEnabled, generativeAiDataCatalog, generativeAiEnabled, generativeAiPrep, generativeAiPulse, generativeAiWebAuthoring, groupAssertionsConnectedAppsEnabled, groupAssertionsEnabled, groupAssertionsOIDCEnabled, groupAssertionsSAMLEnabled, groupSetsEnabled, guestAccessEnabled, id, idpConfigurationIdForScim, linkedTaskRunNowEnabled, linkedTaskSchedulingEnabled, loginBasedLicenseManagementEnabled, maxServiceTokenLimitPerUser, metricsContentTypeEnabled, mfaEnforcementExemption, mobileBiometricsEnabled, name, namedSharingEnabled, notifySiteAdminsOnThrottle, personalSpaceEnabled, personalSpaceStorageQuota, publishToSalesforceEnabled, pulseEnabled, pulseGroupId, pulsePersonalizedRankingEnabled, refreshTokenAbsoluteExpiry, requestAccessEnabled, revisionHistoryEnabled, revisionLimit, runNowEnabled, schedulingFlowsEnabled, selfServiceScheduleForRefreshEnabled, settings, sheetImageEnabled, siteInviteEmailEnabled, sitePromptedLoginFlowEnabled, siteSettings, state, storageQuota, storageUsed, subscribeOthersEnabled, tagLimit, tierCreatorCapacity, tierExplorerCapacity, tierViewerCapacity, timeZone, usage, useDefaultTimeZone, userQuota, userQuotaPolicy, userVisibilityMode, webExtractionEnabled, webZoneContentEnabled, workflowExtensionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodSite {\n");
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
    sb.append("    linkedTaskRunNowEnabled: ").append(toIndentedString(linkedTaskRunNowEnabled)).append("\n");
    sb.append("    linkedTaskSchedulingEnabled: ").append(toIndentedString(linkedTaskSchedulingEnabled)).append("\n");
    sb.append("    loginBasedLicenseManagementEnabled: ").append(toIndentedString(loginBasedLicenseManagementEnabled)).append("\n");
    sb.append("    maxServiceTokenLimitPerUser: ").append(toIndentedString(maxServiceTokenLimitPerUser)).append("\n");
    sb.append("    metricsContentTypeEnabled: ").append(toIndentedString(metricsContentTypeEnabled)).append("\n");
    sb.append("    mfaEnforcementExemption: ").append(toIndentedString(mfaEnforcementExemption)).append("\n");
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
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    storageUsed: ").append(toIndentedString(storageUsed)).append("\n");
    sb.append("    subscribeOthersEnabled: ").append(toIndentedString(subscribeOthersEnabled)).append("\n");
    sb.append("    tagLimit: ").append(toIndentedString(tagLimit)).append("\n");
    sb.append("    tierCreatorCapacity: ").append(toIndentedString(tierCreatorCapacity)).append("\n");
    sb.append("    tierExplorerCapacity: ").append(toIndentedString(tierExplorerCapacity)).append("\n");
    sb.append("    tierViewerCapacity: ").append(toIndentedString(tierViewerCapacity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    useDefaultTimeZone: ").append(toIndentedString(useDefaultTimeZone)).append("\n");
    sb.append("    userQuota: ").append(toIndentedString(userQuota)).append("\n");
    sb.append("    userQuotaPolicy: ").append(toIndentedString(userQuotaPolicy)).append("\n");
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

