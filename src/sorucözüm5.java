
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
public class sorucözüm5 {
    static int N;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Aylık kar oranlarını giriniz");
        N=input.nextInt();
        
        int[][] A=new int[N][N];
        
        double ort;
        int top=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("["+i+"]["+j+"]  İndex degerlerini giriniz:");
                A[i][j]=input.nextInt();
                top=top+A[i][j];
            }
            ort=top/N;
            System.out.println("Arabaların aylık ortalması:"+ort);
        }
        matRix(A);
    }
    public static int[][] matRix(int[][] array){
        
        int Enb=array[1][1],Enk=array[1][1];
        int Enbay=0,Enkay=0;
        for(int i=0;i<N;i++){
            Enb=array[i][1];
            Enk=array[i][1];
            for(int j=0;j<N;j++){
                if(array[i][j]<Enk){
                    Enk=array[i][j];
                    Enkay=j;
                }
                if(array[i][j]>Enb){
                    Enb=array[i][j];
                    Enbay=j;
                }
            }
        }
        System.out.println("Max degeri:"+Enb+" Max İndex degeri:"+Enbay);
        System.out.println("Mini degeri:"+Enk+" Min index degeri:"+Enkay);
        return array;
        
    } 
    
}
