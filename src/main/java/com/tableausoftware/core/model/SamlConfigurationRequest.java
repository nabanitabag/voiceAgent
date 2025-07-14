package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.SiteAttributeMapping;

import java.util.Objects;

/**
 * SamlConfigurationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SamlConfigurationRequest {

  private Boolean allowEmbeddedAuthentication;

  private SiteAttributeMapping attributeMapping;

  private Boolean enabled;

  private String entityDescriptor;

  private String idpConfigurationId;

  private String idpConfigurationName;

  public SamlConfigurationRequest allowEmbeddedAuthentication(Boolean allowEmbeddedAuthentication) {
    this.allowEmbeddedAuthentication = allowEmbeddedAuthentication;
    return this;
  }

  /**
   * Indicate if embedded authentication is allowed
   * @return allowEmbeddedAuthentication
  */
  
  @Schema(name = "allowEmbeddedAuthentication", description = "Indicate if embedded authentication is allowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowEmbeddedAuthentication")
  public Boolean getAllowEmbeddedAuthentication() {
    return allowEmbeddedAuthentication;
  }

  public void setAllowEmbeddedAuthentication(Boolean allowEmbeddedAuthentication) {
    this.allowEmbeddedAuthentication = allowEmbeddedAuthentication;
  }

  public SamlConfigurationRequest attributeMapping(SiteAttributeMapping attributeMapping) {
    this.attributeMapping = attributeMapping;
    return this;
  }

  /**
   * Get attributeMapping
   * @return attributeMapping
  */
  @Valid 
  @Schema(name = "attributeMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeMapping")
  public SiteAttributeMapping getAttributeMapping() {
    return attributeMapping;
  }

  public void setAttributeMapping(SiteAttributeMapping attributeMapping) {
    this.attributeMapping = attributeMapping;
  }

  public SamlConfigurationRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicate if the SAML config should be enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", description = "Indicate if the SAML config should be enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SamlConfigurationRequest entityDescriptor(String entityDescriptor) {
    this.entityDescriptor = entityDescriptor;
    return this;
  }

  /**
   * Identity provider's SAML metadata in the form of xml string
   * @return entityDescriptor
  */
  
  @Schema(name = "entityDescriptor", description = "Identity provider's SAML metadata in the form of xml string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityDescriptor")
  public String getEntityDescriptor() {
    return entityDescriptor;
  }

  public void setEntityDescriptor(String entityDescriptor) {
    this.entityDescriptor = entityDescriptor;
  }

  public SamlConfigurationRequest idpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
    return this;
  }

  /**
   * ID of the IdP configuration
   * @return idpConfigurationId
  */
  
  @Schema(name = "idpConfigurationId", description = "ID of the IdP configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationId")
  public String getIdpConfigurationId() {
    return idpConfigurationId;
  }

  public void setIdpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
  }

  public SamlConfigurationRequest idpConfigurationName(String idpConfigurationName) {
    this.idpConfigurationName = idpConfigurationName;
    return this;
  }

  /**
   * Name of the IdP configuration
   * @return idpConfigurationName
  */
  
  @Schema(name = "idpConfigurationName", description = "Name of the IdP configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationName")
  public String getIdpConfigurationName() {
    return idpConfigurationName;
  }

  public void setIdpConfigurationName(String idpConfigurationName) {
    this.idpConfigurationName = idpConfigurationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationRequest samlConfigurationRequest = (SamlConfigurationRequest) o;
    return Objects.equals(this.allowEmbeddedAuthentication, samlConfigurationRequest.allowEmbeddedAuthentication) &&
        Objects.equals(this.attributeMapping, samlConfigurationRequest.attributeMapping) &&
        Objects.equals(this.enabled, samlConfigurationRequest.enabled) &&
        Objects.equals(this.entityDescriptor, samlConfigurationRequest.entityDescriptor) &&
        Objects.equals(this.idpConfigurationId, samlConfigurationRequest.idpConfigurationId) &&
        Objects.equals(this.idpConfigurationName, samlConfigurationRequest.idpConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmbeddedAuthentication, attributeMapping, enabled, entityDescriptor, idpConfigurationId, idpConfigurationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationRequest {\n");
    sb.append("    allowEmbeddedAuthentication: ").append(toIndentedString(allowEmbeddedAuthentication)).append("\n");
    sb.append("    attributeMapping: ").append(toIndentedString(attributeMapping)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityDescriptor: ").append(toIndentedString(entityDescriptor)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    idpConfigurationName: ").append(toIndentedString(idpConfigurationName)).append("\n");
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

