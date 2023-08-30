package org.learn.design.patterns.structural.fasade.hardware;

public class Hdd {
    private String data;
    public void copyData(CdRom cdRom) {
        data = cdRom.getData();
        System.out.println("Data is copied: \"" + data + "\"");
    }
}
