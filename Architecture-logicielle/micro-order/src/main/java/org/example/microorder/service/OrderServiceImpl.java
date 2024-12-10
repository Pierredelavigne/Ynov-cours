package org.example.microorder.service;


import org.example.microorder.client.RestClient;
import org.example.microorder.dto.OrderDTO;
import org.example.microorder.dto.ProductDTO;
import org.example.microorder.exception.ResourceNotFoundException;
import org.example.microorder.model.Order;
import org.example.microorder.repository.OrderRepository;
import org.example.microorder.utils.DTOMapper;
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
    private RestClient restClient;


    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(order ->{
                    ProductDTO productDTO = restClient.getProductById(order.getProductId());
                    return DTOMapper.convertToDTO(order, productDTO);
                }).toList();
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        ProductDTO productDTO = restClient.getProductById(orderDTO.getProductId());
        if(productDTO == null){
            throw new ResourceNotFoundException("Product not found");
        }
        Order order = DTOMapper.convertToEntity(orderDTO);
        return DTOMapper.convertToDTO(orderRepository.save(order),productDTO);
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));

        ProductDTO productDTO = restClient.getProductById(orderDTO.getProductId());
        if(productDTO == null){
            throw new ResourceNotFoundException("Product not found");
        }
        order.setProductId(orderDTO.getProductId());
        return DTOMapper.convertToDTO(orderRepository.save(order), productDTO);
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
        ProductDTO productDTO = restClient.getProductById(order.getProductId());
        if(productDTO == null){
            throw new ResourceNotFoundException("Product not found");
        }
        return DTOMapper.convertToDTO(order, productDTO);
    }
}

