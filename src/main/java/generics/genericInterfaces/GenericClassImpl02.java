package generics.genericInterfaces;

public class GenericClassImpl02 implements GenericInterface<String>
{

    //2nd: if you dont want to make your class generic but still want to use generic interface you need to specify the data type
    @Override
    public void setValue(String s) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
