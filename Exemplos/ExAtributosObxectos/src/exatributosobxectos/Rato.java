package exatributosobxectos;

public class Rato {

    private String marca;

    public Rato(String marca) {
        this.marca = marca;
    }

    public Rato() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rato{" + "marca=" + marca + '}';
    }

}
