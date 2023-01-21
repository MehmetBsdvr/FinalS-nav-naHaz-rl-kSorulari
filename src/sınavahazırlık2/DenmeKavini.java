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
public class DenmeKavini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sınıftaki kisi sayısı giriniz");
        int N=input.nextInt();
        
        System.out.println("Notlarızın sayısını giriniz");
        int M=input.nextInt();
        
        int[][] A=new int[M][N];
        
        int END,ENY;
        double ort;
        int ogrYK,ogrDS,top=0;
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi giriniz:");
                A[i][j]=input.nextInt();
            }        
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                top=top+A[i][j];
            }
            ort=top/N;
        }
        for(int i=0;i<N;i++){
            END=A[i][1];ogrDS=1;
            ENY=A[i][1];ogrYK=1;
            for(int j=2;j<N;j++){
                if(A[i][j]<END){
                    END=A[i][j];
                    ogrDS=j;
                }
                else if(A[i][j]>ENY){
                    A[i][j]=ENY;
                    ogrYK=j;    
                }
            }
            System.out.println("Enyüksek Not:"+ENY+" Yüksek alan ögrenci no:"+ogrYK);
            System.out.println("Endüksük Not:"+END+" Düsük alan ögrenci no:"+ogrDS);
            
        }
    }
    

}