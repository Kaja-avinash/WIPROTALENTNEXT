package com.wipro.collection;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getFirstName().compareToIgnoreCase(emp2.getFirstName());

    }

}