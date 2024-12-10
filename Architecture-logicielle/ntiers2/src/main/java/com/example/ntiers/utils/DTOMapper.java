package com.example.ntiers.utils;

import com.example.ntiers.dto.OrderDTO;
import com.example.ntiers.dto.ProductDTO;
import com.example.ntiers.model.Order;
import com.example.ntiers.model.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DTOMapper {

    // Méthode pour transformer un Product en ProductDTO
    public static ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

    // Méthode pour transformer un ProductDTO en Product
    public static Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    // Méthode pour transformer un Order en OrderDTO
    public static OrderDTO convertToDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setOrderNumber(order.getOrderNumber());
        orderDTO.setFormattedOrderDate(order.getOrderDate().toString()); // Formatage de la date
        orderDTO.setProductId(order.getProduct().getId());

        // Transformer également le produit associé en DTO
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(order.getProduct().getId());
        productDTO.setName(order.getProduct().getName());
        productDTO.setPrice(order.getProduct().getPrice());
        orderDTO.setProduct(productDTO);

        return orderDTO;
    }

    // Méthode pour transformer un OrderDTO en Order
    public static Order convertToEntity(OrderDTO orderDTO, Product product) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));
        order.setProduct(product); // Associer le produit directement
        return order;
    }
}
