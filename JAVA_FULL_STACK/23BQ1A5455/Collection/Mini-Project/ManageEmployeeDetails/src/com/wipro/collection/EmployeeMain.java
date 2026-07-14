package com.wipro.collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeComparator());

        System.out.println("Enter the Number of Employees");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = sc.nextLong();
            sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            Employee emp = new Employee(firstName, lastName, mobile, email, address);

            employeeSet.add(emp);
        }

        System.out.println();
        System.out.println("Employee List");
        System.out.println();

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName",
                "SecondName",
                "MobileNumber",
                "Email",
                "Address");

        for (Employee emp : employeeSet) {

            System.out.println(emp);

        }

        sc.close();
    }
}