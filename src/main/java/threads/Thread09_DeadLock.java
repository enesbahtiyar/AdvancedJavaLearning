package threads;

public class Thread09_DeadLock
{
    public static void main(String[] args)
    {
        final String obj1 = "Pencil";
        final String obj2 = "Ruler";


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println(Thread.currentThread().getName() + " is using " +  obj1);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (obj2){
                        System.out.println(Thread.currentThread().getName() + " wants to use " +  obj2);
                    }
                }
            }
        });

        thread1.setName("John");
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getName() + " is using " +  obj2);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (obj1){
                        System.out.println(Thread.currentThread().getName() + " wants to use " +  obj1);
                    }
                }
            }
        });

        thread2.setName("Krazinski");
        thread2.start();
    }
}
