package com.behavioral.command.withundoredo;

import com.behavioral.command.AirConditioner;

public class TurnACOffCommand implements Command {

  private AirConditioner airConditioner;

  public TurnACOffCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOffAirConditioner();
  }

  @Override
  public void undo() {
    airConditioner.turnOnAirConditioner();
  }
}
