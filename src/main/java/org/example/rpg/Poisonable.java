package org.example.rpg;
import org.example.rpg.Monster;
public interface Poisonable {
    double getDamage();
    public default double poison(){
        return getDamage()*0.3;
    }
}
