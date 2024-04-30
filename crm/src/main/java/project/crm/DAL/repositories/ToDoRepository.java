package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.ToDo;

@Repository
public interface ToDoRepository extends ListPagingAndSortingRepository<ToDo, Long> {
}
