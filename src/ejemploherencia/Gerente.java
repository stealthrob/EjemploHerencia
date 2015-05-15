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
public class Gerente extends Empresa{
    protected boolean orden;

    public Gerente(boolean orden, int id, String nombre, String apellidos, String nss, int edad) {
        super(id, nombre, apellidos, nss, edad);
        this.orden = orden;
    }
    
    public void ordenar(){
        System.out.println("Has tu trabajo.");
        orden = true;
    }

    public boolean isOrden() {
        return orden;
    }
    
    
    
}
