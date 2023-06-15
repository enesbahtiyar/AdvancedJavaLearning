package threads;

public class CounterWithThread extends Thread
{
    private String name;

    public CounterWithThread(String name)
    {
        this.name = name;


    }

    @Override
    public void run()
    {
        countMe();
    }

    public void countMe()
    {
        for (int i = 1; i < 11; i++)
        {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(name + " count is: " + i);
        }
    }

    public static void main(String[] args)
    {
        CounterWithThread thread1 = new CounterWithThread("enes");
        CounterWithThread thread2 = new CounterWithThread("esra");

        thread1.start();
        thread2.start();
        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }



    }


}
