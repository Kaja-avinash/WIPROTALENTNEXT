package com.wipro.collection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringOperations operations = new StringOperations();
        StringOperationsBO bo = new StringOperationsBO(operations.getItemList());

        int choice;

        do {

            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.println("Enter the item to be inserted:");

                String insertItem = sc.nextLine();

                bo.insert(insertItem);

                break;

            case 2:

                System.out.println("Enter the item to search :");

                String searchItem = sc.nextLine();

                bo.search(searchItem);

                break;

            case 3:

                System.out.println("Enter the item to delete :");

                String deleteItem = sc.nextLine();

                bo.delete(deleteItem);

                break;

            case 4:

                bo.display();

                break;

            case 5:

                System.out.println("Exiting...");

                break;

            default:

                System.out.println("Invalid Choice");

            }

            System.out.println();

        } while (choice != 5);

        sc.close();

    }

}