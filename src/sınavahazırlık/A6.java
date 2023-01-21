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
public class A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // klavyeden girilen cümleyi ikiye bölüm bir 2 büyük 2 kücük yazdıran program
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String metin=input.nextLine();
        
        int s=0;
        for(int i=0;i<metin.length();i++){
            int r=s%4;
            if(r<2){
                System.out.print(Character.toUpperCase(metin.charAt(i)));
            }
            else{
                System.out.print(Character.toLowerCase(metin.charAt(i)));
            }
            s=s+1;
        }
        
        
    }
    
}
