package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.CloudProvider;

import java.util.Objects;
import java.util.UUID;

/**
 * POD instance of this site
 */

@Schema(name = "PodInstance", description = "POD instance of this site")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PodInstance {

  private String baseUrl;

  private CloudProvider cloudProvider;

  private UUID id;

  private UUID regionUUID;

  private String serverInstanceId;

  public PodInstance baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * The base URL of the pod instance.
   * @return baseUrl
  */
  
  @Schema(name = "baseUrl", description = "The base URL of the pod instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public PodInstance cloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * Get cloudProvider
   * @return cloudProvider
  */
  @Valid 
  @Schema(name = "cloudProvider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cloudProvider")
  public CloudProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public PodInstance id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the pod instance.
   * @return id
  */
  @Valid 
  @Schema(name = "id", description = "The unique identifier of the pod instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PodInstance regionUUID(UUID regionUUID) {
    this.regionUUID = regionUUID;
    return this;
  }

  /**
   * The unique identifier of the region of the pod instance.
   * @return regionUUID
  */
  @Valid 
  @Schema(name = "regionUUID", description = "The unique identifier of the region of the pod instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionUUID")
  public UUID getRegionUUID() {
    return regionUUID;
  }

  public void setRegionUUID(UUID regionUUID) {
    this.regionUUID = regionUUID;
  }

  public PodInstance serverInstanceId(String serverInstanceId) {
    this.serverInstanceId = serverInstanceId;
    return this;
  }

  /**
   * The server instance ID of the pod instance.
   * @return serverInstanceId
  */
  
  @Schema(name = "serverInstanceId", description = "The server instance ID of the pod instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverInstanceId")
  public String getServerInstanceId() {
    return serverInstanceId;
  }

  public void setServerInstanceId(String serverInstanceId) {
    this.serverInstanceId = serverInstanceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodInstance podInstance = (PodInstance) o;
    return Objects.equals(this.baseUrl, podInstance.baseUrl) &&
        Objects.equals(this.cloudProvider, podInstance.cloudProvider) &&
        Objects.equals(this.id, podInstance.id) &&
        Objects.equals(this.regionUUID, podInstance.regionUUID) &&
        Objects.equals(this.serverInstanceId, podInstance.serverInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, cloudProvider, id, regionUUID, serverInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodInstance {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    regionUUID: ").append(toIndentedString(regionUUID)).append("\n");
    sb.append("    serverInstanceId: ").append(toIndentedString(serverInstanceId)).append("\n");
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

