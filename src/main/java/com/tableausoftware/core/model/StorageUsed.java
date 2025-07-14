package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * StorageUsed
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class StorageUsed {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastRetrieved;

  private Long usage;

  public StorageUsed lastRetrieved(OffsetDateTime lastRetrieved) {
    this.lastRetrieved = lastRetrieved;
    return this;
  }

  /**
   * Date and time when the storage was last retrieved.
   * @return lastRetrieved
  */
  @Valid 
  @Schema(name = "lastRetrieved", description = "Date and time when the storage was last retrieved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastRetrieved")
  public OffsetDateTime getLastRetrieved() {
    return lastRetrieved;
  }

  public void setLastRetrieved(OffsetDateTime lastRetrieved) {
    this.lastRetrieved = lastRetrieved;
  }

  public StorageUsed usage(Long usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Storage used by the site in MB.
   * @return usage
  */
  
  @Schema(name = "usage", description = "Storage used by the site in MB.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public Long getUsage() {
    return usage;
  }

  public void setUsage(Long usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUsed storageUsed = (StorageUsed) o;
    return Objects.equals(this.lastRetrieved, storageUsed.lastRetrieved) &&
        Objects.equals(this.usage, storageUsed.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRetrieved, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUsed {\n");
    sb.append("    lastRetrieved: ").append(toIndentedString(lastRetrieved)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

