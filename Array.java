public class Array {

    // Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5 itens, exiba a lista completa.

    public static void main(String[] args) {
        String[] carrinhoCompras = {"Banana", "Maça", "Mamão", "Abacate", "Pitaya"};
        for ( int fruta = 0; fruta < carrinhoCompras.length; fruta++){
            System.out.println(carrinhoCompras[fruta]);
        }
        //ou
        for (String fruta : carrinhoCompras) {
        System.out.println(fruta);
        }
        
    }

}
