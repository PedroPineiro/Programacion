package exatributosobxectos;

public class CPU {

    private int velocidade;
    private int alamacenamento;

    public CPU() {
    }

    public CPU(int velocidade, int alamacenamento) {
        this.velocidade = velocidade;
        this.alamacenamento = alamacenamento;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAlamacenamento() {
        return alamacenamento;
    }

    public void setAlamacenamento(int alamacenamento) {
        this.alamacenamento = alamacenamento;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidade=" + velocidade + ", alamacenamento=" + alamacenamento + '}';
    }

}


