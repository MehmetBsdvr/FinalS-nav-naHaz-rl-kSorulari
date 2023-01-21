
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
public class sorucözüm2 {
    static int N;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun elamanlarını giriniz");
        N=input.nextInt();
        
        int[][] A=new int[N][N];
        int top=0;
        double ort;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"] Satır ve Sütun İndexlerini giriniz:");
                A[i][j]=input.nextInt();
                top=top+A[i][j];
            }
            ort=top/N;
            System.out.println("Satır ların ortalaması:"+ort);
            System.out.println("Satır İndexlerini toplamı:"+top);
        }
        matrix(A);
    }
    public static void matrix(int[][] saol){
        
        int Enk=saol[1][1],Enb=saol[1][1];
        int Enkin=1,Enbin=1;
        for(int i=0;i<N;i++){
            Enk=saol[i][1];
            Enb=saol[i][1];
            for(int j=0;j<N;j++){
                if(saol[i][j]<Enk){
                    Enk=saol[i][j];
                    Enkin=j;
                }
                if(saol[i][j]>Enb){
                    Enb=saol[i][j];
                    Enbin=j;
                }
            }
        }
        System.out.println("Max degeri:"+Enb+" Max İndex degeri:"+Enbin);
        System.out.println("Mini degeri:"+Enk+" Min index degeri:"+Enkin);
    }
    
}
