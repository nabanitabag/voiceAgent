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
 * Link role of the user
 */

@Schema(name = "PatchUserLinkRoleDTO", description = "Link role of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PatchUserLinkRoleDTO {

  /**
   * IDP configured for particular link
   */
  public enum IdpEnum {
    SAML("SAML"),
    
    OPENID("OpenID"),
    
    TABLEAUIDWITHMFA("TableauIDWithMFA");

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

  private UUID linkId;

  /**
   * operation in linkRole to perform
   */
  public enum LinkOpEnum {
    ADD_LINK_ROLE("ADD_LINK_ROLE"),
    
    UPDATE_LINK_ROLE("UPDATE_LINK_ROLE"),
    
    DELETE_LINK_ROLE("DELETE_LINK_ROLE");

    private String value;

    LinkOpEnum(String value) {
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
    public static LinkOpEnum fromValue(String value) {
      for (LinkOpEnum b : LinkOpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LinkOpEnum linkOp;

  /**
   * link role of the user in particular link
   */
  public enum LinkRoleEnum {
    LINK_ADMIN("LINK_ADMIN");

    private String value;

    LinkRoleEnum(String value) {
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
    public static LinkRoleEnum fromValue(String value) {
      for (LinkRoleEnum b : LinkRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LinkRoleEnum linkRole;

  private Boolean notifyUser;

  /**
   * Default constructor
   * @deprecated Use {@link PatchUserLinkRoleDTO#PatchUserLinkRoleDTO(UUID, LinkOpEnum)}
   */
  @Deprecated
  public PatchUserLinkRoleDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PatchUserLinkRoleDTO(UUID linkId, LinkOpEnum linkOp) {
    this.linkId = linkId;
    this.linkOp = linkOp;
  }

  public PatchUserLinkRoleDTO idp(IdpEnum idp) {
    this.idp = idp;
    return this;
  }

  /**
   * IDP configured for particular link
   * @return idp
  */
  
  @Schema(name = "idp", description = "IDP configured for particular link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idp")
  public IdpEnum getIdp() {
    return idp;
  }

  public void setIdp(IdpEnum idp) {
    this.idp = idp;
  }

  public PatchUserLinkRoleDTO linkId(UUID linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * link Id to which the role belongs
   * @return linkId
  */
  @NotNull @Valid 
  @Schema(name = "linkId", description = "link Id to which the role belongs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkId")
  public UUID getLinkId() {
    return linkId;
  }

  public void setLinkId(UUID linkId) {
    this.linkId = linkId;
  }

  public PatchUserLinkRoleDTO linkOp(LinkOpEnum linkOp) {
    this.linkOp = linkOp;
    return this;
  }

  /**
   * operation in linkRole to perform
   * @return linkOp
  */
  @NotNull 
  @Schema(name = "linkOp", description = "operation in linkRole to perform", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkOp")
  public LinkOpEnum getLinkOp() {
    return linkOp;
  }

  public void setLinkOp(LinkOpEnum linkOp) {
    this.linkOp = linkOp;
  }

  public PatchUserLinkRoleDTO linkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
    return this;
  }

  /**
   * link role of the user in particular link
   * @return linkRole
  */
  
  @Schema(name = "linkRole", description = "link role of the user in particular link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkRole")
  public LinkRoleEnum getLinkRole() {
    return linkRole;
  }

  public void setLinkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
  }

  public PatchUserLinkRoleDTO notifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
    return this;
  }

  /**
   * flag to notify user for sending email for link ops
   * @return notifyUser
  */
  
  @Schema(name = "notifyUser", description = "flag to notify user for sending email for link ops", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyUser")
  public Boolean getNotifyUser() {
    return notifyUser;
  }

  public void setNotifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserLinkRoleDTO patchUserLinkRoleDTO = (PatchUserLinkRoleDTO) o;
    return Objects.equals(this.idp, patchUserLinkRoleDTO.idp) &&
        Objects.equals(this.linkId, patchUserLinkRoleDTO.linkId) &&
        Objects.equals(this.linkOp, patchUserLinkRoleDTO.linkOp) &&
        Objects.equals(this.linkRole, patchUserLinkRoleDTO.linkRole) &&
        Objects.equals(this.notifyUser, patchUserLinkRoleDTO.notifyUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idp, linkId, linkOp, linkRole, notifyUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserLinkRoleDTO {\n");
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkOp: ").append(toIndentedString(linkOp)).append("\n");
    sb.append("    linkRole: ").append(toIndentedString(linkRole)).append("\n");
    sb.append("    notifyUser: ").append(toIndentedString(notifyUser)).append("\n");
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

