package org.example.microproduct.service;



import org.example.microproduct.dto.ProductDTO;
import org.example.microproduct.exception.ResourceNotFoundException;
import org.example.microproduct.model.Product;
import org.example.microproduct.repository.ProductRepository;
import org.example.microproduct.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DTOMapper dtoMapper;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(dtoMapper::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        return dtoMapper.convertToDTO(product);
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = dtoMapper.convertToEntity(productDTO);
        return dtoMapper.convertToDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return dtoMapper.convertToDTO(productRepository.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        productRepository.delete(product);
    }




}


