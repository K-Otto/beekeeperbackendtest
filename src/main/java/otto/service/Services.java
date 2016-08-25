package otto.service;

import java.util.Set;

/**
 * Created by Karl Otto on 4/10/2016.
 */
public interface Services<E, ID> {
    E Create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E Update(E entity);

    void Delete(E entity);

}
