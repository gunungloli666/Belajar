/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tampilan;

/**
 *
 * @author mrs_sweet
 */

import tampilan.MainFrame;
public class Test {
      public static void main(String[] args){
          java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               new MainFrame();
            }
        });

      }
}
