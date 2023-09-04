
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class Llamado {
    
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("John Wick", 12654789, 'k');
        Trabajador trabajador2 = new Trabajador("Neo Matrix", 10528596, '3');
        Tarjeta tarjeta1 = new Tarjeta(4125478, 1265, 10000,"20 de marzo del ", trabajador1);
        Tarjeta tarjeta2 = new Tarjeta(528987, 1052, 50000, "11 de septiembre 2020", trabajador2);
        
        
        
        int opcion=0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("*********** Menu **********");
            System.out.println("1. Generar Codigo correlativo");
            System.out.println("2. Validar clave trabajador");
            System.out.println("3. Validar Monto de compra");
            System.out.println("4. Descontar monto ");
            System.out.println("5. Salir");
            System.out.println("****************************");
            
            
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    long codigo = tarjeta1.generarCorrelativo();
                    System.out.println("Codigo generado: " + codigo);
                       
            opcion = leer.nextInt();
                    
                    
                    
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Ingresar Clave: ");
                    int claveIngresada = leer.nextInt();
                    if(tarjeta1.validarClaveTrabajador(claveIngresada)){
                        System.out.println("Clave Valida para Trabajador1.");
                    }else if (tarjeta2.validarClaveTrabajador(claveIngresada)){
                        System.out.println("Clave Valida para Trabajador2.");
                    }else{
                        System.out.println("Error,su clave no coincide vuelva a ingresar");
                    }
                    
                    
                    
                    break;
                    
                    
                case 3:
                    
                    
                    
                    break;
                    
                    
                case 4:
                    
                    break;
                    
                    
                    
                case 5:
                    System.out.println("Adios,Vuelva pronto!");
                    break;
                default:
                    
            }
            
        } while (opcion!=5);
        
        
    }
    
}
