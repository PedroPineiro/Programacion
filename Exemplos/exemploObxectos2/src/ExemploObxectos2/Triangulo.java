
package ExemploObxectos2;


public class Triangulo {
    //atributos
    
    private float base;
    private float altura;
    
    //metodos
    
    //constructor
    
    public Triangulo(float b, float al){
        base=b;
        altura=al;
    }
    
    
    //metodos de acceso
    
    public void calcularArea(){
        float area=base*altura/2;
        System.out.println("area = "+area);
    }
}
