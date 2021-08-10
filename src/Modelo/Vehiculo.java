package Modelo;

/**
 *
 * @author Kevin Matinez
 */
abstract class Vehiculo {
    
    private String Vehiculo_Aereo, Vehiculo_Terrestre, Automovil, Motocicleta, Avion, Helicoptero;

    public String getVehiculo_Aereo() {
        return Vehiculo_Aereo;
    }

    public void setVehiculo_Aereo(String Vehiculo_Aereo) {
        this.Vehiculo_Aereo = Vehiculo_Aereo;
    }

    public String getVehiculo_Terrestre() {
        return Vehiculo_Terrestre;
    }

    public void setVehiculo_Terrestre(String Vehiculo_Terrestre) {
        this.Vehiculo_Terrestre = Vehiculo_Terrestre;
    }

    public String getAutomovil() {
        return Automovil;
    }

    public void setAutomovil(String Automovil) {
        this.Automovil = Automovil;
    }

    public String getMotocicleta() {
        return Motocicleta;
    }

    public void setMotocicleta(String Motocicleta) {
        this.Motocicleta = Motocicleta;
    }

    public String getAvion() {
        return Avion;
    }

    public void setAvion(String Avion) {
        this.Avion = Avion;
    }

    public String getHelicoptero() {
        return Helicoptero;
    }

    public void setHelicoptero(String Helicoptero) {
        this.Helicoptero = Helicoptero;
    }
    
    public void agregar() {
    
    System.out.println("Vehiculo_Aereo: " + getVehiculo_Aereo() );
    System.out.println("Vehiculo_Terrestre: " + getVehiculo_Terrestre() );
    System.out.println("Automovil: " + getAutomovil() );
    System.out.println("Motocicleta: " + getMotocicleta() );
    System.out.println("Avion: " + getAvion() );
    System.out.println("Helicoptero: " + getHelicoptero() );
    
    
    }
    
}
