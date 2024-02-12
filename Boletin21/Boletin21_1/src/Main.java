public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
        }
    }

}