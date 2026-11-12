
public class C3 {
    int data;
    boolean available = false;

    synchronized void produce(int n) {
        try {
            while (available) {
                wait();
            }

            data = n;
            System.out.println("Produced: " + data);

            available = true;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + data);

            available = false;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        C3 obj = new C3();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                obj.produce(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                obj.consume();
            }
        });

        t1.start();
        t2.start();
    }
}
