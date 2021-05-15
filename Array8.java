import java.util.Scanner;

public class Array8 {

    //Escreva um programa que lê nome e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] name = new String[5];
        float[] weigth = new float[5];
        float[] heigth = new float[5];

        for (int i = 0; i < 2; i++) {
            System.out.print("Informe nome: ");
            name[i] = scan.next();
            System.out.print("Informe peso em kg:" );
            weigth[i] = scan.nextFloat();
            System.out.print("Informe sua Altura: ");
            heigth[i] = scan.nextFloat();

            float imc = weigth[i] / (heigth[i] * heigth[i]);
            System.out.printf("%s tem o IMC de: %.2f \n", name[i], imc);
            if (imc > 25 || imc < 18.5) {
                System.out.println("O aluno " + name[i] + " está acima do peso");
            } else {
                System.out.println("O aluno " + name[i] + " está no peso ideial");
            }
        }
    }

    /* correção
        String[] nomes = {"Maria", "Jose", "Lucia", "Eduardo", "Bernardo"};
        int[] alturas = {157, 163, 121, 140, 170 };
        double [] pesos = {92, 70, 120, 90, 59};

        for (int i=0; i<nomes.length, i++) {
            double imc = peso[i]/Math.pow(alturas[i], 2);
            if(imc < 18.5 || imc > 25) {
                System.out.printf(%s está fora do peso ideal com imc=%.2f\n", nomes[i], imc);
            }
        }



    */

}
