package org.edu.vo;

import java.awt.image.ByteLookupTable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ryr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		fileInputStream = new FileInputStream("C:\\egov\\workspace\\limsongha\\test.txt");
		fileOutputStream = new FileOutputStream("C:\\egov\\workspace\\limsongha\\test2.txt");
		int byte_content;
		while ((byte_content = fileInputStream.read()) != -1) {
			System.out.println("바이트형문자읽어들이기" + (char) byte_content);
			fileOutputStream.write(byte_content);
		}
	}

}
