package ProjectSpringWeb.repository;

import ProjectSpringWeb.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@Repository
public class ProductJdbcRepository {
    public List<Product> getAllProducts(){
        List<Product> productList = new ArrayList<>();
        Connection connection = getConnection();
        String selectSql = "SELECT * FROM products";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSql);
            //TBD map result set to a list of products
        }
        catch (Exception e) {

        }
        return productList;
    }

    private Connection getConnection() {
        try (Connection con = DriverManager
             .getConnection("jdbc:postgresql://localhost:5432/myshop", "postgres", "password")){
            return con;
        }
        catch (Exception e) {
            System.out.println("Connection error");
        }
        return null;
    }

}
