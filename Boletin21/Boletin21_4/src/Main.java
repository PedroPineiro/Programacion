import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dni;
        int modulo;

        System.out.println("Ingrese su DNI: ");
        dni = scanner.nextInt();

        modulo = dni % 23;

        if(modulo == 0){
            System.out.println("Su letra es T");
        }else if(modulo == 1){
            System.out.println("Su letra es R");
        }else if(modulo == 2){
            System.out.println("Su letra es W");
        }else if(modulo == 3){
            System.out.println("Su letra es A");
        }else if(modulo == 4){
            System.out.println("Su letra es G");
        }else if(modulo == 5){
            System.out.println("Su letra es M");
        }else if(modulo == 6){
            System.out.println("Su letra es Y");
        }else if(modulo == 7){
            System.out.println("Su letra es F");
        }else if(modulo == 8){
            System.out.println("Su letra es P");
        }else if(modulo == 9){
            System.out.println("Su letra es D");
        }else if(modulo == 10){
            System.out.println("Su letra es X");
        }else if(modulo == 11){
            System.out.println("Su letra es B");
        }else if(modulo == 12){
            System.out.println("Su letra es N");
        }else if(modulo == 13){
            System.out.println("Su letra es J");
        }else if(modulo == 14){
            System.out.println("Su letra es Z");
        }else if(modulo == 15){
            System.out.println("Su letra es S");
        }else if(modulo == 16){
            System.out.println("Su letra es Q");
        }else if(modulo == 17){
            System.out.println("Su letra es V");
        }else if(modulo == 18){
            System.out.println("Su letra es H");
        }else if(modulo == 19){
            System.out.println("Su letra es L");
        }else if(modulo == 20){
            System.out.println("Su letra es C");
        }else if(modulo == 21){
            System.out.println("Su letra es K");
        }else if(modulo == 22){
            System.out.println("Su letra es E");
        }

    }

}