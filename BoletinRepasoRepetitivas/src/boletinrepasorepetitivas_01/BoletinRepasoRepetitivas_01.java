package boletinrepasorepetitivas_01;

public class BoletinRepasoRepetitivas_01 {

    public static void main(String[] args) {
        
        // 1. Sacar por consola 5 veces a frase "isto é un bucle"
        Boletin01 b01 = new Boletin01();
        b01.frasear();

        // 2. Visualizar 5 números que pides por teclado 
        Boletin02 b02 = new Boletin02();
        b02.visualizar();
        
        // 3. Visualizar varios números que pides por teclado, remata cando premes 0
        Boletin03 b03 = new Boletin03();
        b03.visualizarNums();
        
        // 4. Visualizar 4 numeros que entren por teclado. Os números non poden ser negativos 
        Boletin04y05 b04 = new Boletin04y05();
        b04.verPositivos();

        // 6. Calcula o área dun cadrado pedindo o valor por teclado tendo en conta que non pode ser negativo
        Boletin06y07 br6 = new Boletin06y07();
        br6.calcaularArea();

        // 8. Calcular o área de varios cadrados, rematando con 0
        Boletin08 br8 = new Boletin08();
        br8.calcularArea();

        // 9.
        Boletin09 br9 = new Boletin09();
        br9.sumarNumeros();

        // 10.
        Boletin10 br10 = new Boletin10();
        br10.mediaNotas();

        // 11.
        Boletin11 br11 = new Boletin11();
        br11.mediaNotas();

        // 12.
        Boletin12 br12 = new Boletin12();
        br12.media();
    }
    
}
