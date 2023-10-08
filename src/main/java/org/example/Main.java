package org.example;

public class Main {
    public static void main(String[] args) {
        Product first = new Product();
        first.AddProduct("Egg", 3.2f);

        Product second = new Product();
        first.AddProduct("Mild", 32.9f);

        Product third = new Product();
        first.AddProduct("Bread", 15f);

        Cart firstCart = new Cart();
        firstCart.AddProductToCart(first);
    }
}