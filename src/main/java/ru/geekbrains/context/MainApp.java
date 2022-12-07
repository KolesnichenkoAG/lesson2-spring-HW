package ru.geekbrains.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains.context");
        Cart cart = context.getBean(Cart.class);

        System.out.println("введите 1 если хотите получить список продуктов");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            cart.printListProduct();
        }

        System.out.println("введите номер продукта для добавления в корзину");
        Scanner sc1 = new Scanner(System.in);
        Long id = sc1.nextLong();
        cart.createCartFromProduct(id);

        context.close();
    }
}
