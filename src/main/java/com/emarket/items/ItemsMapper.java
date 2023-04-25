package com.emarket.items;

import com.emarket.items.domain.Item;
import com.emarket.items.domain.ItemRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemsMapper {

    List<Item> find();

    Item findById(Long id);

    void insert(ItemRequest params);

    void update(Long id, ItemRequest params);

    void delete(Long id);

}
