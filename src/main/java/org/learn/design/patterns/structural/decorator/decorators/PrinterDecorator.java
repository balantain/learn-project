package org.learn.design.patterns.structural.decorator.decorators;

import org.learn.design.patterns.structural.decorator.models.Printer;

public abstract class PrinterDecorator implements Printer {
    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }
}
