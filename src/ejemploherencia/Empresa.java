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
public class Empresa {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String nss;
    protected int edad;

    public Empresa(int id, String nombre, String apellidos, String nss, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nss = nss;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println("Estoy comiendo...");
    }
    
    
}
