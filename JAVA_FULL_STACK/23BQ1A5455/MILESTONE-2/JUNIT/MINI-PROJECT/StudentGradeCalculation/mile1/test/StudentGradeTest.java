package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class StudentGradeTest {

    StudentReport report = new StudentReport();

    @Test
    public void testGradeA() throws Exception {

        Student student = new Student("Avinash",
                new int[] {90, 85, 95});

        assertEquals("A", report.validate(student));
    }

    @Test
    public void testGradeD() throws Exception {

        Student student = new Student("Rahul",
                new int[] {60, 65, 70});

        assertEquals("D", report.validate(student));
    }

    @Test
    public void testGradeF() throws Exception {

        Student student = new Student("Kiran",
                new int[] {30, 40, 45});

        assertEquals("F", report.validate(student));
    }
    @Test(expected = com.mile1.service.NullStudentException.class)
    public void testNullStudent() throws Exception {

        report.validate(null);
    }

    @Test(expected = com.mile1.service.NullNameException.class)
    public void testNullName() throws Exception {

        Student student = new Student(null,
                new int[] {80, 85, 90});

        report.validate(student);
    }

    @Test(expected = com.mile1.service.NullMarksArrayException.class)
    public void testNullMarks() throws Exception {

        Student student = new Student("Avinash", null);

        report.validate(student);
    }
    @Test
    public void testFindNumberOfNullName() {

        Student[] students = {
                new Student(null, new int[] {90, 80}),
                new Student("Rahul", new int[] {70, 60}),
                new Student(null, new int[] {50, 40})
        };

        assertEquals(2, report.findNumberOfNullName(students));
    }

    @Test
    public void testFindNumberOfNullObjects() {

        Student[] students = {
                new Student("A", new int[] {90}),
                null,
                new Student("B", new int[] {80}),
                null
        };

        assertEquals(2, report.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNumberOfNullMarks() {

        Student[] students = {
                new Student("A", null),
                new Student("B", new int[] {90}),
                new Student("C", null)
        };

        assertEquals(2, report.findNumberOfNullMarks(students));
    }

}