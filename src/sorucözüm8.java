
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
public class sorucözüm8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ders notlarını satır indizi giriniz");
        int M=input.nextInt();
        System.out.println("Sınıfdaki kisi sayısını giriniz");
        int N=input.nextInt();
        
        int[][] notlar=new int[M][N];
        int sınıfnotları=(int) ogrNotları(M,N);
        
    }
    public static double ogrNotları(int M,int N){
        Scanner input=new Scanner (System.in);
        
        int top=0;
        int[][] sınıfort=new int[M][N];
        double ort;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] İndex giriniz");
                sınıfort[i][j]=input.nextInt();
                top=top+sınıfort[i][j];
            }

        }
        ort=top/N;
        return ort;
    }   
    
}
