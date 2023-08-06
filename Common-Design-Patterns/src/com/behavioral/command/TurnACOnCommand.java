package com.behavioral.command;

public class TurnACOnCommand implements Command{

  private AirConditioner airConditioner;

  public TurnACOnCommand(AirConditioner airConditioner){
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
     airConditioner.turnOnAirConditioner();
  }
}
