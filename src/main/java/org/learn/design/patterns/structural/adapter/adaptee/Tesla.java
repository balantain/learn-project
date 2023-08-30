package org.learn.design.patterns.structural.adapter.adaptee;

public class Tesla implements ElectricCar{

    public void charge() {
        System.out.println("Tesla is charging");
    }
    public void turnOn() {
        System.out.println("Tesla turns on");
    }

    public void drive() {
        System.out.println("Tesla is driving");
    }

    public void turnOff() {
        System.out.println("Tesla turns off");
    }
}
