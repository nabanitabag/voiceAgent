package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * Site roles of the user
 */

@Schema(name = "GetUserSiteRoleResponseDTO", description = "Site roles of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GetUserSiteRoleResponseDTO {

  private String idpConfigurationId;

  /**
   * Gets or Sets idpType
   */
  public enum IdpTypeEnum {
    SAML("SAML"),
    
    OPENID("OpenID"),
    
    TABLEAUIDWITHMFA("TableauIDWithMFA"),
    
    DEFAULT("DEFAULT");

    private String value;

    IdpTypeEnum(String value) {
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
    public static IdpTypeEnum fromValue(String value) {
      for (IdpTypeEnum b : IdpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdpTypeEnum idpType;

  private String serverSiteUserId;

  private UUID siteId;

  /**
   * Gets or Sets siteRole
   */
  public enum SiteRoleEnum {
    SITEADMINISTRATOREXPLORER("SiteAdministratorExplorer"),
    
    SUPPORTUSER("SupportUser"),
    
    EXPLORERCANPUBLISH("ExplorerCanPublish"),
    
    EXPLORER("Explorer"),
    
    UNLICENSED("Unlicensed"),
    
    VIEWER("Viewer"),
    
    CREATOR("Creator"),
    
    SITEADMINISTRATORCREATOR("SiteAdministratorCreator");

    private String value;

    SiteRoleEnum(String value) {
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
    public static SiteRoleEnum fromValue(String value) {
      for (SiteRoleEnum b : SiteRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SiteRoleEnum siteRole;

  /**
   * Default constructor
   * @deprecated Use {@link GetUserSiteRoleResponseDTO#GetUserSiteRoleResponseDTO(UUID, SiteRoleEnum)}
   */
  @Deprecated
  public GetUserSiteRoleResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUserSiteRoleResponseDTO(UUID siteId, SiteRoleEnum siteRole) {
    this.siteId = siteId;
    this.siteRole = siteRole;
  }

  public GetUserSiteRoleResponseDTO idpConfigurationId(String idpConfigurationId) {
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

  public GetUserSiteRoleResponseDTO idpType(IdpTypeEnum idpType) {
    this.idpType = idpType;
    return this;
  }

  /**
   * Get idpType
   * @return idpType
  */
  
  @Schema(name = "idpType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpType")
  public IdpTypeEnum getIdpType() {
    return idpType;
  }

  public void setIdpType(IdpTypeEnum idpType) {
    this.idpType = idpType;
  }

  public GetUserSiteRoleResponseDTO serverSiteUserId(String serverSiteUserId) {
    this.serverSiteUserId = serverSiteUserId;
    return this;
  }

  /**
   * Get serverSiteUserId
   * @return serverSiteUserId
  */
  
  @Schema(name = "serverSiteUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverSiteUserId")
  public String getServerSiteUserId() {
    return serverSiteUserId;
  }

  public void setServerSiteUserId(String serverSiteUserId) {
    this.serverSiteUserId = serverSiteUserId;
  }

  public GetUserSiteRoleResponseDTO siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  @NotNull @Valid 
  @Schema(name = "siteId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteId")
  public UUID getSiteId() {
    return siteId;
  }

  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  public GetUserSiteRoleResponseDTO siteRole(SiteRoleEnum siteRole) {
    this.siteRole = siteRole;
    return this;
  }

  /**
   * Get siteRole
   * @return siteRole
  */
  @NotNull 
  @Schema(name = "siteRole", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteRole")
  public SiteRoleEnum getSiteRole() {
    return siteRole;
  }

  public void setSiteRole(SiteRoleEnum siteRole) {
    this.siteRole = siteRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserSiteRoleResponseDTO getUserSiteRoleResponseDTO = (GetUserSiteRoleResponseDTO) o;
    return Objects.equals(this.idpConfigurationId, getUserSiteRoleResponseDTO.idpConfigurationId) &&
        Objects.equals(this.idpType, getUserSiteRoleResponseDTO.idpType) &&
        Objects.equals(this.serverSiteUserId, getUserSiteRoleResponseDTO.serverSiteUserId) &&
        Objects.equals(this.siteId, getUserSiteRoleResponseDTO.siteId) &&
        Objects.equals(this.siteRole, getUserSiteRoleResponseDTO.siteRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpConfigurationId, idpType, serverSiteUserId, siteId, siteRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserSiteRoleResponseDTO {\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    idpType: ").append(toIndentedString(idpType)).append("\n");
    sb.append("    serverSiteUserId: ").append(toIndentedString(serverSiteUserId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteRole: ").append(toIndentedString(siteRole)).append("\n");
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

