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
 * added/updated siteRole
 */

@Schema(name = "UserSiteRoleResponseDTO", description = "added/updated siteRole")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserSiteRoleResponseDTO {

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
   * siteRoleStatus
   */
  public enum SiteRoleStatusEnum {
    ACTIVE("ACTIVE"),
    
    DELETED("DELETED"),
    
    SYNC_PENDING("SYNC_PENDING"),
    
    SYNC_IN_PROGRESS("SYNC_IN_PROGRESS");

    private String value;

    SiteRoleStatusEnum(String value) {
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
    public static SiteRoleStatusEnum fromValue(String value) {
      for (SiteRoleStatusEnum b : SiteRoleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SiteRoleStatusEnum siteRoleStatus;

  /**
   * Default constructor
   * @deprecated Use {@link UserSiteRoleResponseDTO#UserSiteRoleResponseDTO(UUID)}
   */
  @Deprecated
  public UserSiteRoleResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserSiteRoleResponseDTO(UUID siteId) {
    this.siteId = siteId;
  }

  public UserSiteRoleResponseDTO idp(IdpEnum idp) {
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

  public UserSiteRoleResponseDTO idpConfigurationId(String idpConfigurationId) {
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

  public UserSiteRoleResponseDTO notifyUser(Boolean notifyUser) {
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

  public UserSiteRoleResponseDTO siteId(UUID siteId) {
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

  public UserSiteRoleResponseDTO siteRole(SiteRoleEnum siteRole) {
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

  public UserSiteRoleResponseDTO siteRoleStatus(SiteRoleStatusEnum siteRoleStatus) {
    this.siteRoleStatus = siteRoleStatus;
    return this;
  }

  /**
   * siteRoleStatus
   * @return siteRoleStatus
  */
  
  @Schema(name = "siteRoleStatus", description = "siteRoleStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRoleStatus")
  public SiteRoleStatusEnum getSiteRoleStatus() {
    return siteRoleStatus;
  }

  public void setSiteRoleStatus(SiteRoleStatusEnum siteRoleStatus) {
    this.siteRoleStatus = siteRoleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSiteRoleResponseDTO userSiteRoleResponseDTO = (UserSiteRoleResponseDTO) o;
    return Objects.equals(this.idp, userSiteRoleResponseDTO.idp) &&
        Objects.equals(this.idpConfigurationId, userSiteRoleResponseDTO.idpConfigurationId) &&
        Objects.equals(this.notifyUser, userSiteRoleResponseDTO.notifyUser) &&
        Objects.equals(this.siteId, userSiteRoleResponseDTO.siteId) &&
        Objects.equals(this.siteRole, userSiteRoleResponseDTO.siteRole) &&
        Objects.equals(this.siteRoleStatus, userSiteRoleResponseDTO.siteRoleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idp, idpConfigurationId, notifyUser, siteId, siteRole, siteRoleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSiteRoleResponseDTO {\n");
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    idpConfigurationId: ").append(toIndentedString(idpConfigurationId)).append("\n");
    sb.append("    notifyUser: ").append(toIndentedString(notifyUser)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteRole: ").append(toIndentedString(siteRole)).append("\n");
    sb.append("    siteRoleStatus: ").append(toIndentedString(siteRoleStatus)).append("\n");
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

