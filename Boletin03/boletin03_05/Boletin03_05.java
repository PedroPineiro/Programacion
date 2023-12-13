package boletin03_05;

import java.util.Scanner;

public class Boletin03_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario los datos necesarios
        System.out.print("Introduce el salario fijo mensual: ");
        double salarioFijo = sc.nextDouble();

        System.out.print("Introduce el importe total de ventas: ");
        double ventas = sc.nextDouble();

        System.out.print("Introduce la cantidad de kilómetros recorridos: ");
        double kilometraje = sc.nextDouble();

        System.out.print("Introduce la cantidad de días de desplazamiento: ");
        int diasDesplazamiento = sc.nextInt();

        // Calcular la comisión (5% sobre las ventas)
        double comision = ventas * 0.05;

        // Calcular la quilometraje (2 € por km)
        double salarioKilometraje = kilometraje * 2;

        // Calcular las dietas (30 € por día de desplazamiento)
        double dietas = diasDesplazamiento * 30;

        // Calcular el salario total
        double salarioTotal = salarioFijo + comision + salarioKilometraje + dietas;

        // Calcular el I.R.P.F. (18% del salario total)
        double irpf = salarioTotal * 0.18;

        // Calcular la retención a la seguridad social (36 €)
        double retencionSeguridadSocial = 36.0;

        // Calcular el salario neto
        double salarioNeto = salarioTotal - irpf - retencionSeguridadSocial;

        // Mostrar los resultados
        System.out.println("Salario Bruto: " + salarioTotal + " euros");
        System.out.println("Salario Neto: " + salarioNeto + " euros");
    }
    
}