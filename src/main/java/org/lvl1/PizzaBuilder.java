package org.lvl1;

import java.util.List;

public class PizzaBuilder implements IPizzaBuilder{
    protected int size;
    protected String dough;
    protected List<Topping> toppings;

    @Override
    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(List<Topping> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder build(){
        return new MasterPizza(this);
    }

}
