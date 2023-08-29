package org.learn.design.patterns.creational.factory.method;

import org.learn.design.patterns.creational.factory.Car;
import org.learn.design.patterns.creational.factory.SportCar;

public class SportCarFactory implements CarFactory {
    @Override
    public Car build() {
        return new SportCar();
    }
}
