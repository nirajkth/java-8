public class RunnableLambda {
    public static void main(String[] args) {
        // before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread t1 is running.");
            }
        };
        new Thread(t1).start();

        // after
        Runnable t2 = () -> System.out.println("Thread t2 is running");
        new Thread(t2).start();

        Runnable t3 = () -> {
            System.out.println("Thread t3 is running");
            System.out.println("Thread t 3.1 is running");
        };
        new Thread(t3).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread t4 is running");
            }
        }).start();

        new Thread(() -> System.out.println("Thread t5 is running")).start();
    }
}