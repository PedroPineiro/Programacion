package exatributosobxectos;

public class Ordenador {

    private Teclado tecla;
    private Rato raton;
    private Monitor pantalla;
    private float precio;

    public Ordenador(Teclado tecla, Rato raton, Monitor pantalla, float precio) {
        this.tecla = tecla;
        this.raton = raton;
        this.pantalla = pantalla;
        this.precio = precio;
    }

    public Ordenador() {
    }

    public Teclado getTecla() {
        return tecla;
    }

    public void setTecla(Teclado tecla) {
        this.tecla = tecla;
    }

    public Rato getRaton() {
        return raton;
    }

    public void setRaton(Rato raton) {
        this.raton = raton;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "tecla=" + tecla + ", raton=" + raton + ", pantalla=" + pantalla + ", precio=" + precio + '}';
    }
    
    public void amosar(Ordenador or){
        System.out.println(or);
    }
    
    public Ordenador devolver() {
        Ordenador ordenador = new Ordenador(new Teclado("qqq", 60), 
        new Rato("rara"), new Monitor("marca", 30), 500);
        return this;
    }
    

}
