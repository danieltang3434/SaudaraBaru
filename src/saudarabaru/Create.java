/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Create extends profile {
	
    String Name;
    String Age;
    String Gender;
    String Nationality;
    profile p1 = new profile();       
    
	void Create()throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Name= br.readLine();  
		Age = br.readLine();
		Gender= br.readLine();
		Nationality = br.readLine();
		p1.setname(Name);
		p1.setage(Age);
		p1.setgender(Gender);
		p1.setnationality(Nationality);
		
	}           
	 
	void WRITE()throws IOException {
		
		File file = new File(p1.name+".txt");
	
		// if file doesn't exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
	
		BufferedWriter writer = null;
		
	    try {
	        writer = new BufferedWriter( new FileWriter(file));
	        writer.write(p1.name);
	        writer.newLine();
	        writer.write(p1.age);
	        writer.newLine();
	        writer.write(p1.gender);
	        writer.newLine();
	        writer.write(p1.nationality);                           
	    }
	    
	    catch (IOException e) {}
	    
	    finally {
	    	
	        try {
	            if (writer!=null)
	                writer.close();
	        }
	        
	        catch (IOException e) {}
				
				
				System.out.println("Done");
	
			
		}                     
	}
}



