package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        Chocolate choco = new Chocolate("Junk Food",10,"Cocoa Oil","White");
        Coke pepsi = new Coke("Drink",12,"Made in USA","Dr.Coke");
        Bread ekmek = new Bread("Food",5,"Bakery","Wheat");
        products[0]=choco;
        products[1]=pepsi;
        products[2]=ekmek;
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
         
            product.showDetails();
        }
    }
}