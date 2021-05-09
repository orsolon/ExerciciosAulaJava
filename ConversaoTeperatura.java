import java.util.Scanner;

// Escreva um programa que converte temperaturas de Celsius para Farenheit.

public class ConversaoTeperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsus:");
        double c = teclado.nextDouble();
        double f = ((c * 9) / 5) + 32;
        System.out.println(c + "Graus Celsius corresponde a " + f + "Graus Farenheit");
    }
}
