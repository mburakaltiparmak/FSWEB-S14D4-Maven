package org.example.model;

public class Coke extends ProductForSale {
    private String brand;

    public Coke(String type, int price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }
    public Coke(String type,int price,String description){
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(brand);
    }
}
