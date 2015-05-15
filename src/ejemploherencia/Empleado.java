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
public class Empleado extends Empresa{
   

    public Empleado( int id, String nombre, String apellidos, String nss, int edad) {
        super(id, nombre, apellidos, nss, edad);
        
    }
    
    
}
