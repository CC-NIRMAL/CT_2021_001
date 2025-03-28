package Q_05;

public class Main {
    public static void main(String[] args) {
        // Create Lecturer object
        Lecturer lecturer = new Lecturer("Kesavan  ", "Object-Oriented Programming");

        // Create Course object
        Course course = new Course("Object-Oriented Programming", "CTEC22043", lecturer);

        // Create Student object
        Student student = new Student("Chalaka ", "BICT", "Object-Oriented Programming");

        // Display course and student details
        System.out.println("---- Course Details ----");
        course.displayCourseInfo();
        System.out.println("\n---- Student Details ----");
        student.displayStudentInfo();
    }
}