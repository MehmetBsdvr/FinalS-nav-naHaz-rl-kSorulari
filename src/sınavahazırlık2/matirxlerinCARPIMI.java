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
public class matirxlerinCARPIMI {

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
        System.out.println("A matrix degerleri");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi:");
                A[i][j]=input.nextInt();
                System.out.print(A[i][j]+" ");
                input.nextLine();
            }
            System.out.println();
        }
        System.out.println("B matrix degerleri");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi:");
                B[i][j]=input.nextInt();
                System.out.print(B[i][j]+" ");
                input.nextLine();
            }
            System.out.println();
        }
        System.out.println("A ve B Mtrixlerin Carpımı= C matrixi");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                C[i][j]=0;
                for(int k=0;k<N;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            System.out.print(C[i][j]+" ");    
            }
            System.out.println();
        }
    }
    
}
