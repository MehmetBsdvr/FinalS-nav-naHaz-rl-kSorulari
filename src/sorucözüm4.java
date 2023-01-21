
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
public class sorucözüm4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        asal(N);
    }
    public static void asal(int sayi){
        int s=0;
        for(int i=2;i<=sayi;i++){
            if(sayi%i==0){
                s=s+1;
            }
            if(s==0){
                System.out.println("Asal sayıdır");
                break;
            }
            else{
                System.out.println("Asal sayı degildir");
                break;
            }
        }
        
    }
    
    
}
