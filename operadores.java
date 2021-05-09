import java.util.Scanner;

// Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma, subtração, multiplicação e divisão. 
// Considere sempre a ordem em que foram informados.

public class operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num1 = input.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = input.nextInt();
        System.out.println("A soma dos números digitados é: " + (num1 + num2));
        System.out.println("A subtração dos números digitados é: " + (num1 - num2));
        System.out.println("A multiplicação dos números digitados é: " + (num1 * num2));
        System.out.println("A divisão dos números digitados é: " + (num1 / num2));

    }
}
