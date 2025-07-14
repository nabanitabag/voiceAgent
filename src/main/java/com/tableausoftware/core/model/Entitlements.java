package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.UsageBasedPricing;
import com.tableausoftware.core.model.UserQuotaPolicy;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Entitlements
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class Entitlements {

  private Boolean activityLogEnabled;

  private Integer additionalBackgrounderConcurrency;

  private Integer additionalBackgrounderDailyQuota;

  private Boolean addressGeocodingEligible;

  private Integer addressGeocodingPacks;

  private Boolean adminInsightsExtendedRetentionEnabled;

  private Integer allowedStorageMB;

  private Boolean catalogingEnabled;

  private Boolean contentMigrationToolEnabled;

  private Boolean customerManagedEncryptionKeyEnabled;

  private Integer dataConnectNodes;

  private Boolean einsteinCopilotForTableauEnabled;

  private Boolean flowsEnabled;

  private Boolean loginBasedLicenseManagementEnabled;

  private Integer maximumAllowedSites;

  private Boolean mfaEnforcementExemption;

  private Integer privateConnectDataTransfer;

  private Integer privateConnectLicenses;

  private Boolean pulsePremiumConsumptionEnabled;

  private Boolean pulsePremiumDigestControlEnabled;

  private Boolean pulsePremiumGAIEnabled;

  private Boolean pulsePremiumGlobalizationEnabled;

  private Boolean pulsePremiumInsightsEnabled;

  private Boolean pulsePremiumScaleEnabled;

  private Boolean releasePreviewEnabled;

  private Boolean resourceGovernanceEnabled;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime subscriptionEndDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime subscriptionStartDateTime;

  private UsageBasedPricing usageBasedPricing;

  private UserQuotaPolicy userQuotaPolicy;

  private Integer vinstances;

  public Entitlements activityLogEnabled(Boolean activityLogEnabled) {
    this.activityLogEnabled = activityLogEnabled;
    return this;
  }

  /**
   * Get activityLogEnabled
   * @return activityLogEnabled
  */
  
  @Schema(name = "activityLogEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityLogEnabled")
  public Boolean getActivityLogEnabled() {
    return activityLogEnabled;
  }

  public void setActivityLogEnabled(Boolean activityLogEnabled) {
    this.activityLogEnabled = activityLogEnabled;
  }

  public Entitlements additionalBackgrounderConcurrency(Integer additionalBackgrounderConcurrency) {
    this.additionalBackgrounderConcurrency = additionalBackgrounderConcurrency;
    return this;
  }

  /**
   * Get additionalBackgrounderConcurrency
   * @return additionalBackgrounderConcurrency
  */
  
  @Schema(name = "additionalBackgrounderConcurrency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalBackgrounderConcurrency")
  public Integer getAdditionalBackgrounderConcurrency() {
    return additionalBackgrounderConcurrency;
  }

  public void setAdditionalBackgrounderConcurrency(Integer additionalBackgrounderConcurrency) {
    this.additionalBackgrounderConcurrency = additionalBackgrounderConcurrency;
  }

  public Entitlements additionalBackgrounderDailyQuota(Integer additionalBackgrounderDailyQuota) {
    this.additionalBackgrounderDailyQuota = additionalBackgrounderDailyQuota;
    return this;
  }

  /**
   * Get additionalBackgrounderDailyQuota
   * @return additionalBackgrounderDailyQuota
  */
  
  @Schema(name = "additionalBackgrounderDailyQuota", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalBackgrounderDailyQuota")
  public Integer getAdditionalBackgrounderDailyQuota() {
    return additionalBackgrounderDailyQuota;
  }

  public void setAdditionalBackgrounderDailyQuota(Integer additionalBackgrounderDailyQuota) {
    this.additionalBackgrounderDailyQuota = additionalBackgrounderDailyQuota;
  }

  public Entitlements addressGeocodingEligible(Boolean addressGeocodingEligible) {
    this.addressGeocodingEligible = addressGeocodingEligible;
    return this;
  }

  /**
   * Get addressGeocodingEligible
   * @return addressGeocodingEligible
  */
  
  @Schema(name = "addressGeocodingEligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressGeocodingEligible")
  public Boolean getAddressGeocodingEligible() {
    return addressGeocodingEligible;
  }

  public void setAddressGeocodingEligible(Boolean addressGeocodingEligible) {
    this.addressGeocodingEligible = addressGeocodingEligible;
  }

  public Entitlements addressGeocodingPacks(Integer addressGeocodingPacks) {
    this.addressGeocodingPacks = addressGeocodingPacks;
    return this;
  }

  /**
   * Get addressGeocodingPacks
   * @return addressGeocodingPacks
  */
  
  @Schema(name = "addressGeocodingPacks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressGeocodingPacks")
  public Integer getAddressGeocodingPacks() {
    return addressGeocodingPacks;
  }

  public void setAddressGeocodingPacks(Integer addressGeocodingPacks) {
    this.addressGeocodingPacks = addressGeocodingPacks;
  }

  public Entitlements adminInsightsExtendedRetentionEnabled(Boolean adminInsightsExtendedRetentionEnabled) {
    this.adminInsightsExtendedRetentionEnabled = adminInsightsExtendedRetentionEnabled;
    return this;
  }

  /**
   * Get adminInsightsExtendedRetentionEnabled
   * @return adminInsightsExtendedRetentionEnabled
  */
  
  @Schema(name = "adminInsightsExtendedRetentionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminInsightsExtendedRetentionEnabled")
  public Boolean getAdminInsightsExtendedRetentionEnabled() {
    return adminInsightsExtendedRetentionEnabled;
  }

  public void setAdminInsightsExtendedRetentionEnabled(Boolean adminInsightsExtendedRetentionEnabled) {
    this.adminInsightsExtendedRetentionEnabled = adminInsightsExtendedRetentionEnabled;
  }

  public Entitlements allowedStorageMB(Integer allowedStorageMB) {
    this.allowedStorageMB = allowedStorageMB;
    return this;
  }

  /**
   * Get allowedStorageMB
   * @return allowedStorageMB
  */
  
  @Schema(name = "allowedStorageMB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedStorageMB")
  public Integer getAllowedStorageMB() {
    return allowedStorageMB;
  }

  public void setAllowedStorageMB(Integer allowedStorageMB) {
    this.allowedStorageMB = allowedStorageMB;
  }

  public Entitlements catalogingEnabled(Boolean catalogingEnabled) {
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

  public Entitlements contentMigrationToolEnabled(Boolean contentMigrationToolEnabled) {
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

  public Entitlements customerManagedEncryptionKeyEnabled(Boolean customerManagedEncryptionKeyEnabled) {
    this.customerManagedEncryptionKeyEnabled = customerManagedEncryptionKeyEnabled;
    return this;
  }

  /**
   * Get customerManagedEncryptionKeyEnabled
   * @return customerManagedEncryptionKeyEnabled
  */
  
  @Schema(name = "customerManagedEncryptionKeyEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerManagedEncryptionKeyEnabled")
  public Boolean getCustomerManagedEncryptionKeyEnabled() {
    return customerManagedEncryptionKeyEnabled;
  }

  public void setCustomerManagedEncryptionKeyEnabled(Boolean customerManagedEncryptionKeyEnabled) {
    this.customerManagedEncryptionKeyEnabled = customerManagedEncryptionKeyEnabled;
  }

  public Entitlements dataConnectNodes(Integer dataConnectNodes) {
    this.dataConnectNodes = dataConnectNodes;
    return this;
  }

  /**
   * Get dataConnectNodes
   * @return dataConnectNodes
  */
  
  @Schema(name = "dataConnectNodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataConnectNodes")
  public Integer getDataConnectNodes() {
    return dataConnectNodes;
  }

  public void setDataConnectNodes(Integer dataConnectNodes) {
    this.dataConnectNodes = dataConnectNodes;
  }

  public Entitlements einsteinCopilotForTableauEnabled(Boolean einsteinCopilotForTableauEnabled) {
    this.einsteinCopilotForTableauEnabled = einsteinCopilotForTableauEnabled;
    return this;
  }

  /**
   * Get einsteinCopilotForTableauEnabled
   * @return einsteinCopilotForTableauEnabled
  */
  
  @Schema(name = "einsteinCopilotForTableauEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("einsteinCopilotForTableauEnabled")
  public Boolean getEinsteinCopilotForTableauEnabled() {
    return einsteinCopilotForTableauEnabled;
  }

  public void setEinsteinCopilotForTableauEnabled(Boolean einsteinCopilotForTableauEnabled) {
    this.einsteinCopilotForTableauEnabled = einsteinCopilotForTableauEnabled;
  }

  public Entitlements flowsEnabled(Boolean flowsEnabled) {
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

  public Entitlements loginBasedLicenseManagementEnabled(Boolean loginBasedLicenseManagementEnabled) {
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

  public Entitlements maximumAllowedSites(Integer maximumAllowedSites) {
    this.maximumAllowedSites = maximumAllowedSites;
    return this;
  }

  /**
   * Get maximumAllowedSites
   * @return maximumAllowedSites
  */
  
  @Schema(name = "maximumAllowedSites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumAllowedSites")
  public Integer getMaximumAllowedSites() {
    return maximumAllowedSites;
  }

  public void setMaximumAllowedSites(Integer maximumAllowedSites) {
    this.maximumAllowedSites = maximumAllowedSites;
  }

  public Entitlements mfaEnforcementExemption(Boolean mfaEnforcementExemption) {
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

  public Entitlements privateConnectDataTransfer(Integer privateConnectDataTransfer) {
    this.privateConnectDataTransfer = privateConnectDataTransfer;
    return this;
  }

  /**
   * Get privateConnectDataTransfer
   * @return privateConnectDataTransfer
  */
  
  @Schema(name = "privateConnectDataTransfer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privateConnectDataTransfer")
  public Integer getPrivateConnectDataTransfer() {
    return privateConnectDataTransfer;
  }

  public void setPrivateConnectDataTransfer(Integer privateConnectDataTransfer) {
    this.privateConnectDataTransfer = privateConnectDataTransfer;
  }

  public Entitlements privateConnectLicenses(Integer privateConnectLicenses) {
    this.privateConnectLicenses = privateConnectLicenses;
    return this;
  }

  /**
   * Get privateConnectLicenses
   * @return privateConnectLicenses
  */
  
  @Schema(name = "privateConnectLicenses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privateConnectLicenses")
  public Integer getPrivateConnectLicenses() {
    return privateConnectLicenses;
  }

  public void setPrivateConnectLicenses(Integer privateConnectLicenses) {
    this.privateConnectLicenses = privateConnectLicenses;
  }

  public Entitlements pulsePremiumConsumptionEnabled(Boolean pulsePremiumConsumptionEnabled) {
    this.pulsePremiumConsumptionEnabled = pulsePremiumConsumptionEnabled;
    return this;
  }

  /**
   * Get pulsePremiumConsumptionEnabled
   * @return pulsePremiumConsumptionEnabled
  */
  
  @Schema(name = "pulsePremiumConsumptionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumConsumptionEnabled")
  public Boolean getPulsePremiumConsumptionEnabled() {
    return pulsePremiumConsumptionEnabled;
  }

  public void setPulsePremiumConsumptionEnabled(Boolean pulsePremiumConsumptionEnabled) {
    this.pulsePremiumConsumptionEnabled = pulsePremiumConsumptionEnabled;
  }

  public Entitlements pulsePremiumDigestControlEnabled(Boolean pulsePremiumDigestControlEnabled) {
    this.pulsePremiumDigestControlEnabled = pulsePremiumDigestControlEnabled;
    return this;
  }

  /**
   * Get pulsePremiumDigestControlEnabled
   * @return pulsePremiumDigestControlEnabled
  */
  
  @Schema(name = "pulsePremiumDigestControlEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumDigestControlEnabled")
  public Boolean getPulsePremiumDigestControlEnabled() {
    return pulsePremiumDigestControlEnabled;
  }

  public void setPulsePremiumDigestControlEnabled(Boolean pulsePremiumDigestControlEnabled) {
    this.pulsePremiumDigestControlEnabled = pulsePremiumDigestControlEnabled;
  }

  public Entitlements pulsePremiumGAIEnabled(Boolean pulsePremiumGAIEnabled) {
    this.pulsePremiumGAIEnabled = pulsePremiumGAIEnabled;
    return this;
  }

  /**
   * Get pulsePremiumGAIEnabled
   * @return pulsePremiumGAIEnabled
  */
  
  @Schema(name = "pulsePremiumGAIEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumGAIEnabled")
  public Boolean getPulsePremiumGAIEnabled() {
    return pulsePremiumGAIEnabled;
  }

  public void setPulsePremiumGAIEnabled(Boolean pulsePremiumGAIEnabled) {
    this.pulsePremiumGAIEnabled = pulsePremiumGAIEnabled;
  }

  public Entitlements pulsePremiumGlobalizationEnabled(Boolean pulsePremiumGlobalizationEnabled) {
    this.pulsePremiumGlobalizationEnabled = pulsePremiumGlobalizationEnabled;
    return this;
  }

  /**
   * Get pulsePremiumGlobalizationEnabled
   * @return pulsePremiumGlobalizationEnabled
  */
  
  @Schema(name = "pulsePremiumGlobalizationEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumGlobalizationEnabled")
  public Boolean getPulsePremiumGlobalizationEnabled() {
    return pulsePremiumGlobalizationEnabled;
  }

  public void setPulsePremiumGlobalizationEnabled(Boolean pulsePremiumGlobalizationEnabled) {
    this.pulsePremiumGlobalizationEnabled = pulsePremiumGlobalizationEnabled;
  }

  public Entitlements pulsePremiumInsightsEnabled(Boolean pulsePremiumInsightsEnabled) {
    this.pulsePremiumInsightsEnabled = pulsePremiumInsightsEnabled;
    return this;
  }

  /**
   * Get pulsePremiumInsightsEnabled
   * @return pulsePremiumInsightsEnabled
  */
  
  @Schema(name = "pulsePremiumInsightsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumInsightsEnabled")
  public Boolean getPulsePremiumInsightsEnabled() {
    return pulsePremiumInsightsEnabled;
  }

  public void setPulsePremiumInsightsEnabled(Boolean pulsePremiumInsightsEnabled) {
    this.pulsePremiumInsightsEnabled = pulsePremiumInsightsEnabled;
  }

  public Entitlements pulsePremiumScaleEnabled(Boolean pulsePremiumScaleEnabled) {
    this.pulsePremiumScaleEnabled = pulsePremiumScaleEnabled;
    return this;
  }

  /**
   * Get pulsePremiumScaleEnabled
   * @return pulsePremiumScaleEnabled
  */
  
  @Schema(name = "pulsePremiumScaleEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pulsePremiumScaleEnabled")
  public Boolean getPulsePremiumScaleEnabled() {
    return pulsePremiumScaleEnabled;
  }

  public void setPulsePremiumScaleEnabled(Boolean pulsePremiumScaleEnabled) {
    this.pulsePremiumScaleEnabled = pulsePremiumScaleEnabled;
  }

  public Entitlements releasePreviewEnabled(Boolean releasePreviewEnabled) {
    this.releasePreviewEnabled = releasePreviewEnabled;
    return this;
  }

  /**
   * Get releasePreviewEnabled
   * @return releasePreviewEnabled
  */
  
  @Schema(name = "releasePreviewEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releasePreviewEnabled")
  public Boolean getReleasePreviewEnabled() {
    return releasePreviewEnabled;
  }

  public void setReleasePreviewEnabled(Boolean releasePreviewEnabled) {
    this.releasePreviewEnabled = releasePreviewEnabled;
  }

  public Entitlements resourceGovernanceEnabled(Boolean resourceGovernanceEnabled) {
    this.resourceGovernanceEnabled = resourceGovernanceEnabled;
    return this;
  }

  /**
   * Get resourceGovernanceEnabled
   * @return resourceGovernanceEnabled
  */
  
  @Schema(name = "resourceGovernanceEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceGovernanceEnabled")
  public Boolean getResourceGovernanceEnabled() {
    return resourceGovernanceEnabled;
  }

  public void setResourceGovernanceEnabled(Boolean resourceGovernanceEnabled) {
    this.resourceGovernanceEnabled = resourceGovernanceEnabled;
  }

  public Entitlements subscriptionEndDateTime(OffsetDateTime subscriptionEndDateTime) {
    this.subscriptionEndDateTime = subscriptionEndDateTime;
    return this;
  }

  /**
   * Get subscriptionEndDateTime
   * @return subscriptionEndDateTime
  */
  @Valid 
  @Schema(name = "subscriptionEndDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionEndDateTime")
  public OffsetDateTime getSubscriptionEndDateTime() {
    return subscriptionEndDateTime;
  }

  public void setSubscriptionEndDateTime(OffsetDateTime subscriptionEndDateTime) {
    this.subscriptionEndDateTime = subscriptionEndDateTime;
  }

  public Entitlements subscriptionStartDateTime(OffsetDateTime subscriptionStartDateTime) {
    this.subscriptionStartDateTime = subscriptionStartDateTime;
    return this;
  }

  /**
   * Get subscriptionStartDateTime
   * @return subscriptionStartDateTime
  */
  @Valid 
  @Schema(name = "subscriptionStartDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionStartDateTime")
  public OffsetDateTime getSubscriptionStartDateTime() {
    return subscriptionStartDateTime;
  }

  public void setSubscriptionStartDateTime(OffsetDateTime subscriptionStartDateTime) {
    this.subscriptionStartDateTime = subscriptionStartDateTime;
  }

  public Entitlements usageBasedPricing(UsageBasedPricing usageBasedPricing) {
    this.usageBasedPricing = usageBasedPricing;
    return this;
  }

  /**
   * Get usageBasedPricing
   * @return usageBasedPricing
  */
  @Valid 
  @Schema(name = "usageBasedPricing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageBasedPricing")
  public UsageBasedPricing getUsageBasedPricing() {
    return usageBasedPricing;
  }

  public void setUsageBasedPricing(UsageBasedPricing usageBasedPricing) {
    this.usageBasedPricing = usageBasedPricing;
  }

  public Entitlements userQuotaPolicy(UserQuotaPolicy userQuotaPolicy) {
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

  public Entitlements vinstances(Integer vinstances) {
    this.vinstances = vinstances;
    return this;
  }

  /**
   * Get vinstances
   * @return vinstances
  */
  
  @Schema(name = "vinstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vinstances")
  public Integer getVinstances() {
    return vinstances;
  }

  public void setVinstances(Integer vinstances) {
    this.vinstances = vinstances;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entitlements entitlements = (Entitlements) o;
    return Objects.equals(this.activityLogEnabled, entitlements.activityLogEnabled) &&
        Objects.equals(this.additionalBackgrounderConcurrency, entitlements.additionalBackgrounderConcurrency) &&
        Objects.equals(this.additionalBackgrounderDailyQuota, entitlements.additionalBackgrounderDailyQuota) &&
        Objects.equals(this.addressGeocodingEligible, entitlements.addressGeocodingEligible) &&
        Objects.equals(this.addressGeocodingPacks, entitlements.addressGeocodingPacks) &&
        Objects.equals(this.adminInsightsExtendedRetentionEnabled, entitlements.adminInsightsExtendedRetentionEnabled) &&
        Objects.equals(this.allowedStorageMB, entitlements.allowedStorageMB) &&
        Objects.equals(this.catalogingEnabled, entitlements.catalogingEnabled) &&
        Objects.equals(this.contentMigrationToolEnabled, entitlements.contentMigrationToolEnabled) &&
        Objects.equals(this.customerManagedEncryptionKeyEnabled, entitlements.customerManagedEncryptionKeyEnabled) &&
        Objects.equals(this.dataConnectNodes, entitlements.dataConnectNodes) &&
        Objects.equals(this.einsteinCopilotForTableauEnabled, entitlements.einsteinCopilotForTableauEnabled) &&
        Objects.equals(this.flowsEnabled, entitlements.flowsEnabled) &&
        Objects.equals(this.loginBasedLicenseManagementEnabled, entitlements.loginBasedLicenseManagementEnabled) &&
        Objects.equals(this.maximumAllowedSites, entitlements.maximumAllowedSites) &&
        Objects.equals(this.mfaEnforcementExemption, entitlements.mfaEnforcementExemption) &&
        Objects.equals(this.privateConnectDataTransfer, entitlements.privateConnectDataTransfer) &&
        Objects.equals(this.privateConnectLicenses, entitlements.privateConnectLicenses) &&
        Objects.equals(this.pulsePremiumConsumptionEnabled, entitlements.pulsePremiumConsumptionEnabled) &&
        Objects.equals(this.pulsePremiumDigestControlEnabled, entitlements.pulsePremiumDigestControlEnabled) &&
        Objects.equals(this.pulsePremiumGAIEnabled, entitlements.pulsePremiumGAIEnabled) &&
        Objects.equals(this.pulsePremiumGlobalizationEnabled, entitlements.pulsePremiumGlobalizationEnabled) &&
        Objects.equals(this.pulsePremiumInsightsEnabled, entitlements.pulsePremiumInsightsEnabled) &&
        Objects.equals(this.pulsePremiumScaleEnabled, entitlements.pulsePremiumScaleEnabled) &&
        Objects.equals(this.releasePreviewEnabled, entitlements.releasePreviewEnabled) &&
        Objects.equals(this.resourceGovernanceEnabled, entitlements.resourceGovernanceEnabled) &&
        Objects.equals(this.subscriptionEndDateTime, entitlements.subscriptionEndDateTime) &&
        Objects.equals(this.subscriptionStartDateTime, entitlements.subscriptionStartDateTime) &&
        Objects.equals(this.usageBasedPricing, entitlements.usageBasedPricing) &&
        Objects.equals(this.userQuotaPolicy, entitlements.userQuotaPolicy) &&
        Objects.equals(this.vinstances, entitlements.vinstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityLogEnabled, additionalBackgrounderConcurrency, additionalBackgrounderDailyQuota, addressGeocodingEligible, addressGeocodingPacks, adminInsightsExtendedRetentionEnabled, allowedStorageMB, catalogingEnabled, contentMigrationToolEnabled, customerManagedEncryptionKeyEnabled, dataConnectNodes, einsteinCopilotForTableauEnabled, flowsEnabled, loginBasedLicenseManagementEnabled, maximumAllowedSites, mfaEnforcementExemption, privateConnectDataTransfer, privateConnectLicenses, pulsePremiumConsumptionEnabled, pulsePremiumDigestControlEnabled, pulsePremiumGAIEnabled, pulsePremiumGlobalizationEnabled, pulsePremiumInsightsEnabled, pulsePremiumScaleEnabled, releasePreviewEnabled, resourceGovernanceEnabled, subscriptionEndDateTime, subscriptionStartDateTime, usageBasedPricing, userQuotaPolicy, vinstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entitlements {\n");
    sb.append("    activityLogEnabled: ").append(toIndentedString(activityLogEnabled)).append("\n");
    sb.append("    additionalBackgrounderConcurrency: ").append(toIndentedString(additionalBackgrounderConcurrency)).append("\n");
    sb.append("    additionalBackgrounderDailyQuota: ").append(toIndentedString(additionalBackgrounderDailyQuota)).append("\n");
    sb.append("    addressGeocodingEligible: ").append(toIndentedString(addressGeocodingEligible)).append("\n");
    sb.append("    addressGeocodingPacks: ").append(toIndentedString(addressGeocodingPacks)).append("\n");
    sb.append("    adminInsightsExtendedRetentionEnabled: ").append(toIndentedString(adminInsightsExtendedRetentionEnabled)).append("\n");
    sb.append("    allowedStorageMB: ").append(toIndentedString(allowedStorageMB)).append("\n");
    sb.append("    catalogingEnabled: ").append(toIndentedString(catalogingEnabled)).append("\n");
    sb.append("    contentMigrationToolEnabled: ").append(toIndentedString(contentMigrationToolEnabled)).append("\n");
    sb.append("    customerManagedEncryptionKeyEnabled: ").append(toIndentedString(customerManagedEncryptionKeyEnabled)).append("\n");
    sb.append("    dataConnectNodes: ").append(toIndentedString(dataConnectNodes)).append("\n");
    sb.append("    einsteinCopilotForTableauEnabled: ").append(toIndentedString(einsteinCopilotForTableauEnabled)).append("\n");
    sb.append("    flowsEnabled: ").append(toIndentedString(flowsEnabled)).append("\n");
    sb.append("    loginBasedLicenseManagementEnabled: ").append(toIndentedString(loginBasedLicenseManagementEnabled)).append("\n");
    sb.append("    maximumAllowedSites: ").append(toIndentedString(maximumAllowedSites)).append("\n");
    sb.append("    mfaEnforcementExemption: ").append(toIndentedString(mfaEnforcementExemption)).append("\n");
    sb.append("    privateConnectDataTransfer: ").append(toIndentedString(privateConnectDataTransfer)).append("\n");
    sb.append("    privateConnectLicenses: ").append(toIndentedString(privateConnectLicenses)).append("\n");
    sb.append("    pulsePremiumConsumptionEnabled: ").append(toIndentedString(pulsePremiumConsumptionEnabled)).append("\n");
    sb.append("    pulsePremiumDigestControlEnabled: ").append(toIndentedString(pulsePremiumDigestControlEnabled)).append("\n");
    sb.append("    pulsePremiumGAIEnabled: ").append(toIndentedString(pulsePremiumGAIEnabled)).append("\n");
    sb.append("    pulsePremiumGlobalizationEnabled: ").append(toIndentedString(pulsePremiumGlobalizationEnabled)).append("\n");
    sb.append("    pulsePremiumInsightsEnabled: ").append(toIndentedString(pulsePremiumInsightsEnabled)).append("\n");
    sb.append("    pulsePremiumScaleEnabled: ").append(toIndentedString(pulsePremiumScaleEnabled)).append("\n");
    sb.append("    releasePreviewEnabled: ").append(toIndentedString(releasePreviewEnabled)).append("\n");
    sb.append("    resourceGovernanceEnabled: ").append(toIndentedString(resourceGovernanceEnabled)).append("\n");
    sb.append("    subscriptionEndDateTime: ").append(toIndentedString(subscriptionEndDateTime)).append("\n");
    sb.append("    subscriptionStartDateTime: ").append(toIndentedString(subscriptionStartDateTime)).append("\n");
    sb.append("    usageBasedPricing: ").append(toIndentedString(usageBasedPricing)).append("\n");
    sb.append("    userQuotaPolicy: ").append(toIndentedString(userQuotaPolicy)).append("\n");
    sb.append("    vinstances: ").append(toIndentedString(vinstances)).append("\n");
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

