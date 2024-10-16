/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

/**
 *
 * @author yoven
 */
public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private Empleado jefe;

    public Departamento(String nombre, int numeroEmpleados, Empleado jefe) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public Empleado getJefe() {
        return jefe;
    }

 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

@Override
    public String toString() {
        return "Departamento: " + nombre + ", Número de Empleados: " + numeroEmpleados +
               ", Jefe: " + jefe.getNombre();
    }


}

