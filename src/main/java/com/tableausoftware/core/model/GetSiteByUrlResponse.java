package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;
import java.util.UUID;

/**
 * GetSiteByUrlResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GetSiteByUrlResponse {

  private UUID id;

  private String instanceDomain;

  private String name;

  private UUID serverSiteId;

  private String state;

  private String uri;

  public GetSiteByUrlResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * site uuid from MIDS, will be null for TCM site
   * @return id
  */
  @Valid 
  @Schema(name = "id", description = "site uuid from MIDS, will be null for TCM site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetSiteByUrlResponse instanceDomain(String instanceDomain) {
    this.instanceDomain = instanceDomain;
    return this;
  }

  /**
   * pod instance base url 
   * @return instanceDomain
  */
  
  @Schema(name = "instanceDomain", description = "pod instance base url ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instanceDomain")
  public String getInstanceDomain() {
    return instanceDomain;
  }

  public void setInstanceDomain(String instanceDomain) {
    this.instanceDomain = instanceDomain;
  }

  public GetSiteByUrlResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * site name
   * @return name
  */
  
  @Schema(name = "name", description = "site name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSiteByUrlResponse serverSiteId(UUID serverSiteId) {
    this.serverSiteId = serverSiteId;
    return this;
  }

  /**
   * site luid from POD
   * @return serverSiteId
  */
  @Valid 
  @Schema(name = "serverSiteId", description = "site luid from POD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverSiteId")
  public UUID getServerSiteId() {
    return serverSiteId;
  }

  public void setServerSiteId(UUID serverSiteId) {
    this.serverSiteId = serverSiteId;
  }

  public GetSiteByUrlResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * site state:  ACTIVE / SUSPENDED / MIGRATING / DELETE
   * @return state
  */
  
  @Schema(name = "state", description = "site state:  ACTIVE / SUSPENDED / MIGRATING / DELETE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public GetSiteByUrlResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * site content_url
   * @return uri
  */
  
  @Schema(name = "uri", description = "site content_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSiteByUrlResponse getSiteByUrlResponse = (GetSiteByUrlResponse) o;
    return Objects.equals(this.id, getSiteByUrlResponse.id) &&
        Objects.equals(this.instanceDomain, getSiteByUrlResponse.instanceDomain) &&
        Objects.equals(this.name, getSiteByUrlResponse.name) &&
        Objects.equals(this.serverSiteId, getSiteByUrlResponse.serverSiteId) &&
        Objects.equals(this.state, getSiteByUrlResponse.state) &&
        Objects.equals(this.uri, getSiteByUrlResponse.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceDomain, name, serverSiteId, state, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSiteByUrlResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceDomain: ").append(toIndentedString(instanceDomain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serverSiteId: ").append(toIndentedString(serverSiteId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

