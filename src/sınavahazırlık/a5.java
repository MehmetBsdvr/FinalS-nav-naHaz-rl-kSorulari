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
public class a5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String metin=input.nextLine();
        
        for(int i=metin.length()-1;i>=0;i--){
            if(metin.charAt(i)>=65 && metin.charAt(i)<=90 ){
                System.out.print(Character.toLowerCase(metin.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(metin.charAt(i)));
            }
        }
    }
    
}
