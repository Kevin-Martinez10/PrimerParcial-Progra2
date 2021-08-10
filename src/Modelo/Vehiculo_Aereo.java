package Modelo;

import static javax.swing.plaf.metal.MetalLookAndFeel.getControl;

/**
 *
 * @author Kevin Matinez
 */
public class Vehiculo_Aereo extends Vehiculo {
    
    private String tren_aterrizaje, pista, control;

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }
    
    public void agregar () {
    System.out.println("Tren Aterrizaje: " + getTren_aterrizaje() );
    System.out.println("Control: " + getControl() );
    System.out.println("Pista: " + getPista() );
    
    }
}
