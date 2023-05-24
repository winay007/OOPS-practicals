package Practicals;

import java.util.Scanner;

class StudentData {
    String name;
    int age, roll_no;

    StudentData(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException() {
        super("invalid range of age");
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Invalid name");
    }
}

public class Practical24 {

    static boolean containsAllAlphabets(String name) {

        for (char ch : name.toCharArray()) {
            if (!Character.isLetter(ch) && ch != ' ') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            String name;
            int age, roll_no;
            System.out.println("Enter your name:");
            name = sc.next();

            if (!containsAllAlphabets(name))
                throw new NameNotValidException();

            System.out.println("Enter your age:");
            age = sc.nextInt();

            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException();
            }

            System.out.println("Enter roll number:");
            roll_no = sc.nextInt();

            StudentData s1 = new StudentData(name, age, roll_no);
            System.out.println("Successfully saved data");

        } catch (AgeNotWithinRangeException ae) {
            System.out.println(ae.getMessage());
        } catch (NameNotValidException ae) {
            System.out.println(ae.getMessage());
        } finally {
            sc.close();
        }
    }
}
