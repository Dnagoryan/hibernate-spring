package ru.gb.daohome;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import ru.gb.entity.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
//@RequiredArgsConstructor
//public class NamedParameterJdbcProductDao implements ProductDao {
//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id =:id";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id =:id";
//
//    @Override
//    public List<Product> findAll() {
//        List<Product> products=namedParameterJdbcTemplate.query(FIND_ALL,new BeanPropertyRowMapper<>(Product.class));
//        return products;
//    }
//
//    @Override
//    public Product findById(Long id) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("id", id);
//        return namedParameterJdbcTemplate.queryForObject(FIND_BY_ID,params,idRowMapper());
//    }
//
//    private RowMapper<Product> idRowMapper() {
//        return (rs, rowNum) -> Product.builder()
//                .id(rs.getLong("id"))
//                .title(rs.getString("title"))
//                .cost(rs.getBigDecimal("cost"))
//                .productDate(rs.getDate("productDate"))
//                .build();
//    }
//    @Override
//    public String findTitleById(Long id) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("id", id);
//        return namedParameterJdbcTemplate.queryForObject(FIND_TITLE_BY_ID, params,String.class);
//    }


//}
