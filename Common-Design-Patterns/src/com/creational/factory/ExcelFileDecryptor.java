package com.creational.factory;

public class ExcelFileDecryptor implements FileDecryptor {

	@Override
	public String decryptFile(String inputFile) {
		
		System.out.println("File to decrypted - " + inputFile);
		
		return "decrypted_excel_"+inputFile;
	}

}
