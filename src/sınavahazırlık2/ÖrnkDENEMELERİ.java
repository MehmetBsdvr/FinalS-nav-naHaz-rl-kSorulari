/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık2;

import static java.lang.Math.E;
import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class ÖrnkDENEMELERİ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun sayısını giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        int[][] B=new int[N][N];
        int[][] C=new int[N][N];
        int[][] T=new int[N][N];
        int[][] F=new int[N][N];
        int[][] K=new int[N][N];
        int[] E=new int[N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi giriniz:");
                A[i][j]=input.nextInt();
                B[i][j]=input.nextInt();
                C[i][j]=input.nextInt();
                
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                T[i][j]=A[j][i];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                F[i][j]=0;
                for(int k=0;k<N;k++){
                    F[i][j]=F[i][j]+B[i][k]*C[k][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                K[i][j]=0;
                for(int k=0;k<N;k++){
                    K[i][j]=K[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            E[i]=0;
            for(int j=0;j<N;j++){
                E[i]=E[i]+T[i][j]+F[i][j]-K[i][j];
            }
            System.out.println(E[i]+" ");
        }
        
        
    }
    
}
