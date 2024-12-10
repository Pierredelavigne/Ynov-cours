package com.example.ntiers.service;

import com.example.ntiers.dto.OrderDTO;
import com.example.ntiers.dto.ProductDTO;
import com.example.ntiers.exception.ResourceNotFoundException;
import com.example.ntiers.model.Order;
import com.example.ntiers.model.Product;
import com.example.ntiers.repository.OrderRepository;
import com.example.ntiers.repository.ProductRepository;
import com.example.ntiers.utils.DTOMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductService productRepository;

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(DTOMapper::convertToDTO) // Utilisation de DTOMapper
                .collect(Collectors.toList());
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        // Récupérer le produit à partir de l'ID
        Product product = productRepository.findById(orderDTO.getProductId());
        Order order = DTOMapper.convertToEntity(orderDTO, product);
        return DTOMapper.convertToDTO(orderRepository.save(order));
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));

        // Récupérer le produit à partir de l'ID
        Product product = productRepository.findById(orderDTO.getProductId());
        order.setProduct(product);

        return DTOMapper.convertToDTO(orderRepository.save(order));
    }

    @Override
    public void deleteOrder(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        orderRepository.delete(order);
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        return DTOMapper.convertToDTO(order);
    }
}
