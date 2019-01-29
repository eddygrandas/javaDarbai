package com.company;
import java.util.*;


public class Device {
    private int counter =0;
    private boolean isOn;
    private double id;
    

    public Device(boolean isOn) {
        //Random randnr= new Random();
        this.isOn=isOn;//randnr.nextBoolean();
        //this.isOn = isOn;
        this.id = counter++;//(int) (Math.random()*10000000);
    }

    public Device() {
        
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCounter() {
        return counter;
    }

    public double getId() {
        return id;
    }

    public void ping() throws  DeviceIsOffException{

        if (!isOn) {
            throw  new DeviceIsOffException();
        }
    }

    public void setOn(boolean b) {
    }
}


