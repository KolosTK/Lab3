package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GetStatusTest {
    Product first = new Product();
    Product second = new Product();
    Cart firstCart = new Cart();

    Order firstOrder = new Order();

    @BeforeEach
    public void init() {

        first.AddProduct("Egg", 3.2f);
        first.AddProduct("Milk", 32.9f);

        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
    }

    @Test
    void getInProgressStatus() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        firstOrder.GetStatus();

        System.setOut(System.out);

        assertEquals("In progress", outputStream.toString().trim());
    }

    @Test
    void getCompleteStatus() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        firstOrder.AddOrder(firstCart);


        firstOrder.GetStatus();

        System.setOut(System.out);

        assertEquals("Complete", outputStream.toString().trim());
    }
}