package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.Meeting;

@Repository
public interface MeetingRepository extends PagingAndSortingRepository<Meeting, Long> {
}
