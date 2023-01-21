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
public class ders1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       topla(5,6);
       
       isimSoyisim("Mehmet","Başduvar");
       
    }
    public static void topla(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        System.out.println("Toplamı:"+sonuc);
    }
    public static void isimSoyisim(String isim,String soyisim){
        System.out.println("İsim Soyisim:"+isim+" "+soyisim);
    }
    
    
}
