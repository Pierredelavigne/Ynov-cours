package com.example.ntiers.service;

import com.example.ntiers.dto.ProductDTO;
import com.example.ntiers.exception.ResourceNotFoundException;
import com.example.ntiers.model.Product;
import com.example.ntiers.repository.ProductRepository;
import com.example.ntiers.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//@Service
public class AlternativeProductServiceImpl {

    //@Autowired
    private ProductRepository productRepository;


   // @Override
    public List<ProductDTO> getAllProducts() {
        System.out.println("Alternative ProductServiceImpl - Getting all products");
        return productRepository.findAll().stream()
                .map(DTOMapper::convertToDTO)
                .collect(Collectors.toList());
    }

    //@Override
    public ProductDTO getProductById(Long id) {
        System.out.println("Alternative ProductServiceImpl - Getting product by ID: " + id);
        return productRepository.findById(id)
                .map(DTOMapper::convertToDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
    }


  //  @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        System.out.println("Alternative ProductServiceImpl - Saving product");
        Product product = DTOMapper.convertToEntity(productDTO);
        return DTOMapper.convertToDTO(productRepository.save(product));
    }

   // @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        System.out.println("Alternative ProductServiceImpl - Updating product with ID: " + productDTO.getId());
        Product product = productRepository.findById(productDTO.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return DTOMapper.convertToDTO(productRepository.save(product));
    }

   // @Override
    public void deleteProduct(Long id) {
        System.out.println("Alternative ProductServiceImpl - Deleting product with ID: " + id);
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
        productRepository.delete(product);
    }
}
