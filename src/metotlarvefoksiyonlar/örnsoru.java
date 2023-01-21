/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlarvefoksiyonlar;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class örnsoru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] A={'a','e','ı','i','o','ö','u','ü'};
        karaTer(A);
    }
    public static void karaTer(char[] isim){
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        String k1=" "; // Sesli  harfler
        String k2=" "; // Sessiz harfler
        for(int i=0;i<N.length();i++){
            char h=N.charAt(i);
            for(int j=0;j<8;j++){
                if(h==isim[j]){
                   k1=k1+h;
                }
                else{
                   k2=k2+h;                  
                }
            }
        }
        System.out.println("Sesli harfler:"+k1);
        System.out.println("Sesiz harfler:"+k2);
    }
    
}
