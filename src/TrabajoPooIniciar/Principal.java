/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPooIniciar;

import TrabajoPoo.Departamento;
import TrabajoPoo.Empleado;
import TrabajoPoo.Empresa;

// Esta es la clase principal donde voy a probar todo lo que he creado
public class Principal {

    public static void main(String[] args) {
        // Aquí muestro mi código y mi nombre
        System.out.println("Código: 7502310018 - Nombre: Yovani Enrique Castro Rios");
        System.out.println("****************************************");
        
        // Creo un empleado que será el jefe del departamento
        Empleado jefe = new Empleado("YOVANI CASTRO", "ESTUDIANTE", 5000000);

        // Creo un departamento y le asigno al jefe que acabo de crear
        Departamento depto = new Departamento("INGENIERIA", 40, jefe);

        // Creo una empresa y le paso su nombre, sector y número de empleados
        Empresa empresa = new Empresa("UNICARTEGENA", "EDUCACION", 2000);

        // Muestro el nombre del jefe del departamento
        System.out.println("Jefe del departamento: " + depto.getJefe().getNombre());
        
        // Muestro el nombre de la empresa y el sector en el que trabaja
        System.out.println("Empresa: " + empresa.getNombre() + " - Sector: " + empresa.getSector());
        
        System.out.println("****************************************");
        
        // Aquí imprimo directamente los objetos de empresa, departamento y jefe usando toString
        System.out.println(empresa);
        System.out.println(depto);
        System.out.println(jefe);
    }
}
