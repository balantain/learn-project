package org.learn.design.patterns.creational.factory;

import org.learn.design.patterns.creational.factory.method.CarFactory;
import org.learn.design.patterns.creational.factory.method.SportCarFactory;
import org.learn.design.patterns.creational.factory.simple.CarType;
import org.learn.design.patterns.creational.factory.simple.SimpleCarBuilder;

public class Main {
    public static void main(String[] args) {
        Car car = SimpleCarBuilder.buildCar(CarType.SPORT);
        car.drive();

        CarFactory factory = new SportCarFactory();
        Car sportCar = factory.build();
        sportCar.drive();
    }
}
