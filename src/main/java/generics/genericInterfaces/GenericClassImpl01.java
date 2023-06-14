package generics.genericInterfaces;
//if we implement generic interface class should be also generic
public class GenericClassImpl01<T> implements GenericInterface <T>
{
    //if a generic interface implemented the class should e generic too

    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
