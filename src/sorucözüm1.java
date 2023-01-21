
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
public class sorucözüm1 {
    static int N;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Araba sayısı giriniz");
        N=input.nextInt();
        
        int[][] A=new int[N][12];
        int top=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<12;j++){
                System.out.print("["+i+"]["+j+"]  Fiyat İndex giriniz:");
                A[i][j]=input.nextInt();
                top=top+A[i][12];
            }            
            System.out.print("Aylık araba satış ederi:"+top);
        }
        Matrix(A);
    }
    public static int[][] Matrix(int[][] araba){
        
        int Enk=araba[1][1],Enb=araba[1][1];
        int Enkar=0,Enbar=0;
        for(int i=0;i<N;i++){
            Enk=araba[i][1];
            Enb=araba[i][1];
            for(int j=0;j<12;j++){
                if(araba[i][j]<Enk){
                    Enk=araba[i][j];
                    Enkar=j;
                }
                if(araba[i][j]>Enb){
                    Enb=araba[i][j];
                    Enbar=j;
                }
            }
        }
        System.out.println("Enpahlı araba:"+Enb+"En palı araba ayı:"+Enbar);
        System.out.println("En ucuz araba:"+Enk+"En ucuz araba ayı:"+Enkar);
        return araba;
        
    }
    
}
