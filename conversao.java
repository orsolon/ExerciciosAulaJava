public class conversao {
    public static void main(String[] args) {

        // Declare uma constante que representa o fator de conversão de peso de quilos (kg) para libras (lb). 
        // (Considere o fator igual a 2.20462).

        double quilos = 2;
        final double FATOR_DE_CONVERSAO = 2.20462;
        double pesoLibras = quilos *  FATOR_DE_CONVERSAO;
        System.out.println(" 2 kilos correspondem a " + pesoLibras + "lb");
        System.out.printf("%s kilos correspode a %.2f lb",quilos, pesoLibras);

    }

}
