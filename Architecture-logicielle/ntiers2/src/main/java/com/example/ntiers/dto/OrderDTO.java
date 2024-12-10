package com.example.ntiers.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private String orderNumber;
    private String formattedOrderDate; // Different from entity
    private Long productId; // Facilitates saving
    private ProductDTO product; // Used for response


}

