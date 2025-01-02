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
import java.time.LocalDate;
import org.vitalii.fedyk.libraryuserservice.dto.FullNameDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReadUserDto
 */
@JsonPropertyOrder({
  ReadUserDto.JSON_PROPERTY_ID,
  ReadUserDto.JSON_PROPERTY_FULL_NAME,
  ReadUserDto.JSON_PROPERTY_EMAIL,
  ReadUserDto.JSON_PROPERTY_BIRTHDAY
})
@JsonTypeName("ReadUser")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ReadUserDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  @jakarta.annotation.Nullable
  private FullNameDto fullName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_BIRTHDAY = "birthday";
  @jakarta.annotation.Nullable
  private LocalDate birthday;

  public ReadUserDto() {
  }

  public ReadUserDto id(@jakarta.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * minimum: 1
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable Long id) {
    this.id = id;
  }

  public ReadUserDto fullName(@jakarta.annotation.Nullable FullNameDto fullName) {
    
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullNameDto getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(@jakarta.annotation.Nullable FullNameDto fullName) {
    this.fullName = fullName;
  }

  public ReadUserDto email(@jakarta.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@jakarta.annotation.Nullable String email) {
    this.email = email;
  }

  public ReadUserDto birthday(@jakarta.annotation.Nullable LocalDate birthday) {
    
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIRTHDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getBirthday() {
    return birthday;
  }


  @JsonProperty(JSON_PROPERTY_BIRTHDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthday(@jakarta.annotation.Nullable LocalDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadUserDto readUser = (ReadUserDto) o;
    return Objects.equals(this.id, readUser.id) &&
        Objects.equals(this.fullName, readUser.fullName) &&
        Objects.equals(this.email, readUser.email) &&
        Objects.equals(this.birthday, readUser.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, email, birthday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadUserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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
