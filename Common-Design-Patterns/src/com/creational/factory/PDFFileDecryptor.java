package com.creational.factory;

public class PDFFileDecryptor implements FileDecryptor {

	@Override
	public String decryptFile(String inputFile) {
		
		System.out.println("File to decrypted - " + inputFile);

		return "decrypted_pdF_"+inputFile;
		
	}

}
