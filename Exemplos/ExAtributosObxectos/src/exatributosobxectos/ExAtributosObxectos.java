package exatributosobxectos;

public class ExAtributosObxectos {

    public static void main(String[] args) {
        Teclado teclado = new Teclado("Samsung", 80f);
        Rato rato = new Rato("Logitech");
        Monitor monitor = new Monitor("Samsung", 15.5f);
        Ordenador ordenador = new Ordenador(teclado, rato, monitor, 800);
        System.out.println(ordenador);

        /* Ordenador ordenador2 = new Ordenador(new Teclado("aa", 20f), 
        new Rato("bbbb"), new Monitor("asus", 21f), 1000);
        System.out.println(ordenador2);
         */
        ordenador.getPantalla().getMarca();

        String marca = ordenador.getPantalla().getMarca();
        System.out.println("marca: " + marca);

    }

}
