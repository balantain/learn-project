package org.learn.design.patterns.structural.decorator.models;

public class JetPrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println("Jet printing: " + text);
    }
}
