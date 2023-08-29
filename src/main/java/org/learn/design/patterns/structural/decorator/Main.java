package org.learn.design.patterns.structural.decorator;

import org.learn.design.patterns.structural.decorator.decorators.AsteriskPrinterDecorator;
import org.learn.design.patterns.structural.decorator.decorators.QuotesPrinterDecorator;
import org.learn.design.patterns.structural.decorator.printers.LaserPrinter;
import org.learn.design.patterns.structural.decorator.printers.Printer;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Printer printer = new QuotesPrinterDecorator(
                new AsteriskPrinterDecorator(
                        new QuotesPrinterDecorator(new LaserPrinter())));
        printer.print(text);
    }
}
