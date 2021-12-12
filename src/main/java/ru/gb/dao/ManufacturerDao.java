package ru.gb.dao;

import org.springframework.data.repository.CrudRepository;
import ru.gb.entity.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerDao extends CrudRepository<Manufacturer,Long> {
    List<Manufacturer> findAll();
    Optional<Manufacturer> findById(Long id);
    }


