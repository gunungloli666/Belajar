package Test;

import java.io.File;

public class Cari {

    int mm = 0;

    public Cari() {
        File f = new File("./m");
        String[] a = f.list();
        for (int i = 0; i < a.length; i++) {
            File fl = new File(a[i]);
            if (!fl.isDirectory()) {
                // System.out.println(a[i]);
                int as = a[i].lastIndexOf(".");
                String bc = a[i].substring(as + 1, a[i].length());
                if (bc.equalsIgnoreCase("class")) //  mm++;
                {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Cari c = new Cari();
    }
}
