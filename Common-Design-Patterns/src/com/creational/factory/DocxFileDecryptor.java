package com.creational.factory;

public class DocxFileDecryptor implements FileDecryptor{

	@Override
	public String decryptFile(String inputFile) {

		System.out.println("File to decrypted - " + inputFile);

		return "decrypted_docx_"+inputFile;

	}

}
