package project.crm.DAL.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "MeetingAttendees")
public class MeetingAttendees extends BaseModel {

    public MeetingAttendees(Long id, boolean isDeleted, Meeting meeting, User user) {
        super(id, isDeleted);
        this.meeting = meeting;
        this.user = user;
    }

    public MeetingAttendees() {}

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @ManyToOne
    @JoinColumn(name = "atendee")
    private User user;

    @Override
    public String toString() {
        return "MeetingAttendees{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", meeting=" + meeting +
                ", user=" + user +
                '}';
    }
}
