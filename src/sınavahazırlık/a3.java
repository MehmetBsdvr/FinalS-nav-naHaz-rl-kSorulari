/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class a3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        String str="KoDLaMa";
        for(int i=str.length()-1;i>=0;i--){
            
                System.out.print(Character.toLowerCase(str.charAt(i)));
                System.out.print(Character.toUpperCase(str.charAt(i)));
            
        }
        
    }
    
}
