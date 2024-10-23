package Examen;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int flag=0;
        float x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1:"));
        float y=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2:"));
        Operacion1 objeto=new Operacion1();
        Operacion2 objeto2=new Operacion2();
        Operacion3 objeto3=new Operacion3();
        Operacion4 objeto4=new Operacion4();
        do{
            int ans=Integer.parseInt(JOptionPane.showInputDialog("Escoja la opcion que desea ejecutar:\n1.Suma\n2.Resta\n3.Multiplicación\n4División\n5.Salir"));
            switch(ans){
            case 1:
                objeto.suma1(x,y);
                break;
            case 2:
                objeto2.resta1(x,y);
                break;
            case 3:
                objeto3.multiplicacion1(x,y);
                break;
            case 4:
                objeto4.division1(x,y);
                break;
            case 5:
                System.exit(0);
            }
        }while(flag!=1);
        
    }
}
