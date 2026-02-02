import java.util.Scanner;

public class aforo {
    public static void main(String[] args) {
        //Un local empieza con aforo 0 y máximo 50
        //Lees eventos: E (entra 1 persona), S (sale 1 persona), F (fin).
        //Reglas
        //No puede bajar de 0
        //Si está en 50, no puede entrar más
        //Muestra cuántos eventos fueron inválidos y el aforo final
        Scanner sc = new Scanner(System.in);
        int aforo_actual = 0;
        int aforo_max = 50;
        int eventos_invalidos = 0;
        String evento;

        System.out.println("---Control de accesos---");
        System.out.println("Nuestro aforo máximo es " + aforo_max);
        System.out.println("Escribe E (entrar), S (salir) y F (terminar programa)");

        while (true) {
            System.out.println("aforo actual: " + aforo_actual);
            System.out.println("Escribe E/S/F: ");
            evento = sc.next().toUpperCase();

            if (evento.equals("E")) {

                if (aforo_actual < aforo_max) {
                    aforo_actual++;
                    System.out.println("Entras");
                } else {
                    eventos_invalidos++;
                    System.out.println("Aforo completo");
                }

            } else if (evento.equals("S")) {
                if (aforo_actual > 0) {
                    aforo_actual--;
                    System.out.println("Sales");
                } else {
                    System.out.println("No hay nadie");
                    eventos_invalidos++;
                }
            } else if (evento.equals("F")) {
                System.out.println("Terminar programa");
                break;
            } else {
                System.out.println("Inválido");
                eventos_invalidos++;
            }
            System.out.println();
            System.out.println("Eventos inválidos: " + eventos_invalidos);

        }
    }
}
