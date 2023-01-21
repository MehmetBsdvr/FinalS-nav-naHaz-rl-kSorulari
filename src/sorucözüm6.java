
import java.util.Random;
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
public class sorucözüm6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        isimLer(N);
        
    }
    public static String isimLer(String cümle){
        Random rnd=new Random();
        for(int i=0;i<cümle.length();i++){
            char h=cümle.charAt(i);
            int X=rnd.nextInt(10);
            if(X%2==0){
                System.out.print(Character.toLowerCase(h));
            }
            else{
                System.out.print(Character.toUpperCase(h));
            }
        }
        return cümle;
    }
    
}
