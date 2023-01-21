
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class özelSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Harshad sayılar 162  1+2+6=9   162%9=18
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayını giriniz");
        int N=input.nextInt();
        
        int Rakam;
        int top=0;

        int gecici2=N;
        
        
        while(N>0){
            Rakam=N%10;
            top=top+Rakam;
            N=N/10;
        }
        if(gecici2%top==0){
            System.out.println("Harshad sayıdır");
        }
        else{
            System.out.println("Harshad sayıdegildir");
        }
    }
    
}
