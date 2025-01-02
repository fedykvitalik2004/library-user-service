package org.vitalii.fedyk.libraryuserservice.client;

import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.BaseApi;

import org.vitalii.fedyk.libraryuserservice.dto.CreateBookDto;
import org.vitalii.fedyk.libraryuserservice.dto.ExceptionMessageDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadBookDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:36:24.503014+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class BookApi extends BaseApi {

    public BookApi() {
        super(new ApiClient());
    }

    public BookApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create a new book
     * 
     * <p><b>201</b> - Book successfully created
     * <p><b>400</b> - Invalid input data
     * @param createBookDto Data to create a new book (optional)
     * @return ReadBookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadBookDto createBook(CreateBookDto createBookDto) throws RestClientException {
        return createBookWithHttpInfo(createBookDto).getBody();
    }

    /**
     * Create a new book
     * 
     * <p><b>201</b> - Book successfully created
     * <p><b>400</b> - Invalid input data
     * @param createBookDto Data to create a new book (optional)
     * @return ResponseEntity&lt;ReadBookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadBookDto> createBookWithHttpInfo(CreateBookDto createBookDto) throws RestClientException {
        Object localVarPostBody = createBookDto;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ReadBookDto> localReturnType = new ParameterizedTypeReference<ReadBookDto>() {};
        return apiClient.invokeAPI("/books", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a book by ID
     * 
     * <p><b>204</b> - Book successfully deleted
     * <p><b>404</b> - Book not found
     * <p><b>409</b> - Book cannot be deleted because it is referenced elsewhere
     * @param bookId Identifier of the book (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteBook(Long bookId) throws RestClientException {
        deleteBookWithHttpInfo(bookId);
    }

    /**
     * Delete a book by ID
     * 
     * <p><b>204</b> - Book successfully deleted
     * <p><b>404</b> - Book not found
     * <p><b>409</b> - Book cannot be deleted because it is referenced elsewhere
     * @param bookId Identifier of the book (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteBookWithHttpInfo(Long bookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bookId' is set
        if (bookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookId' when calling deleteBook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookId", bookId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/books/{bookId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find a book by ID
     * 
     * <p><b>200</b> - Book successfully retrieved
     * <p><b>404</b> - Author not found
     * @param bookId Identifier of the book (required)
     * @return ReadBookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadBookDto getBookById(Long bookId) throws RestClientException {
        return getBookByIdWithHttpInfo(bookId).getBody();
    }

    /**
     * Find a book by ID
     * 
     * <p><b>200</b> - Book successfully retrieved
     * <p><b>404</b> - Author not found
     * @param bookId Identifier of the book (required)
     * @return ResponseEntity&lt;ReadBookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadBookDto> getBookByIdWithHttpInfo(Long bookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bookId' is set
        if (bookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookId' when calling getBookById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookId", bookId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ReadBookDto> localReturnType = new ParameterizedTypeReference<ReadBookDto>() {};
        return apiClient.invokeAPI("/books/{bookId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find books by criteria
     * This endpoint allows users to search for books based on various search criteria for such fields (&#39;title&#39; and &#39;pagesCount&#39;). Such operators are permitted: &#x60;:&#x60;, &#x60;!&#x3D;&#x60;, &#x60;&lt;&#x60;, &#x60;&gt;&#x60;, &#x60;&lt;:&#x60;, &#x60;&gt;:&#x60;, &#x60;contains&#x60;. If there are several criteria, use &#39;,&#39; between them 
     * <p><b>200</b> - Books are retrieved accordingly
     * @param query  (required)
     * @return List&lt;ReadBookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ReadBookDto> search(String query) throws RestClientException {
        return searchWithHttpInfo(query).getBody();
    }

    /**
     * Find books by criteria
     * This endpoint allows users to search for books based on various search criteria for such fields (&#39;title&#39; and &#39;pagesCount&#39;). Such operators are permitted: &#x60;:&#x60;, &#x60;!&#x3D;&#x60;, &#x60;&lt;&#x60;, &#x60;&gt;&#x60;, &#x60;&lt;:&#x60;, &#x60;&gt;:&#x60;, &#x60;contains&#x60;. If there are several criteria, use &#39;,&#39; between them 
     * <p><b>200</b> - Books are retrieved accordingly
     * @param query  (required)
     * @return ResponseEntity&lt;List&lt;ReadBookDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ReadBookDto>> searchWithHttpInfo(String query) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'query' when calling search");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ReadBookDto>> localReturnType = new ParameterizedTypeReference<List<ReadBookDto>>() {};
        return apiClient.invokeAPI("/books/search", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a book by ID
     * 
     * <p><b>200</b> - Book successfully updated
     * <p><b>400</b> - Invalid input data
     * <p><b>404</b> - Book not found
     * @param bookId Identifier of the book (required)
     * @param createBookDto Data to update a book (optional)
     * @return ReadBookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadBookDto updateBook(Long bookId, CreateBookDto createBookDto) throws RestClientException {
        return updateBookWithHttpInfo(bookId, createBookDto).getBody();
    }

    /**
     * Update a book by ID
     * 
     * <p><b>200</b> - Book successfully updated
     * <p><b>400</b> - Invalid input data
     * <p><b>404</b> - Book not found
     * @param bookId Identifier of the book (required)
     * @param createBookDto Data to update a book (optional)
     * @return ResponseEntity&lt;ReadBookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadBookDto> updateBookWithHttpInfo(Long bookId, CreateBookDto createBookDto) throws RestClientException {
        Object localVarPostBody = createBookDto;
        
        // verify the required parameter 'bookId' is set
        if (bookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookId' when calling updateBook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookId", bookId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ReadBookDto> localReturnType = new ParameterizedTypeReference<ReadBookDto>() {};
        return apiClient.invokeAPI("/books/{bookId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
