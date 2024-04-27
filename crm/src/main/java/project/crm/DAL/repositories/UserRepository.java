package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
