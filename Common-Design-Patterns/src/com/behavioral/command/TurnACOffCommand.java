package com.behavioral.command;

public class TurnACOffCommand implements Command{

  private AirConditioner airConditioner;

  public TurnACOffCommand(AirConditioner airConditioner){
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
     airConditioner.turnOffAirConditioner();
  }
}
