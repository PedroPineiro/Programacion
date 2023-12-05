package boletin5;

/**
 *
 * @author dam1
 */
public class Consumo {
        private float km;
        private float litros;
        private float vMed;
        private float pGas;

    public Consumo() { 
    
    }
    
    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
    public float getTempo() {
        return km/vMed;
    }
    
    public int consumoMedio() {
        return (int) ((litros/km)*100);
    }
    
    public float consumoEuros() {
        return (pGas/km)*100;
    }
    
    public void setKms(float km) {
        this.km = km;
    }
    public void setLitros(float litros) {
        this.litros = litros;
    }
    public void setvMed(float vMed) {
        this.vMed = vMed;
    }
    public void setpGas(float pGas) {
        this.pGas = pGas;
    }
    
    public float getKms() {
        return this.km;
    }
    public float getLitros() {
        return this.litros;
    }
    public float getvMed() {
        return this.vMed;
    }
    public float getpGas() {
        return this.pGas;
    }
    
}