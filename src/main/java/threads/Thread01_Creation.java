package threads;

public class Thread01_Creation
{
    public static void main(String[] args)
    {
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        Mythread thread1 = new Mythread();
        thread1.start(); //creates a thread than runs the code inside.
        //thread1.run(); //this will run it like a method not like a Thread

        MyRunnable myRunnable = new MyRunnable();
        //myRunnable.run();

        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        //creating an Anonymous Thread
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Current Thread: " + Thread.currentThread().getName());

            }
        });

        thread3.setName("Anonymous Thread");
        thread3.start();

        Thread thread4 = new Thread(() ->{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        });

        thread4.setName("lambda thread");
        thread4.start();
    }
}

class Mythread extends Thread
{
    @Override
    public void run() {
        System.out.println("MyThread is running.");
    }
}

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.println("My Runnable thread is running.");
    }
}
