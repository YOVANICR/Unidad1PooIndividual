/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

/**
 *
 * @author yoven
 */
public class Empresa {
    private String nombre;
    private String sector;
    private int numeroEmpleados;

    public Empresa(String nombre, String sector, int numeroEmpleados) {
        this.nombre = nombre;
        this.sector = sector;
        this.numeroEmpleados = numeroEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }


    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
  @Override
    public String toString() {
        return "Empresa: " + nombre + ", Sector: " + sector + ", Número de Empleados: " + numeroEmpleados;
    }

}
