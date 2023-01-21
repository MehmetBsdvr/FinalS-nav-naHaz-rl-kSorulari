
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
public class sorucözüm9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int M=input.nextInt();
        int N=input.nextInt();
        int[][] notlar=randomal(M,N);
        int[] mini=mininotbul(notlar);
        yazdır_ogrencinot(notlar,2);
        double[] maxort=maxOrt(notlar);
        
    }

    public static int[][] randomal(int M, int N) {
        Random rnd=new Random();
        int[][] rndnotlar=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                rndnotlar[i][j]=rnd.nextInt(100);
            }
        }      
        return rndnotlar;
    }
    public static int[] mininotbul(int[][] notlar ){
        int satır=notlar.length;
        int sütun=notlar[0].length;
        int[] min=new int[satır];
        
        for(int i=0;i<satır;i++){
           int minnot=notlar[i][0];
            for(int j=0;j<sütun;j++){
                if(notlar[i][j]<minnot){
                    minnot=notlar[i][j];
                }
            }
            min[i]=minnot;
        }
        return min;
    }
    public static void yazdır_ogrencinot(int[][] notlar,int İndex){
        int satır=notlar.length;
        int sutun=notlar[0].length;
        for(int i=0;i<satır;i++){
            System.out.println("[i]:"+notlar[i][İndex-1]);
        }
    }

    public static double[] maxOrt(int[][] notlar) {
       int satır=notlar.length;
       int sütun=notlar[0].length;
       int top=0;
       double[] maxort=new double[satır];
       for(int i=0;i<satır;i++){
           for(int j=0;j<sütun;j++){
               top=top+notlar[i][j];
           }
           maxort[i]=top/sütun;
       }
       return maxort;
    }
    
    
}
