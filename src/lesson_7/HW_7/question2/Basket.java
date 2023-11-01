package lesson_7.HW_7.question2;

import java.util.Arrays;

public class Basket {

    private Product[] products;

    public Basket(Product[] products) {
        setProducts(products);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        Product[] products1 = new Product[this.products.length + 1];
        for (int i = 0; i < this.products.length; i++) {
            products1[i] = products[i];
        }
        products1[this.products.length] = product;
        setProducts(products1);
    }

    @Override
    public String toString() {
        return Arrays.toString(getProducts());
    }
}