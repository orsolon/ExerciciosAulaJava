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

        /* correção

        String palavra = "palavra";
        char [] ordemNormal = palavra.toCharArray();
        System.out.println("A palavra  ao contrario é: ");
        for (int i=ordemNormal.length; i >=0; i++){
            System.out.println(ordemNormal[i]);
            */
        }
       
        
 }
    

