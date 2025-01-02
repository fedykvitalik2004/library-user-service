# AuthorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAuthor**](AuthorApi.md#createAuthor) | **POST** /authors | Create a new author |
| [**deleteAuthor**](AuthorApi.md#deleteAuthor) | **DELETE** /authors/{authorId} | Delete an author by ID |
| [**getAllAuthors**](AuthorApi.md#getAllAuthors) | **GET** /authors | Get all authors |
| [**getAuthorById**](AuthorApi.md#getAuthorById) | **GET** /authors/{authorId} | Find an author by ID |
| [**updateAuthor**](AuthorApi.md#updateAuthor) | **PUT** /authors/{authorId} | Update an author |



## createAuthor

> ReadAuthorDto createAuthor(createAuthorDto)

Create a new author

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.AuthorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthorApi apiInstance = new AuthorApi(defaultClient);
        CreateAuthorDto createAuthorDto = new CreateAuthorDto(); // CreateAuthorDto | Data for the author to be created
        try {
            ReadAuthorDto result = apiInstance.createAuthor(createAuthorDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorApi#createAuthor");
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
| **createAuthorDto** | [**CreateAuthorDto**](CreateAuthorDto.md)| Data for the author to be created | [optional] |

### Return type

[**ReadAuthorDto**](ReadAuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Author successfully created |  -  |
| **400** | Invalid input data |  -  |


## deleteAuthor

> deleteAuthor(authorId)

Delete an author by ID

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.AuthorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthorApi apiInstance = new AuthorApi(defaultClient);
        Long authorId = 56L; // Long | Identifier of the author
        try {
            apiInstance.deleteAuthor(authorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorApi#deleteAuthor");
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
| **authorId** | **Long**| Identifier of the author | |

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
| **204** | Author successfully deleted |  -  |
| **404** | Author not found |  -  |
| **409** | Author cannot be deleted because it is referenced elsewhere |  -  |


## getAllAuthors

> ReadAuthorsDto getAllAuthors()

Get all authors

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.AuthorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthorApi apiInstance = new AuthorApi(defaultClient);
        try {
            ReadAuthorsDto result = apiInstance.getAllAuthors();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorApi#getAllAuthors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ReadAuthorsDto**](ReadAuthorsDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All authors retrieved successfully |  -  |


## getAuthorById

> ReadAuthorDto getAuthorById(authorId)

Find an author by ID

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.AuthorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthorApi apiInstance = new AuthorApi(defaultClient);
        Long authorId = 56L; // Long | Identifier of the author
        try {
            ReadAuthorDto result = apiInstance.getAuthorById(authorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorApi#getAuthorById");
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
| **authorId** | **Long**| Identifier of the author | |

### Return type

[**ReadAuthorDto**](ReadAuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Author successfully retrieved |  -  |
| **404** | Author not found |  -  |


## updateAuthor

> ReadAuthorDto updateAuthor(authorId, createAuthorDto)

Update an author

### Example

```java
// Import classes:
import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.ApiException;
import org.vitalii.fedyk.libraryuserservice.Configuration;
import org.vitalii.fedyk.libraryuserservice.models.*;
import org.vitalii.fedyk.libraryuserservice.client.AuthorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthorApi apiInstance = new AuthorApi(defaultClient);
        Long authorId = 56L; // Long | Identifier of the author
        CreateAuthorDto createAuthorDto = new CreateAuthorDto(); // CreateAuthorDto | Data to update the author
        try {
            ReadAuthorDto result = apiInstance.updateAuthor(authorId, createAuthorDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorApi#updateAuthor");
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
| **authorId** | **Long**| Identifier of the author | |
| **createAuthorDto** | [**CreateAuthorDto**](CreateAuthorDto.md)| Data to update the author | [optional] |

### Return type

[**ReadAuthorDto**](ReadAuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Author successfully updated |  -  |
| **400** | Invalid input data |  -  |
| **404** | Author not found |  -  |

