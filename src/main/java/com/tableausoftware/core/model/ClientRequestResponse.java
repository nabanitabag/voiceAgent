package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The client information associated with the session.
 */

@Schema(name = "ClientRequestResponse", description = "The client information associated with the session.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ClientRequestResponse {

  @Valid
  private Map<String, List<Object>> clientInfo = new HashMap<>();

  private String email;

  private String idpId;

  private String tenantId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
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

  private String userId;

  private String userName;

  /**
   * Default constructor
   * @deprecated Use {@link ClientRequestResponse#ClientRequestResponse(String)}
   */
  @Deprecated
  public ClientRequestResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClientRequestResponse(String userName) {
    this.userName = userName;
  }

  public ClientRequestResponse clientInfo(Map<String, List<Object>> clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

  public ClientRequestResponse putClientInfoItem(String key, List<Object> clientInfoItem) {
    if (this.clientInfo == null) {
      this.clientInfo = new HashMap<>();
    }
    this.clientInfo.put(key, clientInfoItem);
    return this;
  }

  /**
   * Get clientInfo
   * @return clientInfo
  */
  @Valid 
  @Schema(name = "clientInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientInfo")
  public Map<String, List<Object>> getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(Map<String, List<Object>> clientInfo) {
    this.clientInfo = clientInfo;
  }

  public ClientRequestResponse email(String email) {
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

  public ClientRequestResponse idpId(String idpId) {
    this.idpId = idpId;
    return this;
  }

  /**
   * Get idpId
   * @return idpId
  */
  
  @Schema(name = "idpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpId")
  public String getIdpId() {
    return idpId;
  }

  public void setIdpId(String idpId) {
    this.idpId = idpId;
  }

  public ClientRequestResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  
  @Schema(name = "tenantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ClientRequestResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ClientRequestResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ClientRequestResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ClientRequestResponse clientRequestResponse = (ClientRequestResponse) o;
    return Objects.equals(this.clientInfo, clientRequestResponse.clientInfo) &&
        Objects.equals(this.email, clientRequestResponse.email) &&
        Objects.equals(this.idpId, clientRequestResponse.idpId) &&
        Objects.equals(this.tenantId, clientRequestResponse.tenantId) &&
        Objects.equals(this.type, clientRequestResponse.type) &&
        Objects.equals(this.userId, clientRequestResponse.userId) &&
        Objects.equals(this.userName, clientRequestResponse.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientInfo, email, idpId, tenantId, type, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRequestResponse {\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

