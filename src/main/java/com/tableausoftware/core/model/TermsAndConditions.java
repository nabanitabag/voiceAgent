package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Terms and Conditions block, which includes acceptedTandC (Bool), acceptedBy (UUID), and acceptedAt (Date).
 */

@Schema(name = "TermsAndConditions", description = "Terms and Conditions block, which includes acceptedTandC (Bool), acceptedBy (UUID), and acceptedAt (Date).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class TermsAndConditions {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime acceptedAt;

  private UUID acceptedBy;

  private Boolean acceptedTandC;

  public TermsAndConditions acceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  /**
   * Get acceptedAt
   * @return acceptedAt
  */
  @Valid 
  @Schema(name = "acceptedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptedAt")
  public OffsetDateTime getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public TermsAndConditions acceptedBy(UUID acceptedBy) {
    this.acceptedBy = acceptedBy;
    return this;
  }

  /**
   * Get acceptedBy
   * @return acceptedBy
  */
  @Valid 
  @Schema(name = "acceptedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptedBy")
  public UUID getAcceptedBy() {
    return acceptedBy;
  }

  public void setAcceptedBy(UUID acceptedBy) {
    this.acceptedBy = acceptedBy;
  }

  public TermsAndConditions acceptedTandC(Boolean acceptedTandC) {
    this.acceptedTandC = acceptedTandC;
    return this;
  }

  /**
   * Get acceptedTandC
   * @return acceptedTandC
  */
  
  @Schema(name = "acceptedTandC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptedTandC")
  public Boolean getAcceptedTandC() {
    return acceptedTandC;
  }

  public void setAcceptedTandC(Boolean acceptedTandC) {
    this.acceptedTandC = acceptedTandC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditions termsAndConditions = (TermsAndConditions) o;
    return Objects.equals(this.acceptedAt, termsAndConditions.acceptedAt) &&
        Objects.equals(this.acceptedBy, termsAndConditions.acceptedBy) &&
        Objects.equals(this.acceptedTandC, termsAndConditions.acceptedTandC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAt, acceptedBy, acceptedTandC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditions {\n");
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    acceptedBy: ").append(toIndentedString(acceptedBy)).append("\n");
    sb.append("    acceptedTandC: ").append(toIndentedString(acceptedTandC)).append("\n");
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

