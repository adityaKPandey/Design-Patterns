package com.creational.builder;

public class DocumentRequest implements DocumentRequestPlan {

	private String customerInfo;
	private String attributeInfo;
	private String documentCode;
	
	public void setCustomerInfo(String gfcId) {
		this.customerInfo = gfcId;
	}
	public void setAttributeInfo(String cdeName) {
		this.attributeInfo = cdeName;
	}
	public void setDocumentCode(String docTypeCode) {
		this.documentCode = docTypeCode;
	}
	
	@Override
	public String toString() {
		return "DocumentRequest [customerInfo=" + customerInfo + ", attributeInfo=" + attributeInfo + ", documentCode="
				+ documentCode + "]";
	}
	
	 
}
