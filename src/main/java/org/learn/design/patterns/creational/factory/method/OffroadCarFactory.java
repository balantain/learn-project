package org.learn.design.patterns.creational.factory.method;

import org.learn.design.patterns.creational.factory.Car;
import org.learn.design.patterns.creational.factory.OffroadCar;

public class OffroadCarFactory implements CarFactory {
    @Override
    public Car build() {
        return new OffroadCar();
    }
}
