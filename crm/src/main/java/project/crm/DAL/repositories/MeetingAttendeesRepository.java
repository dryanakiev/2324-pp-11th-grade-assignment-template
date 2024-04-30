package project.crm.DAL.repositories;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.crm.DAL.models.MeetingAttendees;

@Repository
public interface MeetingAttendeesRepository extends ListPagingAndSortingRepository<MeetingAttendees, Long> {
}
