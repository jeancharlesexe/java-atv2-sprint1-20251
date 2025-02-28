package br.com.exemplo;
import java.sql.SQLOutput;
import java.util.*;

public class Exercise002 {
    public static void main(String[] args) {
        Integer number = 0;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Digite um número positivo:");
            number = in.nextInt();
        }while(number <= 0);

        String numberString = String.valueOf(number);

        List<Character> digits = new ArrayList<>();

        for(int i = 0; i < numberString.length(); i++){
            digits.add(numberString.charAt(i));
        }

        Integer sum = 0;

        for(int i = 0; i < digits.size(); i++){
            sum += Character.getNumericValue(digits.get(i));
        }

        System.out.println("A soma dos digitos do número é: " + sum);

    }
}
