package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.CartDao;
import ru.gb.entity.Cart;

import javax.sql.rowset.CachedRowSet;

@Service
@RequiredArgsConstructor
@Transactional
public class ServiceCartDao {

    private CartDao cartDao;

    @Transactional(readOnly = true)
    public Iterable<Cart> findAll(){
        return cartDao.findAll();
    }
}
