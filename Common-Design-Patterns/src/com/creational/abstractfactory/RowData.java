package com.creational.abstractfactory;

import java.util.List;

public class RowData {

	 private List<String>rowValues ;
	 
	 public RowData(List<String>rowValues){
		 this.rowValues = rowValues;
	 }

	@Override
	public String toString() {
		return "RowData [rowValues=" + rowValues + "]";
	}
	 
	 
	 
}
