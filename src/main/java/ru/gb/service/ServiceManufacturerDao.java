package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.ManufacturerDao;
import ru.gb.entity.Manufacturer;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ServiceManufacturerDao {

    private ManufacturerDao manufacturerDao;

    @Transactional(readOnly = true)
    public List<Manufacturer> findAll(){
        return manufacturerDao.findAll();
    }

    @Transactional(readOnly = true)
    public Manufacturer findById(Long id){
        return manufacturerDao.findById(id).get();

    }


}
