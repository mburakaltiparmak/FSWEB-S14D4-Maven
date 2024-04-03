package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateType;

    public Chocolate(String type, int price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType = chocolateType;
    }
    public Chocolate(String type,int price,String description){
        super(type, price, description);
    }

    @Override
   public void showDetails() {
        System.out.println(chocolateType);
    }

}
