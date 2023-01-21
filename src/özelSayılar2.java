
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
public class özelSayılar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Zengin Sayılar  12 1+2+3+4+6=16  16>12 
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        
        int top=0;
        
        for(int i=1;i<N;i++){
            if(N%i==0){
                top=top+i;
            }
        }
        if(top>N){
            System.out.println("Zengin Sayıdır");
        }
        else{
            System.out.println("Zengin Sayı degildir");
        }
    }
    
}
