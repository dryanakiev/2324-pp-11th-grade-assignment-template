package project.crm.DAL.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.MeetingAttendees;

@Repository
public interface MeetingAttendeesRepository extends PagingAndSortingRepository<MeetingAttendees, Long> {
}
