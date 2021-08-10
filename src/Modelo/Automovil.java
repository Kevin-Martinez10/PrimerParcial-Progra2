package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Automovil extends Vehiculo_Terrestre{
    
    private String asientos, camioneta, bajo;

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getCamioneta() {
        return camioneta;
    }

    public void setCamioneta(String camioneta) {
        this.camioneta = camioneta;
    }

    public String getBajo() {
        return bajo;
    }

    public void setBajo(String bajo) {
        this.bajo = bajo;
    }
    
    public void agregar() {
    System.out.println("Asientos: " + getAsientos() );
    System.out.println("Camioneta: " + getCamioneta() );
    System.out.println("Bajo: " + getBajo() );
    
    }
    
}
