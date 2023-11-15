package boletin06;

import javax.swing.JOptionPane;

public class Coche {
     private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int getVelocidade() {
        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Introduce a velocidade actual: "));
        return velocidade;
    }

    public void acelerar(int valor) {
        valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la aceleración: "));
        velocidade = velocidade + valor;
        //JOptionPane.showMessageDialog(null, "Se aceleró a: " + velocidade + "km/h");
        amosar();
    }

    public void frenar(int menos) {
        menos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la deceleración: "));
        velocidade = velocidade - menos;
        //JOptionPane.showMessageDialog(null, "Se frenó en: " + velocidade + "km/h");
        amosar();
    }
    public void amosar(){
    JOptionPane.showMessageDialog(null, "Se frenó en: " + velocidade + "km/h");

    }
}
