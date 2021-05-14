import java.util.Scanner;

public class Array3 {

    // Escreva um programa que lê 5 números. 
    // Ao final, escreva primeiros todos os ímpares, depois todos os pares.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorInicial = new int[5];
        int[] vetorPar = new int[vetorInicial.length];
        int[] vetorImpar = new int[vetorInicial.length];
        int posicaoVetorPar = 0;
        int posicaoVetorImpar = 0;

        for (int i=0; i<vetorInicial.length; i++){
            System.out.println("Digite um numero: ");
            vetorInicial[i] = scan.nextInt();
        }

        for (int i=0; i<vetorInicial.length; i++){
            if (vetorInicial[i] % 2 == 0) {
                vetorPar[posicaoVetorPar] = vetorInicial[i];
                posicaoVetorPar++;
            } else {
                vetorImpar[posicaoVetorImpar] = vetorInicial[i];
                posicaoVetorImpar++;
            }
        }

        System.out.print("Vetor Inicial = ");
        for (int i=0; i<vetorInicial.length; i++){
            System.out.print(vetorInicial[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor Par = ");
        for (int i=0; i<posicaoVetorPar; i++){
            System.out.print(vetorPar[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor Impar = ");
        for (int i=0; i<posicaoVetorImpar; i++){
            System.out.print(vetorImpar[i] + " ");
        }

    }
}
