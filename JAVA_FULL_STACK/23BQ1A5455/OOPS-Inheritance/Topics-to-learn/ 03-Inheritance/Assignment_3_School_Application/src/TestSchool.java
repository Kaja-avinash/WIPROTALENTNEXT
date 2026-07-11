public class TestSchool {

    public static void main(String[] args) {

        Teacher teacher = new Teacher(
                "Ramesh",
                "10-05-1985",
                55000,
                "Java");

        Student student = new Student(
                "Avinash",
                "15-08-2004",
                "S101");

        CollegeStudent collegeStudent = new CollegeStudent(
                "Rahul",
                "20-09-2003",
                "CS201",
                "VVIT",
                "Fourth Year");

        System.out.println("Teacher Details");
        System.out.println("Name : " + teacher.getName());
        System.out.println("DOB : " + teacher.getDateOfBirth());
        System.out.println("Salary : " + teacher.getSalary());
        System.out.println("Subject : " + teacher.getSubject());

        System.out.println();

        System.out.println("Student Details");
        System.out.println("Name : " + student.getName());
        System.out.println("DOB : " + student.getDateOfBirth());
        System.out.println("Student ID : " + student.getStudentId());

        System.out.println();

        System.out.println("College Student Details");
        System.out.println("Name : " + collegeStudent.getName());
        System.out.println("DOB : " + collegeStudent.getDateOfBirth());
        System.out.println("Student ID : " + collegeStudent.getStudentId());
        System.out.println("College : " + collegeStudent.getCollegeName());
        System.out.println("Year : " + collegeStudent.getYear());

    }

}