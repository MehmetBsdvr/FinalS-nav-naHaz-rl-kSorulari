/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class a8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        char[] N={'a','e','ı','o','u'};
        System.out.println("İfadenizi giriniz");
        String C=input.nextLine();
        int[] yer=new int[255];
        int s=0;
            for(int i=0;i<C.length();i++){
                char h=C.charAt(i);
                for(int j=0;j<5;j++){
                    if(h==N[j]){
                        System.out.println((i+1)+" İnci index degeri");
                        s=s+1;
                        yer[s]=i;
                    }
                }
            }
            
            for(int i=0;i<s;i++){
                System.out.println("Kaçtane sesli harf vardır:"+s);
                System.out.println(yer[i]+"\t");
            }
    }
    
}
