package org.learn.design.patterns.creational.factory.method;

import org.learn.design.patterns.creational.factory.Car;
import org.learn.design.patterns.creational.factory.LuxaryCar;

public class LuxaryCarFactory implements CarFactory {
    @Override
    public Car build() {
        return new LuxaryCar();
    }
}
