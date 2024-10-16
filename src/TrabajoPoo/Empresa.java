/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPoo;

// Esta clase representa una empresa, aquí guardo sus datos básicos
public class Empresa {
    private String nombre; // El nombre de la empresa
    private String sector; // El sector al que pertenece la empresa (como tecnología, salud, etc.)
    private int numeroEmpleados; // El número de empleados que tiene la empresa

    // Constructor para crear una empresa, pasando el nombre, el sector y el número de empleados
    public Empresa(String nombre, String sector, int numeroEmpleados) {
        this.nombre = nombre; // Guardo el nombre que me pasaron
        this.sector = sector; // Guardo el sector que me pasaron
        this.numeroEmpleados = numeroEmpleados; // Guardo el número de empleados que me pasaron
    }

    // Método para cambiar el nombre de la empresa
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualizo el nombre de la empresa
    }

    // Método para cambiar el sector de la empresa
    public void setSector(String sector) {
        this.sector = sector; // Actualizo el sector de la empresa
    }

    // Método para cambiar el número de empleados
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados; // Actualizo el número de empleados
    }

    // Método para obtener el nombre de la empresa
    public String getNombre() {
        return nombre; // Devuelvo el nombre de la empresa
    }

    // Método para obtener el sector de la empresa
    public String getSector() {
        return sector; // Devuelvo el sector de la empresa
    }

    // Método para obtener el número de empleados de la empresa
    public int getNumeroEmpleados() {
        return numeroEmpleados; // Devuelvo el número de empleados
    }

    // Sobrescribo el método toString para que cuando se imprima la empresa, muestre sus datos
    @Override
    public String toString() {
        // Muestra el nombre de la empresa, el sector y el número de empleados
        return "Empresa: " + nombre + ", Sector: " + sector + ", Número de Empleados: " + numeroEmpleados;
    }
}
