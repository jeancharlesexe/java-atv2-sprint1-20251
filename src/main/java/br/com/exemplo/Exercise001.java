package br.com.exemplo;
import java.util.*;

public class Exercise001 {
    public static void main(String[] args) {
        Integer number = 0;
        Integer divisor;
        Boolean isPrime = false;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Digite o número positivo: ");
            number = in.nextInt();

        }while(number < 0);

        if (number <= 1) {
            isPrime = false;
        } else {
            isPrime = true;
            for (divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "É primo!" : "Não é primo.");
        in.close();
    }
}
