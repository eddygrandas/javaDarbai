package com.company;

import java.util.List;

public class Monitoring  extends Device{
    public Monitoring(boolean isOn) {
        super(isOn);
    }

    public Monitoring() {
        super();
    }

    public void pingAllDevices(List<Device> devices) {
        for(Device device: devices){
            try {
                device.ping();
                System.out.println("Fuck");
            }catch (DeviceIsOffException e){}
        }
    }
}
