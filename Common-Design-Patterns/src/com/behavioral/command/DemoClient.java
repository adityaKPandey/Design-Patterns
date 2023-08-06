package com.behavioral.command;

//Client
public class DemoClient {

  public static void main(String [] args){
     AirConditioner airConditioner = new AirConditioner();
     MyRemoteControl myRemoteControl = new MyRemoteControl(new TurnACOnCommand(airConditioner));
     myRemoteControl.pressButton();

     myRemoteControl = new MyRemoteControl(new TurnACOffCommand(airConditioner));
     myRemoteControl.pressButton();

  }
}
