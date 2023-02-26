package com.behavioral.chainofresponsibility;

/*
   There is an abstract processor/handler/receiver class which has a member field to set next processor in the chain ,
   and it provides default implementation of the task(handle/process/receive) : to invoke action on next processor.

   All implementations of this abstract processor/handler/receiver class simply execute action if the input matches or call the super
   implementation if input doesn't match.
   So logic always flows through abstract class until we hit upon correct/matching processor
 */

public class ChainOfResponsibilityDemo {

  public static void main(String [] args){
     AbstractLogProcessor logProcessor = new DebugLogProcessor(new InfoLogProcessor(new ErrorLogProcessor(null)));
     logProcessor.log(AbstractLogProcessor.ERROR,"Error occurred in processing input");
     logProcessor.log(AbstractLogProcessor.INFO,"Input processed");
     logProcessor.log(AbstractLogProcessor.DEBUG,"Going to take special route");

     logProcessor.log(AbstractLogProcessor.NO_LOG_LEVEL,"no log level case");
  }

}
