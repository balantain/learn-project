package org.learn.design.patterns.structural.decorator.decorators;

import org.learn.design.patterns.structural.decorator.printers.Printer;

public class AsteriskPrinterDecorator extends PrinterDecorator {
    public AsteriskPrinterDecorator(Printer printer) {
        super(printer);
    }

    private String addAsterisk(String text) {
        return "*** " + text + " ***";
    }

    public void print(String text) {
        super.print(addAsterisk(text));
    }
}
