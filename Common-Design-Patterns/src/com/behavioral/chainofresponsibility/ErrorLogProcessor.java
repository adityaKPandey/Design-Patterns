package com.behavioral.chainofresponsibility;

public class ErrorLogProcessor extends AbstractLogProcessor{

  public ErrorLogProcessor(
      AbstractLogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(String level, String message) {
     if(AbstractLogProcessor.ERROR == level)
       System.out.println("ERROR: "+message);
     else
       super.log(level,message);
  }
}
