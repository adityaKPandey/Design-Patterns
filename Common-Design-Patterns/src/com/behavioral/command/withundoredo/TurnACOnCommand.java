package com.behavioral.command.withundoredo;

import com.behavioral.command.AirConditioner;

public class TurnACOnCommand implements Command {

  private AirConditioner airConditioner;

  public TurnACOnCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOnAirConditioner();
  }

  @Override
  public void undo() {
    airConditioner.turnOffAirConditioner();
  }
}
