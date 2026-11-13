
class C11 {
    int id;
    String name;

    C11() {
        this(101, "Adharsh");
        System.out.println("Default Constructor");
    }

    C11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    void show() {
        this.display();
    }

    void send() {
        print(this);
    }

    void print(C11 s) {
        System.out.println("Passing current object:");
        s.display();
    }

    public static void main(String[] args) {
        C11 s = new C11();

        s.show();
        s.send();
    }
}
