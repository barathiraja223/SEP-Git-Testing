package org.login;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Testing\\new.xlsx");
		
		f.createNewFile();
				
		
		
	}
	
	
}
