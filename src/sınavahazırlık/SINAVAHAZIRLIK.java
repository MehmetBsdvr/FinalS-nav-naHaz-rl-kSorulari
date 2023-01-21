/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavahazırlık;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class SINAVAHAZIRLIK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Random rdn=new Random();
        
        System.out.println("İfadeyi giriniz");
        String txt=input.nextLine();
        
        for(int i=txt.length()-1;i>=0;i--){
            char h=txt.charAt(i);
            if(txt.charAt(i)%2==0){
                System.out.print(Character.toLowerCase(h));
            }
            else{
                System.out.print(Character.toUpperCase(h));
            }
        }
        
        }
    }
    

