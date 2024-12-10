package org.example.microorder.service;

import org.example.microorder.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    // Méthode pour récupérer toutes les commandes
    List<OrderDTO> getAllOrders();

    // Méthode pour créer une nouvelle commande
    OrderDTO saveOrder(OrderDTO orderDTO);

    // Méthode pour mettre à jour une commande existante
    OrderDTO updateOrder(Long id, OrderDTO orderDTO);

    // Méthode pour supprimer une commande par son ID
    void deleteOrder(Long id);

    // Méthode pour récupérer une commande par son ID
    OrderDTO getOrderById(Long id);
}