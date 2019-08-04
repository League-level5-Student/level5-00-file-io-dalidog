package _02_File_Encrypt_Decrypt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) {
		String useranswer=JOptionPane.showInputDialog("Give me a message!");
	try {	
		BufferedWriter fw = new BufferedWriter(new FileWriter("src/_02_File_Encrypt_Decrypt/encrypted_file", true));
		
		for (int i = 0; i < useranswer.length(); i++) {
			
				fw.write((int)useranswer.charAt(i)+"\n");
			}
		
		
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
