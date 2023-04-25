package com.emarket.cart;

import com.emarket.cart.domain.Cart;
import com.emarket.cart.domain.CartRequest;
import com.emarket.cart.domain.CartSummary;
import com.emarket.items.domain.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cart", produces = "application/json; charset=utf-8")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> find() {
        return this.cartService.find();
    }

    @GetMapping("/{id}")
    public Cart findById(@PathVariable Long id) {
        return this.cartService.findById(id);
    }

    @PostMapping("/{id}")
    public void insert(@PathVariable Long id, @RequestBody CartRequest request) {
        this.cartService.insert(id, request);
    }

    @PostMapping
    public Float findTotalAmount() {
        return this.cartService.findTotalAmount();
    }

    @PutMapping
    public void update(@RequestBody CartRequest request) {
        this.cartService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.cartService.delete(id);
    }

}
