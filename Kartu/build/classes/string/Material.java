/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class Material implements MataKuliah, IdMataKuliah {

    public String[][] getMataKuliah() {
          String[][] matkul = {
            {"FI 3712", "Fisika Energi", "2"},
            {"FI 3722", "Fisika Kristal", "2"},
            {"FI 3732", "Fisika Semikonduktor", "2"},
            {"FI 3753", "Fisika Material dan Elektronik", "3"},
            {"FI 3763", "Fisika Keramik&Polimer", "3"},
            {"FI 3772", "Fisika Superkonduktor", "2"},
            {"FI 4712", "Prak. Fisika Material&Energi", "2"},
            {"FI 4722", "Karakterisasi Bahan Semikonduktor", "2"},
            {"FI 4733", "Kemagnetan Zat Padat", "2"},
            {"FI 4742", "Teknologi Semikonduktor", "2"}
        };
        return  matkul;
    }

    @Override
   public String toString(){
       return "Material";
   }

    @Override
    public int getID() {
        return 3;
    }

}
