package project.crm.DAL.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "MeetingAttendees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingAttendees extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @ManyToOne
    @JoinColumn(name = "atendee")
    private User user;

}
