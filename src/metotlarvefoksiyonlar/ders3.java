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
public class ders3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinizi giriniz");
        int N=input.nextInt();
        
        int[] sayi=new int[N];
        for(int i=0;i<sayi.length;i++){
            System.out.print((i+1)+" Dizinin İndex degerini giriniz:");
            sayi[i]=input.nextInt();
        }
        for(int deger:sayi){
            tekMiCifmi(deger);
        }
    }
    public static void tekMiCifmi(int sayi){
        if(sayi%2==0){
            System.out.println("Çif sayı girdiniz");
        }
        else{
            System.out.println("Tek sayi girdiniz");
        }
        
    }
    
    
}
