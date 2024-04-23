package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskPoint;

@Entity
@Table(name = "Meetings")
public class Meeting extends BaseModel {

    public Meeting(Long id, boolean isDeleted, TaskPoint meeting) {
        super(id, isDeleted);
        this.meeting = meeting;
    }

    public Meeting() {
    }

    @Embedded
    @AttributeOverride(name = "task_name", column = @Column(name = "meeting_title"))
    @AttributeOverride(name = "task_description", column = @Column(name = "description"))
    TaskPoint meeting;

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", meeting=" + meeting +
                '}';
    }
}
