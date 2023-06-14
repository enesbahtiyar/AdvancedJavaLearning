package generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildcard
{
    public static void main(String[] args)
    {
        System.out.println("********wildcard lower bound***********");
        //list of Integers
        List<Integer> intlist = new ArrayList<>();
        addElements(intlist);
        System.out.println(intlist);
        //list of Numbers
        List<Number> numList = new ArrayList<>();
        addElements(numList);
        System.out.println(numList);
        //list of doubles
        List<Double> doublelist = new ArrayList<>();
        //addElements(doublelist); //CTE because Double is not parent of Integer
    }


    //method to add elements from integer and its parent classes
    public  static void addElements(List<? super Integer> list)
    {
        //? --> wildCard(unknown type)
        //super Integer --> give me the parents of integer
        //with the Super Integer we can use Number Object and Integer


        for (int i = 1; i <= 10; i++)
        {
            list.add(i);
        }
    }

    /*
        extends --> defining a parent
        super --> referring to the parent
     */


    //wildcard disadvantages
    public static void printElements(List<?> listOfUnknowns)
    {
        //if we dont mention any data type with wildcard "adding" methods wont work on its own
        //listOfUnknowns.add("java");

        for (Object w: listOfUnknowns)
        {
            System.out.println(w);
        }
    }

    public static void printObj(List<Object> objectList)
    {
        objectList.add("java");
        for (Object w : objectList)
        {
            System.out.println(w);
        }
    }

    //-------------


    //using wildcard with upper bound

    public static void multiplyByTwo(List<? extends Number> list)
    {
        //list.add(1); we cannot do any operations related to data type

        list.stream().map(t -> 2 * t.doubleValue()).forEach(System.out::println);
    }
}
