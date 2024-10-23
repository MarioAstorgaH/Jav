package classes.escalera2;

import javax.swing.JOptionPane;

public class Escalera2 {

    public static void main(String[] args) {
        int escalon=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de escalones: "));
        String imprime=null;
        imprime=Subir2(escalon);
        System.out.println(imprime);
        System.exit(0);
    }
    public static String Subir2(int x){
        String sumaEscalon="";
        for(int i=1;i<=x;i++){
            sumaEscalon=sumaEscalon+"Estas en "+i+"\n";
        }
        return sumaEscalon;
    }
}
