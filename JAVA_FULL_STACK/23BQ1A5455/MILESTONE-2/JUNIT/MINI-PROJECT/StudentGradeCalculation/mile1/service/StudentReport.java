package com.mile1.service;

import com.mile1.bean.Student;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int total = 0;

        for (int mark : student.getMarks()) {
            total += mark;
        }

        double average = total / (double) student.getMarks().length;

        if (average >= 80)
            return "A";

        else if (average >= 60)
            return "D";

        else
            return "F";
    }

    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null && student.getName() == null)

                count++;
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student == null)

                count++;
        }

        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null && student.getMarks() == null)

                count++;
        }

        return count;
    }

}