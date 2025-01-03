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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaginationDto
 */
@JsonPropertyOrder({
  PaginationDto.JSON_PROPERTY_PAGE_NUMBER,
  PaginationDto.JSON_PROPERTY_PAGE_SIZE,
  PaginationDto.JSON_PROPERTY_TOTAL_NUMBER_OF_PAGES
})
@JsonTypeName("Pagination")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class PaginationDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
  @jakarta.annotation.Nullable
  private Integer pageNumber;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  @jakarta.annotation.Nullable
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_PAGES = "totalNumberOfPages";
  @jakarta.annotation.Nullable
  private Integer totalNumberOfPages;

  public PaginationDto() {
  }

  public PaginationDto pageNumber(@jakarta.annotation.Nullable Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * minimum: 0
   * @return pageNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(@jakarta.annotation.Nullable Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PaginationDto pageSize(@jakarta.annotation.Nullable Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * minimum: 1
   * maximum: 100
   * @return pageSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(@jakarta.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PaginationDto totalNumberOfPages(@jakarta.annotation.Nullable Integer totalNumberOfPages) {
    
    this.totalNumberOfPages = totalNumberOfPages;
    return this;
  }

  /**
   * Get totalNumberOfPages
   * minimum: 0
   * @return totalNumberOfPages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumberOfPages() {
    return totalNumberOfPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumberOfPages(@jakarta.annotation.Nullable Integer totalNumberOfPages) {
    this.totalNumberOfPages = totalNumberOfPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationDto pagination = (PaginationDto) o;
    return Objects.equals(this.pageNumber, pagination.pageNumber) &&
        Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.totalNumberOfPages, pagination.totalNumberOfPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalNumberOfPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationDto {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumberOfPages: ").append(toIndentedString(totalNumberOfPages)).append("\n");
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

