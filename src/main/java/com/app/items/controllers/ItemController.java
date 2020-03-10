package com.app.items.controllers;

import com.app.items.models.Item;
import com.app.items.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}/quantity/{quantity}")
    public Item getItemById (@PathVariable Long id, @PathVariable Integer quantity) {
        return itemService.findById(id, quantity);
    }
}
