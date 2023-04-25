package com.emarket.cart;

import com.emarket.cart.domain.Cart;
import com.emarket.cart.domain.CartRequest;
import com.emarket.cart.domain.CartSummary;
import com.emarket.items.ItemsMapper;
import com.emarket.items.domain.Item;
import com.emarket.items.domain.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Autowired
    private CartMapper cartMapper;

    public List<Cart> find() {
        return this.cartMapper.find();
    }

    public Cart findById(Long id) {
        return this.cartMapper.findById(id);
    }

    public float findTotalAmount() {

        List<Cart> cartSummary = this.cartMapper.findTotalAmount();

        float total = 0f;

        for (Cart item : cartSummary) {
            total = total + item.getPrice() * item.getQuantity();
        }

        return total;
    }

    public void insert(Long id, CartRequest request) {
        Integer quantity = request.getQuantity();

        ItemRequest itemRequest = new ItemRequest();

        Item item_data = this.itemsMapper.findById(id);
        itemRequest.setStock(item_data.getStock() - quantity);

        this.cartMapper.insert(item_data, quantity);

        this.itemsMapper.update(id, itemRequest);
    }

    public void update(CartRequest request) {
        Long id = request.getId();
        Integer quantity = request.getQuantity();

        Item itemData = this.itemsMapper.findById(id);
        Cart cartData = this.cartMapper.findById(id);

        Integer newStock = quantity - cartData.getQuantity();

        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setStock(itemData.getStock() - newStock);

        this.itemsMapper.update(id, itemRequest);
        this.cartMapper.update(id, quantity);
    }

    public void delete(Long id) {
        Cart cartData = this.cartMapper.findById(id);
        Item itemData = this.itemsMapper.findById(id);

        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setStock(cartData.getQuantity() + itemData.getStock());

        this.itemsMapper.update(id, itemRequest);
        this.cartMapper.delete(id);
    }

}
