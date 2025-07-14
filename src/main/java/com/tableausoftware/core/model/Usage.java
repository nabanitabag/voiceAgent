package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Usage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class Usage {

  private Integer numCreators;

  private Integer numExplorers;

  private Integer numUsers;

  private Integer numViewers;

  private Integer storage;

  public Usage numCreators(Integer numCreators) {
    this.numCreators = numCreators;
    return this;
  }

  /**
   * Get numCreators
   * @return numCreators
  */
  
  @Schema(name = "numCreators", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numCreators")
  public Integer getNumCreators() {
    return numCreators;
  }

  public void setNumCreators(Integer numCreators) {
    this.numCreators = numCreators;
  }

  public Usage numExplorers(Integer numExplorers) {
    this.numExplorers = numExplorers;
    return this;
  }

  /**
   * Get numExplorers
   * @return numExplorers
  */
  
  @Schema(name = "numExplorers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numExplorers")
  public Integer getNumExplorers() {
    return numExplorers;
  }

  public void setNumExplorers(Integer numExplorers) {
    this.numExplorers = numExplorers;
  }

  public Usage numUsers(Integer numUsers) {
    this.numUsers = numUsers;
    return this;
  }

  /**
   * Get numUsers
   * @return numUsers
  */
  
  @Schema(name = "numUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numUsers")
  public Integer getNumUsers() {
    return numUsers;
  }

  public void setNumUsers(Integer numUsers) {
    this.numUsers = numUsers;
  }

  public Usage numViewers(Integer numViewers) {
    this.numViewers = numViewers;
    return this;
  }

  /**
   * Get numViewers
   * @return numViewers
  */
  
  @Schema(name = "numViewers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numViewers")
  public Integer getNumViewers() {
    return numViewers;
  }

  public void setNumViewers(Integer numViewers) {
    this.numViewers = numViewers;
  }

  public Usage storage(Integer storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Get storage
   * @return storage
  */
  
  @Schema(name = "storage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storage")
  public Integer getStorage() {
    return storage;
  }

  public void setStorage(Integer storage) {
    this.storage = storage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usage usage = (Usage) o;
    return Objects.equals(this.numCreators, usage.numCreators) &&
        Objects.equals(this.numExplorers, usage.numExplorers) &&
        Objects.equals(this.numUsers, usage.numUsers) &&
        Objects.equals(this.numViewers, usage.numViewers) &&
        Objects.equals(this.storage, usage.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numCreators, numExplorers, numUsers, numViewers, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usage {\n");
    sb.append("    numCreators: ").append(toIndentedString(numCreators)).append("\n");
    sb.append("    numExplorers: ").append(toIndentedString(numExplorers)).append("\n");
    sb.append("    numUsers: ").append(toIndentedString(numUsers)).append("\n");
    sb.append("    numViewers: ").append(toIndentedString(numViewers)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

