import java.util.Scanner;

public class billetes {

    public static void main(String[] args) {
        int BC = 0;  // Billetes de 50000
        int BV = 0;  // Billetes de 20000
        int BD = 0;  // Billetes de 10000
        int BC2 = 0; // Billetes de 5000
        int BM = 0;  // Billetes de 1000

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un valor:");
        int N = sc.nextInt();

        int C = N;

        // Calcular billetes de 50000
        while (C >= 50000) {
            BC++; //es como poner BC = BC + 1
            C -= 50000; // es como poner C = C - 50000
        }

        // Calcular billetes de 20000
        while (C >= 20000) {
            BV++;
            C -= 20000;
        }

        // Calcular billetes de 10000
        while (C >= 10000) {
            BD++;
            C -= 10000;
        }

        // Calcular billetes de 5000
        while (C >= 5000) {
            BC2++;
            C -= 5000;
        }

        // Calcular billetes de 1000
        while (C >= 1000) {
            BM++;
            C -= 1000;
        }

        // Mostrar resultados
        System.out.println("\nCantidad ingresada: " + N);
        if (BC > 0) System.out.println("Billetes de 50000: " + BC);
        if (BV > 0) System.out.println("Billetes de 20000: " + BV);
        if (BD > 0) System.out.println("Billetes de 10000: " + BD);
        if (BC2 > 0) System.out.println("Billetes de 5000: " + BC2);
        if (BM > 0) System.out.println("Billetes de 1000: " + BM);
        if (C > 0) System.out.println("Resto: " + C);

        sc.close();
    }
}