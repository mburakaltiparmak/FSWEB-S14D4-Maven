package org.example.rpg;

public interface Bleedable {
    double getDamage();
public default double bleed(){
    return getDamage()*0.25;
}
}
