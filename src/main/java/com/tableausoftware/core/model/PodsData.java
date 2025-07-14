package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.PodData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PodsData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class PodsData {

  @Valid
  private List<@Valid PodData> pods;

  public PodsData pods(List<@Valid PodData> pods) {
    this.pods = pods;
    return this;
  }

  public PodsData addPodsItem(PodData podsItem) {
    if (this.pods == null) {
      this.pods = new ArrayList<>();
    }
    this.pods.add(podsItem);
    return this;
  }

  /**
   * Get pods
   * @return pods
  */
  @Valid 
  @Schema(name = "pods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pods")
  public List<@Valid PodData> getPods() {
    return pods;
  }

  public void setPods(List<@Valid PodData> pods) {
    this.pods = pods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodsData podsData = (PodsData) o;
    return Objects.equals(this.pods, podsData.pods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodsData {\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
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

