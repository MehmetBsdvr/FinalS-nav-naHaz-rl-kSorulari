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
public class arabafiyatları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Araba  fiyatlarını kaçtane oldugunu giriniz");
        int A=input.nextInt();
        
        System.out.println("Araba numarasını giriniz");
        int AS=input.nextInt();
        
        int[][] araba=new int[A][AS];
        int top=0;
        double ort;
        for(int i=0;i<A;i++){
            for(int j=0;j<AS;j++){
                System.out.print("["+i+"]["+j+"] Araba fiyatlarının İndexlerini giriniz:");
                araba[i][j]=input.nextInt();
                top=top+araba[i][j];
            }
            ort=top/AS;
            System.out.println("Araba fiyatlarının oratalamsı:"+ort);
        }
        
        int Enb=araba[1][1],Enk=araba[1][1];
        int Enplı=1,Enucz=1;
        for(int i=0;i<A;i++){
            Enb=araba[i][1];
            Enk=araba[i][1];
            for(int j=0;j<AS;j++){
                if(araba[i][j]<Enk){
                    Enk=araba[i][j];
                    Enucz=j;
                }
                if(araba[i][j]>Enb){
                    Enb=araba[i][j];
                    Enplı=j;
                }
            }
            System.out.println("En pahlı arba:"+Enb+" Araba numarası:"+Enplı);
            System.out.println("En ucuz araba:"+Enk+" Araba numarası:"+Enucz);
        }
        
    }
    
}
