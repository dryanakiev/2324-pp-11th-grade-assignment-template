package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Role;

@Repository
public interface RoleRepository extends ListPagingAndSortingRepository<Role, Long> {
}
