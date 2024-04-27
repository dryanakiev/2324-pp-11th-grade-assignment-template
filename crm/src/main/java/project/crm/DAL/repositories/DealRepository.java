package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Deal;

@Repository
public interface DealRepository extends PagingAndSortingRepository<Deal, Long> {

}
