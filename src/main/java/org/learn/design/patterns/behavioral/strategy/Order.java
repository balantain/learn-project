package org.learn.design.patterns.behavioral.strategy;

import lombok.Data;

@Data
public class Order {
    private int id;

    public Order(int id) {
        this.id = id;
    }
}
