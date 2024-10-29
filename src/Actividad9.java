import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Ingrese la altura de la perona en metros");
        persona.setAltura(scaner.nextDouble());
        System.out.println("Inserte el peso de la persona en kg");
        persona.setPeso(scaner.nextDouble());
        persona.getIMC();

    }
}
