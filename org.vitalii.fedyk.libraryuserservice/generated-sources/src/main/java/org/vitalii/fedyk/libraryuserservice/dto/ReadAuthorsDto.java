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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.vitalii.fedyk.libraryuserservice.dto.PaginationDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadAuthorDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReadAuthorsDto
 */
@JsonPropertyOrder({
  ReadAuthorsDto.JSON_PROPERTY_AUTHORS,
  ReadAuthorsDto.JSON_PROPERTY_PAGINATION
})
@JsonTypeName("ReadAuthors")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:36:24.503014+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ReadAuthorsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTHORS = "authors";
  @jakarta.annotation.Nullable
  private List<ReadAuthorDto> authors = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  @jakarta.annotation.Nullable
  private PaginationDto pagination;

  public ReadAuthorsDto() {
  }

  public ReadAuthorsDto authors(@jakarta.annotation.Nullable List<ReadAuthorDto> authors) {
    
    this.authors = authors;
    return this;
  }

  public ReadAuthorsDto addAuthorsItem(ReadAuthorDto authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    return this;
  }

  /**
   * Get authors
   * @return authors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReadAuthorDto> getAuthors() {
    return authors;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthors(@jakarta.annotation.Nullable List<ReadAuthorDto> authors) {
    this.authors = authors;
  }

  public ReadAuthorsDto pagination(@jakarta.annotation.Nullable PaginationDto pagination) {
    
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationDto getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(@jakarta.annotation.Nullable PaginationDto pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAuthorsDto readAuthors = (ReadAuthorsDto) o;
    return Objects.equals(this.authors, readAuthors.authors) &&
        Objects.equals(this.pagination, readAuthors.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAuthorsDto {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

