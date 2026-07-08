package day10;

import java.util.Scanner;

public class SecondWordUppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        if (words.length >= 2) {
            System.out.println("Second Word in Uppercase = " + words[1].toUpperCase());
        } else {
            System.out.println("The sentence does not contain a second word.");
        }

        sc.close();
    }
}