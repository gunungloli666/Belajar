package tampilan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mrs_sweet
 */
public class ControlPanel extends javax.swing.JPanel {

    private AsembliPanel[] asembli;
    private int SKS, nilaiKaliSKS, totSKS = 0, totSKSKaliNilai = 0;
    private double IP, IPK = 0;
    private NumberFormat form;
    int semester = 0;
    String pesan = "";
    StringBuilder builder = new StringBuilder();

    public ControlPanel(AsembliPanel[] h) {

        form = new DecimalFormat("#0.000");
        this.asembli = h;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        getIP = new javax.swing.JButton();
        resetIP = new javax.swing.JButton();
        getIPK = new javax.swing.JButton();
        resetIPK = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fieldIP = new javax.swing.JTextField();
        fieldSKS = new javax.swing.JTextField();
        fieldTotSKS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldIPK = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Control Panel"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        getIP.setText("Get IP");
        getIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getIPActionPerformed(evt);
            }
        });

        resetIP.setText("Reset IP");
        resetIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetIPActionPerformed(evt);
            }
        });

        getIPK.setText("Get IPK");
        getIPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getIPKActionPerformed(evt);
            }
        });

        resetIPK.setText("Reset IPK");
        resetIPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetIPKActionPerformed(evt);
            }
        });

        prev.setText("prev");

        next.setText("next");

        printButton.setText("print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        statusLabel.setText("Ready..........!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(getIP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetIPK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getIP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetIP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prev)
                    .addComponent(next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 120));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        fieldIP.setBackground(new java.awt.Color(204, 204, 255));
        fieldIP.setEditable(false);
        fieldIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIPActionPerformed(evt);
            }
        });

        fieldSKS.setEditable(false);
        fieldSKS.setBackground(new java.awt.Color(204, 204, 255));

        fieldTotSKS.setEditable(false);
        fieldTotSKS.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("IP");

        jLabel2.setText("IPK");

        jLabel5.setText("SKS");

        jLabel6.setText("Tot SKS");

        fieldIPK.setEditable(false);
        fieldIPK.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(fieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(fieldTotSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldIPK)
                            .addComponent(fieldSKS, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldIPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTotSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void getIPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getIPKActionPerformed
        // TODO add your handling code here:
        semester += 1;
        fieldIPK.setText(form.format(getIPK()));
        fieldTotSKS.setText(form.format(getTotSKS()));
        tulisPesan();
    }//GEN-LAST:event_getIPKActionPerformed

    private void getIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getIPActionPerformed
        // TODO add your handling code here:
        IP = 0;
        SKS = 0;
        nilaiKaliSKS = 0;
        
        for (int i = 0; i < asembli.length; i++) {
            asembli[i].setIP();
            int a = asembli[i].getTotalSks();
            SKS += a;
            int b = asembli[i].getTotalNilaiKaliSKS();
            nilaiKaliSKS += b;
        }
        if (SKS != 0) {
            hitungKUmulatif();
            fieldIP.setText(form.format(getIP()));
            fieldSKS.setText(form.format(getSKS()));
        } else {
            
        }
    }//GEN-LAST:event_getIPActionPerformed

    private void fieldIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIPActionPerformed
        // TODO add your handling code here:
        //   fieldIPK.setText("hai");
    }//GEN-LAST:event_fieldIPActionPerformed

    private void resetIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetIPActionPerformed
        // TODO add your handling code here:
        IP = 0;
        SKS = 0;
        fieldIP.setText("");
        fieldSKS.setText("");
        
        for (int i = 0; i < asembli.length; i++) {
            asembli[i].unChecked();
        }
    }//GEN-LAST:event_resetIPActionPerformed

    private void resetIPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetIPKActionPerformed
        // TODO add your handling code here:
        pesan ="";
        semester = 0;
        IPK = 0;
        totSKS = 0;
        fieldIPK.setText("");
        fieldTotSKS.setText("");
        for (int i = 0; i < asembli.length; i++) {
            asembli[i].unChecked();
        }
    }//GEN-LAST:event_resetIPKActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        print();
    }//GEN-LAST:event_printButtonActionPerformed

    void hitungKUmulatif() {
        IP = (double) nilaiKaliSKS / SKS;
        totSKSKaliNilai += nilaiKaliSKS;
        totSKS += SKS;
        if (totSKS != 0) {
            IPK = (double) totSKSKaliNilai / totSKS;
        }
    }

    private double getIP() {
        return round(IP, 2);
    }

    private double getIPK() {
        return round(IPK, 2);
    }

    private double getSKS() {
        return SKS;
    }

    private double getTotSKS() {
        return totSKS;
    }

    void tulisPesan() {
        pesan += ("Untuk semester ke-" + semester + ", IP anda: " + getIP() + " | SKS terprogram: " + getSKS() + " | IP Kumulatif: " + getIPK() + " | Total SKS terprogram: " + getTotSKS() + "\n");
    }

    public void print() {
        String s = "Hasil perhitungan IP dan IPK yang anda peroleh adalah \n";
        s += pesan;
        JFileChooser chooser = new JFileChooser(".");
        flt = new JavaFilter();
        chooser.setFileFilter(flt);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setApproveButtonText("save");
        int returnVal = chooser.showOpenDialog(new JFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file.exists()) {
                int response = JOptionPane.showConfirmDialog(null,
                        "Overwrite existing file?", "Confirm Overwrite",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }
            writeFile(file, s);
            chooser = null;
        } else {
            chooser = null;
        }

    }
    
    private void writeFile(File f, String s) {
        PrintWriter out ;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            out.print(s);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Error dslam print file ... ");
        }
       
    }
    
     private class JavaFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File f) {
            return f.getName().toLowerCase().endsWith(".txt")
                    || f.isDirectory();
        }

        @Override
        public String getDescription() {
            return "Text files (*.txt)";
        }
    }
     
     
      public double round(double rval, int rpl) {
        double p = (double) Math.pow(10, rpl);
        rval = rval * p;
        double temp = Math.round(rval);

        return (double) temp / p;
    }


    JavaFilter flt;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldIP;
    private javax.swing.JTextField fieldIPK;
    private javax.swing.JTextField fieldSKS;
    private javax.swing.JTextField fieldTotSKS;
    private javax.swing.JButton getIP;
    private javax.swing.JButton getIPK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JButton printButton;
    private javax.swing.JButton resetIP;
    private javax.swing.JButton resetIPK;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
    ///buat ngeprint hasil perhitungan
}
