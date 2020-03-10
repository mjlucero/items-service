package com.app.items.service;
import com.app.items.models.Item;
import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer quantity);
}
