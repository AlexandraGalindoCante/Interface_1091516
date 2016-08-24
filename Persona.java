/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author ricaurte
 */
public class Persona {
    
   protected String direccion;
   protected  String ciudad;
   protected int telefono;
   protected int edad;

    public Persona(String direccion, String ciudad, int telefono, int edad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
    
    return "Dirección:"+direccion+"\nCiudad: "+ciudad+"\nTelefono: "+telefono+"\nEdad: "+edad;
    } 
}
