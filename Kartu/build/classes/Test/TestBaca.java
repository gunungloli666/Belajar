/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mrs_sweet
 */
public class TestBaca {

    public TestBaca(String a) throws FileNotFoundException, IOException {
        File f = new File(".", a);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String x = br.readLine();
        String[] y = x.split("\t");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

    }

    public static void main(String[] args) {
        try {
            TestBaca test = new TestBaca("A.txt");
        } catch (Exception e) {
        }
    }
}
