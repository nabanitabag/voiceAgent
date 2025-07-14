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
 * Site role of the user
 */

@Schema(name = "PatchUserSiteRoleDTO", description = "Site role of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PatchUserSiteRoleDTO {

  /**
   * IDP configured for particular site
   */
  public enum IdpEnum {
    SAML("SAML"),
    
    OPENID("OpenID"),
    
    TABLEAUIDWITHMFA("TableauIDWithMFA"),
    
    DEFAULT("DEFAULT");

    private String value;

    IdpEnum(String value) {
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
    public static IdpEnum fromValue(String value) {
      for (IdpEnum b : IdpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdpEnum idp;

  private String idpConfigurationId;

  private Boolean notifyUser;

  private UUID siteId;

  /**
   * operation in siteRole to perform
   */
  public enum SiteOpEnum {
    ADD_SITE_ROLE("ADD_SITE_ROLE"),
    
    UPDATE_SITE_ROLE("UPDATE_SITE_ROLE"),
    
    DELETE_SITE_ROLE("DELETE_SITE_ROLE");

    private String value;

    SiteOpEnum(String value) {
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
    public static SiteOpEnum fromValue(String value) {
      for (SiteOpEnum b : SiteOpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SiteOpEnum siteOp;

  /**
   * Site role of the user in particular site
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
   * @deprecated Use {@link PatchUserSiteRoleDTO#PatchUserSiteRoleDTO(UUID, SiteOpEnum)}
   */
  @Deprecated
  public PatchUserSiteRoleDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PatchUserSiteRoleDTO(UUID siteId, SiteOpEnum siteOp) {
    this.siteId = siteId;
    this.siteOp = siteOp;
  }

  public PatchUserSiteRoleDTO idp(IdpEnum idp) {
    this.idp = idp;
    return this;
  }

  /**
   * IDP configured for particular site
   * @return idp
  */
  
  @Schema(name = "idp", description = "IDP configured for particular site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idp")
  public IdpEnum getIdp() {
    return idp;
  }

  public void setIdp(IdpEnum idp) {
    this.idp = idp;
  }

  public PatchUserSiteRoleDTO idpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
    return this;
  }

  /**
   * Identifier of a given idp configuration
   * @return idpConfigurationId
  */
  
  @Schema(name = "idpConfigurationId", description = "Identifier of a given idp configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpConfigurationId")
  public String getIdpConfigurationId() {
    return idpConfigurationId;
  }

  public void setIdpConfigurationId(String idpConfigurationId) {
    this.idpConfigurationId = idpConfigurationId;
  }

  public PatchUserSiteRoleDTO notifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
    return this;
  }

  /**
   * flag to notify user for sending email for site ops defaults to true
   * @return notifyUser
  */
  
  @Schema(name = "notifyUser", description = "flag to notify user for sending email for site ops defaults to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyUser")
  public Boolean getNotifyUser() {
    return notifyUser;
  }

  public void setNotifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
  }

  public PatchUserSiteRoleDTO siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Site Id to which the role belongs
   * @return siteId
  */
  @NotNull @Valid 
  @Schema(name = "siteId", description = "Site Id to which the role belongs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteId")
  public UUID getSiteId() {
    return siteId;
  }

  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  public PatchUserSiteRoleDTO siteOp(SiteOpEnum siteOp) {
    this.siteOp = siteOp;
    return this;
  }

  /**
   * operation in siteRole to perform
   * @return siteOp
  */
  @NotNull 
  @Schema(name = "siteOp", description = "operation in siteRole to perform", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("siteOp")
  public SiteOpEnum getSiteOp() {
    return siteOp;
  }

  public void setSiteOp(SiteOpEnum siteOp) {
    this.siteOp = siteOp;
  }

  public PatchUserSiteRoleDTO siteRole(SiteRoleEnum siteRole) {
    this.siteRole = siteRole;
    return this;
  }

  /**
   * Site role of the user in particular site
   * @return siteRole
  */
  
  @Schema(name = "siteRole", description = "Site role of the user in particular site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PatchUserSiteRoleDTO patchUserSiteRoleDTO = (PatchUserSiteRoleDTO) o;
    return Objects.equals(this.idp, patchUserSiteRoleDTO.idp) &&
        Objects.equals(this.idpConfigurationId, patchUserSiteRoleDTO.idpConfigurationId) &&
        Objects.equals(this.notifyUser, patchUserSiteRoleDTO.notifyUser) &&
        Objects.equals(this.siteId, patchUserSiteRoleDTO.siteId) &&
        Objects.equals(this.siteOp, patchUserSiteRoleDTO.siteOp) &&
        Objects.equals(this.siteRole, patchUserSiteRoleDTO.siteRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idp, idpConfigurationId, notifyUser, siteId, siteOp, siteRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserSiteRoleDTO {\n");
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    notifyUser: ").append(toIndentedString(notifyUser)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteOp: ").append(toIndentedString(siteOp)).append("\n");
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

