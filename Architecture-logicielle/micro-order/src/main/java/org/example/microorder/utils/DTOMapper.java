package org.example.microorder.utils;

import org.example.microorder.dto.OrderDTO;
import org.example.microorder.dto.ProductDTO;
import org.example.microorder.model.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DTOMapper {

    // Méthode pour transformer un Order en OrderDTO
    public static OrderDTO convertToDTO(Order order, ProductDTO productDTO) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setOrderNumber(order.getOrderNumber());
        orderDTO.setFormattedOrderDate(order.getOrderDate().toString());
        orderDTO.setProductId(order.getProductId());

        orderDTO.setProduct(productDTO);
        return orderDTO;
    }

    // Méthode pour transformer un OrderDTO en Order
    public static Order convertToEntity(OrderDTO orderDTO) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));
        order.setProductId(orderDTO.getProductId());  // On stocke uniquement l'ID du produit
        return order;
    }
}
