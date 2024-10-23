package ejercicio1.autos;

import javax.swing.JOptionPane;

public class Autos {
    private int codigo;
    private String nombre;
    private String modelo;
    private int velocidad;

    public Autos(int codigo, String nombre, String modelo, int velocidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void imprimetodo(){
        JOptionPane.showMessageDialog(null,"Información del auto:\nCodigo: "+codigo+"\nNombre: "+nombre+"\nModelo: "+modelo+"\nVelocidad: "+velocidad);
    }
    public double Calcular(int velocidad){
        double multa=0;
        if(velocidad>0 && velocidad<=60){
            multa=300;
        }
        else if(velocidad>60 && velocidad<=120){
            multa=0;
        }
        else if(velocidad>120 && velocidad<=140){
            multa=300;
        }
        else if(velocidad>140 && velocidad<=180){
            multa=600;
        }
        else if(velocidad>180){
            multa=1000;
        }
        return multa;
    }
}
