public class Main {

    public static void main(String args[]) {

        RunnableDemo thread1 = new RunnableDemo("Thread 1");
        RunnableDemo thread2 = new RunnableDemo("Thread 2");
        RunnableDemo thread3 = new RunnableDemo("Thread 3");
        RunnableDemo thread4 = new RunnableDemo("Thread 4");
        RunnableDemo thread5 = new RunnableDemo("Thread 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
