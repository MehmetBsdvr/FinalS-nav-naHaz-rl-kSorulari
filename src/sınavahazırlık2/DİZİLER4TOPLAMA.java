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
public class DİZİLER4TOPLAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ifadenizi giriniz");
        int N=input.nextInt();
        
        int[] A=new int[N];
        int[] B=new int[N];
        
         for(int i=0;i<A.length;i++){
            System.out.println((i)+"İndex toplamı");
            A[i]=input.nextInt();
        }
         for(int i=0;i<B.length;i++){
            System.out.println((i)+"İndex toplamı");
            B[i]=input.nextInt();
        }
         int top=0;
         for(int i=0;i<N;i++){
             top=top+A[i]+B[i];
         }
         System.out.println("A VE B TOPLAMI:"+top);
        
    }
    
}
