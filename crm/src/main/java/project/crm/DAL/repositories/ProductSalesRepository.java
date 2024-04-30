package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ProductSales;

@Repository
public interface ProductSalesRepository extends ListPagingAndSortingRepository<ProductSales, Long> {
}
