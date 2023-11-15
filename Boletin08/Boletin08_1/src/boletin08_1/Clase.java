package boletin08_1;

import javax.swing.JOptionPane;

public class Clase {
    public void verVenta(){
        int venta=Integer.parseInt(JOptionPane.showInputDialog("Teclea a cantidade de ventas anuais :"));
        if (venta<=100){
            System.out.println("Baixo");
        }
        else if(venta>100 && venta<=500){
            System.out.println("Medio");
        }
        else if(venta>500 && venta<=1000){
            System.out.println("Alto");
        }
        else if(venta>1000){
            System.out.println("Primeira necesidade");
        }
        else{
            System.out.println("No es un numero valido");
        }
    }
}
