/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.File;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;

public class update extends Create{
    void existfile() {
    	String user_file="C:\\Users\\KengHzou\\Documents\\NetBeansProjects\\SaudaraBaru";
    	
    	File dit = new File(user_file);
    	
    	for (File f:dit.listFiles()){
    		if(f.getName().contains(".txt")) {
    			System.out.print(f.getName()+"\n");
    		}
    	}
    }
    
    void update() throws IOException {
    	BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));
    	profile p1 = new profile();
        p1.profile();
        File file = new File("keng.txt");
        Scanner s = new Scanner(file);
                
		ArrayList<String>List = new ArrayList<String>();
        
		while(s.hasNextLine()){
			List.add(s.nextLine());
		}
		
        s.close();
        p1.setname(List.get(0));
        p1.setage(List.get(1));
        p1.setgender(List.get(2));
        p1.setnationality(List.get(3));
                
                String B = bk.readLine();
                switch(B){
                        case "1":
                            p1.setname(bk.readLine());
                            break;
                        case "2":
                            p1.setage(bk.readLine());
                            break;
                        case "3":
                            p1.setgender(bk.readLine());
                            break;
                        case "4":
                            p1.setnationality(bk.readLine());
                            break;
                }
                   
                        System.out.println(p1.age);
                       
        }
}


