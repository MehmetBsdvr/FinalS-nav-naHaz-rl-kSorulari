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
public class ornksoru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] sayi={1,2,3,4,5,6,7,8,9,10};
        arry(sayi);
       
    }
    public static void arry(int[] deger){
        
        Scanner input=new Scanner(System.in);
        
        int top=0;
        double ort;
        for(int i=0;i<deger.length;i++){
            top=top+deger[i];
        }
        ort=top/deger.length;
        System.out.println("Sayıların Ortalaması:"+ort);
        int max=deger[1];
        int min=deger[1];
        int maxİndex=1,miniİndex=1;
        
        for(int i=0;i<deger.length;i++){
            if(deger[i]<min){
                min=deger[i];
                miniİndex=i;
            }
            if(deger[i]>max){
                max=deger[i];
                maxİndex=i;
            }
        }
        System.out.println("Max degeri:"+max+" Max İndex degeri:"+maxİndex);
        System.out.println("Mini degeri:"+min+" Min index degeri:"+miniİndex);
    }
    
}
