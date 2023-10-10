package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addAndRemoveProductsFromCart {
    Product first = new Product();
    Cart firstCart = new Cart();

    @Test
    void addEggToCart() {
        first.AddProduct("Egg", 3.2f);
        firstCart.AddProductToCart(first);

        assertTrue(firstCart.listOfProducts.contains(first));
    }

    @Test
    void removeEggFromCart() {
        first.AddProduct("Egg", 3.2f);

        firstCart.AddProductToCart(first);
        firstCart.RemoveProductFromCart(first);

        assertFalse(firstCart.listOfProducts.contains(first));
    }
}