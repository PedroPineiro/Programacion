package boletin06_3;

public class Circulo {
    //atributos
    private double radio;
   
    
    //constructor sen parametros
    public  Circulo(){
    }
    //constructor con parametros
    public Circulo(double radio){
    this.radio=radio;
    
    }
    //setters
    public void setRadio(double radio){
    this.radio=radio;
    }
    
    //metodos
    public void calcularArea(){
       double area = Math.pow(radio, 2)*Math.PI;
        System.out.println("Area: "+area);
    }
    public void calcularLonxitude(){
        double lonxitude = 2*Math.PI*radio;
        System.out.println("Lonxitude: "+lonxitude);
        
    }
    
    
    
    
    }

