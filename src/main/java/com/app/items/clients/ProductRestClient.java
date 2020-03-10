package com.app.items.clients;

import com.app.items.models.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient
public interface ProductRestClient {

    @GetMapping("/products")
    public List<Product> getProducts();

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id);
}
