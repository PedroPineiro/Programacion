package boletinrepasorepetitivas_01;

import javax.swing.JOptionPane;

public class Boletin11 {
    int nota;
    int i;
    float media;
    int suma;
    int alumno = 0;

    public void mediaNotas() {
        do {
            suma = 0;
            i = 0;
            do {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce tus notas: "));
                i++;
                suma += nota;
            } while (i < 6);
            alumno++;
            media = (float) suma / 6;
            System.out.println("Tiene una media de " + media);
        } while (alumno < 3);
    }
}
