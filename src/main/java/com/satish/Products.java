package com.satish;

import java.util.ArrayList;
import java.util.List;

public class Products {
    int price;
    String productName;

    public Products(String productName, int price) {
        this.price = price;
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getProductList(){
        List<String> productList = new ArrayList<>();
        productList.add("Apple MacBook Pro");
        productList.add("Apple MacBook Air");
        productList.add("Apple iphone 12");
        return productList;
    }



}
