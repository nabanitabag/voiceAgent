package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * The response object for errors
 */

@Schema(name = "ApiErrorResponse", description = "The response object for errors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class ApiErrorResponse {

  private String errorCode;

  private String message;

  private String reason;

  /**
   * Default constructor
   * @deprecated Use {@link ApiErrorResponse#ApiErrorResponse(String)}
   */
  @Deprecated
  public ApiErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiErrorResponse(String message) {
    this.message = message;
  }

  public ApiErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * errorCode
   * @return errorCode
  */
  
  @Schema(name = "errorCode", description = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ApiErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * error message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiErrorResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason
   * @return reason
  */
  
  @Schema(name = "reason", description = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorResponse apiErrorResponse = (ApiErrorResponse) o;
    return Objects.equals(this.errorCode, apiErrorResponse.errorCode) &&
        Objects.equals(this.message, apiErrorResponse.message) &&
        Objects.equals(this.reason, apiErrorResponse.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorResponse {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

