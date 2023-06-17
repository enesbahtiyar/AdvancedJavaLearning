package threads;

public class Thread05_WaitAndNotify
{
    public static int balance = 0;

    public static void main(String[] args)
    {
        Thread05_WaitAndNotify object = new Thread05_WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.withdraw(1000);
            }
        });

        thread1.setName("Student");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                thread1.interrupt();
                object.deposit(100);

            }

        });

        thread2.setName("Parent");


        thread1.start();
        thread2.start();
    }

    public synchronized void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw money");
        if(balance <= 0 || balance < amount)
        {
            System.out.println("Insufficient balance " + balance);
            System.out.println("waiting for the balance to be deposited");
            try
            {
                wait(); //Causes the current thread to wait until it is awakened, typically by being notified or interrupted.
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
                if(balance >= amount)
                {
                    balance = balance - amount;
                    System.out.println("Amount has been withdrawn successfully " + balance);
                }
                else
                {
                    System.out.println("Insufficient Amount deposited try later " + balance);
                }
            }

        }
        else
        {
            balance = balance - amount;
            System.out.println("Amount has been withdrawn " + balance);
        }

    }

    public synchronized void deposit(int amount)
    {
        System.out.println(Thread.currentThread().getName() + " wants to deposit amount" + amount);
        balance = balance + amount;
        System.out.println("the amount is deposited current balance is: " + balance);
        notify(); //Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this
        //notifyAll(); //Wakes up all threads that are waiting on this object's monitor. A thread waits on an object's monitor by calling one of the wait methods.
    }
}
