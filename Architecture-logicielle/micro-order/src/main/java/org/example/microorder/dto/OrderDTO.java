package org.example.microorder.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private String orderNumber;
    private String formattedOrderDate;
    private Long productId; // Used for saving orders
    private ProductDTO product; // Used for displaying order details

}
