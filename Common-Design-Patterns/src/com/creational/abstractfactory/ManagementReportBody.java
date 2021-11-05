package com.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class ManagementReportBody implements ReportBody {

	private List<RowData> rowData;
	
	@Override
	public List<RowData> addRowValues() {
		rowData = Arrays.asList( new RowData(Arrays.asList("1","AMC" , "Group 1" , "Review 5" , "Cycle 1" , "12122.0")) ,
				new RowData(Arrays.asList("1","CDM" , "Group 1" , "Review 6" , "Cycle 1" , "4534.0"))
				);
		return rowData;
	}

	@Override
	public String toString() {
		return "ManagementReportBody [rowData=" + rowData + "]";
	}
	
	
  
}
