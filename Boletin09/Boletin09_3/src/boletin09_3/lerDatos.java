package boletin09_3;

import javax.swing.JOptionPane;

public class lerDatos {

    public static int lerEnteiro(String mensaxe) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;

        //tamén
        // return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static float lerFloatPositivo(String mensaxe) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } while (dato <= 0);
        return dato;

    }
}
