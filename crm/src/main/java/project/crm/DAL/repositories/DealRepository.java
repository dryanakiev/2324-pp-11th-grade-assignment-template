package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Deal;

@Repository
public interface DealRepository extends ListPagingAndSortingRepository<Deal, Long> {

}
