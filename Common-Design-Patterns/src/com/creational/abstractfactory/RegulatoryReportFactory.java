package com.creational.abstractfactory;

public class RegulatoryReportFactory implements ReportFactory {

	@Override
	public Header createHeaderColumns() {
		
		Header header = new RegulatoryReportHeader();
		header.createColumnList();
		return header;
	}

	@Override
	public ReportBody createReportData() {
		 
		ReportBody reportBody =   new RegulatoryReportBody();
		reportBody.addRowValues();
		return reportBody;
	}

}
