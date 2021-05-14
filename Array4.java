import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
        int[] myNum = {10, 20, 30, 40, 3};
        int maior = 0;
        int menor = 0;
        
        for (int i=0; i<5; i++){
            int n = myNum[i];
            if(n>maior){
                maior = n;
            }  
            if(n<maior){
                menor = n;
            }
        }

        float media = ((float)maior+menor)/2;
        System.out.println("Maior; " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
    }
}
