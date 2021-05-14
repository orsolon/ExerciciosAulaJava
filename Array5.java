public class Array5 {
    //Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. 
    //Ao final, informe qual o nome mais longo presente na lista.
    public static void main(String[] args) {
        String[] convidados = {"João", "Lucas", "Marcela", "Lais", "Tati"};
        int maior = 0;
        int indicepalavra=0;
        int tamanho = convidados.length;

        for (int i = 0; i < tamanho; i++) {
            if (maior < convidados[i].length()) {
                maior = convidados[i].length();
                indicepalavra = i;
            }
        }
        System.out.println(convidados[indicepalavra]);
    }

}

/*
1 - inicializei a variavel maior com zero
2 - criei um If onde ele analisa se a variavel maior é MENOR que o tamanho da palavra corrente, caso seja, maior irá receber o tamanho da palavra corrente e indicepalavra receberá o indice que indica a posição da palavra no "vetor".
3 - por fim como sei aonde a maior palavra esta posicionada, utilizo a variavel indicepalavra para indicar qual é a maior.*/