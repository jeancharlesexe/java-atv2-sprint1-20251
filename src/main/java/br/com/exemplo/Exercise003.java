package br.com.exemplo;
import java.util.*;

public class Exercise003 {
    public static void main(String[] args) {
        Integer term;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Digite o termo da sequência fibonacci:");
            term = in.nextInt();
        }while(term <= 0);

        Integer prevOne = 0;
        Integer prevTwo = 0;
        Integer current = 0;


        for(int i = 1; i <= term; i++){
            current = prevOne + prevTwo;

            if (prevOne == 0 && prevTwo == 0) {
                current = 1;
            }

            System.out.println(current);

            prevOne = prevTwo;
            prevTwo = current;
        }
    }
}
