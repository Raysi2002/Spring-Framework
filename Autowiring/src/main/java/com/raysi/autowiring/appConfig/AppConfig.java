package com.raysi.autowiring.appConfig;

import com.raysi.autowiring.beans.Product;
import com.raysi.autowiring.beans.Supplier;
import com.raysi.autowiring.beans.SupplierAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.raysi.autowiring.beans")
public class AppConfig {
    @Bean
    public Supplier supplier(){
        Supplier supplier = new Supplier("Raysi Corp.");
        return supplier;
    }

    @Bean
    public SupplierAddress supplierAddress(){
        return new SupplierAddress("Laukahi", "Koshi", "Nepal");
    }
    @Bean
    public Product product(){
        Product product = new Product();
        product.setProductName("Earphones");
        product.setPid(116);
        product.setSellingPrice(99.99);
        product.setQuanity(10000);
        return product;
    }
}
