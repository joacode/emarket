package com.emarket.items;

import com.emarket.items.domain.Item;
import com.emarket.items.domain.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/items", produces = "application/json; charset=utf-8")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping
    public List<Item> find() {
        return this.itemsService.find();
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable Long id) {
        return this.itemsService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody ItemRequest request) {
        this.itemsService.insert(request);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody ItemRequest request) {
        this.itemsService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.itemsService.delete(id);
    }

}
