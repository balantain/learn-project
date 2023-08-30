package org.learn.design.patterns.structural.fasade;

import org.learn.design.patterns.structural.fasade.hardware.CdRom;
import org.learn.design.patterns.structural.fasade.hardware.Hdd;
import org.learn.design.patterns.structural.fasade.hardware.PowerAdapter;

public class Computer {
    private PowerAdapter powerAdapter;
    private CdRom cdRom;
    private Hdd hdd;

    public Computer() {
        powerAdapter = new PowerAdapter();
        cdRom = new CdRom();
        hdd = new Hdd();
    }

    public void copyData(String data) {
        powerAdapter.switchPowerButton();
        hdd.copyData(cdRom.loadData(data));
        cdRom.unloadData();
        powerAdapter.switchPowerButton();
    }
}
