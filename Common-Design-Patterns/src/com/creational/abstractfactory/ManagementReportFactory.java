package com.creational.abstractfactory;

public class ManagementReportFactory implements ReportFactory {

	@Override
	public Header createHeaderColumns() {
		
		Header header =  new ManagementReportHeader();
		header.createColumnList();
		return header;
	}

	@Override
	public ReportBody createReportData() {
		 
		ReportBody reportBody =  new ManagementReportBody();
		reportBody.addRowValues();
		Math.min(1, 2);
		return reportBody;
	}

}
