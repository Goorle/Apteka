package com.example.aptekapract;

import java.io.Serializable;

public class MedicalProduct {

    private String productName;
    private String storage;
    private int countProduct;

    public MedicalProduct(String productName, String storage, int countProduct){
        this.productName = productName;
        this.storage = storage;
        this.countProduct = countProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }
}
