package org.learn.design.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);
        DeliveryService service = new DeliveryService();
        service.setDeliverStrategy(new ExpressDeliverStrategy());
        service.deliver(order);

        service.setDeliverStrategy(new RegularDeliverStrategy());
        service.deliver(order);
    }
}
