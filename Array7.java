import java.util.Scanner;

public class Array7 {

    /* Escreva um programa que lê nome e idade de 5 pessoas 
    e ao final informa quem é o mais novo, 
    o mais velho e qual a média de idade.*/

    public static void main(String[] args) {

        // String [] nomes = {"Maria", "Jose", "Lucia", "Eduardo", "Bernardo"};
        // int [] idades = {20, 30, 50, 34, 26};

        Scanner scan = new Scanner(System.in);
        String [] [] nomePessoas = new String [5][3];
        String [] idadesString = new String[5];
        int[] idadeEmInt = new int[idadesString.length];

        for (int i=0; i < nomePessoas.length; i++) {
            System.out.println("Digite seu nome: ");
            nomePessoas[0][i] = scan.next();
            System.out.println("Digite sua idade: ");
            idadesString[0][i] = scan.next();

        }    
            for (int i=0; i < 5; i++) {
                idadesString[i] = nomePessoas[1][i];
            }

            for (int i=0; i < idadesString.length; i++) {
                idadeEmInt[i] = Integer.parseInt(idadesString[i]);
            }

            int valorMax = idadesString[0];
        }

        /*
        correção
        String[] nomes = {"Joao", "Maria", "Lucia", "Lais", "Vera"};
        int [] idades = {10, 20, 30, 40, 3};
        int maisNovoIndice=0, maisVelhoIndice=0;
        double somatorio;

        for (int i=0; i<nomes.length; i++) {
            if (idades[i]>idades[maisVelhoIndice]){
                maisVelhoIndice = i;
            } if (idades[i] < idades[maisNovoIndice]) {
                maisNovoIndice = i;
            }
            somatorio += idades[i];
        }

            
        

        System.out.println("O mais novo é: " + nomes[maisNovoIndice]);
        System.out.println("O mais velho é: " + nomes[maisVelhoIndice]);
        System.out.println("A media de idade deles é: " + somatorio/idades.length);
     */
    }


