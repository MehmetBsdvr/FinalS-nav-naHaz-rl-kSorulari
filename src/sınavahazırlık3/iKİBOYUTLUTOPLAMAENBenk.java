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
public class iKİBOYUTLUTOPLAMAENBenk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun degerlerini giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        int Satırtop=0,Sütuntop=0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] Satır ve Sütun İndexlerini giriniz:");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){          
            for(int j=0;j<N;j++){
                Satırtop=Satırtop+A[i][1];
                Sütuntop=Sütuntop+A[1][j]; 
            }
        }
        System.out.println("Satır elemanlarının toplamı:"+Satırtop);
        System.out.println("Sütun elemanlarının toplamı:"+Sütuntop);
        
        int Enb=A[1][1],Enk=A[1][1];
        int Enbsatır=0,Enbsütun=0,Enksatır=0,Enksütun=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]<Enk){
                    Enk=A[i][j];
                    Enksatır=i;
                    Enksütun=j;
                }
                if(A[i][j]>Enb){
                    Enb=A[i][j];
                    Enbsatır=i;
                    Enbsütun=j;
                }
            }
        }
        System.out.println("Enbüyük elananı:"+Enb+" Enbüyük satırı:"+Enbsatır+" Enbüyük sütunu:"+Enbsütun);
        System.out.println("Enkücük elamanı:"+Enk+" Enkücük satırı:"+Enksatır+" Enkücük sütunu:"+Enksütun);
    }
    
}
