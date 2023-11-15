package boletin_4;

public class Libro {

    private String titulo;
    private String autor;
    private int ano;
    private short numPag;
    private float valoracion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ano, short numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPag() {
        return numPag;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPag(short numPag) {
        this.numPag = numPag;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
    
    

}
