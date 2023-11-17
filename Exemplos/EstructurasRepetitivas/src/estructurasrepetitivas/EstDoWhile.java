package estructurasrepetitivas;

public class EstDoWhile {
    public void amosarDoWhile(){
        int i =0;
        do{
            System.out.println("DAM 1"+ (i+1));
            i++;
        }while(i<7);
        System.out.println("Saímos do bucle");
    }
    public void amosarPositivo(){
        float dato=lerDatos.lerFloatPositivo("Teclea dato positivo: ");
        System.out.println("Dato --> "+dato);
    }
}
