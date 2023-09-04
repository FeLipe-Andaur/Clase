/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class Trabajador {
    
    private String nombre;
    private int run;
    private char dv;

    public Trabajador(String nombre, int run, char dv) {
        this.nombre = nombre;
        this.run = run;
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", run=" + run + ", dv=" + dv + '}';
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("run: "+run+dv);
         
    }
    
    
}
