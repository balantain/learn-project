package org.learn.design.patterns.creational.factory.simple;

import org.learn.design.patterns.creational.factory.Car;
import org.learn.design.patterns.creational.factory.LuxaryCar;
import org.learn.design.patterns.creational.factory.OffroadCar;
import org.learn.design.patterns.creational.factory.SportCar;

public class SimpleCarBuilder {
    private static Car car;

    public static Car buildCar(CarType carType) {
        switch (carType) {
            case SPORT -> car = new SportCar();
            case LUXURY -> car = new LuxaryCar();
            case OFFROAD -> car = new OffroadCar();
            default -> System.out.println("Car type is not defined");
        }
        return car;
    }

}
