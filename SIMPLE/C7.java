
import java.util.*;

abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        a = sc.nextInt();

        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}

public class C7 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
