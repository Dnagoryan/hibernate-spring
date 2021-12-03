package ru.gb.daohome;

import ru.gb.entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(Long id);
    String findTitleById(Long id);


}
