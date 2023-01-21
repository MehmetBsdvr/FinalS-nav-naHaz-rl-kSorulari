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
public class OrtlamaDİZİLERLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sınıfdaki notları sayısını  giriniz");
        int N=input.nextInt();
        
        int[] not=new int[N];
        double ort;
        int top=0;
        
        for(int i=0;i<not.length;i++){
            System.out.println( (i+1)+" Not İndexi giriniz:");
            not[i]=input.nextInt();
            top=top+not[i];
        if(not[i]>=50){
            System.out.println("Desrten Gectiniz");
        }
        else{
            System.out.println("Desrten Kaldınız");
        }
    }
        
       ort=top/N;
         System.out.println("Sınıfın Ortalamsı:"+ort);
                
    }
    
}
