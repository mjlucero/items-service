package com.app.items.service;

import com.app.items.clients.ProductRestClient;
import com.app.items.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductRestClient productRestClient;

    @Override
    public List<Item> findAll() {
        return productRestClient.getProducts().stream().map(product -> new Item(product, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        return new Item(productRestClient.getProductById(id), 1);
    }
}
