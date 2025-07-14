package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.*;

/**
 * UserLoginRequestResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserLoginRequestResponse {

  @Valid
  private Map<String, List<Object>> clientInfo = new HashMap<>();

  private String email;

  private String idpId;

  private UUID tenantId;

  /**
   * type of client making the request
   */
  public enum TypeEnum {
    SERVICE("Service"),
    
    USER("User");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String userName;

  /**
   * Default constructor
   * @deprecated Use {@link UserLoginRequestResponse#UserLoginRequestResponse(String)}
   */
  @Deprecated
  public UserLoginRequestResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserLoginRequestResponse(String userName) {
    this.userName = userName;
  }

  public UserLoginRequestResponse clientInfo(Map<String, List<Object>> clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

  public UserLoginRequestResponse putClientInfoItem(String key, List<Object> clientInfoItem) {
    if (this.clientInfo == null) {
      this.clientInfo = new HashMap<>();
    }
    this.clientInfo.put(key, clientInfoItem);
    return this;
  }

  /**
   * parameters given by IDP
   * @return clientInfo
  */
  @Valid 
  @Schema(name = "clientInfo", description = "parameters given by IDP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientInfo")
  public Map<String, List<Object>> getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(Map<String, List<Object>> clientInfo) {
    this.clientInfo = clientInfo;
  }

  public UserLoginRequestResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email ID of the user
   * @return email
  */
  
  @Schema(name = "email", description = "email ID of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserLoginRequestResponse idpId(String idpId) {
    this.idpId = idpId;
    return this;
  }

  /**
   * UserId as configured in the IDP
   * @return idpId
  */
  @Size(max = 1000) 
  @Schema(name = "idpId", description = "UserId as configured in the IDP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpId")
  public String getIdpId() {
    return idpId;
  }

  public void setIdpId(String idpId) {
    this.idpId = idpId;
  }

  public UserLoginRequestResponse tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * unique ID of the tenant
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "unique ID of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public UserLoginRequestResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * type of client making the request
   * @return type
  */
  
  @Schema(name = "type", description = "type of client making the request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UserLoginRequestResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * username as stored in the IDP
   * @return userName
  */
  @NotNull @Size(max = 1000) 
  @Schema(name = "userName", description = "username as stored in the IDP", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UserLoginRequestResponse userLoginRequestResponse = (UserLoginRequestResponse) o;
    return Objects.equals(this.clientInfo, userLoginRequestResponse.clientInfo) &&
        Objects.equals(this.email, userLoginRequestResponse.email) &&
        Objects.equals(this.idpId, userLoginRequestResponse.idpId) &&
        Objects.equals(this.tenantId, userLoginRequestResponse.tenantId) &&
        Objects.equals(this.type, userLoginRequestResponse.type) &&
        Objects.equals(this.userName, userLoginRequestResponse.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientInfo, email, idpId, tenantId, type, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginRequestResponse {\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

