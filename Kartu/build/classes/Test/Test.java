
package  Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test {

   double[][] matriks ;
   int jmlBaris,jmlKolom;

   public Test( double matriks[][]){
       this.matriks = matriks;
       this.jmlBaris = matriks.length;
       this.jmlKolom = matriks[0].length;
   }

   public double[][] multilpy1(){
       double hasil[][] = new double[jmlBaris][jmlKolom];
       for(int i=0; i< jmlBaris;i++)
          for(int j=0; j< jmlKolom;j++)
             hasil[i][j] = 2*matriks[i][j];
                  
       return hasil;
   }
   
   double[][] getMatriks(){
       return matriks;
   }

   public double[][] multiply2(){
       double hasil[][] = new double[jmlBaris][jmlKolom];
       hasil = matriks;
       for(int i=0; i< jmlBaris; i++)
           for(int j = 0; j< jmlKolom;j++)
               hasil[i][j] = 2*hasil[i][j];

       return hasil;
   }

    //Uji
    public static void main(String[] args) {
       double matriksTest[][] = {
            {1, 3, 3},
            {2, 4, 2},
            {6, 3, 6}
        };
        Test t = new Test(matriksTest);
        System.out.println("Matriks yang diuji:");
        print(matriksTest);
        System.out.println("Instan variabel:");
        print(t.getMatriks());
        System.out.println("Hasil eksekusi method 1:");
        print(t.multilpy1());
        System.out.println("Instant variabel setelah eksekusi method 1:");
        print(t.getMatriks());
        System.out.println("Hasil eksekusi method 2:");
        print(t.multiply2());
        System.out.println("Instant variabel setelah eksekusi method 2:");
        print(t.getMatriks());
    }

   static void print(double[][] matriks){
      NumberFormat m = new DecimalFormat("#0.000");
       for (int i = 0; i < matriks.length; i++) {
           for (int j = 0; j < matriks[0].length; j++) {
               System.out.print(m.format(matriks[i][j]));
               System.out.print("  ");
           }
            System.out.println();
       }
      System.out.println();
   }
}

