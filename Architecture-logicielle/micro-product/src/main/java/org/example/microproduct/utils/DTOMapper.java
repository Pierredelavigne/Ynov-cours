package org.example.microproduct.utils;

import org.example.microproduct.dto.ProductDTO;
import org.example.microproduct.model.Product;
import org.springframework.stereotype.Component;

@Component
public class DTOMapper {

    // Méthode pour convertir Product en ProductDTO
    public ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

    // Méthode pour convertir ProductDTO en Product
    public Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }
}
