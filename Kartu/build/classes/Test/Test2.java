
package Test;

public class Test2 {

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
          //  System.out.println(i);
            for (int j = 0; j < 4; j++) {
                System.out.print( + j+"\t");
                if (j == i) {
                    j++;
                }
               
            }
            System.out.println();
        }
    }
}
