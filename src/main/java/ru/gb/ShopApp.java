package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import ru.gb.config.JpaConfig;
import ru.gb.dao.*;
import ru.gb.dao.Impl.JpaManufacturerDao;
import ru.gb.entity.Client;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Order;
import ru.gb.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ShopApp {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(JpaConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        ClientDao clientDao=context.getBean(ClientDao.class);
        OrderDao   orderDao=context.getBean(OrderDao.class);

        Order testOrder = Order.builder()
                .products(new ArrayList<>(productDao.findAll().subList(1,5)))
                .cost(orderDao.finalAmount(productDao.findAll().subList(1,5)))
                .client(clientDao.findById(3L))
                .build();
        System.out.println(testOrder);
        orderDao.save(testOrder);


//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);

//        CartDao cartDao = context.getBean(CartDao.class);
//        JpaManufacturerDao jpaDao = context.getBean(JpaManufacturerDao.class);
//        System.out.println(productDao.findById(6L));
//        System.out.println("-----------------------");
//        System.out.println(productDao.findTitleById(6L));
//        System.out.println("-----------------------");



//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//    }
//        --------------------------------------------------------
//      Manufacturer testManufacturer =  Manufacturer.builder()
//                .name("Company 1")
//                .products(new HashSet<Product>(productDao.findAll().subList(1,5)))
//                .build();
//        System.out.println(testManufacturer);
//        manufacturerDao.save(testManufacturer);
//                ___________________________________________
//            System.out.println(manufacturerDao.findById(7L));

//      ----------------------------------------------------------
//        Manufacturer savedManufacturer=manufacturerDao.findById(5L);
//        savedManufacturer.setName("Apple");
//        manufacturerDao.save(savedManufacturer);
//        _________________________________________________________
//        manufacturerDao.deleteById(7L);

//        _____________________________________________________

//        Product product = productDao.findAll().get(5);
//        Cart cart= new Cart();
//        cart.addProduct(product);
//        cartDao.save(cart);
//        ___________________________________
            /* SpringJdbc  */
//     JDBC (1,2) JdbcProductDao jdbcProductDao=new JdbcProductDao();
////     1    for (Product product: jdbcProductDao.findAll()){
////            System.out.println(product);
////
////        }
//        System.out.println("Имя по ID: "+jdbcProductDao.findTitleById(5L));
            /* JdbcTemplate  */
//        AnnotationConfigApplicationContext context
//                = new AnnotationConfigApplicationContext(DbConfig.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }
//        System.out.println(productDao.findById(6L));
//        System.out.println(productDao.findTitleById(6L));
//
//    }


        }
    }

