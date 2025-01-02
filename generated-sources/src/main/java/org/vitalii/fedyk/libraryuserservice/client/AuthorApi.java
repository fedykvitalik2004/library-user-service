package org.vitalii.fedyk.libraryuserservice.client;

import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.BaseApi;

import org.vitalii.fedyk.libraryuserservice.dto.CreateAuthorDto;
import org.vitalii.fedyk.libraryuserservice.dto.ExceptionMessageDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadAuthorDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadAuthorsDto;

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
public class AuthorApi extends BaseApi {

    public AuthorApi() {
        super(new ApiClient());
    }

    public AuthorApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create a new author
     * 
     * <p><b>201</b> - Author successfully created
     * <p><b>400</b> - Invalid input data
     * @param createAuthorDto Data for the author to be created (optional)
     * @return ReadAuthorDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadAuthorDto createAuthor(CreateAuthorDto createAuthorDto) throws RestClientException {
        return createAuthorWithHttpInfo(createAuthorDto).getBody();
    }

    /**
     * Create a new author
     * 
     * <p><b>201</b> - Author successfully created
     * <p><b>400</b> - Invalid input data
     * @param createAuthorDto Data for the author to be created (optional)
     * @return ResponseEntity&lt;ReadAuthorDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadAuthorDto> createAuthorWithHttpInfo(CreateAuthorDto createAuthorDto) throws RestClientException {
        Object localVarPostBody = createAuthorDto;
        

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

        ParameterizedTypeReference<ReadAuthorDto> localReturnType = new ParameterizedTypeReference<ReadAuthorDto>() {};
        return apiClient.invokeAPI("/authors", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an author by ID
     * 
     * <p><b>204</b> - Author successfully deleted
     * <p><b>404</b> - Author not found
     * <p><b>409</b> - Author cannot be deleted because it is referenced elsewhere
     * @param authorId Identifier of the author (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAuthor(Long authorId) throws RestClientException {
        deleteAuthorWithHttpInfo(authorId);
    }

    /**
     * Delete an author by ID
     * 
     * <p><b>204</b> - Author successfully deleted
     * <p><b>404</b> - Author not found
     * <p><b>409</b> - Author cannot be deleted because it is referenced elsewhere
     * @param authorId Identifier of the author (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteAuthorWithHttpInfo(Long authorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorId' is set
        if (authorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorId' when calling deleteAuthor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("authorId", authorId);

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
        return apiClient.invokeAPI("/authors/{authorId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all authors
     * 
     * <p><b>200</b> - All authors retrieved successfully
     * @return ReadAuthorsDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadAuthorsDto getAllAuthors() throws RestClientException {
        return getAllAuthorsWithHttpInfo().getBody();
    }

    /**
     * Get all authors
     * 
     * <p><b>200</b> - All authors retrieved successfully
     * @return ResponseEntity&lt;ReadAuthorsDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadAuthorsDto> getAllAuthorsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<ReadAuthorsDto> localReturnType = new ParameterizedTypeReference<ReadAuthorsDto>() {};
        return apiClient.invokeAPI("/authors", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find an author by ID
     * 
     * <p><b>200</b> - Author successfully retrieved
     * <p><b>404</b> - Author not found
     * @param authorId Identifier of the author (required)
     * @return ReadAuthorDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadAuthorDto getAuthorById(Long authorId) throws RestClientException {
        return getAuthorByIdWithHttpInfo(authorId).getBody();
    }

    /**
     * Find an author by ID
     * 
     * <p><b>200</b> - Author successfully retrieved
     * <p><b>404</b> - Author not found
     * @param authorId Identifier of the author (required)
     * @return ResponseEntity&lt;ReadAuthorDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadAuthorDto> getAuthorByIdWithHttpInfo(Long authorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorId' is set
        if (authorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorId' when calling getAuthorById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("authorId", authorId);

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

        ParameterizedTypeReference<ReadAuthorDto> localReturnType = new ParameterizedTypeReference<ReadAuthorDto>() {};
        return apiClient.invokeAPI("/authors/{authorId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an author
     * 
     * <p><b>200</b> - Author successfully updated
     * <p><b>400</b> - Invalid input data
     * <p><b>404</b> - Author not found
     * @param authorId Identifier of the author (required)
     * @param createAuthorDto Data to update the author (optional)
     * @return ReadAuthorDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadAuthorDto updateAuthor(Long authorId, CreateAuthorDto createAuthorDto) throws RestClientException {
        return updateAuthorWithHttpInfo(authorId, createAuthorDto).getBody();
    }

    /**
     * Update an author
     * 
     * <p><b>200</b> - Author successfully updated
     * <p><b>400</b> - Invalid input data
     * <p><b>404</b> - Author not found
     * @param authorId Identifier of the author (required)
     * @param createAuthorDto Data to update the author (optional)
     * @return ResponseEntity&lt;ReadAuthorDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadAuthorDto> updateAuthorWithHttpInfo(Long authorId, CreateAuthorDto createAuthorDto) throws RestClientException {
        Object localVarPostBody = createAuthorDto;
        
        // verify the required parameter 'authorId' is set
        if (authorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorId' when calling updateAuthor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("authorId", authorId);

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

        ParameterizedTypeReference<ReadAuthorDto> localReturnType = new ParameterizedTypeReference<ReadAuthorDto>() {};
        return apiClient.invokeAPI("/authors/{authorId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
