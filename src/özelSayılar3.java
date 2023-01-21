
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
public class özelSayılar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tau Sayılar    ikiside asldır
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadesini giniz");
        int N=input.nextInt();
        
        int s=0;
        for(int i=1;i<N;i++){
            if(N%i==0){
                s=s+1;
            }
            if(N%s==0){
            System.out.println("Tau sayısıdır");
            break;
        }
            else{
            System.out.println("Tau sayısı degildir ");
            break;
        }
        }
        
    }
    
}
