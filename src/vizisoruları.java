
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
public class vizisoruları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ders Sayısı: ");
        int M = input.nextInt();
        System.out.print("Öğrenci Sayısı: ");
        int N = input.nextInt(); 
        
        int[] ogrencino = diziOlustur(N, 10000, 20000);
        
        int[][] notlar = new int[M][N];
        notlar = generate_notes(notlar);
           
        double[] ortalamalar = avg_notes(notlar);
        arr_print(ortalamalar);
        
        int[][] report = get_maxmin(notlar,ogrencino);
        arr_print(report);
        
    }
    
    public static void arr_print(int[] array) {
        for (int i = 0; i <array.length; i++) {
            System.out.println((i+1)+"inci eleman: "+array[i]);
        }
    }
    public static void arr_print(double[] array) {
        for (int i = 0; i <array.length; i++) {
            System.out.println((i+1)+"inci eleman: "+array[i]);
        }
    }
    
    public static void arr_print(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println((i+1)+", "+(j+1)+" eleman:"+array[i][j]);
            }
        }
    }
    
    // N boyutlu lb-ub arasında rasgele sayılardan oluşan diziyi oluşturup döndüren metot
    public static int[] diziOlustur(int N, int lb, int ub) {
        int[] array = new int[N];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (lb + (ub-lb)*r.nextDouble());
        }
        return array;
    }
    
    // iki boyutlu bir diziye 0-100 arasında rasgele atamalar yapan ve döndüren metot
    public static int[][] generate_notes(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        Random r = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = r.nextInt(100);
            }
        }
        
        return array;
    }
    
    // M ders N sütundan oluşan notlar dizisinde herbir derse ait
    // notları hesaplayıp bir dizi formatında döndüren metot
    public static double[] avg_notes(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        double[] avg = new double[row];
        
        for (int i = 0; i < row; i++) {
            int toplam = 0;
            for (int j = 0; j < col; j++) {
                toplam += array[i][j];
            }
            avg[i] = (double) toplam / col;
        }
        
        return avg;
    }
    
    // her derse ait max-maxyer ve min-minyer bulup döndüren fonksiyon
    public static int[][] get_maxmin(int[][] array,int[] ogrencino){
        int row = array.length;
        int col = array[0].length;
        int[][] rapor = new int[row][4]; // min mindex, max maxindex
        // derse ait max min bulma
        for (int i = 0; i < row; i++) {
            int max = array[i][0], min = array[i][0];
            int maxid=0, minid=0;
            for (int j = 0; j < col; j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                    maxid = ogrencino[j];
                }
                if (array[i][j]<min) {
                    min = array[i][j];
                    minid = ogrencino[j];
                }
            }
            rapor[i][0]=max; rapor[i][1]=maxid; rapor[i][2]=min; rapor[i][3]=minid;
        }
        
        return rapor;
    }
    
}

