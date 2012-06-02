/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class Elektro implements MataKuliah , IdMataKuliah {

    @Override
    public String[][] getMataKuliah() {
       String[][] matkul = {
            {"FI 2562", "Sistem Jaringan Komputer", "2"},
            {"FI 3543", "Sistem Sensor", "3"},
            {"FI 3563", "Mikroprosessor", "3"},
            {"FI 3553", "Sistem Sensor II", "3"},
            {"FI 3553", "Sistem Kendali", "3"},
            {"FI 3582", "Komputer dan Antarmuka", "2"},
            {"FI 4512", "Praktek Bengkel", "2"},
            {"FI 4522", "Instrumentasi Fisika Media", "2"},
            {"FI 4532", "Instrumentasi Geofisika", "2"},
            {"FI 4542", "Instrumentasi Industri", "2"}
        };
        return matkul;
    }

    @Override
  public String toString(){
      return "elektro";
  }

    @Override
    public int getID() {
        return 5;
    }


}
