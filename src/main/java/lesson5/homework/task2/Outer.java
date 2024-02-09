package lesson5.homework.task2;

public class Outer {
    private static class Inner {
        private static int count = 0;

        Inner() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        // Creating instances of the Inner class
        Inner inner1 = new Inner();
        Inner inner2 = new Inner();
        Inner inner3 = new Inner();
        Inner inner4 = new Inner();


        // Getting the count of instances created
        System.out.println("Count of instances created: " + Inner.getCount());
    }
}

