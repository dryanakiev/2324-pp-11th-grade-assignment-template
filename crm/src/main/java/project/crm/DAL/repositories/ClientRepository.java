package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Client;

@Repository
public interface ClientRepository extends ListPagingAndSortingRepository<Client, Long> {

}
