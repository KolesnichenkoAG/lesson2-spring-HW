package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getTitleById(Long id) {
        return productRepository.findById(id).getTitle();
    }

    public int getCostById(Long id) {
        return productRepository.findById(id).getCost();
    }

    public String getListProduct() {
        return productRepository.printListProduct();
    }
}
