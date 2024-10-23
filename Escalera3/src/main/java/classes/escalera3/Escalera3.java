package classes.escalera3;

import javax.swing.JOptionPane;

public class Escalera3 {

    public static void main(String[] args) {
        String imprime="";
        imprime=Subir3();
        System.out.println(imprime);
        System.exit(0);
    }
    public static String Subir3(){
        int Escalon=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de escalones: "));
        String SumaEscalon="";
        for(int i=1;i<=Escalon;i++){
            SumaEscalon=SumaEscalon+"Estas en "+i+"\n";
        }
        return SumaEscalon;
    }
}
