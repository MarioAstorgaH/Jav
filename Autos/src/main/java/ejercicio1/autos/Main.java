package ejercicio1.autos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String Args[]){
        int codigo,velocidad;
        String nombre,modelo;
        
        codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo del auto:"));
        nombre=JOptionPane.showInputDialog("Ingresa el nombre del auto");
        modelo=JOptionPane.showInputDialog("Ingresa el modelo del auto");
        velocidad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la velocidad del auto"));
        Autos Carro= new Autos(codigo,nombre,modelo,velocidad);
        Carro.imprimetodo();
        JOptionPane.showMessageDialog(null,"Tu multa es de: $"+Carro.Calcular(velocidad));
    }
}
