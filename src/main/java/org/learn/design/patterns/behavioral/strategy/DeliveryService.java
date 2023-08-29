package org.learn.design.patterns.behavioral.strategy;

public class DeliveryService {
    private DeliverStrategy strategy;

    public void setDeliverStrategy(DeliverStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliver(Order order) {
        if (strategy != null) {
            strategy.deliver(order);
        } else {
            System.out.println("Deliver strategy is not defined");
        }
    }
}
