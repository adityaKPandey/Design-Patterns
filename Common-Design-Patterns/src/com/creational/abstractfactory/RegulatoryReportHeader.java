package com.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class RegulatoryReportHeader implements Header {
	
	private List<String> headerList  ;

	@Override
	public List<String> createColumnList() {
		
		headerList = Arrays.asList("Id" , "Regulator Name" , "Product" , "Sub product" , "Total Amount");
		return headerList;
		
	}

	@Override
	public String toString() {
		return "RegulatoryReportHeader [headerList=" + headerList + "]";
	}
	
	

}
