package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, int price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public Bread(String type,int price,String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(flourType);
    }
}
