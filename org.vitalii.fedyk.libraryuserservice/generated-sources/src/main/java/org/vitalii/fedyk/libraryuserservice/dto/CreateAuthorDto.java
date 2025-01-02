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
import org.vitalii.fedyk.libraryuserservice.dto.FullNameDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateAuthorDto
 */
@JsonPropertyOrder({
  CreateAuthorDto.JSON_PROPERTY_FULL_NAME,
  CreateAuthorDto.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("CreateAuthor")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:36:24.503014+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CreateAuthorDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  @jakarta.annotation.Nonnull
  private FullNameDto fullName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @jakarta.annotation.Nullable
  private String description;

  public CreateAuthorDto() {
  }

  public CreateAuthorDto fullName(@jakarta.annotation.Nonnull FullNameDto fullName) {
    
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FullNameDto getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(@jakarta.annotation.Nonnull FullNameDto fullName) {
    this.fullName = fullName;
  }

  public CreateAuthorDto description(@jakarta.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthorDto createAuthor = (CreateAuthorDto) o;
    return Objects.equals(this.fullName, createAuthor.fullName) &&
        Objects.equals(this.description, createAuthor.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthorDto {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

