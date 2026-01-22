package example40;

import java.util.*;
import java.util.function.Predicate;



public class Test40 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 2500.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Keyboard", 150.0));
        products.add(new Product("Monitor", 800.0));
        products.add(new Product("USB Cable", 15.0));

        Predicate<Product> expensiveProduct = p -> p.getPrice() > 100;

        int count = countMatching(products, expensiveProduct);
        System.out.println("Liczba produktów droższych niż 100: " + count); // 3
    }
    public static <E> int countMatching(Collection<E> items, Predicate<E> condition) {
        int count = 0;
        for (E item : items) {
            if (condition.test(item)) {
                count++;
            }
        }
        return count;
    }


}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}