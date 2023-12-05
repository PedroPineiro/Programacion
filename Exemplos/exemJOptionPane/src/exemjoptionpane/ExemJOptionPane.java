package exemjoptionpane;

import javax.swing.JOptionPane;

public class ExemJOptionPane {

    public static void main(String[] args) {
        //System.out.println( dato);
        //amosamos con JOptionPane
        float dato= Float.parseFloat(JOptionPane.showInputDialog("teclea: "));
        JOptionPane.showMessageDialog(null, "o valor é: "+dato);
    }
    
}
