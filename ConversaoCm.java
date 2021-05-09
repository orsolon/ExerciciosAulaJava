import java.util.Scanner;

// Escreva um programa que realiza conversão de medidas de polegadas em centímetros.

public class ConversaoCm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em polegadas: ");
        double in = teclado.nextDouble();
        double cm = in / 0.39370;
        System.out.printf(in + " polegadas correspondem a %.2f cm" , cm);

    }
    
}
