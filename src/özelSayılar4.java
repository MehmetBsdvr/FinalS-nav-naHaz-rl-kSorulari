
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
public class özelSayılar4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Bagdas sayıdır
        // 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110=284    220 pozitif bölenleri 
        //  1, 2, 4, 71, 142=220   284 pozitif bölenleri 
        
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı 1 nızı giriniz");
        int N=input.nextInt();
        
        System.out.println("Sayı 2 nızı giriniz");
        int M=input.nextInt();
        
        int S=0;
        int T=0;
        
        for(int i=1;i<N;i++){
            if(N%i==0){
                S=S+i;
            }
        }
        for(int j=1;j<M;j++){
            if(M%j==0){
                T=T+j;
            }
        }
        if(S==T){
            System.out.println("Bağdas sayı ikilisidir("+N+","+M+")");
            
        }
        else{
            System.out.println("Bagdas sayı degildir");
        }
        
    }
    
}
