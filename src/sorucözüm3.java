
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
public class sorucözüm3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] karakter={'a','e','ı','i','u','ü','o','ö'};
        matrix(karakter);
    }
    public static void matrix(char[] kar){
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        int s=0;
        int[] yer=new int[255];
        
        for(int i=0;i<N.length();i++){            
            for(int j=0;j<8;j++){
                if(N.charAt(i)==kar[j]){
                    s=s+1;
                    yer[s-1]=i+1;
                }
            }
        }
        System.out.println("Kaç sesli harf vardır:"+s);
        for(int i=0;i<s;i++){
            System.out.println("Sesli harflerin  yerleri:"+yer[i]);
        }
        
        
    }
    
}
