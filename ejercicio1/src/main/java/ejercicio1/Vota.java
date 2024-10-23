package ejercicio1;

import javax.swing.JOptionPane;

public class Vota {
    public static void Verifica(){
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Cuál es tu edad?"));
        if(edad>=18){
            JOptionPane.showMessageDialog(null, "Eres mayor de edad puedes votar");
        }
        else{
            JOptionPane.showMessageDialog(null, "Eres menor de edad no puedes votar");
        }
    }
}
