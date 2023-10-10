package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOrderTest {
    Product first = new Product();
    Product second = new Product();
    Product third = new Product();
    Cart firstCart = new Cart();

    Order firstOrder = new Order();

    @BeforeEach
    public void init() {

        first.AddProduct("Egg", 3.2f);
        first.AddProduct("Milk", 32.9f);
        first.AddProduct("Bread", 15f);

        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
        firstCart.AddProductToCart(third);
    }

    @Test
    void checkForIncludingAllElements() {

        firstOrder.AddOrder(firstCart);

        assertTrue(firstOrder.orderItems.contains(first) &&
                firstOrder.orderItems.contains(second) &&
                firstOrder.orderItems.contains(third));
    }

    @Test
    void isFunctionComplete() {
        firstOrder.AddOrder(firstCart);
        assertEquals("Complete", firstOrder.status);
    }

    @Test
    void isFunctionInProgress() {
        assertEquals("In progress", firstOrder.status);
    }
}