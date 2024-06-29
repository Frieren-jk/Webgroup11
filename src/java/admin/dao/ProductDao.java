package admin.dao;

import admin.model.ProductBlueprint;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * ProductDao class to handle database operations for the Product entity.
 */
public class ProductDao {

    private static final String SELECT_PRODUCT_ID = "SELECT "
            + "productID,"
            + "productName,"
            + "description,"
            + "size,"
            + "price,"
            + "quantity from product where productID = ? ";
    private static final String SELECT_ALL_PRODUCT = "select * from product";
    private static final String DELETE_PRODUCT = "delete from product where productID = ?;";
    private static final String UPDATE_PRODUCT = "UPDATE product SET "
            + "productName=?, "
            + "description=?, "
            + "size=?, "
            + "price=?, "
            + "quantity=? WHERE productID=?";

    // Method to create a new product in the database
    public boolean createProduct(ProductBlueprint product) throws SQLException {
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
        }
        return success;
    }

   
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
    
    //update product
     public boolean updateProduct(String productName, String description, String size, BigDecimal price, int quantity, int productID) {
        boolean success = false;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Get a connection from the connection pool 
            conn = ConnectPool.getConnection();
            // Prepare the SQL statement
            ps = conn.prepareStatement(UPDATE_PRODUCT);
            // Set the parameters for the prepared statement
            ps.setString(1, productName);
            ps.setString(2, description);
            ps.setString(3, size);
            ps.setBigDecimal(4, price);
            ps.setInt(5, quantity);
            ps.setInt(6, productID);
            // Execute the update
            int rowAffected = ps.executeUpdate();
            // Check if the insertion was successful
            if (rowAffected != 0) {
                success = true;
            }
        } catch (SQLException error) {
            System.out.println("updateProduct Error: " + error);
        }
        
        

        return success;
    }
     
     //SELECT USER BY ID
    public ArrayList<ProductBlueprint> selectProduct(int productID) {
        ArrayList<ProductBlueprint> AllProducts = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCT_ID);
            ps.setInt(1, productID);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ProductBlueprint product = new ProductBlueprint();
                product.setProductID(rs.getInt("productID"));
                product.setProductName(rs.getString("productName"));
                product.setDescription(rs.getString("description"));
                product.setSize(rs.getString("size"));
                product.setPrice(rs.getBigDecimal("price"));
                product.setQuantity(rs.getInt("quantity"));

                AllProducts.add(product);
                
                System.out.println(AllProducts);
            }

        } catch (SQLException e) {
            System.out.println("SELECT PRODUCT BY ID error: " + e);
        }

        return AllProducts;
    }

    
    // SELECT ALL USER
    
    
    //DLEETE USER
    public boolean deleteProduct(int productID) throws SQLException {
        boolean rowsDeleted = false;
        Connection conn;
        PreparedStatement ps;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(DELETE_PRODUCT);
            ps.setInt(1, productID);
            
            rowsDeleted = ps.executeUpdate() > 0;
            

        } catch (SQLException e) {
            System.out.println("DELETE PRODUCT error: " + e);
        }
        return rowsDeleted;
    }

}
