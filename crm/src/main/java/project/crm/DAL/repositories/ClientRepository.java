package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Client;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

}
