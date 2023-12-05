package exemploobxectos;

public class Rectangulo {
    private float base;
    private float altura;
    //constructores
    
    //constructor por defecto
    /*public Rectangulo(){
    }
    */
    
    //constructor parametrizado
    public Rectangulo(float ba,float al){
        base=ba;
        altura=al;
    }
    
    //metodos de acceso
    public void darValorBase(float ba){
        base=ba;
    }
    public float devolverValorBase(){
        return base;
    }
    public void darValorAltura(float al){
        altura=al;
    }
    public float devolverValorAltura(){
        return altura;
    }
    public void calcularArea(float ba,float al){
        float area = ba*al;
        System.out.println("area = "+area);
    }
    public float calcularPerimetro(float ba,float al){
        float peri= 2*ba+2*al;
        return peri;
        //tamen return (2*ba+2*al); aforrandonos a variable peri
    }
}
