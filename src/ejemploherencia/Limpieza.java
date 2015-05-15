/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author RNS
 */
public class Limpieza extends Empleado{

    private int piso;

    public Limpieza(int piso, int id, String nombre, String apellidos, String nss, int edad) {
        super( id, nombre, apellidos, nss, edad);
        this.piso = piso;
    }
   
    
    

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public void limpiarPiso(){
        System.out.println("Yo "+nombre+" estoy limpiando el piso");
    }
    
}
