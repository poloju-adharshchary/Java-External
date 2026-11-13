//6. Write a program to demonstrate the usage of method overriding, calling super class constructor in derived class.

class Animal {
    Animal() {
        System.out.println("Animal class constructor");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog class constructor");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class C6 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}