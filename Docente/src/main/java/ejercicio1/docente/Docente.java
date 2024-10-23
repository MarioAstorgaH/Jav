package ejercicio1.docente;

import javax.swing.JOptionPane;

public class Docente {
    private String nombre;
    private String tipo;
    private int horas;
    private double sueldo;

    public Docente(String nombre, String tipo, int horas, double sueldo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void mostrarNombre(){
        JOptionPane.showMessageDialog(null, "El nombre del docente es: "+nombre);
    }
    public double sueldoBruto(){
        double sueldob;
        if("ciencia".equals(tipo)){
            sueldob=(sueldo/3)*horas;
        }
        else{
            sueldob=(sueldo/5)*horas;
        }
        return sueldob;
    }
    public double descuento(double sueldob){
        return sueldob*.1;
    }
    public double sueldoneto(double sueldob,double descuento){
        return sueldob-descuento;
    }
}
