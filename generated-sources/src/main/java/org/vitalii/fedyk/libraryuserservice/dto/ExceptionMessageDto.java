/*
 * Library service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.vitalii.fedyk.libraryuserservice.dto;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ExceptionMessageDto
 */
@JsonPropertyOrder({
  ExceptionMessageDto.JSON_PROPERTY_MESSAGE,
  ExceptionMessageDto.JSON_PROPERTY_ADDITIONAL_INFO
})
@JsonTypeName("ExceptionMessage")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ExceptionMessageDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @jakarta.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @jakarta.annotation.Nullable
  private Map<String, Object> additionalInfo = new HashMap<>();

  public ExceptionMessageDto() {
  }

  public ExceptionMessageDto message(@jakarta.annotation.Nullable String message) {
    
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }

  public ExceptionMessageDto additionalInfo(@jakarta.annotation.Nullable Map<String, Object> additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  public ExceptionMessageDto putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional information related to the exception
   * @return additionalInfo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@jakarta.annotation.Nullable Map<String, Object> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionMessageDto exceptionMessage = (ExceptionMessageDto) o;
    return Objects.equals(this.message, exceptionMessage.message) &&
        Objects.equals(this.additionalInfo, exceptionMessage.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionMessageDto {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

