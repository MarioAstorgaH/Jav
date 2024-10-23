package classes._v;

import java.util.Scanner;

public class V {


    public static void main(String[] args) {
        int x,y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte el numero 1: ");
        x=entrada.nextInt();
        System.out.println("Inserte el numero 2: ");
        y=entrada.nextInt();
        System.out.println("El resultado de la suma es:"+suma(x,y));
        System.out.println("El resultado de la resta es:"+resta(x,y));
        System.out.println("El resultado de la multiplicacion es:"+mult(x,y));
        System.out.println("El resultado de la division es:"+div(x,y));
    }
    public static int suma(int x, int y){
        return (x+y);
    }
    public static int resta(int x, int y){
        return (x-y);
    }
    public static int mult(int x, int y){
        return (x*y);
    }
    public static double div(int x, int y){
        return (x/y);
    }
}
