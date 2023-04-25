package com.emarket.items;

import com.emarket.items.domain.Item;
import com.emarket.items.domain.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Item> find() {
        return this.itemsMapper.find();
    }

    public Item findById(Long id) {
        return this.itemsMapper.findById(id);
    }

    public void insert(ItemRequest request) {
        this.itemsMapper.insert(request);
    }

    public void update(Long id, ItemRequest request) {
        this.itemsMapper.update(id, request);
    }

    public void delete(Long id) {
        this.itemsMapper.delete(id);
    }

}
