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
public class matrixtoplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun dizileri giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print((i)+"Satır index"+(j)+"Sütun indexi");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        
        int top=0;        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                top=top+A[i][j];
            }
        }
        System.out.println(" NXN Matrix toplamı:"+top);
    }
    
}
