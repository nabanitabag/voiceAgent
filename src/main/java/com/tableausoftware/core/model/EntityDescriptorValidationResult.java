package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.ValidationMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EntityDescriptorValidationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class EntityDescriptorValidationResult {

  private String authenticatedBy;

  private String identityProviderEntityId;

  @Valid
  private List<@Valid ValidationMessage> validationMessages;

  public EntityDescriptorValidationResult authenticatedBy(String authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
    return this;
  }

  /**
   * Get authenticatedBy
   * @return authenticatedBy
  */
  
  @Schema(name = "authenticatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticatedBy")
  public String getAuthenticatedBy() {
    return authenticatedBy;
  }

  public void setAuthenticatedBy(String authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
  }

  public EntityDescriptorValidationResult identityProviderEntityId(String identityProviderEntityId) {
    this.identityProviderEntityId = identityProviderEntityId;
    return this;
  }

  /**
   * Get identityProviderEntityId
   * @return identityProviderEntityId
  */
  
  @Schema(name = "identityProviderEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identityProviderEntityId")
  public String getIdentityProviderEntityId() {
    return identityProviderEntityId;
  }

  public void setIdentityProviderEntityId(String identityProviderEntityId) {
    this.identityProviderEntityId = identityProviderEntityId;
  }

  public EntityDescriptorValidationResult validationMessages(List<@Valid ValidationMessage> validationMessages) {
    this.validationMessages = validationMessages;
    return this;
  }

  public EntityDescriptorValidationResult addValidationMessagesItem(ValidationMessage validationMessagesItem) {
    if (this.validationMessages == null) {
      this.validationMessages = new ArrayList<>();
    }
    this.validationMessages.add(validationMessagesItem);
    return this;
  }

  /**
   * Get validationMessages
   * @return validationMessages
  */
  @Valid 
  @Schema(name = "validationMessages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationMessages")
  public List<@Valid ValidationMessage> getValidationMessages() {
    return validationMessages;
  }

  public void setValidationMessages(List<@Valid ValidationMessage> validationMessages) {
    this.validationMessages = validationMessages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDescriptorValidationResult entityDescriptorValidationResult = (EntityDescriptorValidationResult) o;
    return Objects.equals(this.authenticatedBy, entityDescriptorValidationResult.authenticatedBy) &&
        Objects.equals(this.identityProviderEntityId, entityDescriptorValidationResult.identityProviderEntityId) &&
        Objects.equals(this.validationMessages, entityDescriptorValidationResult.validationMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatedBy, identityProviderEntityId, validationMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDescriptorValidationResult {\n");
    sb.append("    authenticatedBy: ").append(toIndentedString(authenticatedBy)).append("\n");
    sb.append("    identityProviderEntityId: ").append(toIndentedString(identityProviderEntityId)).append("\n");
    sb.append("    validationMessages: ").append(toIndentedString(validationMessages)).append("\n");
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

