
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
public class kitapsaru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Notların sayısı giriniz");
        int M=input.nextInt();
        System.out.println("Sınıfdaki kisi sayısını giriniz");
        int N=input.nextInt();
        
        
        int[][] notlar=notlarGiris(M,N);
        double[] sınıfort=sınıfOrtalama(notlar);
        int[] maxVEminiSınıfnot=maxVEmin(notlar);
                
    }
    public static int[][]notlarGiris(int M,int N){
        Scanner input=new Scanner(System.in);
        int satır=M;
        int sütun=N;
        int[][] not=new int[satır][sütun];
        for(int i=0;i<satır;i++){
            for(int j=0;j<sütun;j++){
                System.out.println("["+i+"]["+j+"]  İndexlerini giriniz");
                not[i][j]=input.nextInt();
            }
        }
        return not;
      
    }

    public static double[] sınıfOrtalama(int[][] notlar) {
        int satır=notlar.length;
        int sütun=notlar[0].length;
        double[] ortsınıf=new double[satır];
        int top=0;
        for(int i=0;i<satır;i++){
            for(int j=0;j<sütun;j++){
                top=top+notlar[i][j];
            }
            ortsınıf[i]=top/sütun;
        }
        return ortsınıf;
    }

    public static int[] maxVEmin(int[][] notlar) {
        int satır=notlar.length;
        int sütun=notlar[0].length;
        int[][] maxVEmin=new int[satır][sütun];
        int Enb=notlar[0][0],Enk=notlar[0][0];
        int Enbİndex=0,Enkİndex=0;
        for(int i=0;i<satır;i++){
            Enb=notlar[i][0];
            Enk=notlar[i][0];
            for(int j=0;j<sütun;j++){
                if(notlar[i][j]<Enk){
                    Enk=notlar[i][j];
                    Enkİndex=j;
                }
                if(notlar[i][j]>Enb){
                    Enb=notlar[i][j];
                    Enbİndex=j;
                }
            }
            
        }
    }

    
    
}
