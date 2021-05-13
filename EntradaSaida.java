import java.util.Scanner;

public class EntradaSaida {

    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            while(true) { //loop infinito
                System.out.println("Digite um numero de 1 a 10");
                int numero = input.nextInt();
                System.out.println("Você digitou: " + numero);
                System.out.println("Quer continuar? S/N");
                String resposta = input.next();
                if (resposta.equalsIgnoreCase("N")){
                    break;
                }

            }



    }
}
