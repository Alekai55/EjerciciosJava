import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //---La fórmula del IMC es Peso/Altura^2
        //---por lo que para hacer el cálculo de la altura, lo multipicaré por sí mismo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        //---He importado la utilidad de Scanner para poder pedir datos al usuario
        //---En primer lugar he utilizado el comando escáner para introducir la calculadora
        System.out.print("Introduce tu peso en Kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        //---No he puesto el println para que no pase de línea y he utilizado el double para poder usar decimales
        double imc = peso / (altura * altura);
        //---Introducimos la fórmula para que pueda calcularla
        //------------System.out.println("IMC = " + IMC);
        //---De esta forma te da decimales 0,00... así que por ello he limitado los decimales con la siguiente fórmula
        System.out.printf("IMC= %.2f%n", imc);
        //---al principio puse println y el resultado que me daba incluía el %.2f%n como texto
        //--------------------con ayuda de Gemini he usado el if para indicar los casos de IMC-----------
        if (imc <18.5){
            System.out.println("muy bajo");}
        else if (imc <25){
            System.out.println("bajo");}
        else if (imc <30) {
            System.out.println("normal");}
        else
            System.out.println("alto");
        //---Con estos datos aparecerá un comentario junto con el resultado
            }
        }

