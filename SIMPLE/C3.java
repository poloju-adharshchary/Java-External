//3\. Write a java program to implement constructor overloading.

class Student {
    int id;
    String name;
    int age;

    Student() {
        id = 101;
        name = "Adharsh";
        age = 18;
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class C3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(103, "Arun", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}