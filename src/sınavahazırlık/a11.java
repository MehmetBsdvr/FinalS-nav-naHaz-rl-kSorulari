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
public class a11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadeyi giriniz");
        String k=input.nextLine();
        
        for(int i=0;i<k.length();i++){
            System.out.print(k.charAt(i)+"->");
            for(int j=0;j<k.charAt(i)-64;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
