package org.example;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    public Cart() {
        listOfProducts = new ArrayList<>(); // Initialize the list in the constructor
    }

    List<Product> listOfProducts;
    void AddProductToCart(Product product)
    {
        listOfProducts.add(product);
    }
    void RemoveProductFromCart(Product product)
    {
        listOfProducts.remove(product);
    }


}
