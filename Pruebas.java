public class Pruebas {
public static void main (String[] args) {
    String frase = "Amor a ROMA";
    String frasenormal = frase.replace(" ","").toLowerCase();

    String frasedadalavuelta = new StringBuilder(frasenormal).reverse().toString();

    if (frasenormal.equals(frasedadalavuelta)) {
        System.out.println("Es palíndroma");
    } else{
        System.out.println("No es palíndroma");
    }

    for (int i = 0; i < frase.length(); i++) {
        System.out.printf("[%02d] %c%n", i, frase.charAt(i));
    }
}
}
