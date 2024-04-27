package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ProductType;

@Repository
public interface ProductTypeRepository extends PagingAndSortingRepository<ProductType, Long> {
}
