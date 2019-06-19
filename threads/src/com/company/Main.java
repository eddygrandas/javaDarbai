package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String args[]) throws InterruptedException {
             Thread timePrint=new Thread(()->{
                 while(true){
                     System.out.println(LocalDateTime.now());
                     try {
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         break;
                     }
                 }
             });
             timePrint.start();
             for (int i=0; i<=10; i++){
                 System.out.println(i);
                 Thread.sleep(500);

             }
        timePrint.interrupt();
    }

}