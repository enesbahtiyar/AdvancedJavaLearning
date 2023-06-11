package generics.method;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class GenericMethodDemo
{
    public static void main(String[] args)
    {
        Integer[] intArr = {3, 6, 8, 3, 7};
        Double[] doubleArr = {3.5, 4.2, 2.3, 6.0};
        String[] strArr = {"using", "generics", "is", "helpful"};
        System.out.println("******* print values of arrays with none generic method");
        print(intArr);
        print(doubleArr);
        print(strArr);

        System.out.println("******* print values of arrays with generic method");
        printAllArr(intArr);
        printAllArr(doubleArr);
        printAllArr(strArr);

        System.out.println("******* generic method to return value");
        int n = getFirstElement(intArr);
        System.out.println(n);
        double d = getFirstElement(doubleArr);
        System.out.println(d);

        System.out.println("******* generic method with multiple parameter");
        printArrAndObj(intArr, "OBJECT");
        printArrAndObj(strArr, 3);

        printTwoArrays(intArr, doubleArr);
    }

    public static void print(Integer[] arr)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    public static void print(Double[] arr)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    public static void print(String[] arr)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //generic method
    public static <T> void printAllArr(T[] arr)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //generic method to return value
    public static <T> T getFirstElement(T[] arr)
    {
        T firstEl = arr[0];
        return firstEl;
    }

    //generic method with multiple parameters
    public static <S, U> void printArrAndObj(S[] arr, U obj)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
        System.out.println(obj);
    }

    public static <S, U> void printTwoArrays(S[] arr, U[] arr2)
    {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
        Arrays.stream(arr2).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }
}
