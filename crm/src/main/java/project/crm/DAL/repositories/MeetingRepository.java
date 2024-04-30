package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Meeting;

@Repository
public interface MeetingRepository extends ListPagingAndSortingRepository<Meeting, Long> {
}
