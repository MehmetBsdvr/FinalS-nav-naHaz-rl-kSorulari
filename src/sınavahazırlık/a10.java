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
public class a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);

        System.out.println("İfadeyi giriniz");
        String k=input.nextLine();
        int n=k.length()/2;
        for(int i=0;i<n;i++){
            System.out.print(k.charAt(n+i));
            System.out.print(k.charAt(n+1-i));
        }
    }
    
}
