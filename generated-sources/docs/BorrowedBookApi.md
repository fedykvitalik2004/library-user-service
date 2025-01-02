# BorrowedBookApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBorrowedBook**](BorrowedBookApi.md#addBorrowedBook) | **POST** /borrowed-books | Add a borrowed book |
| [**deleteBorrowedBook**](BorrowedBookApi.md#deleteBorrowedBook) | **DELETE** /borrowed-books/{bookId}/{userId} | Delete a borrowed book |
| [**isBorrowedByUser**](BorrowedBookApi.md#isBorrowedByUser) | **GET** /borrowed-books/borrowed-by-user/{userId} | Check if a book is borrowed by a user |



## addBorrowedBook

> ReadBorrowedBookDto addBorrowedBook(createBorrowedBookDto)

Add a borrowed book

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BorrowedBookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BorrowedBookApi apiInstance = new BorrowedBookApi(defaultClient);
        CreateBorrowedBookDto createBorrowedBookDto = new CreateBorrowedBookDto(); // CreateBorrowedBookDto | 
        try {
            ReadBorrowedBookDto result = apiInstance.addBorrowedBook(createBorrowedBookDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BorrowedBookApi#addBorrowedBook");
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
| **createBorrowedBookDto** | [**CreateBorrowedBookDto**](CreateBorrowedBookDto.md)|  | |

### Return type

[**ReadBorrowedBookDto**](ReadBorrowedBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Borrowed book successfully created |  -  |
| **404** | Book or user doesn&#39;t exist |  -  |
| **409** | Borrowed book exists by its combination of IDs |  -  |


## deleteBorrowedBook

> deleteBorrowedBook(bookId, userId)

Delete a borrowed book

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BorrowedBookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BorrowedBookApi apiInstance = new BorrowedBookApi(defaultClient);
        Long bookId = 123L; // Long | The ID of the book to delete.
        Long userId = 456L; // Long | The ID of the user who borrowed the book.
        try {
            apiInstance.deleteBorrowedBook(bookId, userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BorrowedBookApi#deleteBorrowedBook");
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
| **bookId** | **Long**| The ID of the book to delete. | |
| **userId** | **Long**| The ID of the user who borrowed the book. | |

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
| **204** | Successfully deleted the borrowed book record. |  -  |
| **404** | The specified borrowed book record was not found. |  -  |


## isBorrowedByUser

> Boolean isBorrowedByUser(userId)

Check if a book is borrowed by a user

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.BorrowedBookApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BorrowedBookApi apiInstance = new BorrowedBookApi(defaultClient);
        Long userId = 1L; // Long | The ID of the user.
        try {
            Boolean result = apiInstance.isBorrowedByUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BorrowedBookApi#isBorrowedByUser");
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
| **userId** | **Long**| The ID of the user. | |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns true if the book is borrowed by the user, false otherwise. |  -  |

