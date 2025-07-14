package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * The response object for errors
 */

@Schema(name = "CreateSiteErrorResponse", description = "The response object for errors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class CreateSiteErrorResponse {

  /**
   * errorCode
   */
  public enum ErrorCodeEnum {
    INVALID_PARAM("INVALID_PARAM"),
    
    INVALID_SITE_NAME("INVALID_SITE_NAME"),
    
    INVALID_SITE_CONTENT_URL("INVALID_SITE_CONTENT_URL"),
    
    SITE_LIMIT_REACHED("SITE_LIMIT_REACHED"),
    
    SITE_NAME_CONFLICT("SITE_NAME_CONFLICT"),
    
    SITE_CONTENT_URL_CONFLICT("SITE_CONTENT_URL_CONFLICT"),
    
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR");

    private String value;

    ErrorCodeEnum(String value) {
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
    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ErrorCodeEnum errorCode;

  private String message;

  /**
   * Default constructor
   * @deprecated Use {@link CreateSiteErrorResponse#CreateSiteErrorResponse(String)}
   */
  @Deprecated
  public CreateSiteErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSiteErrorResponse(String message) {
    this.message = message;
  }

  public CreateSiteErrorResponse errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * errorCode
   * @return errorCode
  */
  
  @Schema(name = "errorCode", description = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  public CreateSiteErrorResponse message(String message) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSiteErrorResponse createSiteErrorResponse = (CreateSiteErrorResponse) o;
    return Objects.equals(this.errorCode, createSiteErrorResponse.errorCode) &&
        Objects.equals(this.message, createSiteErrorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSiteErrorResponse {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

