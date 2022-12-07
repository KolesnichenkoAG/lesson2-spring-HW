package ru.geekbrains.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Bread", 120),
                new Product(2L, "Milk", 500),
                new Product(3L, "Apples", 350),
                new Product(4L, "Sugar", 600),
                new Product(5L, "Cheese", 3500)
        ));
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());

    }

    public String printListProduct () {
       for (int i = 0; i < 5; i++) {
           System.out.println(products.get(i));
       }
        return null;
    }
}
