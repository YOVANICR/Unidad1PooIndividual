/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPooIniciar;

import TrabajoPoo.Departamento;
import TrabajoPoo.Empleado;
import TrabajoPoo.Empresa;

/**
 *
 * @author yoven
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Código: 7502310018 - Nombre: Yovani Enrique Castro Rios");
        System.out.println("****************************************");
        
        Empleado jefe = new Empleado("YOVANI CASTRO", "ESTUDIANTE", 5000000);

        
        Departamento depto = new Departamento("INGENIERIA", 40, jefe);

        
        Empresa empresa = new Empresa("UNICARTEGENA", "EDUCACION", 2000);

       
        System.out.println("Jefe del departamento: " + depto.getJefe().getNombre());
        System.out.println("Empresa: " + empresa.getNombre() + " - Sector: " + empresa.getSector());
        
         System.out.println("****************************************");
        
        System.out.println(empresa); System.out.println(depto); System.out.println(jefe);
     
     
    }
}
