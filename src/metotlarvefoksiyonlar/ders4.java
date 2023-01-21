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
public class ders4 {
    static int top=0;
    static double ort;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinizi giriniz");
        int N=input.nextInt();
        
        int[] sayi=new int[N];
        
        for(int i=0;i<sayi.length;i++){
            System.out.print((i+1)+" Dizinizin İndexini giriniz:");
            sayi[i]=input.nextInt();
            top=top+sayi[i];
        }
        ort=top/N;
        for(int deger:sayi){
            sinifOrt(deger);
        }
       
    }
    public static void sinifOrt(int sayi){
        
        if(ort>=50){
            System.out.println("Dersten geçtiniz");
        }
        else{
            System.out.println("Dersten kaldınız");
        }

    }
}
