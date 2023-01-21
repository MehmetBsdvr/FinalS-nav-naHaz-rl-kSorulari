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
public class Karsılıklıdegisim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfa denizi giriniz");
        String N=input.nextLine();
        
        if(N.length()%2!=0){
            N=N+" ";
        }
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)%2!=0){
                System.out.print(N.charAt(i+1));
            }
            else{
                System.out.print(N.charAt(i-1));
            }
        }
                
    }
    
}
