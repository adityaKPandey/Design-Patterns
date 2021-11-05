package com.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		 
		DocumentRequestBuilder documentRequestBuilder = new ICGDocumentRequestBuilder();
        DocumentFinder documentFinder = new DocumentFinder(documentRequestBuilder);
        
        documentFinder.constructRequest();
		
		DocumentRequest documentRequest = documentFinder.getRequest();

		System.out.println("Document request 1:" + documentRequest.toString());
		
		documentRequestBuilder = new GCBDocumentRequestBuilder();
		documentFinder = new DocumentFinder(documentRequestBuilder);
		
		documentFinder.constructRequest();
		
		System.out.println("Document request 2:" + documentFinder.getRequest().toString() );
		
	}

}
