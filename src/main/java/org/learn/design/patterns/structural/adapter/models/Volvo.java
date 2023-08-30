package org.learn.design.patterns.structural.adapter.models;

public class Volvo implements EngineCar {
    @Override
    public void refuell() {
        System.out.println("Volvo is refueling");
    }

    @Override
    public void startEngine() {
        System.out.println("Volvo starts the engine");
    }

    @Override
    public void drive() {
        System.out.println("Volvo is driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("Volvo stops the engine");
    }
}
