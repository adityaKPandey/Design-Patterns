package com.behavioral.chainofresponsibility;

public class DebugLogProcessor extends AbstractLogProcessor {

  public DebugLogProcessor(
      AbstractLogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(String level, String message) {
    if (AbstractLogProcessor.DEBUG == level)
      System.out.println("DEBUG: " + message);
    else
      super.log(level, message);
  }

}
