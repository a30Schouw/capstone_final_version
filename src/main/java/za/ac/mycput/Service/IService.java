package za.ac.mycput.Service;
import java.util.Optional;

public interface IService<T, ID> {
    T save(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}