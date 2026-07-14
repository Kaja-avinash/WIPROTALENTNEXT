package com.wipro.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringOperation operation = new StringOperation();

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        ArrayList<String> result = operation.performOperations(s1, s2);

        System.out.println();
        System.out.println("Output:");

        for (int i = 0; i < result.size(); i++) {

            System.out.println((i + 1) + ". " + result.get(i));

        }

        sc.close();

    }

}