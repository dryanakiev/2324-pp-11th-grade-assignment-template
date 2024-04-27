package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
