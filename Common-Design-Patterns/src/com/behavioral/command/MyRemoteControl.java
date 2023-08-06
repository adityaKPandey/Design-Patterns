package com.behavioral.command;

public class MyRemoteControl {

  private Command command;

  public MyRemoteControl(Command command){
       this.command = command;
  }

  public void pressButton(){
    command.execute();
  }

}
