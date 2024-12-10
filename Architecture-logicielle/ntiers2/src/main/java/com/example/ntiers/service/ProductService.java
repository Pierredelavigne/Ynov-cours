package com.example.ntiers.service;

import com.example.ntiers.dto.ProductDTO;
import com.example.ntiers.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<ProductDTO> getAllProducts();
    public ProductDTO getProductById(Long id);
    public ProductDTO addProduct(ProductDTO product);
    public ProductDTO updateProduct(ProductDTO product);
    public void deleteProduct(Long id);
    Product findById(Long productId);
}
