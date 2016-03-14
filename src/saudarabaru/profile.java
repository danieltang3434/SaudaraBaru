/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;

/**
 *
 * @author KengHzou
 */
public class profile {
    String name;
    String age;
    String nationality;
    String gender;
    
    void newProfile() {
    	name = "";
        age = "";
        nationality = "";
        gender = "";
    }
    void profile(String Name, String Age, String Nationality, String Gender) {
        name = Name;
        age = Age;
        nationality = Nationality;
        gender = Gender;
    }
    
    void setname(String Name) {
    	name = Name;
    }
    
    void setage(String Age) {
    	age = Age;
    }
    
    void setnationality(String Nationality) {   
    	nationality = Nationality;
    }
    
    void setgender(String Gender) {   
    	gender = Gender;
    }
    
    String getname() {   
    	return name;
    }
    
    String getage() { 
    	return age;
    }
    
    String getnationality() {   
    	return nationality;
    }
    
    String getgender(){   
    	return gender;
    }
    
}
    

