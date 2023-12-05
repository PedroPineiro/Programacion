package boletin09_02;

public class CalcularSuma {

    public void calcularSumaProducto() {
        int limiteInferior = 10;
        int limiteSuperior = 90;

        int suma = 0;
        long producto = 1;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("La suma de los numeros entre " + limiteInferior + " y " + limiteSuperior + " es: " + suma);
        System.out.println("El producto de los numeros entre " + limiteInferior + " y " + limiteSuperior + " es: " + producto);
    }
}
