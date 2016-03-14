/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**1
 *
 * @author KengHzou
 */
public class SaudaraBaru extends Create {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader bn = new BufferedReader(new InputStreamReader(System.in));
       
        selection view = new selection();
                      
         boolean menu = true;
         String A = "";
         String B = "continue";                 
         
         while(B.equals("continue"))
         {
             view.displaymenu();
             A = bn.readLine();
        switch(A){
            
            case "1":
            view.instruction();
            Create c1 = new Create();
            c1.Create();
            c1.WRITE();
            
            break;
            case "2":
            view.display4();
            update u1 = new update();
            u1.existfile();
            u1.update();
            u1.WRITE();
            break;                 
        }
        
            view.display2();
            B = bn.readLine();}
       
         
        
        view.display3();
    }
    
}
