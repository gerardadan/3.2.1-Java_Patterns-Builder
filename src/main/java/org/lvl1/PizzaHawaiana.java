package org.lvl1;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiana extends Pizza {
    private final int size;
    private final String dough;
    private List<Topping> toppings = new ArrayList<>();

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    private PizzaHawaiana(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.toppings = List.copyOf(builder.toppings);
    }

    public void showInfo() {
        System.out.println("Size:" + this.size);
        System.out.println("Dough:" + this.dough);
        System.out.println("Toppings:" + this.toppings);
    }

    public static class Builder implements PizzaBuilder {
        private int size;
        private String dough;
        private List<Topping> toppings = new ArrayList<>();

        public Builder() {

        }

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

        @Override
        public PizzaHawaiana build() {
            return new PizzaHawaiana(this);
        }

        @Override
        public void showInfo() {

        }

    }


}
