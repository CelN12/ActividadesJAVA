import java.util.Scanner;

public class Actividad7Arreglos {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++){
            System.out.println("Inserte el valor numero " + (i+1));
            array[i] = scaner.nextInt();
        }
        for (int j = 0; j < array.length; j++){
            System.out.println("Elemento 1: " + array[j] + " Cuadrado: " + (array[j]*array[j]) + " Cubo: " + (array[j]*array[j]*array[j]));
        }
    }
}
