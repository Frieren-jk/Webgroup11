/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.dao;

import admin.model.EmployeeBlueprint;
import admin.model.ProductBlueprint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchInventory {

    public ArrayList<EmployeeBlueprint> getAllUser() {
        ArrayList<EmployeeBlueprint> AllUser = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT "
                    + "userName, "
                    + "password, "
                    + "firstName, "
                    + "middleName, "
                    + "lastName, "
                    + "address, "
                    + "birthday, "
                    + "mobileNumber, "
                    + "accountStatus, "
                    + "loginStatus "
                    + "FROM employee";

            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {

                EmployeeBlueprint user = new EmployeeBlueprint();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstName"));
                user.setMiddleName(rs.getString("middleName"));
                user.setLastName(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setBirthday(rs.getString("birthday"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAccountStatus(rs.getString("accountStatus"));
                user.setLoginStatus(rs.getString("loginStatus"));
              

                AllUser.add(user);

              

            }

        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    //ignore
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    //ignore
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    //ignore
                }
            }

        }

        return AllUser;

    }
    
    public ArrayList<ProductBlueprint> getAllProducts() {
        ArrayList<ProductBlueprint> allProducts = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT "
                    + "productID, "
                    + "productName, "
                    + "description, "
                    + "size, "
                    + "price, "
                    + "quantity "
                    + "FROM product";

            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProductBlueprint product = new ProductBlueprint();
                product.setProductID(rs.getInt("productID"));
                product.setProductName(rs.getString("productName"));
                product.setDescription(rs.getString("description"));
                product.setSize(rs.getString("size"));
                product.setPrice(rs.getBigDecimal("price"));
                product.setQuantity(rs.getInt("quantity"));

                allProducts.add(product);
            }

        } catch (SQLException error) {
            System.out.println("getAllProducts Error: " + error);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    // ignore
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // ignore
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    // ignore
                }
            }
        }

        return allProducts;
    }

}
