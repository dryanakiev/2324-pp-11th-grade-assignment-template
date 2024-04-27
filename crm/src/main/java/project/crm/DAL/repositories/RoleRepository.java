package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Role;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
}
