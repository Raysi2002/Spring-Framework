package com.raysi.autowiring;

import com.raysi.autowiring.beans.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiringApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(AutowiringApplication.class, args);
        Product product = context.getBean(Product.class);
        product.display();
    }

}
