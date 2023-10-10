import static org.junit.jupiter.api.Assertions.*;
import org.example.Product;
import org.junit.jupiter.api.Test;

class AddProductTest {
    String name;
    float price;
    Product product = new Product();

    @Test
    void AddEggToProducts() {
        name = "Egg";
        price = 3.2f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }

    @Test
    void AddMilkToProducts() {
        name = "Milk";
        price = 32.9f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }

    @Test
    void AddBreadToProducts() {
        name = "Bread";
        price = 15f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }


}