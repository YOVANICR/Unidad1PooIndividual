/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

// Esta es la clase Empleado, aquí guardo la información básica de cada empleado
public class Empleado {
    private String nombre; // El nombre del empleado
    private String puesto; // El puesto que tiene el empleado
    private double salario; // El salario del empleado
    private Empleado jefe; // El jefe del empleado, que también es otro empleado

    // Este es el constructor, lo uso para crear empleados con su nombre, puesto y salario
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre; // Asigno el nombre que me pasen
        this.puesto = puesto; // Asigno el puesto
        this.salario = salario; // Asigno el salario
    }

    // Método para cambiar el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualizo el nombre del empleado
    }

    // Método para cambiar el puesto del empleado
    public void setPuesto(String puesto) {
        this.puesto = puesto; // Actualizo el puesto del empleado
    }

    // Método para cambiar el salario del empleado
    public void setSalario(double salario) {
        this.salario = salario; // Actualizo el salario del empleado
    }

    // Este método me devuelve el nombre del empleado cuando lo necesite
    public String getNombre() {
        return nombre;
    }

    // Con este método obtengo el puesto del empleado
    public String getPuesto() {
        return puesto;
    }

    // Este método devuelve el salario del empleado
    public double getSalario() {
        return salario;
    }

    // Método para obtener el jefe del empleado (si tiene uno)
    public Empleado getJefe() {
        return jefe; // Devuelve el jefe que tiene el empleado
    }

    // Método para asignar o cambiar el jefe del empleado
    public void setJefe(Empleado jefe) {
        this.jefe = jefe; // Asigno al jefe del empleado
    }
    
    // Sobreescribo el método toString para mostrar los datos del empleado cuando lo imprima
    @Override
    public String toString() {
        // Aquí muestro el nombre, puesto y salario del empleado
        // Si tiene jefe, también muestro el nombre del jefe, si no, digo que no tiene jefe
        return "Empleado: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario +
               (jefe != null ? ", Jefe: " + jefe.getNombre() : ", No tiene jefe");
    }
}
