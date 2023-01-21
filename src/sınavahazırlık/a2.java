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
public class a2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String str=input.nextLine();
        
        for(int i=str.length()-1;i>=0;i--){
            if(str.length()!=0){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
