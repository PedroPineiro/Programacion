import java.util.Scanner;

public class ConversorTemperaturas {
    Scanner sc = new Scanner(System.in);

    private float temperatura;
    private final float centigrados = 80F;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getCentigrados() {
        return centigrados;
    }

    public float centigradosAFharenheit() {
        System.out.print("Introduce grados centígrados: ");
        temperatura = sc.nextFloat();
        float fharenheit = (float)((9.0 / 5.0) * temperatura + 32.4);
        System.out.println(temperatura + "ºC son " + fharenheit + "ºR");
        return fharenheit;
    }

    public void centigradosAReamur() {
        System.out.print("Introduce grados centígrados: ");
        temperatura = sc.nextFloat();
        float reamur = (float) (4.0 / 5.0) * temperatura;
        System.out.println(temperatura + "ºC son " + reamur + "ºR");
    }
}