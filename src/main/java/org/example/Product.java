package org.example;

public class Product {
    private static int id=0;
    private String name;
    private float price;

    void AddProduct(String name, float price)
    {
        id++;
        this.name = name;
        this.price = price;
    }
}
