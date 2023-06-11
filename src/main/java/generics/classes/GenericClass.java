package generics.classes;

/*
    letters generally accepted by developers
    E --> Element(used for collections)
    K --> Key
    V --> Values
    T --> Type
    N --> Nunbers
    S, U, V
 */
public class GenericClass<T>
{
    public T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

}
