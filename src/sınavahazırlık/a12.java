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
public class a12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadeyi giriniz");
        String k=input.nextLine();
        
        int n=k.length();
        for(int i=n/2;i>=0;i--){
            System.out.print(k.charAt(i));
        }
        for(int j=n;j<n/2+1;j--){
            System.out.print(k.charAt(j));
        }
    }
    
}
