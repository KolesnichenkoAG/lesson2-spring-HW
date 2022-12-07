package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cart {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void createCartFromProduct(Long productId) {
        System.out.println("Заказ создан: ");
        System.out.print(productService.getTitleById(productId) + " - ");
        System.out.println("цена: " + productService.getCostById(productId));
    }

    public void delProductFromCart(Long productId) {
        System.out.println("Выберите продук для удаления из корзины - ");
    }

    public String printListProduct() {
        return productService.getListProduct();
    }


}
