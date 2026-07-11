package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student studentObject)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (studentObject == null) {
            throw new NullStudentObjectException();
        }

        if (studentObject.getName() == null) {
            throw new NullNameException();
        }

        if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();

        // Check if any subject is failed
        for (int mark : marks) {

            if (mark < 35) {
                studentObject.setGrade("F");
                return "F";
            }

        }

        // Calculate total marks
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        // Assign grade based on total
     // Assign grade based on total (as per PDF)
        if (total < 150) {
            studentObject.setGrade("C");
            return "C";
        }
        else if (total < 200) {
            studentObject.setGrade("B");
            return "B";
        }
        else if (total < 250) {
            studentObject.setGrade("A");
            return "A";
        }
        else {
            studentObject.setGrade("A+");
            return "A+";
        }
    }
}