//import java.util.Scanner;
//
//public class valida {
//    public static void main (String[]args){
//        //Pide una palabra y recórrela con un bucle carácter a carácter
//        //La palabra es válida si
//        //tiene longitud entre 6 y 12
//        //Contiene al menos una vocal
//        //No contiene espacios
//        //Usa booleanos como tieneVocal, tieneEspacio y decide al final
//        Scanner sc = new Scanner(System.in);
//
//        boolean longitud = false;
//        boolean vocal = false;
//        boolean espacios = false;
//
//        System.out.println("Introduce una palabra: ");
//        System.out.println("Debe cumplir los siguientes requisitos");
//        System.out.println("longitud (6-12 caracteres), al menos una vocal y no debe contener espacios");
//        String palabra = sc.nextLine();
//
//        longitud= palabra.length() >= 6 && palabra.length() <=12;
//        vocal = palabra.toLowerCase().matches(".*[aeiouáéíóú].*");
//        espacios = !palabra.contains(" ");
//
//        if (longitud){
//            System.out.println("Validación de longitud correcta");
//        }else{
//            System.out.println("Debe contener una longitud entre 6 y 12 dígitos");
//        }
//        if (vocal){
//            System.out.println("Validación de al menos una vocal correcta");
//        }else{
//            System.out.println("Introduce al menos una vocal");
//        }
//        if (espacios) {
//            System.out.println("Validación de espacios correcta");
//        }else{
//            System.out.println("No debe contener espacios");
//        }
//    }
//}
//  ---------------------------MÉTODO DE DANI MOLÓN PRR PRR PATAPIN----------------------------
//import java.util.Scanner;
//
//public class Ejercicio_6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String palabra;
//        boolean tieneVocal = false;
//        boolean tieneEspacio = false;
//        boolean longitudCorrecta = false;
//
//        System.out.println("Ingrese una palabra: ");
//        palabra = sc.nextLine().toLowerCase();
//        for (int letra = 0; letra < palabra.length(); letra++) {
//            if (palabra.length()>=6 && palabra.length()<=12) {
//                longitudCorrecta = true;
//            }
//            if (palabra.contains("a")||palabra.contains("e")||palabra.contains("i")||palabra.contains("o")||palabra.contains("u")) {
//                tieneVocal = true;
//            }
//            if(palabra.contains((" "))) {
//                tieneEspacio = true;
//            }
//        }
//        if (tieneEspacio == false && tieneVocal == true && longitudCorrecta == true) {
//            System.out.println("Tu palabra "+palabra+" cumple con todos los requisitos");
//        } else if(tieneEspacio == true && tieneVocal == true && longitudCorrecta == true){
//            System.out.println("Tu palabra "+palabra+" no cumple con el requisito de espaciado");
//        } else if(tieneEspacio == false && tieneVocal == false && longitudCorrecta == true){
//            System.out.println("Tu palabra "+palabra+" no cumple con el requisito de contener vocales");
//        } else if(tieneEspacio == false && tieneVocal == true && longitudCorrecta == false){
//            System.out.println("Tu palabra "+palabra+" no cumple con el requisito de longitud");
//        }else {
//            System.out.println("Tu palabra no cumple varios requisitos");
//        }
//        sc.close();
//    }
//}

//--------------------MÉTODO MOJÓN DEL GEMINI-------------------------------
import java.util.Scanner;

public class valida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        boolean longitud = palabra.length() >= 6 && palabra.length() <= 12;

        boolean vocal = false;
        boolean espacios = false;
        String vocales = "aeiouáéíóú";

        // 2. Recorrido carácter a carácter
        for (int i = 0; i < palabra.length(); i++) {
            char letraActual = palabra.toLowerCase().charAt(i);

            // ¿Es una vocal?
            if (vocales.indexOf(letraActual) != -1) {
                vocal = true;
            }

            // ¿Es un espacio?
            if (letraActual == ' ') {
                espacios = true;
            }
        }

        // 3. Resultados finales
        // Para que 'espacios' sea true, NO debe haber encontrado ninguno
        boolean espaciosOk = !espacios;

        // --- Bloque de impresión (tus IFs) ---
        if (longitud) {
            System.out.println("Validación de longitud correcta");
        } else {
            System.out.println("Debe contener una longitud entre 6 y 12 dígitos");
        }

        if (vocal) {
            System.out.println("Validación de al menos una vocal correcta");
        } else {
            System.out.println("Introduce al menos una vocal");
        }

        if (espaciosOk) {
            System.out.println("Validación de espacios correcta");
        } else {
            System.out.println("No debe contener espacios");
        }
    }
}
