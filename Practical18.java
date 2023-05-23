package Practicals;

// import java.util.ArrayList;
import java.util.Scanner;

// 18. Write a program to implement following inheritance. Accept data for 5 persons and display the name of employee having salary greater than 5000.

// Class Name: Person
// Member variables:
// Name, age

// Class Name: Employee
// Member variables:
// Designation, salary

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("Person created......");
    }
}

class Employee extends Person {
    String designation;
    float salary;

    public Employee(String designation, float salary, String name, int age) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + Integer.toString(age));
        System.out.println("Salary: " + Float.toString(salary));
    }
}

public class Practical18 {

    static void greaterSalary(Employee[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].salary > 5000)
                people[i].displayInfo();
        }
    }

    public static void main(String[] args) {
        Employee people[];
        String name, designation;
        int age;
        float salary;
        people = new Employee[2];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            System.out.println("\nEnter name:");
            name = sc.next();
            System.out.println("Enter age:");
            age = sc.nextInt();
            System.out.println("Enter designation:");
            designation = sc.next();
            System.out.println("Enter salary:");
            salary = sc.nextFloat();

            people[i] = new Employee(designation, salary, name, age);
            i++;
        }

        sc.close();

        i = 0;
        while (i < 2) {
            people[i].displayInfo();
            i++;
        }

        System.out.println("Employee with salary above 5000");
        greaterSalary(people);

    }
}
