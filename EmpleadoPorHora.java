/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Paola Galindo
 */
public class EmpleadoPorHora extends Empleado{
    
    
    private int cantHorasTrabajadas;
    private double valorHora;
    private double sueldo;
   

    public EmpleadoPorHora(int cantHorasTrabajadas, double valorHora, 
        String direccion, String ciudad, int telefono, int edad) {
        super(direccion, ciudad, telefono, edad);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
        this.valorHora = valorHora;
        calcularSalario();
      
    }


    public int getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSueldo(){
    return sueldo;
    }

    @Override
    public double  calcularSalario() {
        
        sueldo=valorHora*cantHorasTrabajadas;
            return sueldo;
    }
    
    
    @Override
    public String toString(){
    
    return super.toString()+"\nCantidad horas trabajas: "
            +cantHorasTrabajadas+"\nSueldo: "+sueldo;
    }
    
}
