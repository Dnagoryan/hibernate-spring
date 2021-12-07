package ru.gb.dao;

import ru.gb.entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(Long id);

    Product save(Product product);


}
