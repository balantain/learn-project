package org.learn.design.patterns.behavioral.strategy;

public class RegularDeliverStrategy implements DeliverStrategy {
    @Override
    public void deliver(Order order) {
        System.out.println("Order with id " + order.getId()
                + " will be delivered within 5 working days");
    }
}
