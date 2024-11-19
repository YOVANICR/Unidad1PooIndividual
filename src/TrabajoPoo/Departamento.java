/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

// Esta clase representa un departamento dentro de la empresa
public class Departamento {
    // Aquí guardo el nombre del departamento, como "Recursos Humanos"
   
    
    private String nombre;
    
    // Este es el número de empleados que tiene el departamento
    private int numeroEmpleados;
    
    // El jefe del departamento, que es un objeto de tipo Empleado
    private Empleado jefe;

    // Este es el constructor, lo uso para crear un departamento con su nombre, número de empleados y jefe
    public Departamento(String nombre, int numeroEmpleados, Empleado jefe) {
        this.nombre = nombre; // Asigno el nombre que recibo como parámetro
        this.numeroEmpleados = numeroEmpleados; // Lo mismo con el número de empleados
        this.jefe = jefe; // Asigno el jefe que me pasen al crear el departamento
    }

    // Este método me permite obtener el nombre del departamento
    public String getNombre() {
        return nombre;
    }

    // Con este método obtengo el número de empleados del departamento
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    // Aquí obtengo el jefe del departamento
    public Empleado getJefe() {
        return jefe;
    }

    // Si quiero cambiar el nombre del departamento, uso este método
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualizo el nombre con el nuevo valor que me pasen
    }

    // Este método lo uso para cambiar el número de empleados
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados; // Actualizo el número de empleados
    }

    // Y si el departamento cambia de jefe, uso este método para asignar al nuevo jefe
    public void setJefe(Empleado jefe) {
        this.jefe = jefe; // Actualizo el jefe del departamento
    }

    // Aquí sobrescribo el método toString para que cuando imprima un departamento, salga su información de manera legible
    @Override
    public String toString() {
        // Muestro el nombre del departamento, el número de empleados y el nombre del jefe
        return "Departamento: " + nombre + ", Número de Empleados: " + numeroEmpleados +
               ", Jefe: " + jefe.getNombre(); // Aquí hago que muestre el nombre del jefe también
    }
}
