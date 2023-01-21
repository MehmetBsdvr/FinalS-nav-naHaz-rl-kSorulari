
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
public class vizesoruları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); 
        int N = input.nextInt();
        
        int[][] notlar = randomnoturet(M,N);
        int[] maxnotlar = bul_maxdersnot(notlar);
        yazdır_ogrencinot(notlar,2);
        double maxort_ogrenci = bul_maxort1(notlar); 

    }
    // iki boyutlu bir diziye 0-100 arasında rasgele atamalar yapan ve döndüren metot
    public static int[][] randomnoturet(int M, int N) {
        int row = M;
        int col = N;
        int [][] array = new int[M][N];
        Random r = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = r.nextInt(100);
            }
        }
        return array;
    }

    // her derse ait max döndüren fonksiyon
    public static int[] bul_maxdersnot(int[][] array){
        int row = array.length;
        int col = array[0].length;
        int[] maxnot = new int[row]; //  max
        // derse ait max değer bulma
        for (int i = 0; i < row; i++) {
            int max = array[i][0];
            for (int j = 0; j < col; j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                }
            }
            maxnot[i] = max;
        }
        return maxnot;
    }
    public static void yazdır_ogrencinot(int[][] array, int index) {
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i <row; i++) 
        {
            System.out.println("i" + array[i][index-1]);
        }
    }

    // M ders N sütundan oluşan notlar dizisinde herbir derse ait
    // notları hesaplayıp bir dizi formatında döndüren metot
    public static double bul_maxort1(int[][] grades) {
        int toplam;
        int row = grades.length; // ders sayısı
        int col = grades[0].length; // öğrenci sayısı
        double[] ogrenciort = new double[col]; 
        for(int j = 0; j < col; j++) {
            toplam = 0;
            for(int i = 0; i < row;i++) {
                toplam += grades[i][j]; 
            }
            ogrenciort[j] = (double) toplam/row;
        }

        double max = ogrenciort[0];
        for(int j=0; j < ogrenciort.length; j++) {
            if(ogrenciort[j]>max) {
                max = ogrenciort[j];
            }
        }

        return max;
    }






}