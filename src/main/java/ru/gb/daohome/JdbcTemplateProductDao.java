package ru.gb.daohome;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.gb.entity.Product;

import java.sql.ResultSet;
import java.util.List;
//@Component
//@RequiredArgsConstructor
//public class JdbcTemplateProductDao implements ProductDao {
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id = ?";
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Override
//    public List<Product> findAll() {
//        List<Product> products = jdbcTemplate.query(
//                FIND_ALL,
//                new BeanPropertyRowMapper(Product.class));
//
//        return products;
//    }
//
//    @Override
//    public Product findById(Long id) {
//
//        return jdbcTemplate.queryForObject(FIND_BY_ID,rowMapper(), id);
//
//    }
//
//    private RowMapper<Product> rowMapper() {
//        return (rs, rowNum) -> Product.builder()
//                .id(rs.getLong("id"))
//                .title(rs.getString("title"))
//                .cost(rs.getBigDecimal("cost"))
//                .productDate(rs.getDate("productDate"))
//                .build();
//    }
//
//
//
//    @Override
//    public String findTitleById(Long id) {
//
//        return jdbcTemplate.queryForObject(FIND_TITLE_BY_ID, String.class, id);
//    }
//}
