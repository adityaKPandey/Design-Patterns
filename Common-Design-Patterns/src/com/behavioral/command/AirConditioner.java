package com.behavioral.command;

//Receiver
public class AirConditioner {
   private boolean on;
   private int temperature;

   public void turnOnAirConditioner(){
     this.on = true;
     System.out.println("Turn on AC ");
   }

  public void turnOffAirConditioner(){
    this.on = false;
    System.out.println("Turn off AC ");
  }

  public void setTemperature(){
    this.temperature = temperature;
    System.out.println("Temperature set to "+temperature);
  }
}
