package Practicals;

import java.util.Scanner;

interface Account {
    void set(int accountNumber, float balance);

    void display();
}

interface Persons {
    void store(String name, float age);

    void disp();
}

class Customer implements Account, Persons {
    String name;
    int accountNumber;
    float balance,interest;

    @Override
    public void set(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account number:" + accountNumber);
        System.out.println("Balance:" + balance);
    }

    @Override
    public void store(String name, float interest) {
        this.name = name;
        this.interest = interest;
    }

    @Override
    public void disp() {
        System.out.println("Name:" + name);
        System.out.println("Interest:" + interest);
    }

}

public class Practical19 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Scanner sc =  new Scanner(System.in);
        String name;
        int accountNumber;
        float balance,interest;

        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter Account number:");
        accountNumber = sc.nextInt();
        System.out.println("Enter Balance:");
        balance = sc.nextFloat();
        System.out.println("Enter Interest:");
        interest = sc.nextFloat();

        c1.set(accountNumber, balance);
        c1.store(name, interest);

        c1.disp();
        c1.display();

        sc.close();

    }
}