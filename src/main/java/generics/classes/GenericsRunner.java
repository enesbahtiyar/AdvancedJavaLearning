package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsRunner
{
    public static void main(String[] args)
    {
        System.out.println("***********Generic Class with Single parameter******************************");
        GenericClass<String> obj1 = new GenericClass<>(); //with java7, we dont need to write data type to the new part
        obj1.setType("hello generics");
        String str = obj1.getType(); //no need to type cast


        //GenericClass<String> obj2 = new GenericClass<>();
        //obj2.setType(1234); //this will give cte obj will only take String

        //if we want to ser Integer value
        GenericClass<Integer> num = new GenericClass<>();
        num.setType(1234);

        GenericClass<Double> doubleValue = new GenericClass<>();
        doubleValue.setType(13.4);

        //in Collections like list, Map etc uses generics concept
        List<Integer> list = new ArrayList<>();
        list.add(234);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");

        System.out.println("***********Generic Class with Multiple parameter******************************");
        GenericTypeTwoParams<String, Integer> obj3 = new GenericTypeTwoParams<>("enes", 3);
        GenericTypeTwoParams<Integer, String> obj4 = new GenericTypeTwoParams<>(34, "Generics");
        System.out.println(obj3.getS());
        System.out.println(obj4.getU());


    }
}
