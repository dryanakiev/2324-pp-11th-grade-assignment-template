package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
