package com.creational.builder;

public interface DocumentRequestBuilder {

	void createCustomerInfo();//gfcId

	void createAttributeInfo(); //cde details

	void setDocumentCode();// doc type code

	DocumentRequest getRequest();
}
