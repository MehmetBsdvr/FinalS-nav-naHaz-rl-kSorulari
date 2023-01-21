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
public class a7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadenizi giriniz");
        String A=input.nextLine();
        
        System.out.println("Degisecek harfi giriniz");
        char B=input.nextLine().charAt(0);
        
        System.out.println(" Yeni harfi  giriniz");
        char C=input.nextLine().charAt(0);
        
        int[] H=new int[255];
        for(int i=0;i<A.length();i++){
            H[i]=A.charAt(i);
            if(H[i]==B){
                H[i]=C;
            }
        }
        for(int i=0;i<A.length();i++){
            System.out.print(H[i]+" ");
        }
        
    }
    
}
