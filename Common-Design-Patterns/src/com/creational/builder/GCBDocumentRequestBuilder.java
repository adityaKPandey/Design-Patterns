package com.creational.builder;

public class GCBDocumentRequestBuilder implements DocumentRequestBuilder {

	private DocumentRequest documentRequest;
	
	public GCBDocumentRequestBuilder() {
		documentRequest = new DocumentRequest();
	}

	@Override
	public void createCustomerInfo() {
		//business logic to get customer info and then set in request
	   documentRequest.setCustomerInfo("GCB-clients");	 
	}

	@Override
	public void createAttributeInfo() {
		//business logic to get attribute info and then set in request
		 documentRequest.setAttributeInfo("GCB- cde");
	}

	@Override
	public void setDocumentCode() {
		//business logic to get document code info and then set in request
		documentRequest.setDocumentCode("056");
	}

	@Override
	public DocumentRequest getRequest() {
		return documentRequest;
	}

}
