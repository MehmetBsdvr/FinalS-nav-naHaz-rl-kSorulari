/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlarvefoksiyonlar;

/**
 *
 * @author Mehmet
 */
public class ders2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carp(5,6);
       String isimDonder=isimDondur("Mehmet");
    }
    public static String isimDondur(String isim){
        return isim;
    }
    public static int carp(int sayi1,int sayi2){
        int sonuc=sayi1*sayi2;
        return sonuc;
    }
    
}
