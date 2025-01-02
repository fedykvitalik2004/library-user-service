package org.vitalii.fedyk.libraryuserservice.client;

import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.BaseApi;

import org.vitalii.fedyk.libraryuserservice.dto.CreateBorrowedBookDto;
import org.vitalii.fedyk.libraryuserservice.dto.ExceptionMessageDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadBorrowedBookDto;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-01T19:38:52.451589+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class BorrowedBookApi extends BaseApi {

    public BorrowedBookApi() {
        super(new ApiClient());
    }

    public BorrowedBookApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add a borrowed book
     * 
     * <p><b>201</b> - Borrowed book successfully created
     * <p><b>404</b> - Book or user doesn&#39;t exist
     * <p><b>409</b> - Borrowed book exists by its combination of IDs
     * @param createBorrowedBookDto  (required)
     * @return ReadBorrowedBookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadBorrowedBookDto addBorrowedBook(CreateBorrowedBookDto createBorrowedBookDto) throws RestClientException {
        return addBorrowedBookWithHttpInfo(createBorrowedBookDto).getBody();
    }

    /**
     * Add a borrowed book
     * 
     * <p><b>201</b> - Borrowed book successfully created
     * <p><b>404</b> - Book or user doesn&#39;t exist
     * <p><b>409</b> - Borrowed book exists by its combination of IDs
     * @param createBorrowedBookDto  (required)
     * @return ResponseEntity&lt;ReadBorrowedBookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadBorrowedBookDto> addBorrowedBookWithHttpInfo(CreateBorrowedBookDto createBorrowedBookDto) throws RestClientException {
        Object localVarPostBody = createBorrowedBookDto;
        
        // verify the required parameter 'createBorrowedBookDto' is set
        if (createBorrowedBookDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBorrowedBookDto' when calling addBorrowedBook");
        }
        

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

        ParameterizedTypeReference<ReadBorrowedBookDto> localReturnType = new ParameterizedTypeReference<ReadBorrowedBookDto>() {};
        return apiClient.invokeAPI("/borrowed-books", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a borrowed book
     * 
     * <p><b>204</b> - Successfully deleted the borrowed book record.
     * <p><b>404</b> - The specified borrowed book record was not found.
     * @param bookId The ID of the book to delete. (required)
     * @param userId The ID of the user who borrowed the book. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteBorrowedBook(Long bookId, Long userId) throws RestClientException {
        deleteBorrowedBookWithHttpInfo(bookId, userId);
    }

    /**
     * Delete a borrowed book
     * 
     * <p><b>204</b> - Successfully deleted the borrowed book record.
     * <p><b>404</b> - The specified borrowed book record was not found.
     * @param bookId The ID of the book to delete. (required)
     * @param userId The ID of the user who borrowed the book. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteBorrowedBookWithHttpInfo(Long bookId, Long userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bookId' is set
        if (bookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookId' when calling deleteBorrowedBook");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deleteBorrowedBook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookId", bookId);
        uriVariables.put("userId", userId);

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
        return apiClient.invokeAPI("/borrowed-books/{bookId}/{userId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check if a book is borrowed by a user
     * 
     * <p><b>200</b> - Returns true if the book is borrowed by the user, false otherwise.
     * @param userId The ID of the user. (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean isBorrowedByUser(Long userId) throws RestClientException {
        return isBorrowedByUserWithHttpInfo(userId).getBody();
    }

    /**
     * Check if a book is borrowed by a user
     * 
     * <p><b>200</b> - Returns true if the book is borrowed by the user, false otherwise.
     * @param userId The ID of the user. (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> isBorrowedByUserWithHttpInfo(Long userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling isBorrowedByUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        ParameterizedTypeReference<Boolean> localReturnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI("/borrowed-books/borrowed-by-user/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
