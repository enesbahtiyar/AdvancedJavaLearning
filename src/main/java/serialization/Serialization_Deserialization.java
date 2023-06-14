package serialization;

import java.io.*;

public class Serialization_Deserialization
{
    public static void main(String[] args)
    {
        User user1 = new User("enes", 1L, "12345");
        User user2 = new User("esra", 2L, "12348");
        User user3 = new User("boncuk", 3L, "12346");
        writeUserObject(user1,user2,user3);
        readUserObject("user.xyz");
    }

    private static void writeUserObject(User user1, User user2, User user3)
    {
        System.out.println("User Objects are being written");

        try
        {
            FileOutputStream fos = new FileOutputStream("user.xyz");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user1);
            oos.writeObject(user2);
            oos.writeObject(user3);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void readUserObject(String filename)
    {
        try
        {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user1 = (User) ois.readObject();
            User user2 = (User) ois.readObject();
            User user3 = (User) ois.readObject();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
