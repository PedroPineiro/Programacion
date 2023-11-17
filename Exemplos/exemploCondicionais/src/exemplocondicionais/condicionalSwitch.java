package exemplocondicionais;

import javax.swing.JOptionPane;

public class condicionalSwitch {
    public void verDiaSemana(){
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Teclea numero dia del 1 al 7 :"));
        switch(dia){
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miercoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5:System.out.println("Viernes");
                break;
            case 6:System.out.println("Sabado");
                break;
            case 7:System.out.println("Domingo");
                break;
            default:System.out.println("No es un numero valido");
        }
}
}
