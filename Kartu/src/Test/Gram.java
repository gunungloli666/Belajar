package Test;

public class Gram {

    int baris, kolom;
    double[][] vektor;
    double vektorResult[][], vektorBasis[][];

    public Gram(double vektor[][]) {
        this.vektor = vektor;
        baris = vektor.length;
        kolom = vektor[0].length;
        vektorResult = new double[baris][kolom];
        vektorBasis = new double[baris][kolom];
        init();
    }

    void init() {
        vektorResult[0] = vektor[0];
        vektorBasis[0] = getBasis(vektorResult[0]);
        for (int i = 1; i < baris; i++) {
            vektorResult[i] = vektor[i];
            for (int j = 0; j < i; j++) {
                vektorResult[i] = substract(vektorResult[i], projection(vektor[i], vektorResult[j]));
            }
            vektorBasis[i] = getBasis(vektorResult[i]);
        }
    }

    double[][] getVektor() {
        return vektor;
    }

    double[][] getVektorResult() {
        return vektorResult;
    }

    double[][] getVektorBasis() {
        return vektorBasis;
    }

    double[] getBasis(double vektorInput[]) {
        double result[] = new double[vektorInput.length];
        double temp = 0;
        for (int i = 0; i < result.length; i++) {
            temp += Math.pow(vektorInput[i], 2);
        }
        temp = Math.sqrt(temp);
        for (int i = 0; i < result.length; i++) {
            result[i] = vektorInput[i] / temp;
        }
        return result;
    }

    double[] copyVector(double vektorInput[]) {
        double result[] = new double[vektorInput.length];
        System.arraycopy(vektorInput, 0, result, 0, result.length);
        return result;
    }

    double[] projection(double vektorA[], double vektorB[]) {
        double result[] = new double[vektorA.length];
        double a = innerProduct(vektorA, vektorB);
        double b = innerProduct(vektorB, vektorB);
        for (int i = 0; i < result.length; i++) {
            result[i] = a * vektorB[i] / b;
        }
        return result;
    }

    double innerProduct(double vektorA[], double vektorB[]) {
        double result = 0;
        for (int i = 0; i < vektorA.length; i++) {
            result += vektorA[i] * vektorB[i];
        }
        return result;
    }

    double[] substract(double vektorA[], double vektorB[]) {
        double result[] = new double[vektorA.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = vektorA[i] - vektorB[i];
        }
        return result;
    }

    static void print(double v[][]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] argas) {
        double vektorInput[][] = {
            {3, 1, 3}, {2, 2, 1}, {2, 2, 4}
        };
        double vektorInput2[][] = {
            {3, 1}, {2, 2}
        };
        Gram gram = new Gram(vektorInput);
        double a[][] = gram.getVektorResult();
        double b[][] = gram.getVektorBasis();
        System.out.println("Matriks input:");
        print(gram.getVektor());
        System.out.println("Matriks result:");
        print(a);
        System.out.println();
        System.out.println("Matriks Basis:");
        print(b);
        System.out.println();
        System.out.println("Inner product dari matriks hasil:");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.println("Inner product antara " + "baris ke-" + (i) + " dengan " + "baris ke-" + (j) + " = "
                        + gram.innerProduct(a[i], a[j]));
            }
        }

        System.out.println();
        System.out.println("Inner product dari matriks basis:");

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                System.out.println("Inner product antara " + "baris ke-" + (i) + " dengan " + "baris ke-" + (j) + " = "
                        + gram.innerProduct(b[i], b[j]));
            }
        }
    }
}
