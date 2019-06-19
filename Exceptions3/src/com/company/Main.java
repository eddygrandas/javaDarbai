package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main extends Device{

    public static void main(String[] args) {
	// write your code here
        Monitoring monitoring = new Monitoring();

        List<Device> devices = new ArrayList<>();
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(false));
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));

        monitoring.pingAllDevices(devices);
        devices.get(3).setOn(false);
        monitoring.pingAllDevices(devices);

    }
}
