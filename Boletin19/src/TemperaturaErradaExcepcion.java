public class TemperaturaErradaExcepcion {
    boolean entradaValida =  false;
    ConversorTemperaturas ct = new ConversorTemperaturas();
    float grados;

    public void excepcion() {
        while(!entradaValida) {
            try {
                ct.centigradosAFharenheit();
                if (ct.getTemperatura() < ct.getCentigrados()) {
                    throw new IllegalArgumentException("Grados no válidos.");
                }
                entradaValida = true;
            } catch (NumberFormatException e){
                System.out.println("Introduzca una temperatura válida.");
            } catch (IllegalArgumentException i) {
                System.out.println("Inténtelo de nuevo.");
            } finally {
                ct.centigradosAReamur();
            }
        }
    }
}