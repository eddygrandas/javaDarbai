package com.company;

public class Item {
    private String productId;
    private double price;
    private int quantity;
    private String title;
    private String description;

    public Item(String productId, double price, int quantity, String title, String description) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productId='" + productId + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
