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
public class tekboyutludiziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        int N=input.nextInt();
        
        int[] A=new int[N];
        int max=A[1];
        int min=A[1];
        for(int i=0;i<A.length;i++){
            System.out.print((i+1)+"İndexi giriniz:");
            A[i]=input.nextInt();
        }
        for(int i=2;i<A.length;i++){        
            if(A[i]<min){
                min=A[i];
            }
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Dizinin max degerini:"+max);
        System.out.println("Dizinin mini degerini:"+min);
    }
    
}
