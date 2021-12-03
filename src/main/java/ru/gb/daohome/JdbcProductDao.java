package ru.gb.daohome;

import ru.gb.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//
//public class JdbcProductDao implements ProductDao {
//
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id = ?";
//
//
//    private Connection connection;
//
//    private Connection getConnection() throws SQLException {
//        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
//    }
//
//    private void closeConnection(Connection connection) {
//        if (connection == null) {
//            return;
//        }
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<Product> findAll() {
//        List<Product> productList = new ArrayList<>();
//        try {
//            connection = getConnection();
//            PreparedStatement statement = connection.prepareStatement(FIND_ALL);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                final Product product = Product.builder()
//                        .id(resultSet.getLong("id"))
//                        .title(resultSet.getString("title"))
//                        .cost(resultSet.getBigDecimal("cost"))
//                        .productDate(resultSet.getDate("productDate"))
//                        .build();
//                productList.add(product);
//            }
//            statement.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            closeConnection(connection);
//        }
//        return productList;
//    }
//
//    @Override
//    public Product findById(Long id) {
//        try {
//            connection = getConnection();
//            PreparedStatement statement = connection.prepareStatement(FIND_BY_ID);
//            statement.setLong(1, id);
//
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                final Product product = Product.builder()
//                        .id(resultSet.getLong("id"))
//                        .title(resultSet.getString("title"))
//                        .cost(resultSet.getBigDecimal("cost"))
//                        .productDate(resultSet.getDate("productDate"))
//                        .build();
//                return product;
//            }
//            statement.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            closeConnection(connection);
//        }
//        return null;
//
//    }
//
//    @Override
//    public String findTitleById(Long id) {
//        try {
//            connection = getConnection();
//            PreparedStatement statement = connection.prepareStatement(FIND_TITLE_BY_ID);
//            statement.setLong(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                final String title = resultSet.getString("title");
//                return title;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            closeConnection(connection);
//        }
//        return null;
//    }


//}
