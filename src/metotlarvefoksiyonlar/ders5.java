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
public class ders5 {
    static boolean aktif=true;
    static int hakSayisi=3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(aktif){
            if(hakSayisi>0){
                System.out.println("");
            }
            else{
                System.out.println("Hak sayınız doldu ve Kartınız bloke oldu");
            }
        }
    }
    public static boolean login(String sifre,String Kimlik){
        if(sifre.equals("Mehmet") && Kimlik.equals("123")){
            return true; // Başarılı
        }
        else{
            hakSayisi--;
            return false; // Başarısız
        }
    }
    
}
