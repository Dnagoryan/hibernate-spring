package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.gb.confighome.HibernateConfig;
import ru.gb.daohome.ProductDao;
import ru.gb.entity.Product;

public class ShopApp {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        System.out.println(productDao.findById(6L));
        System.out.println("-----------------------");
        System.out.println(productDao.findTitleById(6L));
        System.out.println("-----------------------");
        for (Product product : productDao.findAll()) {
            System.out.println(product);
            /* SpringJdbc  */
//     JDBC (1,2) JdbcProductDao jdbcProductDao=new JdbcProductDao();
////     1    for (Product product: jdbcProductDao.findAll()){
////            System.out.println(product);
////
////        }
//       2 System.out.println(jdbcProductDao.findById(5L));
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
}
