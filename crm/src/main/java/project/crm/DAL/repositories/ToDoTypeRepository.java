package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ToDo;

@Repository
public interface ToDoTypeRepository extends PagingAndSortingRepository<ToDo, Long> {
}
