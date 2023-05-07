package com.structural.composite.filesystemexample;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

  private String directoryName;
  private List<FileSystem> fileSystemList;

  public Directory(String name) {
    this.directoryName = name;
    fileSystemList = new ArrayList<>();
  }

  public void addFileSystem(FileSystem fileSystem){
    this.fileSystemList.add(fileSystem);
  }

  @Override
  public void ls() {
    System.out.println("Directory name:" + directoryName);
    fileSystemList.stream().forEach(fileSystem -> fileSystem.ls());
  }
}
