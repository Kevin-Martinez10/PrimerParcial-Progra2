package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Motocicleta extends Vehiculo_Terrestre{
    
     private String Capacidad, Placa;

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
     
     public void agregar (){
    
    System.out.println("Capacidad: " + getCapacidad() );
    System.out.println("Placa: " + getPlaca() );
    
     }
    
}
