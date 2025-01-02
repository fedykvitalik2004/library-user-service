# BookApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBook**](BookApi.md#createBook) | **POST** /books | Create a new book |
| [**deleteBook**](BookApi.md#deleteBook) | **DELETE** /books/{bookId} | Delete a book by ID |
| [**getBookById**](BookApi.md#getBookById) | **GET** /books/{bookId} | Find a book by ID |
| [**search**](BookApi.md#search) | **GET** /books/search | Find books by criteria |
| [**updateBook**](BookApi.md#updateBook) | **PUT** /books/{bookId} | Update a book by ID |



## createBook

> ReadBookDto createBook(createBookDto)

Create a new book

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BookApi apiInstance = new BookApi(defaultClient);
        CreateBookDto createBookDto = new CreateBookDto(); // CreateBookDto | Data to create a new book
        try {
            ReadBookDto result = apiInstance.createBook(createBookDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApi#createBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBookDto** | [**CreateBookDto**](CreateBookDto.md)| Data to create a new book | [optional] |

### Return type

[**ReadBookDto**](ReadBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Book successfully created |  -  |
| **400** | Invalid input data |  -  |


## deleteBook

> deleteBook(bookId)

Delete a book by ID

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BookApi apiInstance = new BookApi(defaultClient);
        Long bookId = 1L; // Long | Identifier of the book
        try {
            apiInstance.deleteBook(bookId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApi#deleteBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Long**| Identifier of the book | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Book successfully deleted |  -  |
| **404** | Book not found |  -  |
| **409** | Book cannot be deleted because it is referenced elsewhere |  -  |


## getBookById

> ReadBookDto getBookById(bookId)

Find a book by ID

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BookApi apiInstance = new BookApi(defaultClient);
        Long bookId = 1L; // Long | Identifier of the book
        try {
            ReadBookDto result = apiInstance.getBookById(bookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApi#getBookById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Long**| Identifier of the book | |

### Return type

[**ReadBookDto**](ReadBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book successfully retrieved |  -  |
| **404** | Author not found |  -  |


## search

> List&lt;ReadBookDto&gt; search(query)

Find books by criteria

This endpoint allows users to search for books based on various search criteria for such fields (&#39;title&#39; and &#39;pagesCount&#39;). Such operators are permitted: &#x60;:&#x60;, &#x60;!&#x3D;&#x60;, &#x60;&lt;&#x60;, &#x60;&gt;&#x60;, &#x60;&lt;:&#x60;, &#x60;&gt;:&#x60;, &#x60;contains&#x60;. If there are several criteria, use &#39;,&#39; between them 

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BookApi apiInstance = new BookApi(defaultClient);
        String query = "pagesCount>:3,pagesCount<:5,title:Book"; // String | 
        try {
            List<ReadBookDto> result = apiInstance.search(query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApi#search");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**|  | |

### Return type

[**List&lt;ReadBookDto&gt;**](ReadBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Books are retrieved accordingly |  -  |


## updateBook

> ReadBookDto updateBook(bookId, createBookDto)

Update a book by ID

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BookApi apiInstance = new BookApi(defaultClient);
        Long bookId = 1L; // Long | Identifier of the book
        CreateBookDto createBookDto = new CreateBookDto(); // CreateBookDto | Data to update a book
        try {
            ReadBookDto result = apiInstance.updateBook(bookId, createBookDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApi#updateBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Long**| Identifier of the book | |
| **createBookDto** | [**CreateBookDto**](CreateBookDto.md)| Data to update a book | [optional] |

### Return type

[**ReadBookDto**](ReadBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book successfully updated |  -  |
| **400** | Invalid input data |  -  |
| **404** | Book not found |  -  |

