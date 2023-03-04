package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = entrada.nextDouble();
        
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);

        System.out.println("Su cuadrado es " + cuadrado);
        System.out.println("Su cubo es " + cubo);
    }   
}
