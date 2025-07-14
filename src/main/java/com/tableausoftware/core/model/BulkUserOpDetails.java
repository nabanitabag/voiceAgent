package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.JobStatusChangeBO;
import com.tableausoftware.core.model.UserOperationDetailedResponse;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.*;

/**
 * BulkUserOpDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class BulkUserOpDetails {

  @Valid
  private Map<String, String> bulkOpAttributes = new HashMap<>();

  private UUID childJobId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdTime;

  private Integer expectedOpsCount;

  private Integer failedOpsCount;

  @Valid
  private List<@Valid UserOperationDetailedResponse> items;

  private UUID jobId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdateTime;

  private String nextPageToken;

  /**
   * Name of the bulk operation
   */
  public enum OperationEnum {
    BULK_USER_IMPORT("BULK_USER_IMPORT"),
    
    SITE_BULK_USER_IMPORT("SITE_BULK_USER_IMPORT"),
    
    MERGE_TENANTS("MERGE_TENANTS"),
    
    UNLICENSE_USERS_BY_ROLE("UNLICENSE_USERS_BY_ROLE"),
    
    RESTORE_TENANT("RESTORE_TENANT"),
    
    UPDATE_LAST_LOGIN_TIME("UPDATE_LAST_LOGIN_TIME"),
    
    MIGRATE_SITE_USERS("MIGRATE_SITE_USERS"),
    
    SITE_SUSPENDED("SITE_SUSPENDED"),
    
    TENANT_DELETED("TENANT_DELETED"),
    
    SITE_RESTORED("SITE_RESTORED"),
    
    SITE_DELETED("SITE_DELETED"),
    
    BULK_USER_MODIFICATION("BULK_USER_MODIFICATION"),
    
    BULK_USER_DELETE("BULK_USER_DELETE"),
    
    MULTI_ROLE_USER_DELETE("MULTI_ROLE_USER_DELETE"),
    
    SINGLE_ROLE_USER_MODIFY("SINGLE_ROLE_USER_MODIFY"),
    
    MULTI_ROLE_USER_MODIFY("MULTI_ROLE_USER_MODIFY"),
    
    SET_TTL_IN_TENANT("SET_TTL_IN_TENANT"),
    
    UNMERGE_TENANTS("UNMERGE_TENANTS"),
    
    UPDATE_EMAIL("UPDATE_EMAIL"),
    
    RESYNC_USERS("RESYNC_USERS");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  private UUID ownerId;

  /**
   * Role of the bulk operation's owner
   */
  public enum OwnerRoleEnum {
    UNAUTHENTICATED("UNAUTHENTICATED"),
    
    CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),
    
    FORSETI("FORSETI"),
    
    LINK_ADMIN("LINK_ADMIN"),
    
    SITE_SAML("SITE_SAML"),
    
    TOKEN_SERVICE("TOKEN_SERVICE"),
    
    USER_SERVICE_WORKFLOW("USER_SERVICE_WORKFLOW"),
    
    USER_SYNC_WORKFLOW("USER_SYNC_WORKFLOW"),
    
    SESSION_SERVICE("SESSION_SERVICE"),
    
    SUNS("SUNS"),
    
    TCM_WEBSTORE("TCM_WEBSTORE"),
    
    USER_SERVICE("USER_SERVICE");

    private String value;

    OwnerRoleEnum(String value) {
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
    public static OwnerRoleEnum fromValue(String value) {
      for (OwnerRoleEnum b : OwnerRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OwnerRoleEnum ownerRole;

  private UUID parentJobId;

  private UUID siteId;

  private Integer skippedLinesCount;

  /**
   * Status of the bulk operation
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    POST_PROCESSING("POST_PROCESSING"),
    
    SUCCESSFUL("SUCCESSFUL"),
    
    FAILED("FAILED"),
    
    RETRY_REQUESTED("RETRY_REQUESTED"),
    
    SKIPPED("SKIPPED");

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

  @Valid
  private List<@Valid JobStatusChangeBO> statusChangeHistory;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submitTime;

  private Integer successfulOpsCount;

  private UUID tenantId;

  private String triggerSource;

  /**
   * Default constructor
   * @deprecated Use {@link BulkUserOpDetails#BulkUserOpDetails(Integer, Integer, UUID, OperationEnum, OwnerRoleEnum, StatusEnum, Integer, UUID)}
   */
  @Deprecated
  public BulkUserOpDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkUserOpDetails(Integer expectedOpsCount, Integer failedOpsCount, UUID jobId, OperationEnum operation, OwnerRoleEnum ownerRole, StatusEnum status, Integer successfulOpsCount, UUID tenantId) {
    this.expectedOpsCount = expectedOpsCount;
    this.failedOpsCount = failedOpsCount;
    this.jobId = jobId;
    this.operation = operation;
    this.ownerRole = ownerRole;
    this.status = status;
    this.successfulOpsCount = successfulOpsCount;
    this.tenantId = tenantId;
  }

  public BulkUserOpDetails bulkOpAttributes(Map<String, String> bulkOpAttributes) {
    this.bulkOpAttributes = bulkOpAttributes;
    return this;
  }

  public BulkUserOpDetails putBulkOpAttributesItem(String key, String bulkOpAttributesItem) {
    if (this.bulkOpAttributes == null) {
      this.bulkOpAttributes = new HashMap<>();
    }
    this.bulkOpAttributes.put(key, bulkOpAttributesItem);
    return this;
  }

  /**
   * Specific attributes used to launch the bulk operation
   * @return bulkOpAttributes
  */
  
  @Schema(name = "bulkOpAttributes", description = "Specific attributes used to launch the bulk operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkOpAttributes")
  public Map<String, String> getBulkOpAttributes() {
    return bulkOpAttributes;
  }

  public void setBulkOpAttributes(Map<String, String> bulkOpAttributes) {
    this.bulkOpAttributes = bulkOpAttributes;
  }

  public BulkUserOpDetails childJobId(UUID childJobId) {
    this.childJobId = childJobId;
    return this;
  }

  /**
   * Identifier of the child job associated with this job if this is a parent job
   * @return childJobId
  */
  @Valid 
  @Schema(name = "childJobId", description = "Identifier of the child job associated with this job if this is a parent job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childJobId")
  public UUID getChildJobId() {
    return childJobId;
  }

  public void setChildJobId(UUID childJobId) {
    this.childJobId = childJobId;
  }

  public BulkUserOpDetails createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * bulk operation created time in UTC
   * @return createdTime
  */
  @Valid 
  @Schema(name = "createdTime", description = "bulk operation created time in UTC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdTime")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public BulkUserOpDetails expectedOpsCount(Integer expectedOpsCount) {
    this.expectedOpsCount = expectedOpsCount;
    return this;
  }

  /**
   * Total number of expected operations count
   * @return expectedOpsCount
  */
  @NotNull 
  @Schema(name = "expectedOpsCount", description = "Total number of expected operations count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedOpsCount")
  public Integer getExpectedOpsCount() {
    return expectedOpsCount;
  }

  public void setExpectedOpsCount(Integer expectedOpsCount) {
    this.expectedOpsCount = expectedOpsCount;
  }

  public BulkUserOpDetails failedOpsCount(Integer failedOpsCount) {
    this.failedOpsCount = failedOpsCount;
    return this;
  }

  /**
   * Total number of failed operations count
   * @return failedOpsCount
  */
  @NotNull 
  @Schema(name = "failedOpsCount", description = "Total number of failed operations count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failedOpsCount")
  public Integer getFailedOpsCount() {
    return failedOpsCount;
  }

  public void setFailedOpsCount(Integer failedOpsCount) {
    this.failedOpsCount = failedOpsCount;
  }

  public BulkUserOpDetails items(List<@Valid UserOperationDetailedResponse> items) {
    this.items = items;
    return this;
  }

  public BulkUserOpDetails addItemsItem(UserOperationDetailedResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Detailed status of each operation
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Detailed status of each operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid UserOperationDetailedResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid UserOperationDetailedResponse> items) {
    this.items = items;
  }

  public BulkUserOpDetails jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Identifier of the bulk operation
   * @return jobId
  */
  @NotNull @Valid 
  @Schema(name = "jobId", description = "Identifier of the bulk operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public BulkUserOpDetails lastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * bulk operation last update time in UTC
   * @return lastUpdateTime
  */
  @Valid 
  @Schema(name = "lastUpdateTime", description = "bulk operation last update time in UTC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdateTime")
  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public BulkUserOpDetails nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * next page token for detailed job records
   * @return nextPageToken
  */
  
  @Schema(name = "nextPageToken", description = "next page token for detailed job records", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public BulkUserOpDetails operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Name of the bulk operation
   * @return operation
  */
  @NotNull 
  @Schema(name = "operation", description = "Name of the bulk operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public BulkUserOpDetails ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Identifier of the bulk operation's owner
   * @return ownerId
  */
  @Valid 
  @Schema(name = "ownerId", description = "Identifier of the bulk operation's owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public BulkUserOpDetails ownerRole(OwnerRoleEnum ownerRole) {
    this.ownerRole = ownerRole;
    return this;
  }

  /**
   * Role of the bulk operation's owner
   * @return ownerRole
  */
  @NotNull 
  @Schema(name = "ownerRole", description = "Role of the bulk operation's owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerRole")
  public OwnerRoleEnum getOwnerRole() {
    return ownerRole;
  }

  public void setOwnerRole(OwnerRoleEnum ownerRole) {
    this.ownerRole = ownerRole;
  }

  public BulkUserOpDetails parentJobId(UUID parentJobId) {
    this.parentJobId = parentJobId;
    return this;
  }

  /**
   * Identifier of the parent job associated with this job if this is a child job
   * @return parentJobId
  */
  @Valid 
  @Schema(name = "parentJobId", description = "Identifier of the parent job associated with this job if this is a child job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentJobId")
  public UUID getParentJobId() {
    return parentJobId;
  }

  public void setParentJobId(UUID parentJobId) {
    this.parentJobId = parentJobId;
  }

  public BulkUserOpDetails siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Site identifier, if the bulk operation was scoped to a single site
   * @return siteId
  */
  @Valid 
  @Schema(name = "siteId", description = "Site identifier, if the bulk operation was scoped to a single site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteId")
  public UUID getSiteId() {
    return siteId;
  }

  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  public BulkUserOpDetails skippedLinesCount(Integer skippedLinesCount) {
    this.skippedLinesCount = skippedLinesCount;
    return this;
  }

  /**
   * Count of lines which are empty in the csv
   * @return skippedLinesCount
  */
  
  @Schema(name = "skippedLinesCount", description = "Count of lines which are empty in the csv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skippedLinesCount")
  public Integer getSkippedLinesCount() {
    return skippedLinesCount;
  }

  public void setSkippedLinesCount(Integer skippedLinesCount) {
    this.skippedLinesCount = skippedLinesCount;
  }

  public BulkUserOpDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the bulk operation
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Status of the bulk operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BulkUserOpDetails statusChangeHistory(List<@Valid JobStatusChangeBO> statusChangeHistory) {
    this.statusChangeHistory = statusChangeHistory;
    return this;
  }

  public BulkUserOpDetails addStatusChangeHistoryItem(JobStatusChangeBO statusChangeHistoryItem) {
    if (this.statusChangeHistory == null) {
      this.statusChangeHistory = new ArrayList<>();
    }
    this.statusChangeHistory.add(statusChangeHistoryItem);
    return this;
  }

  /**
   * History of status changes that the bulk operation has undergone
   * @return statusChangeHistory
  */
  @Valid 
  @Schema(name = "statusChangeHistory", description = "History of status changes that the bulk operation has undergone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusChangeHistory")
  public List<@Valid JobStatusChangeBO> getStatusChangeHistory() {
    return statusChangeHistory;
  }

  public void setStatusChangeHistory(List<@Valid JobStatusChangeBO> statusChangeHistory) {
    this.statusChangeHistory = statusChangeHistory;
  }

  public BulkUserOpDetails submitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
    return this;
  }

  /**
   * bulk operation submit time in UTC 
   * @return submitTime
  */
  @Valid 
  @Schema(name = "submitTime", description = "bulk operation submit time in UTC ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("submitTime")
  public OffsetDateTime getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
  }

  public BulkUserOpDetails successfulOpsCount(Integer successfulOpsCount) {
    this.successfulOpsCount = successfulOpsCount;
    return this;
  }

  /**
   * Total number of successful operations count
   * @return successfulOpsCount
  */
  @NotNull 
  @Schema(name = "successfulOpsCount", description = "Total number of successful operations count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("successfulOpsCount")
  public Integer getSuccessfulOpsCount() {
    return successfulOpsCount;
  }

  public void setSuccessfulOpsCount(Integer successfulOpsCount) {
    this.successfulOpsCount = successfulOpsCount;
  }

  public BulkUserOpDetails tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Identifier of the tenant associated with the op
   * @return tenantId
  */
  @NotNull @Valid 
  @Schema(name = "tenantId", description = "Identifier of the tenant associated with the op", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public BulkUserOpDetails triggerSource(String triggerSource) {
    this.triggerSource = triggerSource;
    return this;
  }

  /**
   * Source that triggered the bulk operation
   * @return triggerSource
  */
  
  @Schema(name = "triggerSource", description = "Source that triggered the bulk operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggerSource")
  public String getTriggerSource() {
    return triggerSource;
  }

  public void setTriggerSource(String triggerSource) {
    this.triggerSource = triggerSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUserOpDetails bulkUserOpDetails = (BulkUserOpDetails) o;
    return Objects.equals(this.bulkOpAttributes, bulkUserOpDetails.bulkOpAttributes) &&
        Objects.equals(this.childJobId, bulkUserOpDetails.childJobId) &&
        Objects.equals(this.createdTime, bulkUserOpDetails.createdTime) &&
        Objects.equals(this.expectedOpsCount, bulkUserOpDetails.expectedOpsCount) &&
        Objects.equals(this.failedOpsCount, bulkUserOpDetails.failedOpsCount) &&
        Objects.equals(this.items, bulkUserOpDetails.items) &&
        Objects.equals(this.jobId, bulkUserOpDetails.jobId) &&
        Objects.equals(this.lastUpdateTime, bulkUserOpDetails.lastUpdateTime) &&
        Objects.equals(this.nextPageToken, bulkUserOpDetails.nextPageToken) &&
        Objects.equals(this.operation, bulkUserOpDetails.operation) &&
        Objects.equals(this.ownerId, bulkUserOpDetails.ownerId) &&
        Objects.equals(this.ownerRole, bulkUserOpDetails.ownerRole) &&
        Objects.equals(this.parentJobId, bulkUserOpDetails.parentJobId) &&
        Objects.equals(this.siteId, bulkUserOpDetails.siteId) &&
        Objects.equals(this.skippedLinesCount, bulkUserOpDetails.skippedLinesCount) &&
        Objects.equals(this.status, bulkUserOpDetails.status) &&
        Objects.equals(this.statusChangeHistory, bulkUserOpDetails.statusChangeHistory) &&
        Objects.equals(this.submitTime, bulkUserOpDetails.submitTime) &&
        Objects.equals(this.successfulOpsCount, bulkUserOpDetails.successfulOpsCount) &&
        Objects.equals(this.tenantId, bulkUserOpDetails.tenantId) &&
        Objects.equals(this.triggerSource, bulkUserOpDetails.triggerSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOpAttributes, childJobId, createdTime, expectedOpsCount, failedOpsCount, items, jobId, lastUpdateTime, nextPageToken, operation, ownerId, ownerRole, parentJobId, siteId, skippedLinesCount, status, statusChangeHistory, submitTime, successfulOpsCount, tenantId, triggerSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUserOpDetails {\n");
    sb.append("    bulkOpAttributes: ").append(toIndentedString(bulkOpAttributes)).append("\n");
    sb.append("    childJobId: ").append(toIndentedString(childJobId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    expectedOpsCount: ").append(toIndentedString(expectedOpsCount)).append("\n");
    sb.append("    failedOpsCount: ").append(toIndentedString(failedOpsCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerRole: ").append(toIndentedString(ownerRole)).append("\n");
    sb.append("    parentJobId: ").append(toIndentedString(parentJobId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    skippedLinesCount: ").append(toIndentedString(skippedLinesCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangeHistory: ").append(toIndentedString(statusChangeHistory)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    successfulOpsCount: ").append(toIndentedString(successfulOpsCount)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
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

