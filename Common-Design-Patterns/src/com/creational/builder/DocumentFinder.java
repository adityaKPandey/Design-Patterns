package com.creational.builder;

public class DocumentFinder {

	private DocumentRequestBuilder documentRequestBuilder;

	public DocumentFinder(DocumentRequestBuilder documentRequestBuilder) {
		this.documentRequestBuilder = documentRequestBuilder;
	}
	
	public void constructRequest() {
		
		documentRequestBuilder.createCustomerInfo();
		documentRequestBuilder.createAttributeInfo();
		documentRequestBuilder.setDocumentCode();
	}
	
	public DocumentRequest getRequest() {
		return documentRequestBuilder.getRequest();
	}
}
