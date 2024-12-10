package org.example.creational.singleton;

public class OrderManagementService {

    private static OrderManagementService instance;

    private OrderManagementService() {}

    public static OrderManagementService getInstance() {
        if (instance == null) {
            instance = new OrderManagementService();
        }
        return instance;
    }




}
