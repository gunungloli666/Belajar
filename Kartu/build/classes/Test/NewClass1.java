/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.util.ArrayList;

/**
 *
 * @author mrs_sweet
 */
public class NewClass1 {

    static String[]coba = {"Mari makan bersama" , "Dilarang Masuk" , "Jangan keluyuran setiap malam"};

    public static void main(String[] args){
        ArrayList array = new ArrayList();
        for(int i=0; i< coba.length ; i++){
            array.add(coba[i]);
        }
        String[] hasil = new String[array.size()];
        for(int i=0 ; i< hasil.length; i++){
            hasil[i] = array.get(i).toString();
            System.out.println(hasil[i]);
        }




    }

}
