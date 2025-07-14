package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * EmbeddingSettingsType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class EmbeddingSettingsType {

  private String allowList;

  private Boolean unrestrictedEmbedding;

  public EmbeddingSettingsType allowList(String allowList) {
    this.allowList = allowList;
    return this;
  }

  /**
   * Get allowList
   * @return allowList
  */
  
  @Schema(name = "allowList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowList")
  public String getAllowList() {
    return allowList;
  }

  public void setAllowList(String allowList) {
    this.allowList = allowList;
  }

  public EmbeddingSettingsType unrestrictedEmbedding(Boolean unrestrictedEmbedding) {
    this.unrestrictedEmbedding = unrestrictedEmbedding;
    return this;
  }

  /**
   * Get unrestrictedEmbedding
   * @return unrestrictedEmbedding
  */
  
  @Schema(name = "unrestrictedEmbedding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unrestrictedEmbedding")
  public Boolean getUnrestrictedEmbedding() {
    return unrestrictedEmbedding;
  }

  public void setUnrestrictedEmbedding(Boolean unrestrictedEmbedding) {
    this.unrestrictedEmbedding = unrestrictedEmbedding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddingSettingsType embeddingSettingsType = (EmbeddingSettingsType) o;
    return Objects.equals(this.allowList, embeddingSettingsType.allowList) &&
        Objects.equals(this.unrestrictedEmbedding, embeddingSettingsType.unrestrictedEmbedding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowList, unrestrictedEmbedding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddingSettingsType {\n");
    sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
    sb.append("    unrestrictedEmbedding: ").append(toIndentedString(unrestrictedEmbedding)).append("\n");
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

