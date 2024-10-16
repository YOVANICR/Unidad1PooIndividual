/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

/**
 *
 * @author yovani
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
 private Empleado jefe;
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters y Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario +
               (jefe != null ? ", Jefe: " + jefe.getNombre() : ", No tiene jefe");
    }
}
