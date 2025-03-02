package br.com.exemplo;
import java.util.*;

public class Exercise004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        String drow = "";

        System.out.println("Digite a palavra pra ver se é palindromo:");
        word = in.nextLine();

        for(int i = word.length() - 1; i >= 0; i--){
            drow += String.valueOf(word.charAt(i));
        }

        System.out.println(drow.equals(word) ? "é um palindromo" : "nao é palindromo");

    }
}
