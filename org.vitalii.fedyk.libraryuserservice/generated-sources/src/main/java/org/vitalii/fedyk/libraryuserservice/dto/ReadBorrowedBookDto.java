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
import org.vitalii.fedyk.libraryuserservice.dto.ReadBookDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReadBorrowedBookDto
 */
@JsonPropertyOrder({
  ReadBorrowedBookDto.JSON_PROPERTY_BOOK,
  ReadBorrowedBookDto.JSON_PROPERTY_USER_ID,
  ReadBorrowedBookDto.JSON_PROPERTY_BORROW_DATE,
  ReadBorrowedBookDto.JSON_PROPERTY_RETURN_DATE
})
@JsonTypeName("ReadBorrowedBook")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:36:24.503014+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ReadBorrowedBookDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BOOK = "book";
  @jakarta.annotation.Nullable
  private ReadBookDto book;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @jakarta.annotation.Nullable
  private Long userId;

  public static final String JSON_PROPERTY_BORROW_DATE = "borrowDate";
  @jakarta.annotation.Nullable
  private OffsetDateTime borrowDate;

  public static final String JSON_PROPERTY_RETURN_DATE = "returnDate";
  @jakarta.annotation.Nullable
  private OffsetDateTime returnDate;

  public ReadBorrowedBookDto() {
  }

  public ReadBorrowedBookDto book(@jakarta.annotation.Nullable ReadBookDto book) {
    
    this.book = book;
    return this;
  }

  /**
   * Get book
   * @return book
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReadBookDto getBook() {
    return book;
  }


  @JsonProperty(JSON_PROPERTY_BOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBook(@jakarta.annotation.Nullable ReadBookDto book) {
    this.book = book;
  }

  public ReadBorrowedBookDto userId(@jakarta.annotation.Nullable Long userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * minimum: 1
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@jakarta.annotation.Nullable Long userId) {
    this.userId = userId;
  }

  public ReadBorrowedBookDto borrowDate(@jakarta.annotation.Nullable OffsetDateTime borrowDate) {
    
    this.borrowDate = borrowDate;
    return this;
  }

  /**
   * The date when the book was borrowed.
   * @return borrowDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORROW_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getBorrowDate() {
    return borrowDate;
  }


  @JsonProperty(JSON_PROPERTY_BORROW_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorrowDate(@jakarta.annotation.Nullable OffsetDateTime borrowDate) {
    this.borrowDate = borrowDate;
  }

  public ReadBorrowedBookDto returnDate(@jakarta.annotation.Nullable OffsetDateTime returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

  /**
   * The expected return date of the borrowed book.
   * @return returnDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReturnDate() {
    return returnDate;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnDate(@jakarta.annotation.Nullable OffsetDateTime returnDate) {
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
    ReadBorrowedBookDto readBorrowedBook = (ReadBorrowedBookDto) o;
    return Objects.equals(this.book, readBorrowedBook.book) &&
        Objects.equals(this.userId, readBorrowedBook.userId) &&
        Objects.equals(this.borrowDate, readBorrowedBook.borrowDate) &&
        Objects.equals(this.returnDate, readBorrowedBook.returnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book, userId, borrowDate, returnDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadBorrowedBookDto {\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    borrowDate: ").append(toIndentedString(borrowDate)).append("\n");
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

