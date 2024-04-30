package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.User;

@Repository
public interface UserRepository extends ListPagingAndSortingRepository<User, Long> {
}
