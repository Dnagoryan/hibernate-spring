package ru.gb.dao.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class JpaProductDao implements ProductDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        return entityManager.createQuery("select p from Product p").getResultList();
    }

    @Override
    public Product findById(Long id) {
        TypedQuery<Product> namedQuery = entityManager
                .createNamedQuery("Product.findById", Product.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }


    @Override
    public Product save(Product product) {
        if (product.getId() == null){
            entityManager.persist(product);
        }else{
            entityManager.merge(product);
        }

        return product;
    }
}
