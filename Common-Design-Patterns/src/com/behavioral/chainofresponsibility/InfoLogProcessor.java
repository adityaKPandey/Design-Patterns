package com.behavioral.chainofresponsibility;

public class InfoLogProcessor extends AbstractLogProcessor{

  public InfoLogProcessor(
      AbstractLogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(String level, String message) {
     if(AbstractLogProcessor.INFO == level)
       System.out.println("INFO: "+message);
     else
       super.log(level,message);
  }
}
