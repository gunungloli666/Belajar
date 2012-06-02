package tampilan;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import string.ParticularElement;
import string.MataKuliah;

public class AsembliPanel extends JPanel {

    private ParticularElement particularElement;
    private MataKuliah matakuliah;
    private JCheckBox[] checkBox;
    private JComboBox[] comboBox;
    private JLabel[] labels;
    private GridBagConstraints constraint;
    private GridBagLayout layout;
    private static final String[] nilai = {"A", "B", "C", "D", "E"};
    private int length;
    private int totSKS , totSKSNilai , totNilai;
    private double IP;
    boolean selected = false;

    public AsembliPanel(MataKuliah mk){
        this.matakuliah  = mk;
        particularElement = new ParticularElement(matakuliah);
        init();
    }

    private void init(){

        layout = new GridBagLayout();
        setSize(new Dimension(313, 300));
        setLayout(layout);
        setBackground(Color.WHITE);
        constraint =  new GridBagConstraints();
        constraint.fill = GridBagConstraints.BOTH;
        length = particularElement.getKode().length;
        checkBox = new JCheckBox[length];
        comboBox = new JComboBox[length];
        labels = new JLabel[length];

        //looping untuk menambahkan komponen Mata kuliah Ke panel
        try{
           for(int i=0; i< length; i++){
            JLabel label;

            checkBox[i] = new JCheckBox(particularElement.getKode()[i]);
            setComponent(checkBox[i], i, 0, 1, 1);
            label = new JLabel("    ");
            setComponent(label, i, 2, 1, 1);
            label = new JLabel(particularElement.getNama()[i]);
            setComponent(label, i, 3, 5, 1);
            label = new JLabel("    ");
            setComponent(label, i, 8, 1, 1);
            labels[i] = new JLabel(particularElement.getSKS()[i]);
            setComponent(labels[i], i, 9, 1, 1);
            label = new JLabel("    ");
            setComponent(label, i, 10, 3, 1);
            comboBox[i] = new JComboBox(nilai);
            setComponent(comboBox[i], i, 14, 5, 1);
            
        }
        }catch(Exception e){
            System.out.println("Error 1");
        }
      
    }

   private void setComponent(Component comp, int gridY, int gridX, int numCol, int numRow ){

        constraint.gridx = gridX;
        constraint.gridy = gridY;
        constraint.gridwidth = numCol;
        constraint.gridheight = numRow;
        layout.setConstraints(comp, constraint);

        add(comp);

    }

   public MataKuliah getMataKuliah(){
       return matakuliah;
   }


   public void unChecked(){
       for(int i = 0; i< length ;i++){
           checkBox[i].setSelected(false);
       }
   }


   public boolean isSelected(){
       return selected;
   }

   public void setSelected(boolean  state){
       selected =state;
   }

    public  void setIP(){

        totSKS = 0;
        totSKSNilai = 0;
        totNilai = 0;
        IP = 0;

        for(int i=0; i< length ;i++){
            if(checkBox[i].isSelected()){
               int nil = 4-(comboBox[i].getSelectedIndex());
               int SK = (int)Integer.valueOf(labels[i].getText());
               int SKN = nil*SK;
               totSKS+=SK;
               totNilai+=nil;
               totSKSNilai+=SKN;
            }
        }
        IP = (double)totSKSNilai/totSKS;

    }

    public double getIP() {
        return IP;
    }

    public int getTotalSks() {
        return totSKS;
    }

    public int getTotalNilaiKaliSKS() {
       return totSKSNilai;
    }

    public int getTotalNilai() {
       return totNilai;
    }
}
