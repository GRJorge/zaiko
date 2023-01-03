package zaiko;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import views.menu;

/**
 *
 * @author jorge
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar el tema" + e, "Error", 0);
        }
        
        menu w = new menu();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
    }
    
}
