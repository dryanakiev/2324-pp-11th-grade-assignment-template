package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ProductType;

@Repository
public interface ProductTypeRepository extends ListPagingAndSortingRepository<ProductType, Long> {
}
