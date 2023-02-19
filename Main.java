import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Cuál es tu profesión: ");
        String profesion = scanner.nextLine();

        System.out.print("Pon tu nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}