
package tampilan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import string.MataKuliah;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import matakuliah.ReadFile;
import string.Elektro;
import string.Kelautan;
import string.Material;
import string.PU;
import string.Wajib;

/**
 *
 * @author mrs_sweet
 */
public class MainFrame extends JFrame{
    
    JTabbedPane tabbedPane;
    ControlPanel control;
    ArrayList list;
    AsembliPanel[] asembliPanels;
    ReadFile readFile;
    MataKuliah mk;
    MataKuliah[] mks;
    
     public MainFrame(){
           try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Failed loading L&F: ");
            System.out.println(ex);

        }
            setSize(new Dimension(400, 600));
            setLocationRelativeTo(new JRootPane());
            setLayout(new BorderLayout());
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            init();
     }

     private void init()
     {
         JPanel setupPanel = new JPanel();
         setupPanel.setLayout(new BorderLayout());
         tabbedPane = new JTabbedPane();
         try{
             readFile = new ReadFile();
             int a = readFile.getJumlahMataKuliah();
             mks = readFile.getAllMataKuliah();
             asembliPanels = new AsembliPanel[mks.length];
             for(int i = 0 ;i<mks.length; i++){
                setComponent(mks[i], i);
             }
         } catch (IOException e) {
             e.getMessage();
             setDefaultMataKuliah();
         } catch (NullPointerException e) {
             System.err.println("directory tempat file mata kuliah tidak ditemukan..!!");
             setDefaultMataKuliah();
         }
         setupPanel.add(tabbedPane);
         add(setupPanel);
         control = new ControlPanel(asembliPanels);
         add(control, BorderLayout.SOUTH);
     }

    public void setDefaultMataKuliah() {
     //   JOptionPane.showOptionDialog(null, "Ada kesalahan dalam meload mata kuliah, ingin melanjutkan..??", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null , null);
        asembliPanels = new AsembliPanel[5];
        mk = new Wajib();
        setComponent(mk, 0);
        mk = new PU();
        setComponent(mk, 1);
        mk = new Kelautan();
        setComponent(mk, 2);
        mk = new Material();
        setComponent(mk, 3);
        mk = new Elektro();
        setComponent(mk, 4);
    }

     void setComponent(MataKuliah mk,int i)
     {
        asembliPanels[i] = new AsembliPanel(mk);
        JScrollPane scrollPanel = new JScrollPane();
        scrollPanel.setViewportView(asembliPanels[i]);
        scrollPanel.setPreferredSize(new Dimension(200, 260));
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanel.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("Daftar")));
        tabbedPane.add(scrollPanel);
        tabbedPane.setTitleAt(i, asembliPanels[i].getMataKuliah().toString());
        tabbedPane.setFocusable(false);
     }

}
