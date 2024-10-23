package classes.escaleras;

import javax.swing.JOptionPane;

public class Escaleras {
    public static void main(String[] args) {
        subir();
        System.exit(0);
    }
    public static void subir(){
        int escalon=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de escalones:"));
        for(int i=1;i<=escalon;i++){
            JOptionPane.showMessageDialog(null, "Estas en el escalon "+i);
        }
    }
}
    