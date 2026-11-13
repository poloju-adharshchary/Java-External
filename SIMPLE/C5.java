//5. Write a program to demonstrate the following (i) Super, ii) Final keywords

class Animal {
    int a = 10;

    void display() {
        System.out.println("This is Parent Class");
    }
}

class Dog extends Animal {
    int a = 20;

    final int b = 100;

    void display() {
        super.display();
        System.out.println("Parent class variable: " + super.a);
        System.out.println("Child class variable: " + a);
        System.out.println("Final variable: " + b);
    }
}

public class C5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}