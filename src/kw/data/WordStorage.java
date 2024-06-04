package kw.data;

import java.util.HashMap;
import java.util.Map;

public class WordStorage {
    private Map<Character, Integer> letterToNumber;
    private Map<Integer, Character> numberToLetter;

    public WordStorage() {
        // 初始化字母到数字的映射关系
        letterToNumber = new HashMap<>();
        numberToLetter = new HashMap<>();
        char letter = 'a';
        for (int i = 1; i <= 26; i++) {
            letterToNumber.put(letter, i);
            numberToLetter.put(i, letter);
            letter++;
        }
    }

    public long wordToNumber(String word) {
        long result = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int number = letterToNumber.get(letter);
            result = result | ((long)number << (5 * i));
        }
        return result;
    }

    public String numberToWord(long number) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            int num = (int)((number >> (5 * i)) & 31); // 31 是二进制的11111
            if (num == 0) {
                break;
            }
            char letter = numberToLetter.get(num);
            word.append(letter);
        }
        return word.toString();
    }

    public static void main(String[] args) {
        WordStorage storage = new WordStorage();
        String word = "zymologies";
        long numberRepresentation = storage.wordToNumber(word);
        System.out.println("Word \"" + word + "\" can be represented as: " + numberRepresentation);

        String originalWord = storage.numberToWord(numberRepresentation);
        System.out.println("Number " + numberRepresentation + " can be represented as word: " + originalWord);
    }
}
