package org.learn.design.patterns.structural.adapter;

import org.learn.design.patterns.structural.adapter.adaptee.ElectricCar;
import org.learn.design.patterns.structural.adapter.adaptee.Tesla;
import org.learn.design.patterns.structural.adapter.adapter.ElectricCarAdapter;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new Tesla();
        ElectricCarAdapter electricCarAdapter = new ElectricCarAdapter(tesla);
        electricCarAdapter.refuell();
        electricCarAdapter.startEngine();
        electricCarAdapter.drive();
        electricCarAdapter.stopEngine();
    }
}
