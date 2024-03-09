package lesson11.homework;

public class StarvationExample {
    static Object resource = new Object();

    public static void main(String[] args) {
        Thread greedyThread = new Thread(() -> {
            while (true) {
                synchronized (resource) {
                    System.out.println("Greedy Thread acquired resource");
                }
            }
        });

        Thread normalThread = new Thread(() -> {
            while (true) {
                synchronized (resource) {
                    System.out.println("Normal Thread acquired resource");
                }
            }
        });

        greedyThread.setPriority(Thread.MAX_PRIORITY);
        normalThread.setPriority(Thread.MIN_PRIORITY);

        greedyThread.start();
        normalThread.start();
    }
}
