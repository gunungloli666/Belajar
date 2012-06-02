/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Differensial {

    int step, N;
    String[] file;

    public Differensial(int step) {
        this.step = step;
    }

    void Euler() {
        for (int i = 0; i < N; i++) {
        }
    }

    double getY() {
        return 0;
    }

    //Euler Method
    public static void main(String[] args) {
    }
}

class IO {

    BufferedReader br;
    PrintWriter out;
    String s;
    File f;

    IO(File f, String s) {
        this.s = s;
        this.f = f;

    }

    void printToFile() {
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            out.print(s);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.print("Unable to write the file...!!");
        }
    }

    void printToData() {
    }
}

class Plot {

    Plot() {
    }
}
