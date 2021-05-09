import java.util.Scanner;

// Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais. 
// A saída é a quantia em dólares. 
// Use formatação de saída para exibir os valores de acordo com cada representação de moeda.

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar do dia: ");
        double cotacao = teclado.nextDouble();
        System.out.println("Digite o valor em reais: ");
        double reais = teclado.nextDouble();
        double dolares = reais * cotacao;
        System.out.printf("R$" + reais + " corresponde a: U$ %.2f",  dolares);

    }

}
