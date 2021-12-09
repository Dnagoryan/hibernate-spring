package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import ru.gb.config.JpaConfig;
import ru.gb.dao.*;
import ru.gb.service.ServiceProductDao;

public class ShopApp {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(JpaConfig.class);
        ServiceProductDao serviceProductDao =
                context.getBean(ServiceProductDao.class);
        System.out.println(serviceProductDao.findAllSortedByCostIsDesc());
        System.out.println(serviceProductDao.findAllSortedByCostIsASC());

        }
    }

