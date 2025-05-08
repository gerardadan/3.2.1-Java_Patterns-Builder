package org.lvl1;

import org.lvl1.Pizza;
import org.lvl1.PizzaBuilder;
import org.lvl1.Topping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder builder = new Pizza.Builder();
        PizzaBuilder pizza = new Pizza.Builder()
                .setSize(1)
                .setDough("fine")
                .setHawaiana();


    }
}