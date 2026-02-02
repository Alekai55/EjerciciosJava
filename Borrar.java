import java.util.Scanner;

public class Borrar {
    public static void main(String[] args) {
        // Pide al usuario si quiere borrar datos responde: S/N
        // Reglas
        // Solo se borra si responde S dos veces seguidas (confirmación)
        // Usa booleano confirmado y un bucle de lectura

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BORRADO DE DATOS ===");
        System.out.println("¿Quiere borrar datos?");
        System.out.print("Escriba S/N: ");

        String evento = sc.next().toUpperCase();
        boolean confirmado = false;

        if (evento.equals("S")) {
            System.out.println("¿Está usted seguro?");
            System.out.print("Escriba S/N: ");

            String confirmacion = sc.next().toUpperCase();

            if (confirmacion.equals("S")) {
                confirmado = true;
                System.out.println("Confirmado, datos borrados");
            } else {
                System.out.println(" Borrado cancelado");
            }

        } else {
            System.out.println(" Borrado cancelado");
        }

        System.out.println("Saliendo del programa...");
    }
}