package com.creational.builder;

public class ICGDocumentRequestBuilder implements DocumentRequestBuilder {

	private DocumentRequest request;
	
	public  ICGDocumentRequestBuilder() {
		this.request = new DocumentRequest();
	}
	
	@Override
	public void createCustomerInfo() {
		request.setCustomerInfo("ICG");
	}

	@Override
	public void createAttributeInfo() {
		request.setAttributeInfo("ICG-attribute");
	}

	@Override
	public void setDocumentCode() {
		request.setDocumentCode("043");
	}

	@Override
	public DocumentRequest getRequest() {
		return request;
	}

}
