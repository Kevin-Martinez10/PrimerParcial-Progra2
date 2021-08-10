package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Vehiculo_Terrestre extends Vehiculo{
    
    private String tipo, chasis, llantas, pavimento, terraceria;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getPavimento() {
        return pavimento;
    }

    public void setPavimento(String pavimento) {
        this.pavimento = pavimento;
    }

    public String getTerraceria() {
        return terraceria;
    }

    public void setTerraceria(String terraceria) {
        this.terraceria = terraceria;
    }
    
    @Override
    public void agregar () {
    
    

    System.out.println("Vehiculo_Aereo: " + getVehiculo_Aereo() );
    System.out.println("Vehiculo_Terrestre: " + getVehiculo_Terrestre() );
    System.out.println("Automovil: " + getAutomovil() );
    System.out.println("Motocicleta: " + getMotocicleta() );
    System.out.println("Avion: " + getAvion() );
    System.out.println("Helicoptero: " + getHelicoptero() );
    
    
    }
    
    
    
}
