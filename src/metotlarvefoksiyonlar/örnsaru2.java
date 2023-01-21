/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlarvefoksiyonlar;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class örnsaru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        isimBoyut(N);
    }
    public static void isimBoyut(String isim){
        for(int i=0;i<isim.length();i++){      
            if(isim.charAt(i)%2==0){
                System.out.print(Character.toUpperCase(isim.charAt(i)));
            }
            else{
                System.out.print(Character.toLowerCase(isim.charAt(i)));
            }
        }
    }
    
}
