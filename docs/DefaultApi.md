# DefaultApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientesPost**](DefaultApi.md#clientesPost) | **POST** /clientes | Registrar un nuevo cliente


<a name="clientesPost"></a>
# **clientesPost**
> InlineResponse201 clientesPost(cliente)

Registrar un nuevo cliente

Endpoint para que los clientes se registren en el servicio de taxis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Cliente cliente = new Cliente(); // Cliente | Datos del cliente
try {
    InlineResponse201 result = apiInstance.clientesPost(cliente);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#clientesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cliente** | [**Cliente**](Cliente.md)| Datos del cliente |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

