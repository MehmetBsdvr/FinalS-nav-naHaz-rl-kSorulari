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
public class İKİMATRİXTOPLAMI {

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
        
        int[][] C=new int[3][3];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print((i)+" Satır İndexi "+(j)+" Sutun İndexi");
                A[i][j]=input.nextInt();
                B[i][j]=input.nextInt();  
            }
        }
        
        System.out.println("A Matrix ve B Marix Toplamı= C Matrixi");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+"");
            } 
            System.out.println();
        }
         
    }
}
