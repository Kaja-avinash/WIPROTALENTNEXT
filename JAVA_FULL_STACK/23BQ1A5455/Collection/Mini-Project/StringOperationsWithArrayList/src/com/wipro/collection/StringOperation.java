package com.wipro.collection;

import java.util.ArrayList;

public class StringOperation {

    public ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> result = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }

        }

        result.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {

            String reverse = new StringBuilder(s2).reverse().toString();

            String op2 = s1.substring(0, last)
                    + reverse
                    + s1.substring(last + s2.length());

            result.add(op2);

        } else {

            result.add(s1 + s2);

        }

        // Operation 3

        if (first != -1 && first != last) {

            String op3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());

            result.add(op3);

        } else {

            result.add(s1);

        }

        // Operation 4

        int half = (s2.length() + 1) / 2;

        String firstHalf = s2.substring(0, half);

        String secondHalf = s2.substring(half);

        result.add(firstHalf + s1 + secondHalf);

        // Operation 5

        String op5 = s1;

        for (char ch : s2.toCharArray()) {

            op5 = op5.replace(ch, '*');

        }

        result.add(op5);

        return result;

    }

}