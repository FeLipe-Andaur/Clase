
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */

            
            
public class Tarjeta {
    
    private int codigo,clave,monto;
    private String vigencia;
    Trabajador trabajador;

    public Tarjeta(int codigo, int clave, int monto, String vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "codigo=" + codigo + ", clave=" + clave + ", monto=" + monto + ", vigencia=" + vigencia + ", trabajador=" + trabajador + '}';
    }
    
    public void MostrarDatos(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Clave: "+clave);
        System.out.println("Monto: "+monto);
        System.out.println("Vigencia"+vigencia);
        System.out.println(trabajador.toString());
    }
    
    public long generarCorrelativo(){
        Random random = new Random();
        
        long codigo = random.nextLong()%10000000000000000L;
        codigo = Math.abs(codigo);
            return codigo;
                
    }
   
    public boolean validarClaveTrabajador(int claveIngresada){
        String runStr = String.valueOf(trabajador.getRun());
        String claveEsperada = runStr.substring(0, 4); // obtener los primeros 4 digitos del Run
        int claveEsperadaInt = Integer.parseInt(claveEsperada);
        return claveIngresada == claveEsperadaInt;
    }
    
    
    
   
}
