package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.ResourcesHierarchyDTO;

import java.util.Objects;
import java.util.UUID;

/**
 * resources associated with the user
 */

@Schema(name = "UserResourcesInfoDTO", description = "resources associated with the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserResourcesInfoDTO {

  private String email;

  private UUID id;

  private String instanceDomain;

  /**
   * migration status of site resource
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

  private ResourcesHierarchyDTO parent;

  /**
   * type Of Resource for the user
   */
  public enum ResourceTypeEnum {
    SITE("SITE"),
    
    TENANT("TENANT");

    private String value;

    ResourceTypeEnum(String value) {
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
    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceTypeEnum resourceType;

  private String role;

  private String state;

  private String uri;

  public UserResourcesInfoDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email ID of the user
   * @return email
  */
  
  @Schema(name = "email", description = "Email ID of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResourcesInfoDTO id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * UUID of the tenant
   * @return id
  */
  @Valid 
  @Schema(name = "id", description = "UUID of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserResourcesInfoDTO instanceDomain(String instanceDomain) {
    this.instanceDomain = instanceDomain;
    return this;
  }

  /**
   * link to TCM pod-agnostic endpoint and sites POD url
   * @return instanceDomain
  */
  
  @Schema(name = "instanceDomain", description = "link to TCM pod-agnostic endpoint and sites POD url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instanceDomain")
  public String getInstanceDomain() {
    return instanceDomain;
  }

  public void setInstanceDomain(String instanceDomain) {
    this.instanceDomain = instanceDomain;
  }

  public UserResourcesInfoDTO migrationStatus(MigrationStatusEnum migrationStatus) {
    this.migrationStatus = migrationStatus;
    return this;
  }

  /**
   * migration status of site resource
   * @return migrationStatus
  */
  
  @Schema(name = "migrationStatus", description = "migration status of site resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("migrationStatus")
  public MigrationStatusEnum getMigrationStatus() {
    return migrationStatus;
  }

  public void setMigrationStatus(MigrationStatusEnum migrationStatus) {
    this.migrationStatus = migrationStatus;
  }

  public UserResourcesInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tenant
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResourcesInfoDTO parent(ResourcesHierarchyDTO parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public ResourcesHierarchyDTO getParent() {
    return parent;
  }

  public void setParent(ResourcesHierarchyDTO parent) {
    this.parent = parent;
  }

  public UserResourcesInfoDTO resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * type Of Resource for the user
   * @return resourceType
  */
  
  @Schema(name = "resourceType", description = "type Of Resource for the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public UserResourcesInfoDTO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the resource
   * @return role
  */
  
  @Schema(name = "role", description = "role of the resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserResourcesInfoDTO state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the tenant
   * @return state
  */
  
  @Schema(name = "state", description = "State of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UserResourcesInfoDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI of the tenant
   * @return uri
  */
  
  @Schema(name = "uri", description = "URI of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserResourcesInfoDTO userResourcesInfoDTO = (UserResourcesInfoDTO) o;
    return Objects.equals(this.email, userResourcesInfoDTO.email) &&
        Objects.equals(this.id, userResourcesInfoDTO.id) &&
        Objects.equals(this.instanceDomain, userResourcesInfoDTO.instanceDomain) &&
        Objects.equals(this.migrationStatus, userResourcesInfoDTO.migrationStatus) &&
        Objects.equals(this.name, userResourcesInfoDTO.name) &&
        Objects.equals(this.parent, userResourcesInfoDTO.parent) &&
        Objects.equals(this.resourceType, userResourcesInfoDTO.resourceType) &&
        Objects.equals(this.role, userResourcesInfoDTO.role) &&
        Objects.equals(this.state, userResourcesInfoDTO.state) &&
        Objects.equals(this.uri, userResourcesInfoDTO.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, instanceDomain, migrationStatus, name, parent, resourceType, role, state, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResourcesInfoDTO {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceDomain: ").append(toIndentedString(instanceDomain)).append("\n");
    sb.append("    migrationStatus: ").append(toIndentedString(migrationStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

