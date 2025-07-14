package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * History of status changes that the bulk operation has undergone
 */

@Schema(name = "JobStatusChangeBO", description = "History of status changes that the bulk operation has undergone")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class JobStatusChangeBO {

  /**
   * Gets or Sets jobStatus
   */
  public enum JobStatusEnum {
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    POST_PROCESSING("POST_PROCESSING"),
    
    SUCCESSFUL("SUCCESSFUL"),
    
    FAILED("FAILED"),
    
    RETRY_REQUESTED("RETRY_REQUESTED"),
    
    SKIPPED("SKIPPED");

    private String value;

    JobStatusEnum(String value) {
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
    public static JobStatusEnum fromValue(String value) {
      for (JobStatusEnum b : JobStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private JobStatusEnum jobStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  public JobStatusChangeBO jobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  
  @Schema(name = "jobStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobStatus")
  public JobStatusEnum getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
  }

  public JobStatusChangeBO time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @Valid 
  @Schema(name = "time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatusChangeBO jobStatusChangeBO = (JobStatusChangeBO) o;
    return Objects.equals(this.jobStatus, jobStatusChangeBO.jobStatus) &&
        Objects.equals(this.time, jobStatusChangeBO.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStatus, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatusChangeBO {\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

