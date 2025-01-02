# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findBorrowedBooks**](UserApi.md#findBorrowedBooks) | **GET** /users/{userId}/borrowed-books | Find borrowed books by user&#39;s id |



## findBorrowedBooks

> List&lt;ReadBorrowedBookDto&gt; findBorrowedBooks(userId)

Find borrowed books by user&#39;s id

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | Identifier of the user
        try {
            List<ReadBorrowedBookDto> result = apiInstance.findBorrowedBooks(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#findBorrowedBooks");
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
| **userId** | **Long**| Identifier of the user | |

### Return type

[**List&lt;ReadBorrowedBookDto&gt;**](ReadBorrowedBookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Got borrowed books |  -  |

