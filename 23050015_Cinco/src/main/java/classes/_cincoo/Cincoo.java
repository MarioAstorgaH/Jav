package classes._cincoo;

import java.util.Scanner;

public class Cincoo {

    public static void main(String[] args) {
        int x,y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte el numero 1: ");
        x=entrada.nextInt();
        System.out.println("Inserte el numero 2: ");
        y=entrada.nextInt();
        suma(x,y);
        resta(x,y);
        mult(x,y);
        div(x,y);
        
    }
    public static void suma(int x, int y){
        int resultado=0;
        resultado=(x+y);
        System.out.println("El resultado de la suma es: "+resultado);
    }
    public static void resta(int x, int y){
        int resultado=0;
        resultado=(x-y);
        System.out.println("El resultado de la resta es: "+resultado);
    }
    public static void mult(int x, int y){
        int resultado=0;
        resultado=(x*y);
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
    public static void div(int x, int y){
        double resultado=0;
        resultado=(x/y);
        System.out.println("El resultado de la division es: "+resultado);
    }
}
