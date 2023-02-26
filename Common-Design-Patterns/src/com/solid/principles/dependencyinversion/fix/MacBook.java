package com.solid.principles.dependencyinversion.fix;

import com.solid.principles.dependencyinversion.Keyboard;
import com.solid.principles.dependencyinversion.Mouse;

/*
   To fix this violation of dependency inversion , we use mouse and keyboard interface variables and provide flexibility
   to user to customize his mouse and keyboard as per his choices.
 */
public class MacBook {

  private Mouse mouse;
  private Keyboard keyboard;

  public MacBook(Mouse mouse , Keyboard keyboard){
    this.mouse = mouse;
    this.keyboard = keyboard;
  }
  
}
