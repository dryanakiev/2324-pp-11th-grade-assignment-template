package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ProductSales;

@Repository
public interface ProductSalesRepository extends PagingAndSortingRepository<ProductSales, Long> {
}
