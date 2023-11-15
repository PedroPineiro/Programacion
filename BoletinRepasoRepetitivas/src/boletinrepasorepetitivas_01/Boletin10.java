package boletinrepasorepetitivas_01;

import javax.swing.JOptionPane;

public class Boletin10 {
    int nota;
    int i = 0;
    float media;
    int suma = 0;
    public void mediaNotas() {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce tus notas: "));
            i++;
            suma += nota;
        } while (i < 6);
        media = (float) suma / 6;
        System.out.println("Tiene una media de " + media);
    }
}
