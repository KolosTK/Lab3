package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public Order() {
        orderItems = new ArrayList<>();
    }

    List<Product> orderItems;
    private static int orderId = 0;
    private String status = "In progress";

    public void AddOrder(Cart cart) {
        orderId++;
        status = "Complete";
        orderItems.addAll(cart.listOfProducts);
        cart.listOfProducts.clear();
    }
    public void GetStatus()
    {
        System.out.println(status);
    }
}
