package boletin15;

public class Boletin15 {

    public static void main(String[] args) {
        Futbol fut = new Futbolista(13, "lateral", 3, "pablo", "martinez", 30);
        Futbol entr = new Entrenador("abc", 3, "pedro", "pineiro", 18);

        System.out.println(fut.toString());
        System.out.println(entr.toString());
    }

}
