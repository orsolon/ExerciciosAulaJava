import java.util.Scanner;

public class Array2 {

    // Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        String novaPalavra = "";
        for(int i = palavra.length()-1; i>=0; i--){
            novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
        }
        System.out.println(novaPalavra);
    }
    
}
