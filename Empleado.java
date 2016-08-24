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
public abstract class Empleado extends Persona implements PersonaAsalariada  
{

    protected final String CEDULA="2"; 
    protected final String NOMBRE_COMPLETO="Alexandra Cante";

    public Empleado(String direccion, String ciudad, int telefono, int edad) {
        super(direccion, ciudad, telefono, edad);
    }

    @Override
    public double calcularSalario() {
        return 0;
        
            }


    @Override
    public String toString(){
        return super.toString()+"\nCedula: "+CEDULA+"\nNombre Completo: "+NOMBRE_COMPLETO;
    }

 
   
}
