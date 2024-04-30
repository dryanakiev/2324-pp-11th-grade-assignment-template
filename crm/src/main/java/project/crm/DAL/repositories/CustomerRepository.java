package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Customer;

@Repository
public interface CustomerRepository extends ListPagingAndSortingRepository<Customer, Long> {
}
