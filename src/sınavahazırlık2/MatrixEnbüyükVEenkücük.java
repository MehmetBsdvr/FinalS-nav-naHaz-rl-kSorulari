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
public class MatrixEnbüyükVEenkücük {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
         System.out.println("Satır ve Sütun matrizlerini giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
       
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi giriniz:");
                A[i][j]=input.nextInt();
            }
        }
        int ENB=A[0][0];
        int ENK=A[0][0];
        int ENBsatır=1,ENKsatır=1;
        int ENBsütun=1,ENKsütun=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]>ENB){
                    ENB=A[i][j];
                    ENBsatır=i;
                    ENBsütun=j;
                }
                if(A[i][j]<ENK){
                    ENK=A[i][j];
                    ENKsatır=i;
                    ENKsütun=j;
                }
            }
        }
        System.out.println("/Enbüyük sayı:"+ENB+"/En Büyük Satır:"+ENBsatır+"/En Büyük Sütun:"+ENBsütun);
        System.out.println("/Enkücük sayı:"+ENK+"/En Kücük satır:"+ENKsatır+"/En Kücük Sütun:"+ENKsütun);
        
    }
    
}
