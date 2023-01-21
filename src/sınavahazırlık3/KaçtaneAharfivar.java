/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık3;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class KaçtaneAharfivar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfa denizi giriniz");
        String N=input.nextLine();
        char A='A';
        int s=0;
        for(int i=0;i<N.length();i++){
            System.out.print(Character.toUpperCase(N.charAt(i)));
            if(Character.toUpperCase(N.charAt(i))==A){
                s=s+1;
            }
        }
        System.out.println("Girilen ifadede kaç adet A harfi vardır:"+s);
    }
    
}
