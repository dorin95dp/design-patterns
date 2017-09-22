package com.dorin.patterns.creational.builder.pizzas;

import com.dorin.patterns.creational.builder.Item;

public abstract class Pizza implements Item {

    @Override
    public abstract double price();
}
