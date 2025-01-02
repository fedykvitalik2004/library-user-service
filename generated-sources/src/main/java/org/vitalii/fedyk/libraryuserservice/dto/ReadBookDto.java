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
import org.vitalii.fedyk.libraryuserservice.dto.BookGenreDto;
import org.vitalii.fedyk.libraryuserservice.dto.FullNameDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReadBookDto
 */
@JsonPropertyOrder({
  ReadBookDto.JSON_PROPERTY_ID,
  ReadBookDto.JSON_PROPERTY_TITLE,
  ReadBookDto.JSON_PROPERTY_DESCRIPTION,
  ReadBookDto.JSON_PROPERTY_GENRE,
  ReadBookDto.JSON_PROPERTY_PAGES_COUNT,
  ReadBookDto.JSON_PROPERTY_AUTHOR_ID,
  ReadBookDto.JSON_PROPERTY_AUTHOR_FULL_NAME
})
@JsonTypeName("ReadBook")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ReadBookDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @jakarta.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @jakarta.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_GENRE = "genre";
  @jakarta.annotation.Nullable
  private BookGenreDto genre;

  public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
  @jakarta.annotation.Nullable
  private Integer pagesCount;

  public static final String JSON_PROPERTY_AUTHOR_ID = "authorId";
  @jakarta.annotation.Nullable
  private Long authorId;

  public static final String JSON_PROPERTY_AUTHOR_FULL_NAME = "authorFullName";
  @jakarta.annotation.Nullable
  private FullNameDto authorFullName;

  public ReadBookDto() {
  }

  public ReadBookDto id(@jakarta.annotation.Nullable Long id) {
    
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

  public ReadBookDto title(@jakarta.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The title of the book.
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@jakarta.annotation.Nullable String title) {
    this.title = title;
  }

  public ReadBookDto description(@jakarta.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * A brief description of the book.
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

  public ReadBookDto genre(@jakarta.annotation.Nullable BookGenreDto genre) {
    
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BookGenreDto getGenre() {
    return genre;
  }


  @JsonProperty(JSON_PROPERTY_GENRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenre(@jakarta.annotation.Nullable BookGenreDto genre) {
    this.genre = genre;
  }

  public ReadBookDto pagesCount(@jakarta.annotation.Nullable Integer pagesCount) {
    
    this.pagesCount = pagesCount;
    return this;
  }

  /**
   * Number of pages in the book.
   * @return pagesCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesCount() {
    return pagesCount;
  }


  @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagesCount(@jakarta.annotation.Nullable Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public ReadBookDto authorId(@jakarta.annotation.Nullable Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * minimum: 1
   * @return authorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAuthorId() {
    return authorId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorId(@jakarta.annotation.Nullable Long authorId) {
    this.authorId = authorId;
  }

  public ReadBookDto authorFullName(@jakarta.annotation.Nullable FullNameDto authorFullName) {
    
    this.authorFullName = authorFullName;
    return this;
  }

  /**
   * Get authorFullName
   * @return authorFullName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullNameDto getAuthorFullName() {
    return authorFullName;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorFullName(@jakarta.annotation.Nullable FullNameDto authorFullName) {
    this.authorFullName = authorFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadBookDto readBook = (ReadBookDto) o;
    return Objects.equals(this.id, readBook.id) &&
        Objects.equals(this.title, readBook.title) &&
        Objects.equals(this.description, readBook.description) &&
        Objects.equals(this.genre, readBook.genre) &&
        Objects.equals(this.pagesCount, readBook.pagesCount) &&
        Objects.equals(this.authorId, readBook.authorId) &&
        Objects.equals(this.authorFullName, readBook.authorFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, genre, pagesCount, authorId, authorFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadBookDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorFullName: ").append(toIndentedString(authorFullName)).append("\n");
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

