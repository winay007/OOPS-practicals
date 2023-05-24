package Practicals;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Enrolled courses:");
            for (String course : courses) {
                System.out.println(course);
            }
        }
    }

   
}

public class Practical21{
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        student.displayCourses();

        student.removeCourse("Science");

        student.displayCourses();
    }
}