package generics.genericInterfaces.example;

public interface Repository<T>
{
    //common methods for Crud operation
    void save();
    void delete();

    T findAll();

    void Update();
}
