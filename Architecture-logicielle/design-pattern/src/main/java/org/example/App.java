package org.example;

import org.example.creational.singleton.OrderManagementService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        OrderManagementService orderManagementService = OrderManagementService.getInstance();
    }
}
