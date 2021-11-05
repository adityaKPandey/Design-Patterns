package com.creational.builder;

public interface DocumentRequestPlan {

	void setCustomerInfo(String gfcId);//gfcId
	
	void setAttributeInfo(String cdeName); //cde details
	
	void setDocumentCode(String docTypeCode);// doc type code
	
}
