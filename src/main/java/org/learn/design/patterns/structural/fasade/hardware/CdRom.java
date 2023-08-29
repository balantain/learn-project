package org.learn.design.patterns.structural.fasade.hardware;

public class CdRom {
    private String data;
    private boolean hasData = false;

    public boolean isLoaded() {
        return hasData;
    }

    public CdRom loadData(String data) {
        if (!isLoaded()) {
            this.data = data;
            hasData = true;
            System.out.println("Incerting CD with data in Cd-rom");
            return this;
        } else {
            System.out.println("CD-rom is already loaded");
            return this;
        }
    }

    public void unloadData() {
        if (isLoaded()) {
            data = null;
            hasData = false;
            System.out.println("Ejecting CD from CD-rom");
        } else {
            System.out.println("CD-rom is not loaded yet");
        }
    }
    public String getData() {
        return data;
    }
}
