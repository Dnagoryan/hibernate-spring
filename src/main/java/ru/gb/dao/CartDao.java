package ru.gb.dao;

import org.springframework.data.repository.CrudRepository;
import ru.gb.entity.Cart;

import java.util.List;

public interface CartDao  extends CrudRepository<Cart,Long> {

    List<Cart> findAll();
}
