package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * SiteAttributeMapping
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class SiteAttributeMapping {

  private String emailAddressMapping;

  private String emailMapping;

  private String firstNameMapping;

  private String fullNameMapping;

  private String lastNameMapping;

  private Boolean useFullName;

  public SiteAttributeMapping emailAddressMapping(String emailAddressMapping) {
    this.emailAddressMapping = emailAddressMapping;
    return this;
  }

  /**
   * Get emailAddressMapping
   * @return emailAddressMapping
  */
  
  @Schema(name = "emailAddressMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddressMapping")
  public String getEmailAddressMapping() {
    return emailAddressMapping;
  }

  public void setEmailAddressMapping(String emailAddressMapping) {
    this.emailAddressMapping = emailAddressMapping;
  }

  public SiteAttributeMapping emailMapping(String emailMapping) {
    this.emailMapping = emailMapping;
    return this;
  }

  /**
   * Get emailMapping
   * @return emailMapping
  */
  
  @Schema(name = "emailMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailMapping")
  public String getEmailMapping() {
    return emailMapping;
  }

  public void setEmailMapping(String emailMapping) {
    this.emailMapping = emailMapping;
  }

  public SiteAttributeMapping firstNameMapping(String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
    return this;
  }

  /**
   * Get firstNameMapping
   * @return firstNameMapping
  */
  
  @Schema(name = "firstNameMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstNameMapping")
  public String getFirstNameMapping() {
    return firstNameMapping;
  }

  public void setFirstNameMapping(String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
  }

  public SiteAttributeMapping fullNameMapping(String fullNameMapping) {
    this.fullNameMapping = fullNameMapping;
    return this;
  }

  /**
   * Get fullNameMapping
   * @return fullNameMapping
  */
  
  @Schema(name = "fullNameMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullNameMapping")
  public String getFullNameMapping() {
    return fullNameMapping;
  }

  public void setFullNameMapping(String fullNameMapping) {
    this.fullNameMapping = fullNameMapping;
  }

  public SiteAttributeMapping lastNameMapping(String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
    return this;
  }

  /**
   * Get lastNameMapping
   * @return lastNameMapping
  */
  
  @Schema(name = "lastNameMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastNameMapping")
  public String getLastNameMapping() {
    return lastNameMapping;
  }

  public void setLastNameMapping(String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
  }

  public SiteAttributeMapping useFullName(Boolean useFullName) {
    this.useFullName = useFullName;
    return this;
  }

  /**
   * Get useFullName
   * @return useFullName
  */
  
  @Schema(name = "useFullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useFullName")
  public Boolean getUseFullName() {
    return useFullName;
  }

  public void setUseFullName(Boolean useFullName) {
    this.useFullName = useFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteAttributeMapping siteAttributeMapping = (SiteAttributeMapping) o;
    return Objects.equals(this.emailAddressMapping, siteAttributeMapping.emailAddressMapping) &&
        Objects.equals(this.emailMapping, siteAttributeMapping.emailMapping) &&
        Objects.equals(this.firstNameMapping, siteAttributeMapping.firstNameMapping) &&
        Objects.equals(this.fullNameMapping, siteAttributeMapping.fullNameMapping) &&
        Objects.equals(this.lastNameMapping, siteAttributeMapping.lastNameMapping) &&
        Objects.equals(this.useFullName, siteAttributeMapping.useFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddressMapping, emailMapping, firstNameMapping, fullNameMapping, lastNameMapping, useFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteAttributeMapping {\n");
    sb.append("    emailAddressMapping: ").append(toIndentedString(emailAddressMapping)).append("\n");
    sb.append("    emailMapping: ").append(toIndentedString(emailMapping)).append("\n");
    sb.append("    firstNameMapping: ").append(toIndentedString(firstNameMapping)).append("\n");
    sb.append("    fullNameMapping: ").append(toIndentedString(fullNameMapping)).append("\n");
    sb.append("    lastNameMapping: ").append(toIndentedString(lastNameMapping)).append("\n");
    sb.append("    useFullName: ").append(toIndentedString(useFullName)).append("\n");
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

