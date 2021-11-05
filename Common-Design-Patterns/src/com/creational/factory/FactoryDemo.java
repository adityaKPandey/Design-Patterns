package com.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputfile = "qwerty.pdf";
		
		FileDecryptor fileDecryptor1 = getDecryptor("qwerty.pdf");
		System.out.println(fileDecryptor1.decryptFile(inputfile));
		
		inputfile = "sdfew.xlsx" ;
		FileDecryptor fileDecryptor2 = getDecryptor(inputfile);
		System.out.println(fileDecryptor2.decryptFile(inputfile));
		
		
		
		

	}
	
	private static FileDecryptor getDecryptor(String filename) {
		
		if(filename.endsWith(".xlsx"))
			return new ExcelFileDecryptor();
		else if(filename.endsWith(".docx"))
			return new DocxFileDecryptor();
		else if(filename.endsWith(".pdf"))
			return new PDFFileDecryptor();
		
		return null;
	}

}
