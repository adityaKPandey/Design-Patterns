package com.behavioral.command.withundoredo;

import java.util.Stack;

public class MyRemoteControl {

  private Stack<Command> commandHistory = new Stack<>();
  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void pressButton(){
    command.execute();
    commandHistory.add(command);
  }

  public void undo(){
     if(!commandHistory.empty()){
        Command lastCommand = commandHistory.pop();
        lastCommand.execute();
     }
  }



}
