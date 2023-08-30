package org.learn.design.patterns.structural.fasade.hardware;

public class PowerAdapter {
    private boolean isOn = false;

    public void switchPowerButton() {
        if(isPowerOn()) {
            isOn = true;
            System.out.println("Power is turning on");
        } else {
            isOn = false;
            System.out.println("Power is turning of");
        }
    }

    public boolean isPowerOn() {
        return isOn;
    }
}
