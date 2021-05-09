import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos fazer a tabuada?");
        System.out.println("Digite um número de 1 a 10");
        int num = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num + "x" + i +"=" + (num*i));
        }
        
    }

}
