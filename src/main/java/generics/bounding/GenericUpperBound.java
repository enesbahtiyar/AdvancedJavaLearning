package generics.bounding;

public class GenericUpperBound <T extends  Number> // we are setting bounds from upper classes
{
    //data type of T will be only classes which extends from Numbers

    private T[] numberArray;

    //constructor
    public GenericUpperBound(T[] numberArray)
    {
        this.numberArray = numberArray;
    }

    public double getAverage()
    {
        double sum = 0;
        for (T w : numberArray)
        {
            sum += w.doubleValue(); //converts elements to double
        }

        return sum / numberArray.length;
    }

    public static void main(String[] args)
    {
        Integer[] intArr = {2, 5, 8, 9, 3};
        Double [] doubleArr = {1.4, 6.3, 7.3, 8.0};
        String [] strArr = {"Java", "Generics", "Ara", "Fantastic!"};
        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>(intArr);
        System.out.println(obj1.getAverage());

        GenericUpperBound<Double> obj2 = new GenericUpperBound<>(doubleArr);
        System.out.println(obj2.getAverage());

        //GenericUpperBound<String> obj3 = new GenericUpperBound<String>(); this will give error because of the bound
    }
}
