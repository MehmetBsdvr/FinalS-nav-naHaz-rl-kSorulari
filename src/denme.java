

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
public class denme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 
        Scanner input=new Scanner(System.in);
        String N=input.nextLine();
        int s=0;
        for(int i=0;i<N.length();i++){
           int r=N.charAt(i);
                if(r<2){
                    System.out.print(Character.toUpperCase(N.charAt(i)));
                }
                else{
                    System.out.print(N.charAt(i));
                }
           
            
        }
        
    }
    
    
    
}
