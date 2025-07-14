package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.EntityDescriptorValidationResult;
import com.tableausoftware.core.model.SiteAttributeMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SiteConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SiteConfiguration {

  private String acsUrl;

  private Boolean allowEmbeddedAuthentication;

  private SiteAttributeMapping attributeMapping;

  private String authenticationDomainId;

  /**
   * Gets or Sets authenticationTypeForEmbedded
   */
  public enum AuthenticationTypeForEmbeddedEnum {
    DEFAULT("DEFAULT"),
    
    SAML("SAML"),
    
    OIDC("OIDC"),
    
    TABID_WITH_MFA("TABID_WITH_MFA");

    private String value;

    AuthenticationTypeForEmbeddedEnum(String value) {
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
    public static AuthenticationTypeForEmbeddedEnum fromValue(String value) {
      for (AuthenticationTypeForEmbeddedEnum b : AuthenticationTypeForEmbeddedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AuthenticationTypeForEmbeddedEnum authenticationTypeForEmbedded;

  private String certificateUrl;

  private Boolean enabled;

  private EntityDescriptorValidationResult entityDescriptorValidationResult;

  @Valid
  private List<String> idpCertificates;

  private String idpConfigurationId;

  private String idpConfigurationName;

  private String serviceProviderEntityId;

  private String ssoServiceURL;

  private String testLoginUrl;

  public SiteConfiguration acsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
    return this;
  }

  /**
   * Get acsUrl
   * @return acsUrl
  */
  
  @Schema(name = "acsUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acsUrl")
  public String getAcsUrl() {
    return acsUrl;
  }

  public void setAcsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
  }

  public SiteConfiguration allowEmbeddedAuthentication(Boolean allowEmbeddedAuthentication) {
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

  public SiteConfiguration attributeMapping(SiteAttributeMapping attributeMapping) {
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

  public SiteConfiguration authenticationDomainId(String authenticationDomainId) {
    this.authenticationDomainId = authenticationDomainId;
    return this;
  }

  /**
   * Get authenticationDomainId
   * @return authenticationDomainId
  */
  
  @Schema(name = "authenticationDomainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticationDomainId")
  public String getAuthenticationDomainId() {
    return authenticationDomainId;
  }

  public void setAuthenticationDomainId(String authenticationDomainId) {
    this.authenticationDomainId = authenticationDomainId;
  }

  public SiteConfiguration authenticationTypeForEmbedded(AuthenticationTypeForEmbeddedEnum authenticationTypeForEmbedded) {
    this.authenticationTypeForEmbedded = authenticationTypeForEmbedded;
    return this;
  }

  /**
   * Get authenticationTypeForEmbedded
   * @return authenticationTypeForEmbedded
  */
  
  @Schema(name = "authenticationTypeForEmbedded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticationTypeForEmbedded")
  public AuthenticationTypeForEmbeddedEnum getAuthenticationTypeForEmbedded() {
    return authenticationTypeForEmbedded;
  }

  public void setAuthenticationTypeForEmbedded(AuthenticationTypeForEmbeddedEnum authenticationTypeForEmbedded) {
    this.authenticationTypeForEmbedded = authenticationTypeForEmbedded;
  }

  public SiteConfiguration certificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

  /**
   * Get certificateUrl
   * @return certificateUrl
  */
  
  @Schema(name = "certificateUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateUrl")
  public String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public SiteConfiguration enabled(Boolean enabled) {
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

  public SiteConfiguration entityDescriptorValidationResult(EntityDescriptorValidationResult entityDescriptorValidationResult) {
    this.entityDescriptorValidationResult = entityDescriptorValidationResult;
    return this;
  }

  /**
   * Get entityDescriptorValidationResult
   * @return entityDescriptorValidationResult
  */
  @Valid 
  @Schema(name = "entityDescriptorValidationResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityDescriptorValidationResult")
  public EntityDescriptorValidationResult getEntityDescriptorValidationResult() {
    return entityDescriptorValidationResult;
  }

  public void setEntityDescriptorValidationResult(EntityDescriptorValidationResult entityDescriptorValidationResult) {
    this.entityDescriptorValidationResult = entityDescriptorValidationResult;
  }

  public SiteConfiguration idpCertificates(List<String> idpCertificates) {
    this.idpCertificates = idpCertificates;
    return this;
  }

  public SiteConfiguration addIdpCertificatesItem(String idpCertificatesItem) {
    if (this.idpCertificates == null) {
      this.idpCertificates = new ArrayList<>();
    }
    this.idpCertificates.add(idpCertificatesItem);
    return this;
  }

  /**
   * Get idpCertificates
   * @return idpCertificates
  */
  
  @Schema(name = "idpCertificates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpCertificates")
  public List<String> getIdpCertificates() {
    return idpCertificates;
  }

  public void setIdpCertificates(List<String> idpCertificates) {
    this.idpCertificates = idpCertificates;
  }

  public SiteConfiguration idpConfigurationId(String idpConfigurationId) {
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

  public SiteConfiguration idpConfigurationName(String idpConfigurationName) {
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

  public SiteConfiguration serviceProviderEntityId(String serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

  /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
  */
  
  @Schema(name = "serviceProviderEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceProviderEntityId")
  public String getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(String serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public SiteConfiguration ssoServiceURL(String ssoServiceURL) {
    this.ssoServiceURL = ssoServiceURL;
    return this;
  }

  /**
   * Get ssoServiceURL
   * @return ssoServiceURL
  */
  
  @Schema(name = "ssoServiceURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssoServiceURL")
  public String getSsoServiceURL() {
    return ssoServiceURL;
  }

  public void setSsoServiceURL(String ssoServiceURL) {
    this.ssoServiceURL = ssoServiceURL;
  }

  public SiteConfiguration testLoginUrl(String testLoginUrl) {
    this.testLoginUrl = testLoginUrl;
    return this;
  }

  /**
   * Get testLoginUrl
   * @return testLoginUrl
  */
  
  @Schema(name = "testLoginUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testLoginUrl")
  public String getTestLoginUrl() {
    return testLoginUrl;
  }

  public void setTestLoginUrl(String testLoginUrl) {
    this.testLoginUrl = testLoginUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteConfiguration siteConfiguration = (SiteConfiguration) o;
    return Objects.equals(this.acsUrl, siteConfiguration.acsUrl) &&
        Objects.equals(this.allowEmbeddedAuthentication, siteConfiguration.allowEmbeddedAuthentication) &&
        Objects.equals(this.attributeMapping, siteConfiguration.attributeMapping) &&
        Objects.equals(this.authenticationDomainId, siteConfiguration.authenticationDomainId) &&
        Objects.equals(this.authenticationTypeForEmbedded, siteConfiguration.authenticationTypeForEmbedded) &&
        Objects.equals(this.certificateUrl, siteConfiguration.certificateUrl) &&
        Objects.equals(this.enabled, siteConfiguration.enabled) &&
        Objects.equals(this.entityDescriptorValidationResult, siteConfiguration.entityDescriptorValidationResult) &&
        Objects.equals(this.idpCertificates, siteConfiguration.idpCertificates) &&
        Objects.equals(this.idpConfigurationId, siteConfiguration.idpConfigurationId) &&
        Objects.equals(this.idpConfigurationName, siteConfiguration.idpConfigurationName) &&
        Objects.equals(this.serviceProviderEntityId, siteConfiguration.serviceProviderEntityId) &&
        Objects.equals(this.ssoServiceURL, siteConfiguration.ssoServiceURL) &&
        Objects.equals(this.testLoginUrl, siteConfiguration.testLoginUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsUrl, allowEmbeddedAuthentication, attributeMapping, authenticationDomainId, authenticationTypeForEmbedded, certificateUrl, enabled, entityDescriptorValidationResult, idpCertificates, idpConfigurationId, idpConfigurationName, serviceProviderEntityId, ssoServiceURL, testLoginUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteConfiguration {\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
    sb.append("    allowEmbeddedAuthentication: ").append(toIndentedString(allowEmbeddedAuthentication)).append("\n");
    sb.append("    attributeMapping: ").append(toIndentedString(attributeMapping)).append("\n");
    sb.append("    authenticationDomainId: ").append(toIndentedString(authenticationDomainId)).append("\n");
    sb.append("    authenticationTypeForEmbedded: ").append(toIndentedString(authenticationTypeForEmbedded)).append("\n");
    sb.append("    certificateUrl: ").append(toIndentedString(certificateUrl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityDescriptorValidationResult: ").append(toIndentedString(entityDescriptorValidationResult)).append("\n");
    sb.append("    idpCertificates: ").append(toIndentedString(idpCertificates)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    idpConfigurationName: ").append(toIndentedString(idpConfigurationName)).append("\n");
    sb.append("    serviceProviderEntityId: ").append(toIndentedString(serviceProviderEntityId)).append("\n");
    sb.append("    ssoServiceURL: ").append(toIndentedString(ssoServiceURL)).append("\n");
    sb.append("    testLoginUrl: ").append(toIndentedString(testLoginUrl)).append("\n");
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

