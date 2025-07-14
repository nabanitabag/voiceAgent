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
 * Link roles of the user
 */

@Schema(name = "GetUserLinkRoleResponseDTO", description = "Link roles of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GetUserLinkRoleResponseDTO {

  private String idpType;

  private UUID linkId;

  /**
   * Gets or Sets linkRole
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

  /**
   * Gets or Sets linkRoleStatus
   */
  public enum LinkRoleStatusEnum {
    INVITED("INVITED"),
    
    ACTIVE("ACTIVE"),
    
    EXPIRED("EXPIRED"),
    
    DELETED("DELETED");

    private String value;

    LinkRoleStatusEnum(String value) {
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
    public static LinkRoleStatusEnum fromValue(String value) {
      for (LinkRoleStatusEnum b : LinkRoleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LinkRoleStatusEnum linkRoleStatus;

  /**
   * Default constructor
   * @deprecated Use {@link GetUserLinkRoleResponseDTO#GetUserLinkRoleResponseDTO(UUID, LinkRoleEnum, LinkRoleStatusEnum)}
   */
  @Deprecated
  public GetUserLinkRoleResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUserLinkRoleResponseDTO(UUID linkId, LinkRoleEnum linkRole, LinkRoleStatusEnum linkRoleStatus) {
    this.linkId = linkId;
    this.linkRole = linkRole;
    this.linkRoleStatus = linkRoleStatus;
  }

  public GetUserLinkRoleResponseDTO idpType(String idpType) {
    this.idpType = idpType;
    return this;
  }

  /**
   * Get idpType
   * @return idpType
  */
  
  @Schema(name = "idpType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpType")
  public String getIdpType() {
    return idpType;
  }

  public void setIdpType(String idpType) {
    this.idpType = idpType;
  }

  public GetUserLinkRoleResponseDTO linkId(UUID linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * Get linkId
   * @return linkId
  */
  @NotNull @Valid 
  @Schema(name = "linkId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkId")
  public UUID getLinkId() {
    return linkId;
  }

  public void setLinkId(UUID linkId) {
    this.linkId = linkId;
  }

  public GetUserLinkRoleResponseDTO linkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
    return this;
  }

  /**
   * Get linkRole
   * @return linkRole
  */
  @NotNull 
  @Schema(name = "linkRole", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkRole")
  public LinkRoleEnum getLinkRole() {
    return linkRole;
  }

  public void setLinkRole(LinkRoleEnum linkRole) {
    this.linkRole = linkRole;
  }

  public GetUserLinkRoleResponseDTO linkRoleStatus(LinkRoleStatusEnum linkRoleStatus) {
    this.linkRoleStatus = linkRoleStatus;
    return this;
  }

  /**
   * Get linkRoleStatus
   * @return linkRoleStatus
  */
  @NotNull 
  @Schema(name = "linkRoleStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linkRoleStatus")
  public LinkRoleStatusEnum getLinkRoleStatus() {
    return linkRoleStatus;
  }

  public void setLinkRoleStatus(LinkRoleStatusEnum linkRoleStatus) {
    this.linkRoleStatus = linkRoleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserLinkRoleResponseDTO getUserLinkRoleResponseDTO = (GetUserLinkRoleResponseDTO) o;
    return Objects.equals(this.idpType, getUserLinkRoleResponseDTO.idpType) &&
        Objects.equals(this.linkId, getUserLinkRoleResponseDTO.linkId) &&
        Objects.equals(this.linkRole, getUserLinkRoleResponseDTO.linkRole) &&
        Objects.equals(this.linkRoleStatus, getUserLinkRoleResponseDTO.linkRoleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpType, linkId, linkRole, linkRoleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserLinkRoleResponseDTO {\n");
    sb.append("    idpType: ").append(toIndentedString(idpType)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkRole: ").append(toIndentedString(linkRole)).append("\n");
    sb.append("    linkRoleStatus: ").append(toIndentedString(linkRoleStatus)).append("\n");
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

