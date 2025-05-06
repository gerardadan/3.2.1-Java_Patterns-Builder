package org.lvl1;

import java.util.List;

public interface IPizzaBuilder {
    public PizzaBuilder setSize(int size);
    public PizzaBuilder setDough(String dough);
    public PizzaBuilder setToppings(List<Topping> toppings);
}
