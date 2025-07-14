package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PersonalAccessTokenInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PersonalAccessTokenInfo {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationInUtc;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime issueInUtc;

  private String tenantId;

  private String tokenName;

  private String tokenUUID;

  private String userId;

  /**
   * Default constructor
   * @deprecated Use {@link PersonalAccessTokenInfo#PersonalAccessTokenInfo(OffsetDateTime, String, String, String, String)}
   */
  @Deprecated
  public PersonalAccessTokenInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalAccessTokenInfo(OffsetDateTime issueInUtc, String tenantId, String tokenName, String tokenUUID, String userId) {
    this.issueInUtc = issueInUtc;
    this.tenantId = tenantId;
    this.tokenName = tokenName;
    this.tokenUUID = tokenUUID;
    this.userId = userId;
  }

  public PersonalAccessTokenInfo expirationInUtc(OffsetDateTime expirationInUtc) {
    this.expirationInUtc = expirationInUtc;
    return this;
  }

  /**
   * The time the PAT will expire in UTC.
   * @return expirationInUtc
  */
  @Valid 
  @Schema(name = "expirationInUtc", description = "The time the PAT will expire in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationInUtc")
  public OffsetDateTime getExpirationInUtc() {
    return expirationInUtc;
  }

  public void setExpirationInUtc(OffsetDateTime expirationInUtc) {
    this.expirationInUtc = expirationInUtc;
  }

  public PersonalAccessTokenInfo issueInUtc(OffsetDateTime issueInUtc) {
    this.issueInUtc = issueInUtc;
    return this;
  }

  /**
   * The time the PAT was created in UTC.
   * @return issueInUtc
  */
  @NotNull @Valid 
  @Schema(name = "issueInUtc", description = "The time the PAT was created in UTC.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueInUtc")
  public OffsetDateTime getIssueInUtc() {
    return issueInUtc;
  }

  public void setIssueInUtc(OffsetDateTime issueInUtc) {
    this.issueInUtc = issueInUtc;
  }

  public PersonalAccessTokenInfo tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID of the PAT.
   * @return tenantId
  */
  @NotNull 
  @Schema(name = "tenantId", description = "The tenant ID of the PAT.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public PersonalAccessTokenInfo tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

  /**
   * Name of the PAT.
   * @return tokenName
  */
  @NotNull 
  @Schema(name = "tokenName", description = "Name of the PAT.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tokenName")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public PersonalAccessTokenInfo tokenUUID(String tokenUUID) {
    this.tokenUUID = tokenUUID;
    return this;
  }

  /**
   * The unique ID of the PAT.
   * @return tokenUUID
  */
  @NotNull 
  @Schema(name = "tokenUUID", description = "The unique ID of the PAT.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tokenUUID")
  public String getTokenUUID() {
    return tokenUUID;
  }

  public void setTokenUUID(String tokenUUID) {
    this.tokenUUID = tokenUUID;
  }

  public PersonalAccessTokenInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the PAT owner.
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", description = "The user ID of the PAT owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalAccessTokenInfo personalAccessTokenInfo = (PersonalAccessTokenInfo) o;
    return Objects.equals(this.expirationInUtc, personalAccessTokenInfo.expirationInUtc) &&
        Objects.equals(this.issueInUtc, personalAccessTokenInfo.issueInUtc) &&
        Objects.equals(this.tenantId, personalAccessTokenInfo.tenantId) &&
        Objects.equals(this.tokenName, personalAccessTokenInfo.tokenName) &&
        Objects.equals(this.tokenUUID, personalAccessTokenInfo.tokenUUID) &&
        Objects.equals(this.userId, personalAccessTokenInfo.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationInUtc, issueInUtc, tenantId, tokenName, tokenUUID, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalAccessTokenInfo {\n");
    sb.append("    expirationInUtc: ").append(toIndentedString(expirationInUtc)).append("\n");
    sb.append("    issueInUtc: ").append(toIndentedString(issueInUtc)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenUUID: ").append(toIndentedString(tokenUUID)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

