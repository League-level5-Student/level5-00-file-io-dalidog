package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/encrypted_file"));
			String decrypt="";
			String line = br.readLine();
			while(line != null){
				
				decrypt= decrypt+Character.valueOf((char)Integer.parseInt(line));
				
				line = br.readLine();
				
					
			}
			
			br.close();
			JOptionPane.showMessageDialog(null, decrypt);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
				FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/encrypted_file");
				fw.write("");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}
	

