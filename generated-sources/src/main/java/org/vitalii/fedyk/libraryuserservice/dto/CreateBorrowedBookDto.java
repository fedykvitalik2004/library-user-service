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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateBorrowedBookDto
 */
@JsonPropertyOrder({
  CreateBorrowedBookDto.JSON_PROPERTY_BOOK_ID,
  CreateBorrowedBookDto.JSON_PROPERTY_USER_ID,
  CreateBorrowedBookDto.JSON_PROPERTY_RETURN_DATE
})
@JsonTypeName("CreateBorrowedBook")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CreateBorrowedBookDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BOOK_ID = "bookId";
  @jakarta.annotation.Nonnull
  private Long bookId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @jakarta.annotation.Nonnull
  private Long userId;

  public static final String JSON_PROPERTY_RETURN_DATE = "returnDate";
  @jakarta.annotation.Nonnull
  private OffsetDateTime returnDate;

  public CreateBorrowedBookDto() {
  }

  public CreateBorrowedBookDto bookId(@jakarta.annotation.Nonnull Long bookId) {
    
    this.bookId = bookId;
    return this;
  }

  /**
   * Get bookId
   * minimum: 1
   * @return bookId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BOOK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getBookId() {
    return bookId;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBookId(@jakarta.annotation.Nonnull Long bookId) {
    this.bookId = bookId;
  }

  public CreateBorrowedBookDto userId(@jakarta.annotation.Nonnull Long userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * minimum: 1
   * @return userId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@jakarta.annotation.Nonnull Long userId) {
    this.userId = userId;
  }

  public CreateBorrowedBookDto returnDate(@jakarta.annotation.Nonnull OffsetDateTime returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

  /**
   * The date when the book should be returned. Must be in the future.
   * @return returnDate
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RETURN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getReturnDate() {
    return returnDate;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReturnDate(@jakarta.annotation.Nonnull OffsetDateTime returnDate) {
    this.returnDate = returnDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBorrowedBookDto createBorrowedBook = (CreateBorrowedBookDto) o;
    return Objects.equals(this.bookId, createBorrowedBook.bookId) &&
        Objects.equals(this.userId, createBorrowedBook.userId) &&
        Objects.equals(this.returnDate, createBorrowedBook.returnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, userId, returnDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBorrowedBookDto {\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
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

