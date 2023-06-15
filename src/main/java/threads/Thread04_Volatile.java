package threads;

public class Thread04_Volatile
{
    volatile private static int flag = 0;

    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                {
                    if(flag == 0)
                    {
                        System.out.println("Thread1 is working");
                    }
                    else if(flag == 1)
                    {
                        break;
                    }
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag = 1;
                System.out.println("flag is now set to 1");
            }
        });

        thread1.start();
        thread2.start();
    }
}
