package generics.classes;

public class NoneGenericClass
{
    private Object obj;
    //getter and setter


    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args)
    {
        NoneGenericClass obj1 = new NoneGenericClass();
        NoneGenericClass obj2 = new NoneGenericClass();

        //set values for the obj
        obj1.setObj("hello");
        obj2.setObj(1234);
        //-- after some codes
        String str = (String) obj1.getObj(); //using type cast because we are narrowing from obj to string
        String st2 = (String) obj2.getObj(); //mo compile time error(CTE) but it will throw exception
        int num = (int) obj2.getObj();
    }
}
