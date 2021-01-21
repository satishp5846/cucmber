package com.satish;

public class Search {


    public String displayProduct(Products product){
        if(product.getProductList().contains(product.getProductName())){
            return product.getProductName();
        }
        return null;
    }
}
