/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicmemory;

/**
 *
 * @author Hackobo
 */
public class Empleado extends Persona  {
    
    private String puesto;
    private int salario;
    private String codigoEmpleado;
   
    public Empleado(){}
    
    public Empleado(String puesto, int salario, 
        String nombre, String dpi, int edad) {
        super(nombre, dpi, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
    
}
