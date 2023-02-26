package com.behavioral.chainofresponsibility;

import java.util.Objects;


public abstract class AbstractLogProcessor {

  public static final String ERROR = "error";
  public static final String INFO = "info";
  public static final String DEBUG = "debug";
  public static final String NO_LOG_LEVEL =  "NA" ;


  private AbstractLogProcessor nextLogProcessor;

  public AbstractLogProcessor(AbstractLogProcessor nextLogProcessor) {
    this.nextLogProcessor = nextLogProcessor;
  }

  public void log(String level, String message) {
    if(Objects.nonNull(nextLogProcessor))
      nextLogProcessor.log(level,message);
    else
      System.out.printf("No log level processor found for this level %s",level);
  }
}
