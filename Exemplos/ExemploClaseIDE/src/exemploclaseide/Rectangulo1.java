package exemploclaseide;

public class Rectangulo1 {
    private float base;
    private float altura;

    public Rectangulo1() {
    }

    public Rectangulo1(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void calcularArea(float base, float altura) {
        System.out.println("Area: "+base*altura);
    }
    
    public float calcularPerimetro(){
        float perimetro = (2*base)+(2*altura);
        System.out.println(perimetro);
        return 2*base+2*altura;
    }
}
