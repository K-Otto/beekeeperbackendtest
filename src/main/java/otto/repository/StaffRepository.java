package otto.repository;


import otto.domain.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Karl Otto on 4/10/2016.
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, String> {
    public Staff findById(Long id);
}
