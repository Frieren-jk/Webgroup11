/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.model;

import java.math.BigDecimal;

/**
 *
 * @author John
 */
public class ProductBlueprint {

    private int productID;
    private String productName;
    private String description;
    private String size;
    private BigDecimal price;
    private int quantity;

    public ProductBlueprint(int productID, String productName, String description, String size, BigDecimal price, String quantity) {

    }

    public ProductBlueprint() {
//    wag idelete need sa search inventory
    }

    public ProductBlueprint(
            int productID,
            String productName,
            String description,
            String size,
            BigDecimal price,
            int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductBlueprint{"
                + "productID=" + productID
                + ", productName='" + productName + '\''
                + ", description='" + description + '\''
                + ", size='" + size + '\''
                + ", price=" + price
                + ", quantity='" + quantity + '\''
                + '}';
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
