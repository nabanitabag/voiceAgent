package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * UserIdsRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserIdsRequestDTO {

  @Valid
  private Set<UUID> userIds = new LinkedHashSet<>();

  /**
   * Default constructor
   * @deprecated Use {@link UserIdsRequestDTO#UserIdsRequestDTO(Set<UUID>)}
   */
  @Deprecated
  public UserIdsRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserIdsRequestDTO(Set<UUID> userIds) {
    this.userIds = userIds;
  }

  public UserIdsRequestDTO userIds(Set<UUID> userIds) {
    this.userIds = userIds;
    return this;
  }

  public UserIdsRequestDTO addUserIdsItem(UUID userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new LinkedHashSet<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * list of userIds to fetch user details of
   * @return userIds
  */
  @NotNull @Valid 
  @Schema(name = "userIds", description = "list of userIds to fetch user details of", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userIds")
  public Set<UUID> getUserIds() {
    return userIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUserIds(Set<UUID> userIds) {
    this.userIds = userIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdsRequestDTO userIdsRequestDTO = (UserIdsRequestDTO) o;
    return Objects.equals(this.userIds, userIdsRequestDTO.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdsRequestDTO {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

