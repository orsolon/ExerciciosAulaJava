public class Even {

    public static void main(String[] args) {
        //Dado dois numeros exiba pares entre eles e quantos são os pares
        int currentNumber, startNumber = 1, endNumber = 20, countEvens=0;
        currentNumber = startNumber;

        while(currentNumber < endNumber) {
            if(isEvenNumber(currentNumber)){
                System.out.println(currentNumber++);
                countEvens++;
            }
            currentNumber++;
        }

        System.out.printf("there are %d between %d and %d", countEvens, startNumber, endNumber);
    }

    private static boolean isEvenNumber(int number){
        // if (number %2 == 0 ) {
        //     return true;
        // }
        return number % 2 == 0;
    }
}
