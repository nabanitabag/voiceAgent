package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.UserResourcesInfoDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetHydratedUsersResponseDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class GetHydratedUsersResponseDTO {

  @Valid
  private List<@Valid UserResourcesInfoDTO> resources;

  private String userName;

  public GetHydratedUsersResponseDTO resources(List<@Valid UserResourcesInfoDTO> resources) {
    this.resources = resources;
    return this;
  }

  public GetHydratedUsersResponseDTO addResourcesItem(UserResourcesInfoDTO resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * resources associated with the user
   * @return resources
  */
  @Valid 
  @Schema(name = "resources", description = "resources associated with the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resources")
  public List<@Valid UserResourcesInfoDTO> getResources() {
    return resources;
  }

  public void setResources(List<@Valid UserResourcesInfoDTO> resources) {
    this.resources = resources;
  }

  public GetHydratedUsersResponseDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * user name of the user
   * @return userName
  */
  
  @Schema(name = "userName", description = "user name of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    GetHydratedUsersResponseDTO getHydratedUsersResponseDTO = (GetHydratedUsersResponseDTO) o;
    return Objects.equals(this.resources, getHydratedUsersResponseDTO.resources) &&
        Objects.equals(this.userName, getHydratedUsersResponseDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHydratedUsersResponseDTO {\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

