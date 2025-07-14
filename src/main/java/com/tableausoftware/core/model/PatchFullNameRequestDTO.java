package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * PatchFullNameRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PatchFullNameRequestDTO {

  private String fullName;

  /**
   * Default constructor
   * @deprecated Use {@link PatchFullNameRequestDTO#PatchFullNameRequestDTO(String)}
   */
  @Deprecated
  public PatchFullNameRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PatchFullNameRequestDTO(String fullName) {
    this.fullName = fullName;
  }

  public PatchFullNameRequestDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * fullName of the user
   * @return fullName
  */
  @NotNull 
  @Schema(name = "fullName", description = "fullName of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchFullNameRequestDTO patchFullNameRequestDTO = (PatchFullNameRequestDTO) o;
    return Objects.equals(this.fullName, patchFullNameRequestDTO.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchFullNameRequestDTO {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

