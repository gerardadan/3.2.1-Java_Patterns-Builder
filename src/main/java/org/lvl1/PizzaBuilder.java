package org.lvl1;

import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(List<Topping> toppings);
    Pizza build();

    void showInfo();
}
