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
public class AnalistaDeDatos extends Empleado {
    private String proyectoActual;
    private String computadora;
    private String sistemasOperativos;

    public AnalistaDeDatos(String proyectoActual, String computadora, String sistemasOperativos, int id, String nombre, String apellidos, String nss, int edad) {
        super(id, nombre, apellidos, nss, edad);
        this.proyectoActual = proyectoActual;
        this.computadora = computadora;
        this.sistemasOperativos = sistemasOperativos;
        
    }

    
 

    public String getProyectoActual() {
        return proyectoActual;
    }

    public void setProyectoActual(String proyectoActual) {
        this.proyectoActual = proyectoActual;
    }

    public String getComputadora() {
        return computadora;
    }

    public void setComputadora(String computadora) {
        this.computadora = computadora;
    }

    public String getSistemasOperativos() {
        return sistemasOperativos;
    }

    public void setSistemasOperativos(String sistemasOperativos) {
        this.sistemasOperativos = sistemasOperativos;
    }
    
    
    
    public void analizarProyecto(){
        System.out.println("Estoy analizando el proyecto "+proyectoActual);
    }
    
    
    
    
}
