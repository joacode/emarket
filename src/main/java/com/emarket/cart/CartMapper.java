package com.emarket.cart;

import com.emarket.cart.domain.Cart;
import com.emarket.cart.domain.CartRequest;
import com.emarket.cart.domain.CartSummary;
import com.emarket.items.domain.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    List<Cart> find();

    Cart findById(Long id);

    List<Cart> findTotalAmount();

    void insert(Item item, Integer quantity);

    void update(Long id, Integer quantity);

    void delete(Long id);

}
