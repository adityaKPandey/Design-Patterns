package com.behavioral.command.withundoredo;

import com.behavioral.command.AirConditioner;

public class UndoClient {

  public static void main(String [] args){
    AirConditioner airConditioner = new AirConditioner();
    Command turnOnCommand = new TurnACOnCommand(airConditioner);
    MyRemoteControl myRemoteControl = new MyRemoteControl();
    myRemoteControl.setCommand(turnOnCommand);
    myRemoteControl.pressButton();

    Command turnOffCommand = new TurnACOffCommand(airConditioner);
    myRemoteControl.setCommand(turnOffCommand);
    myRemoteControl.pressButton();

    myRemoteControl.undo();


  }

}
