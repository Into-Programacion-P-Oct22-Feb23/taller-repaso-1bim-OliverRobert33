/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Solucion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
    String nombre_empleado;
    int cedula_empleado;
    double horas_matutinas;
    double horas_nocturnas;
    double subtotal;
    String ciudad_empresa;
    double cancelar_matutinas;
    double cancelar_nocturnas;
    //int valor_matutina = 10;
    //int valor_nocturnas = 15;
    String mensaje = " ";
    int contador = 0;
    boolean bandera = true;
    int opcion = 111;
    double seguro_social;
    double valor_total;
    double adicional;
    
    while (bandera == true){
        System.out.println("Ingrese el nombre del empleado: ");
        nombre_empleado = entrada.nextLine();
        System.out.println("Ingrese la Identificacion del empleado: ");
        cedula_empleado = entrada.nextInt();
        System.out.println("Ingrese las horas trabajadas matutinas: ");
        horas_matutinas = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas nocturnas: ");
        horas_nocturnas = entrada.nextDouble();
        System.out.println("Ingrese la ciudad de la empresa: ");
        ciudad_empresa = entrada.nextLine();
        entrada.nextLine(); //Limpieza de buffer
        cancelar_nocturnas =  horas_nocturnas * 15;
          
        if(horas_nocturnas > 10){  
            adicional = cancelar_nocturnas * 10 / 100;
            cancelar_nocturnas =  cancelar_nocturnas + adicional;
           // cancelar_nocturnas =  horas_nocturnas + cancelar_nocturnas;
        }

        cancelar_matutinas =  horas_matutinas * 10; 	
	subtotal = cancelar_matutinas + cancelar_nocturnas;
        seguro_social = subtotal * 18 / 100;
        valor_total = subtotal - seguro_social;
        
        mensaje = mensaje + "Rol del trabajador de nombre " 
                + nombre_empleado + " y cedula " + cedula_empleado 
                + "\n" + " " + "Horas matutina trabajadas: " + horas_matutinas 
                + "." + "\n" + " " + "Horas nocturnas trabajadas: " 
                + horas_nocturnas + "." + "\n" + " " + "Subtotal " + "$" 
                + subtotal + "\n" + " " + "Seguro Social " + "$" + seguro_social
                + "\n" + " " + "Total a cancelar " + "$" + valor_total + "\n\n";

        
        contador = contador + 1;  
        System.out.print("Si deseas terminar el proceso ingrese '111': ");
        opcion = entrada.nextInt();
        
        if(opcion == 111){
            bandera = false;
        }   
        entrada.nextLine(); //Limpieza de buffer
    }
     System.out.printf("Nomina de trabajadores\n\n" + mensaje +"\n"
             + "Numero de empleados " + contador);
    }   
}
