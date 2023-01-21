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
public class a9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        char[] seslı={'a','e','ı','i','o','ö','u','ü'};
        
        System.out.println("İfadenizi giriniz");
        String k=input.nextLine();
        
        String k1="";
        String k2="";
        
        for(int i=0;i<k.length();i++){
            for(int j=0;j<8;j++){
                
            if(k.charAt(i)==seslı[j]){
                k1=(k1+k.charAt(i));  
            }
            else{
                k2=(k2+k.charAt(i));
            }
        }
        }    
        System.out.println("Sesli harfler:"+k1);
        System.out.println("Sessiz harfler:"+k2);
        
    }
    
}
