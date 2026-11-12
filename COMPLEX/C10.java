
import java.util.*;

class Student {
    int rollNo;
    String name;

    void getStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Test extends Student {
    int m1, m2, m3;

    void getMarks(Scanner sc) {
        System.out.print("Enter 3 Academic Marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("Academic Marks: " + m1 + " " + m2 + " " + m3);
    }
}

interface Sports {
    void getSportsMarks(Scanner sc);
    void displaySportsMarks();
}

class Result extends Test implements Sports {
    int sportsMark, total;
    double average;

    public void getSportsMarks(Scanner sc) {
        System.out.print("Enter Sports Marks: ");
        sportsMark = sc.nextInt();
    }

    public void displaySportsMarks() {
        System.out.println("Sports Marks: " + sportsMark);
    }

    void calculate() {
        total = m1 + m2 + m3 + sportsMark;
        average = total / 4.0;
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        displaySportsMarks();

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

public class C10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudent(sc);
        r.getMarks(sc);
        r.getSportsMarks(sc);
        r.calculate();
        r.displayResult();
    }
}
