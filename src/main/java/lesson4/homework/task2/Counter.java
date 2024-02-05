package lesson4.homework.task2;

public class Counter {

    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counte2 = new Counter();
        Counter counte3 = new Counter();

        System.out.println("Instance Count: " + Counter.getInstanceCount());
    }
}
