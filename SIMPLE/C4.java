//4\. Write a program to demonstrate the following i) Single inheritance ii) Multi–level inheritance

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

public class C4 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}