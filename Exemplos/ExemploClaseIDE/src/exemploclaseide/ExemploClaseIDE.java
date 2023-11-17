package exemploclaseide;

public class ExemploClaseIDE {

    public static void main(String[] args) {
        Rectangulo1 obx=new Rectangulo1(5,9);
        //System.out.println(obx.toString());
        obx.calcularArea(10, 4);
        float res=obx.calcularPerimetro();
        System.out.println("Perimetro: "+res);
    }
    
}
