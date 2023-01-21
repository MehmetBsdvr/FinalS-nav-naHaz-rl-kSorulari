
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
public class özelSayal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mükemmel Sayılar 6=1+2+3=6
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        
        int s=0;
        for(int i=1;i<N;i++){
            if(N%i==0){
                s=s+i;
            }
            
        }
        if(N==s){
            System.out.println("Mükemmel sayı dır");
        }
        else{
            System.out.println("Mükemmel sayı degildir");
        }
    }
    
}
