package ru.gb.dao.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.ClientDao;
import ru.gb.entity.Client;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Order;
import ru.gb.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
@Transactional
public class JpaClientDao implements ClientDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Client> findAll() {
        return entityManager
                .createQuery("select o from ord o")
                .getResultList();
    }

    @Override
    public Client findById(Long id) {
        TypedQuery<Client> namedQuery = entityManager
                .createNamedQuery("Client.findById", Client.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public Client findOrderById(Long id) {
        TypedQuery<Client> namedQuery = entityManager
                .createNamedQuery("Client.findById", Client.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }
}
