package boletin09_5;

public class SoldoTraballador {

    public void calcularSoldo() {
        float sueldo;
        int i = 0;
        int contadorMenosDeMil = 0;
        do {
            sueldo = lerDatos.lerFloatPositivo("Introduce el sueldo del empleado." + (i + 1));

            if (1750 >= sueldo && sueldo >= 1000) {
                i++;
            }

            if (sueldo < 1000) {
                contadorMenosDeMil++;
                float porcentaje = contadorMenosDeMil / i * 100;
                System.out.println("El porcentaje de trabajadores que cobran menos de 1000€ es: " + porcentaje + "%.");
            }

        } while (sueldo != 0);
        System.out.println("Hay un total de " + (i+1) + " trabajadores que cobran entre 1000 y 1750€");
        
    }
}

