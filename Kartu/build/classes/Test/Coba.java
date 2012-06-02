/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author mrs_sweet
 */
public class Coba {
    
    
    double data[];
    
    public Coba(double data[]){
        this.data = data;
    }
    
    double[] getData(){
        return data;
    }
    void  uji(){
        double a[] = data;
        for(int i=0; i< a.length ;i++){
            a[i] = 2*a[i];
        }
    }
    
    static void print(double[] d){
        for(int i=0; i< d.length ;i++){
            System.out.print(d[i]+"\t");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        double test[] = {1,3,2,1,5,6,};
        Coba coba = new Coba(test);
        print(coba.getData());
        coba.uji();
        print(coba.getData());
    }
}
