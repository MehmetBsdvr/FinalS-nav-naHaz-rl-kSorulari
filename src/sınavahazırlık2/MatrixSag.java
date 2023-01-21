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
public class MatrixSag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun degerlerini giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        
        int top=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndexi");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i<j){
                    top=top+A[i][j];
                }
            }
        }
        System.out.println("A matrix kösesin deki degerlerin toplamı:"+top);
        
    }
    
}
