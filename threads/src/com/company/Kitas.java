package com.company;

import java.time.LocalTime;

import static java.lang.Thread.sleep;

public class Kitas {
    public void run() {

        for (int i=0; i<=100;i++){
            System.out.println(LocalTime.now());
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
