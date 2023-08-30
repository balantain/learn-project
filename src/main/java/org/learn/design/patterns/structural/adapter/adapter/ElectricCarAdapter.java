package org.learn.design.patterns.structural.adapter.adapter;

import org.learn.design.patterns.structural.adapter.adaptee.ElectricCar;
import org.learn.design.patterns.structural.adapter.models.EngineCar;

public class ElectricCarAdapter implements EngineCar {
    ElectricCar electricCar;

    public ElectricCarAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public void refuell() {
        electricCar.charge();
    }

    @Override
    public void startEngine() {
        electricCar.turnOn();
    }

    @Override
    public void drive() {
        electricCar.drive();
    }

    @Override
    public void stopEngine() {
        electricCar.turnOff();
    }
}
