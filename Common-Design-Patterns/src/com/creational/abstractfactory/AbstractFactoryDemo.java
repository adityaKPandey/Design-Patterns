package com.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		ReportFactory reportFactory = getReportFactory("management");
		Header header = reportFactory.createHeaderColumns();
		ReportBody body = reportFactory.createReportData();
		
		System.out.println("Report : " + header.toString() + " " + body.toString());
		
		 reportFactory = getReportFactory("regulatory");
		 header = reportFactory.createHeaderColumns();
		 body = reportFactory.createReportData();
		
		System.out.println("Report : " + header.toString() + " " + body.toString());

	}

	private static ReportFactory getReportFactory(String type) {
		
		if("management".equalsIgnoreCase(type))
			return new ManagementReportFactory();
		else if ("regulatory".equalsIgnoreCase(type))
			return new RegulatoryReportFactory();
		else 
			throw new RuntimeException("No report factory found for type -"+type);
	}

}
