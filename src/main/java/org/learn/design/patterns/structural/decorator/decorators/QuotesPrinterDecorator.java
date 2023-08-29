package org.learn.design.patterns.structural.decorator.decorators;

import org.learn.design.patterns.structural.decorator.printers.Printer;

public class QuotesPrinterDecorator extends PrinterDecorator {

    public QuotesPrinterDecorator(Printer printer) {
        super(printer);
    }

    private String addQuotes(String text) {
        return "<<<< " + text + " >>>>";
    }

    public void print(String text) {
        super.print(addQuotes(text));
    }
}
