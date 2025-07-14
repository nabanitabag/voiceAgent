package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.SiteAttributeMapping;

import java.util.Objects;

/**
 * OIDCConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class OIDCConfiguration {

  private Boolean allowEmbeddedAuthentication;

  private SiteAttributeMapping attributeMapping;

  private String authorizationEndpoint;

  private String clientAuthentication;

  private String clientId;

  private String clientSecret;

  private String customScope;

  private String discoveryEndpoint;

  private Boolean enabled;

  private String endSessionEndpoint;

  private String essentialAcrValues;

  private String idpConfigurationId;

  private String idpConfigurationName;

  private String jwksUri;

  private String knownProviderAlias;

  private String prompt;

  private String salesforceDomain;

  private String testLoginUri;

  private String tokenEndpoint;

  private String userinfoEndpoint;

  private String voluntaryAcrValues;

  public OIDCConfiguration allowEmbeddedAuthentication(Boolean allowEmbeddedAuthentication) {
    this.allowEmbeddedAuthentication = allowEmbeddedAuthentication;
    return this;
  }

  /**
   * Get allowEmbeddedAuthentication
   * @return allowEmbeddedAuthentication
  */
  
  @Schema(name = "allowEmbeddedAuthentication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowEmbeddedAuthentication")
  public Boolean getAllowEmbeddedAuthentication() {
    return allowEmbeddedAuthentication;
  }

  public void setAllowEmbeddedAuthentication(Boolean allowEmbeddedAuthentication) {
    this.allowEmbeddedAuthentication = allowEmbeddedAuthentication;
  }

  public OIDCConfiguration attributeMapping(SiteAttributeMapping attributeMapping) {
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

  public OIDCConfiguration authorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
    return this;
  }

  /**
   * Get authorizationEndpoint
   * @return authorizationEndpoint
  */
  
  @Schema(name = "authorizationEndpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizationEndpoint")
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }

  public void setAuthorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }

  public OIDCConfiguration clientAuthentication(String clientAuthentication) {
    this.clientAuthentication = clientAuthentication;
    return this;
  }

  /**
   * Get clientAuthentication
   * @return clientAuthentication
  */
  
  @Schema(name = "clientAuthentication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientAuthentication")
  public String getClientAuthentication() {
    return clientAuthentication;
  }

  public void setClientAuthentication(String clientAuthentication) {
    this.clientAuthentication = clientAuthentication;
  }

  public OIDCConfiguration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OIDCConfiguration clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
  */
  
  @Schema(name = "clientSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OIDCConfiguration customScope(String customScope) {
    this.customScope = customScope;
    return this;
  }

  /**
   * Get customScope
   * @return customScope
  */
  
  @Schema(name = "customScope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customScope")
  public String getCustomScope() {
    return customScope;
  }

  public void setCustomScope(String customScope) {
    this.customScope = customScope;
  }

  public OIDCConfiguration discoveryEndpoint(String discoveryEndpoint) {
    this.discoveryEndpoint = discoveryEndpoint;
    return this;
  }

  /**
   * Get discoveryEndpoint
   * @return discoveryEndpoint
  */
  
  @Schema(name = "discoveryEndpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discoveryEndpoint")
  public String getDiscoveryEndpoint() {
    return discoveryEndpoint;
  }

  public void setDiscoveryEndpoint(String discoveryEndpoint) {
    this.discoveryEndpoint = discoveryEndpoint;
  }

  public OIDCConfiguration enabled(Boolean enabled) {
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

  public OIDCConfiguration endSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
    return this;
  }

  /**
   * Get endSessionEndpoint
   * @return endSessionEndpoint
  */
  
  @Schema(name = "endSessionEndpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endSessionEndpoint")
  public String getEndSessionEndpoint() {
    return endSessionEndpoint;
  }

  public void setEndSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
  }

  public OIDCConfiguration essentialAcrValues(String essentialAcrValues) {
    this.essentialAcrValues = essentialAcrValues;
    return this;
  }

  /**
   * Get essentialAcrValues
   * @return essentialAcrValues
  */
  
  @Schema(name = "essentialAcrValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("essentialAcrValues")
  public String getEssentialAcrValues() {
    return essentialAcrValues;
  }

  public void setEssentialAcrValues(String essentialAcrValues) {
    this.essentialAcrValues = essentialAcrValues;
  }

  public OIDCConfiguration idpConfigurationId(String idpConfigurationId) {
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

  public OIDCConfiguration idpConfigurationName(String idpConfigurationName) {
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

  public OIDCConfiguration jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Get jwksUri
   * @return jwksUri
  */
  
  @Schema(name = "jwksUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jwksUri")
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public OIDCConfiguration knownProviderAlias(String knownProviderAlias) {
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

  public OIDCConfiguration prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * Get prompt
   * @return prompt
  */
  
  @Schema(name = "prompt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public OIDCConfiguration salesforceDomain(String salesforceDomain) {
    this.salesforceDomain = salesforceDomain;
    return this;
  }

  /**
   * Get salesforceDomain
   * @return salesforceDomain
  */
  
  @Schema(name = "salesforceDomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforceDomain")
  public String getSalesforceDomain() {
    return salesforceDomain;
  }

  public void setSalesforceDomain(String salesforceDomain) {
    this.salesforceDomain = salesforceDomain;
  }

  public OIDCConfiguration testLoginUri(String testLoginUri) {
    this.testLoginUri = testLoginUri;
    return this;
  }

  /**
   * Get testLoginUri
   * @return testLoginUri
  */
  
  @Schema(name = "testLoginUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testLoginUri")
  public String getTestLoginUri() {
    return testLoginUri;
  }

  public void setTestLoginUri(String testLoginUri) {
    this.testLoginUri = testLoginUri;
  }

  public OIDCConfiguration tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * Get tokenEndpoint
   * @return tokenEndpoint
  */
  
  @Schema(name = "tokenEndpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenEndpoint")
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  public OIDCConfiguration userinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
    return this;
  }

  /**
   * Get userinfoEndpoint
   * @return userinfoEndpoint
  */
  
  @Schema(name = "userinfoEndpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userinfoEndpoint")
  public String getUserinfoEndpoint() {
    return userinfoEndpoint;
  }

  public void setUserinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
  }

  public OIDCConfiguration voluntaryAcrValues(String voluntaryAcrValues) {
    this.voluntaryAcrValues = voluntaryAcrValues;
    return this;
  }

  /**
   * Get voluntaryAcrValues
   * @return voluntaryAcrValues
  */
  
  @Schema(name = "voluntaryAcrValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voluntaryAcrValues")
  public String getVoluntaryAcrValues() {
    return voluntaryAcrValues;
  }

  public void setVoluntaryAcrValues(String voluntaryAcrValues) {
    this.voluntaryAcrValues = voluntaryAcrValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCConfiguration oiDCConfiguration = (OIDCConfiguration) o;
    return Objects.equals(this.allowEmbeddedAuthentication, oiDCConfiguration.allowEmbeddedAuthentication) &&
        Objects.equals(this.attributeMapping, oiDCConfiguration.attributeMapping) &&
        Objects.equals(this.authorizationEndpoint, oiDCConfiguration.authorizationEndpoint) &&
        Objects.equals(this.clientAuthentication, oiDCConfiguration.clientAuthentication) &&
        Objects.equals(this.clientId, oiDCConfiguration.clientId) &&
        Objects.equals(this.clientSecret, oiDCConfiguration.clientSecret) &&
        Objects.equals(this.customScope, oiDCConfiguration.customScope) &&
        Objects.equals(this.discoveryEndpoint, oiDCConfiguration.discoveryEndpoint) &&
        Objects.equals(this.enabled, oiDCConfiguration.enabled) &&
        Objects.equals(this.endSessionEndpoint, oiDCConfiguration.endSessionEndpoint) &&
        Objects.equals(this.essentialAcrValues, oiDCConfiguration.essentialAcrValues) &&
        Objects.equals(this.idpConfigurationId, oiDCConfiguration.idpConfigurationId) &&
        Objects.equals(this.idpConfigurationName, oiDCConfiguration.idpConfigurationName) &&
        Objects.equals(this.jwksUri, oiDCConfiguration.jwksUri) &&
        Objects.equals(this.knownProviderAlias, oiDCConfiguration.knownProviderAlias) &&
        Objects.equals(this.prompt, oiDCConfiguration.prompt) &&
        Objects.equals(this.salesforceDomain, oiDCConfiguration.salesforceDomain) &&
        Objects.equals(this.testLoginUri, oiDCConfiguration.testLoginUri) &&
        Objects.equals(this.tokenEndpoint, oiDCConfiguration.tokenEndpoint) &&
        Objects.equals(this.userinfoEndpoint, oiDCConfiguration.userinfoEndpoint) &&
        Objects.equals(this.voluntaryAcrValues, oiDCConfiguration.voluntaryAcrValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmbeddedAuthentication, attributeMapping, authorizationEndpoint, clientAuthentication, clientId, clientSecret, customScope, discoveryEndpoint, enabled, endSessionEndpoint, essentialAcrValues, idpConfigurationId, idpConfigurationName, jwksUri, knownProviderAlias, prompt, salesforceDomain, testLoginUri, tokenEndpoint, userinfoEndpoint, voluntaryAcrValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCConfiguration {\n");
    sb.append("    allowEmbeddedAuthentication: ").append(toIndentedString(allowEmbeddedAuthentication)).append("\n");
    sb.append("    attributeMapping: ").append(toIndentedString(attributeMapping)).append("\n");
    sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
    sb.append("    clientAuthentication: ").append(toIndentedString(clientAuthentication)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    customScope: ").append(toIndentedString(customScope)).append("\n");
    sb.append("    discoveryEndpoint: ").append(toIndentedString(discoveryEndpoint)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endSessionEndpoint: ").append(toIndentedString(endSessionEndpoint)).append("\n");
    sb.append("    essentialAcrValues: ").append(toIndentedString(essentialAcrValues)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    idpConfigurationName: ").append(toIndentedString(idpConfigurationName)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    knownProviderAlias: ").append(toIndentedString(knownProviderAlias)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    salesforceDomain: ").append(toIndentedString(salesforceDomain)).append("\n");
    sb.append("    testLoginUri: ").append(toIndentedString(testLoginUri)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    userinfoEndpoint: ").append(toIndentedString(userinfoEndpoint)).append("\n");
    sb.append("    voluntaryAcrValues: ").append(toIndentedString(voluntaryAcrValues)).append("\n");
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

