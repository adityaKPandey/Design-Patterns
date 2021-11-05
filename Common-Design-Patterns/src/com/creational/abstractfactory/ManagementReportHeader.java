package com.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class ManagementReportHeader implements Header {
	
	private List<String> headerList  ;

	@Override
	public List<String> createColumnList() {
	 
		headerList = Arrays.asList("Id" , "Managed Segment Name" , "Group" , "Review" , "Cycle" , "Total Amount") ;
		return headerList;
		
	}

	@Override
	public String toString() {
		return "ManagementReportHeader [headerList=" + headerList + "]";
	}
	
	

}
