import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el elmento " + (i+1));
            numeros[i] = scaner.nextInt();
        }

        printNumbs(numeros);
    }

    public static void printNumbs(int[] numeros){
        for (int i = 0; i < numeros.length; i++)
            System.out.println("Numero " + (i + 1) + ": " + numeros[i] + " Cuadrado: " + (numeros[i]*numeros[i]) + " Cubo: " + (numeros[i]*numeros[i]*numeros[i]));
    }


}