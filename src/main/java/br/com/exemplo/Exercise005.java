package br.com.exemplo;
import java.util.*;

public class Exercise005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "";

        System.out.println("Digite uma palavra:");
        word = in.nextLine();

        Integer vowel = 0;
        for(int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            boolean isVowel = false;

            switch(character) {
                case 'a':
                    isVowel = true;
                    break;
                case 'e':
                    isVowel = true;
                    break;
                case 'i':
                    isVowel = true;
                    break;
                case 'o':
                    isVowel = true;
                    break;
                case 'u':
                    isVowel = true;
                    break;
            }

            if(isVowel) {
                vowel++;
            }

        }

        System.out.println("A palavra %s tem %d vogais".formatted(word, vowel));
    }
}
