public class Array6 {
// Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
    public static void main(String[] args) {

        String palavra = "imparesmaisculos";
        char [] palavraEmChars = palavra.toCharArray();

        int qtd = palavraEmChars.length;

        for (int i = 0; i <= (qtd - 1); i = i + 2 ) {
            
            // System.out.println("pegando os caracretres impares:" + palavraEmChars[i]);
            char charUpper = Character.toUpperCase(palavraEmChars[i]);
            System.out.println("Transformando em UpperCase: " + charUpper);
        }
    }

    /*
        correção
        String palavra = "Hello World";
        char[] letrasPalavra = palavra.toCharrArray();
        String estilizado = "";
        for (int i-0. i<letrasPalavra.length; i++);
        if (i%2==0){
            estlizado = estilizado + letrasPalavra[i];
        } else {
            estlizado = estilizado + Character.toUpperCAse(letrasPalavra[i]);
        }


    */

        
}


