import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Inserte el nombre del perro1");
        perro1.setNombre(scaner.nextLine());
        System.out.println("Inserte su edad");
        perro1.setEdad(scaner.nextInt());
        System.out.println("Inserte la raza");
        perro1.setRaza(scaner.nextLine());
        perro1.comer("Croquetas", 30);
        System.out.println(perro1.ladrar());
        System.out.println( "Inserte el nombre del perro2");
        perro2.setNombre(scaner.nextLine());
        System.out.println("Inserte la edad");
        perro2.setEdad(scaner.nextInt());
        System.out.println("Inserte la raza");
        perro2.setRaza(scaner.nextLine());
        perro2.comer("Pollo", 40);
        System.out.println(perro2.ladrar());

    }
}