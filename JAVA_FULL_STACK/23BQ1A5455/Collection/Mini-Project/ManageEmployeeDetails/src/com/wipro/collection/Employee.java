package com.wipro.collection;

public class Employee {

    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String email;
    private String address;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(String firstName, String lastName, long mobileNumber,
            String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return String.format("%-15s %-15s %-15d %-30s %-15s",
                firstName,
                lastName,
                mobileNumber,
                email,
                address);

    }

}