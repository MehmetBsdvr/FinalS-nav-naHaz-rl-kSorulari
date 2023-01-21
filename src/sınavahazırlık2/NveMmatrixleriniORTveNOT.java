/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık2;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class NveMmatrixleriniORTveNOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sınıf daki kisileri giriniz ");
        int N=input.nextInt();
        System.out.println("Ogrencilerin notlarını sayısını giriniz");
        int M=input.nextInt();
        int[][] A=new int[M][N];
        
        double ort;
        int top=0,YKogrno,DSogrno;
        int ENK,ENB;
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] Notlar İndexi giriniz:");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                top=top+A[i][j];
            }
            ort=top/N;
            System.out.println((i)+" Sınıf ortalaması:"+ort);
        }
        for(int i=0;i<M;i++){
            ENB=A[i][1];YKogrno=1;
            ENK=A[i][1];DSogrno=1;
            for(int j=2;j<N;j++){
                if(A[i][j]<ENK){
                    ENK=A[i][j];
                    DSogrno=j;
                }
                else if(A[i][j]>ENB){
                    ENB=A[i][j];
                    YKogrno=j;
                }
            }
            System.out.println("Enyüksek Not:"+ENB+" Yüksek alan ögrenci no:"+YKogrno);
            System.out.println("Endüksük Not:"+ENK+" Düsük alan ögrenci no:"+DSogrno);
            
        }
        
    }
    
}
