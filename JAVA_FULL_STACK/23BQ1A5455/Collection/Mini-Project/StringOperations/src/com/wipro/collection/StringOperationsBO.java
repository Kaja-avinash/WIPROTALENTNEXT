package com.wipro.collection;

import java.util.ArrayList;

public class StringOperationsBO {

    private ArrayList<String> itemList;

    public StringOperationsBO(ArrayList<String> itemList) {
        this.itemList = itemList;
    }

    // Insert
    public void insert(String item) {

        itemList.add(item);

        System.out.println("Inserted successfully");
    }

    // Search
    public void search(String item) {

        if (itemList.contains(item)) {
            System.out.println("Item found in the list.");
        } else {
            System.out.println("Item not found in the list.");
        }

    }

    // Delete
    public void delete(String item) {

        if (itemList.remove(item)) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Item does not exist.");
        }

    }

    // Display
    public void display() {

        if (itemList.isEmpty()) {

            System.out.println("The list is empty.");

        } else {

            System.out.println("The Items in the list are :");

            for (String s : itemList) {

                System.out.println(s);

            }

        }

    }

}