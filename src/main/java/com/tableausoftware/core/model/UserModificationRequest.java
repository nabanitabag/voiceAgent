package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.PatchUserLinkRoleDTO;
import com.tableausoftware.core.model.PatchUserSiteRoleDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * list of users to be modified
 */

@Schema(name = "UserModificationRequest", description = "list of users to be modified")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserModificationRequest {

  private String email;

  @Valid
  private List<@Valid PatchUserLinkRoleDTO> linkRoles;

  @Valid
  private List<@Valid PatchUserSiteRoleDTO> siteRoles;

  private UUID userId;

  private String userName;

  /**
   * Default constructor
   * @deprecated Use {@link UserModificationRequest#UserModificationRequest(UUID)}
   */
  @Deprecated
  public UserModificationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserModificationRequest(UUID userId) {
    this.userId = userId;
  }

  public UserModificationRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserModificationRequest linkRoles(List<@Valid PatchUserLinkRoleDTO> linkRoles) {
    this.linkRoles = linkRoles;
    return this;
  }

  public UserModificationRequest addLinkRolesItem(PatchUserLinkRoleDTO linkRolesItem) {
    if (this.linkRoles == null) {
      this.linkRoles = new ArrayList<>();
    }
    this.linkRoles.add(linkRolesItem);
    return this;
  }

  /**
   * List of link roles of the user to be updated
   * @return linkRoles
  */
  @Valid 
  @Schema(name = "linkRoles", description = "List of link roles of the user to be updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkRoles")
  public List<@Valid PatchUserLinkRoleDTO> getLinkRoles() {
    return linkRoles;
  }

  public void setLinkRoles(List<@Valid PatchUserLinkRoleDTO> linkRoles) {
    this.linkRoles = linkRoles;
  }

  public UserModificationRequest siteRoles(List<@Valid PatchUserSiteRoleDTO> siteRoles) {
    this.siteRoles = siteRoles;
    return this;
  }

  public UserModificationRequest addSiteRolesItem(PatchUserSiteRoleDTO siteRolesItem) {
    if (this.siteRoles == null) {
      this.siteRoles = new ArrayList<>();
    }
    this.siteRoles.add(siteRolesItem);
    return this;
  }

  /**
   * List of site roles of the user to be updated
   * @return siteRoles
  */
  @Valid 
  @Schema(name = "siteRoles", description = "List of site roles of the user to be updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRoles")
  public List<@Valid PatchUserSiteRoleDTO> getSiteRoles() {
    return siteRoles;
  }

  public void setSiteRoles(List<@Valid PatchUserSiteRoleDTO> siteRoles) {
    this.siteRoles = siteRoles;
  }

  public UserModificationRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * unique id of the user
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", description = "unique id of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public UserModificationRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * userName of the user
   * @return userName
  */
  
  @Schema(name = "userName", description = "userName of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModificationRequest userModificationRequest = (UserModificationRequest) o;
    return Objects.equals(this.email, userModificationRequest.email) &&
        Objects.equals(this.linkRoles, userModificationRequest.linkRoles) &&
        Objects.equals(this.siteRoles, userModificationRequest.siteRoles) &&
        Objects.equals(this.userId, userModificationRequest.userId) &&
        Objects.equals(this.userName, userModificationRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, linkRoles, siteRoles, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModificationRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    linkRoles: ").append(toIndentedString(linkRoles)).append("\n");
    sb.append("    siteRoles: ").append(toIndentedString(siteRoles)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

