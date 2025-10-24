public class Main {
    public static void main(String[] args) {
        double nota = 3;
        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >=7 && nota <9) {
            System.out.println("Notable");
        }else if (nota >=5 && nota<7) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
        System.out.println("----------------------------------");
        System.out.println(" Ejercicio 2");
        System.out.println("-----------------------------------");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------");
        System.out.println(" Ejercicio 3");
        System.out.println("-----------------------------------");

        for (int y = 500; y >= 400; y--){
            if (y % 2 != 0){
                System.out.println(y);
            }
        }
        System.out.println("-------------------------------");
        System.out.println(" Fin del ejercicio");
        System.out.println("-------------------------------");
    }
}

