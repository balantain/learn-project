package org.learn.design.patterns.structural.decorator.printers;

public class LaserPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("Laser printing : " + text);
    }
}
