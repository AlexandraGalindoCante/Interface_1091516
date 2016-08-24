/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import javax.swing.JOptionPane;

/**
 *
 * @author ricaurte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
        
        
        
            
    int opc=Integer.parseInt(JOptionPane.showInputDialog("1.Empleado por comision"
             + "\n2.Empleado por hora"));
        
    switch (opc){    
        case 1 :
        int porcentajeVentas=Integer.parseInt(JOptionPane.showInputDialog
            ("Ingrese su porcentaje ventas"));
        double sueldoBasico=Double.parseDouble(JOptionPane.showInputDialog
            ("Escriba su su sueldo basico"));
        String direccion=JOptionPane.showInputDialog("Escriba su dirección");
        String ciudad=JOptionPane.showInputDialog("Escriba su ciudad");
        int telefono=Integer.parseInt(JOptionPane.showInputDialog("Escriba su telefono"));
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));
        EmpleadoPorComision per1=new EmpleadoPorComision(porcentajeVentas,
                sueldoBasico,direccion,ciudad,telefono,edad);
        JOptionPane.showMessageDialog(null,per1.toString());
        break;
        case 2:
            
        int cantHorasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog
            ("Ingrese cantidad de horas trabajadas"));
        double valorHora =Double.parseDouble(JOptionPane.showInputDialog
            ("Escriba valor de la hora"));
        direccion=JOptionPane.showInputDialog("Escriba su dirección");
        ciudad=JOptionPane.showInputDialog("Escriba su ciudad");
        telefono=Integer.parseInt(JOptionPane.showInputDialog("Escriba su telefono"));
        edad=Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));

        EmpleadoPorHora per2=new EmpleadoPorHora(cantHorasTrabajadas,
                valorHora,direccion,ciudad,telefono,edad);
        JOptionPane.showMessageDialog(null,per2.toString());
            break;
        default:
            JOptionPane.showMessageDialog(null,"Hasta luego!");
        
    }
     
        
    }
   
    
  
    
}
