package com.app.items.clients;

import com.app.items.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "products-service")
public interface ProductRestClient {

    @GetMapping("/products")
    List<Product> getProducts();

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id);
}
