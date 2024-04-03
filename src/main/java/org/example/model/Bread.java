package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, int price, String description, String flourType) {
        super(type, price, description);

    }

    public Bread(String flourType) {
        super();
        this.flourType = flourType;
    }

    @Override
    void showDetails() {
        System.out.println(flourType);
    }
}
