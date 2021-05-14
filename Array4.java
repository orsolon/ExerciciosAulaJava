import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
        Scanner scan = new Scanner(System.in);
        int n; 
        int maior = 0;
        int menor = 0;
        int media = (maior + menor)/2;

        for (int i=0; i<5; i=i+1){
            System.out.println("Digite um numero:");
            n = scan.nextInt();

            if(i==0){
                maior = n;
                menor = n;
            }
       
            if(n>maior){
                maior = n;
            }  
            if(n<menor){
                menor = n;
            }

        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
        scan.close();
    }
}
