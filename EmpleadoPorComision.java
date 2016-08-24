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
public class EmpleadoPorComision  extends Empleado{
    
  
    private int porcentajeVentas;
    private double sueldoBasico;
    private double sueldoTotal;
   

    public EmpleadoPorComision(int porcentajeVentas, double sueldoBasico, 
        String direccion, String ciudad, int telefono, int edad) {
        super(direccion, ciudad, telefono, edad);
        this.porcentajeVentas = porcentajeVentas;
        this.sueldoBasico = sueldoBasico;
        calcularSalario();
        
    }

    public int getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(int porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }


    @Override
    public double calcularSalario() {
       
         sueldoTotal = sueldoBasico*porcentajeVentas/100;
        return sueldoTotal;
    }

    @Override
   public String toString(){
    
    return super.toString()+"\nSueldo basico: "+sueldoBasico+"\nPorcentaje Ventas: "
            +porcentajeVentas+"\nSueldo total: "+sueldoTotal;
    }
    
    
    
  
    
    
    
}
