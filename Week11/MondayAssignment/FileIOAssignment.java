package Week11.MondayAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOAssignment {
    private static final String path = "./Week11/MondayAssignment/";

    public static void method1(String file) throws IOException {
        String str, longestWord = "";
        int len = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(path + file))) {
            while ((str = in.readLine()) != null) {
                if (str.length() > len) {
                    longestWord = str;
                    len = longestWord.length();
                }
            }
            System.out.println("Longest word: " + longestWord + "\nLength: " + len);
        }
    }

    public static void method2(String file) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(path + "long_words.txt"))) {
            BufferedReader in = new BufferedReader(new FileReader(path + file));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.length() > 25) {
                    out.write(str);
                    out.newLine();
                }
            }
            in.close();
        }
    }

    public static void findPalindromes(String file) throws IOException {
        int count = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(path + file))) {
            String str;
            while ((str = in.readLine()) != null) {
                if (palindrome(str)) {
                    System.out.println(str);
                    count++;
                }
            }
            System.out.println("Palindromes in file: " + count);
        }
    }

    public static boolean palindrome(String word) {
        for(int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            method1("words_alpha.txt");
            method2("words_alpha.txt");
            findPalindromes("words_alpha.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
