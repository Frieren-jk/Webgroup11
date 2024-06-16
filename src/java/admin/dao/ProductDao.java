package admin.dao;

import admin.model.ProductBlueprint;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ProductDao class to handle database operations for the Product entity.
 */
public class ProductDao {

    // Method to create a new product in the database
    public boolean createProduct(ProductBlueprint product) {
        boolean success = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO product ("
                + "productID, "
                + "productName, "
                + "description, "
                + "size, "
                + "price, "
                + "quantity) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            // Get a connection from the connection pool
            conn = ConnectPool.getConnection();
            // Prepare the SQL statement
            ps = conn.prepareStatement(query);
            // Set the parameters for the prepared statement
            ps.setInt(1, product.getProductID());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getSize());
            ps.setBigDecimal(5, product.getPrice());
            ps.setInt(6, product.getQuantity());
            // Execute the update
            int rowAffected = ps.executeUpdate();
            // Check if the insertion was successful
            if (rowAffected != 0) {
                success = true;
            }
        } catch (SQLException error) {
            System.out.println("createProduct Error: " + error);
        } finally {
            // Close the connection and prepared statement
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Ignore the exception
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    // Ignore the exception
                }
            }
        }
        return success;
    }

    // Method to get a product list (this is a placeholder, typically you would get a list from the database)
    public ProductBlueprint getProductList(ProductBlueprint product) {
        // Get the fields from the product object
        int productID = product.getProductID();
        String productName = product.getProductName();
        String description = product.getDescription();
        String size = product.getSize();
        BigDecimal price = product.getPrice();
        int quantity = product.getQuantity();
        // Create a new product object with the same fields
        ProductBlueprint productList = new ProductBlueprint(
                productID,
                productName,
                description,
                size,
                price,
                quantity);
        return productList;
    }

}
