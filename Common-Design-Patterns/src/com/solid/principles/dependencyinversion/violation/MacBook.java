package com.solid.principles.dependencyinversion.violation;

import com.solid.principles.dependencyinversion.WiredKeyboard;
import com.solid.principles.dependencyinversion.WiredMouse;


/*
   Dependency inversion principle states that class should depend on interfaces rather than depending on concrete classes.
   Eg. In this MackBook class , we have assigned concrete keyboard and mouse class. In future if we want our MacBook to use
   bluettooth keyboard and bluetooth mouse , we don't have that flexibility with this.
 */
public class MacBook {

  private WiredMouse mouse;
  private WiredKeyboard keyboard;

  public MacBook(){
    this.mouse = new WiredMouse();
    this.keyboard = new WiredKeyboard();
  }

}
