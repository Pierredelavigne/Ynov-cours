package org.example.microorder.client;

import org.example.microorder.dto.ProductDTO;
import org.example.microorder.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String SERVICE_PRODUCT_URL = "http://localhost:8083/api/products/";

    public ProductDTO getProductById(Long productId) {
        try{
            return restTemplate.getForObject(SERVICE_PRODUCT_URL + productId, ProductDTO.class);

        }catch (RestClientException e){
            throw new ResourceNotFoundException("Product with id : " + productId + "not found");
        }
    }
}
