import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Avinash", 75));
        students.add(new Student(2, "Rahul", 40));
        students.add(new Student(3, "Kiran", 85));
        students.add(new Student(4, "Suresh", 50));
        students.add(new Student(5, "Ravi", 30));

        List<Student> passedStudents = students.stream()
                .filter(student -> student.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Students Passed");

        passedStudents.forEach(System.out::println);

        long count = students.stream()
                .filter(student -> student.mark >= 50)
                .count();

        System.out.println();

        System.out.println("Number of Students Passed = " + count);

    }

}