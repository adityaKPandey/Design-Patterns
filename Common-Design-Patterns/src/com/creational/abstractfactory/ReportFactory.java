package com.creational.abstractfactory;

public interface ReportFactory {

	Header createHeaderColumns();
	ReportBody createReportData();
	
	
}
