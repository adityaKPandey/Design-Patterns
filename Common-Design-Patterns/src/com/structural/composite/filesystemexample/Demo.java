package com.structural.composite.filesystemexample;

public class Demo {

  public static void main(String [] args){
     Directory movieDirectory = new Directory("Movies");
     movieDirectory.addFileSystem(new File("Border"));

     Directory comedyDirectory = new Directory("Comedy movies");
     comedyDirectory.addFileSystem(new File("Andaz apna apna"));
     movieDirectory.addFileSystem(comedyDirectory);

     movieDirectory.ls();
  }
}
