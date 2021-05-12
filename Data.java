import java.time.LocalDate;


// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.printf("Hoje é %td/%tB/%tY", hoje, hoje, hoje);


    }
}
