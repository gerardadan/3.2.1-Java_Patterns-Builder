package org.lvl1;

import org.lvl1.Pizza;
import org.lvl1.PizzaBuilder;
import org.lvl1.Topping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder builder = new Pizza.Builder();
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato"));
        toppings.add(new Topping("Chesse"));
        toppings.add(new Topping("Jam"));
        toppings.add(new Topping("pineapple"));
        PizzaBuilder pizza = new Pizza.Builder()
                .setSize(1)
                .setDough("fine")
                .setToppings(toppings);


        pizza.showInfo();
    }
}