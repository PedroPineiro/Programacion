package boletin18_01;

public class Boletin18_01 {

    public static void main(String[] args) {
        Prezo prez = new Prezo();
        Chamada cham = new Chamada();
        do {
            prez.CantidadeMinutos();
        } while (cham.getMinuto() != 0);
    }
}
