package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;
import java.util.UUID;

/**
 * ResourceAuthConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ResourceAuthConfiguration {

  /**
   * Gets or Sets authenticationType
   */
  public enum AuthenticationTypeEnum {
    DEFAULT("DEFAULT"),
    
    SAML("SAML"),
    
    OIDC("OIDC"),
    
    TABID_WITH_MFA("TABID_WITH_MFA");

    private String value;

    AuthenticationTypeEnum(String value) {
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
    public static AuthenticationTypeEnum fromValue(String value) {
      for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AuthenticationTypeEnum authenticationType;

  private Boolean enabled;

  private String idpConfigurationId;

  private String idpConfigurationName;

  private String knownProviderAlias;

  private UUID resourceId;

  public ResourceAuthConfiguration authenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * Get authenticationType
   * @return authenticationType
  */
  
  @Schema(name = "authenticationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticationType")
  public AuthenticationTypeEnum getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
  }

  public ResourceAuthConfiguration enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ResourceAuthConfiguration idpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
    return this;
  }

  /**
   * Get idpConfigurationId
   * @return idpConfigurationId
  */
  
  @Schema(name = "idpConfigurationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationId")
  public String getIdpConfigurationId() {
    return idpConfigurationId;
  }

  public void setIdpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
  }

  public ResourceAuthConfiguration idpConfigurationName(String idpConfigurationName) {
    this.idpConfigurationName = idpConfigurationName;
    return this;
  }

  /**
   * Get idpConfigurationName
   * @return idpConfigurationName
  */
  
  @Schema(name = "idpConfigurationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationName")
  public String getIdpConfigurationName() {
    return idpConfigurationName;
  }

  public void setIdpConfigurationName(String idpConfigurationName) {
    this.idpConfigurationName = idpConfigurationName;
  }

  public ResourceAuthConfiguration knownProviderAlias(String knownProviderAlias) {
    this.knownProviderAlias = knownProviderAlias;
    return this;
  }

  /**
   * Get knownProviderAlias
   * @return knownProviderAlias
  */
  
  @Schema(name = "knownProviderAlias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("knownProviderAlias")
  public String getKnownProviderAlias() {
    return knownProviderAlias;
  }

  public void setKnownProviderAlias(String knownProviderAlias) {
    this.knownProviderAlias = knownProviderAlias;
  }

  public ResourceAuthConfiguration resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @Valid 
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public UUID getResourceId() {
    return resourceId;
  }

  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAuthConfiguration resourceAuthConfiguration = (ResourceAuthConfiguration) o;
    return Objects.equals(this.authenticationType, resourceAuthConfiguration.authenticationType) &&
        Objects.equals(this.enabled, resourceAuthConfiguration.enabled) &&
        Objects.equals(this.idpConfigurationId, resourceAuthConfiguration.idpConfigurationId) &&
        Objects.equals(this.idpConfigurationName, resourceAuthConfiguration.idpConfigurationName) &&
        Objects.equals(this.knownProviderAlias, resourceAuthConfiguration.knownProviderAlias) &&
        Objects.equals(this.resourceId, resourceAuthConfiguration.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, enabled, idpConfigurationId, idpConfigurationName, knownProviderAlias, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAuthConfiguration {\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    idpConfigurationName: ").append(toIndentedString(idpConfigurationName)).append("\n");
    sb.append("    knownProviderAlias: ").append(toIndentedString(knownProviderAlias)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

