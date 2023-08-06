package com.behavioral.command.withundoredo;

public interface Command {
  void execute();
  void undo();
}
