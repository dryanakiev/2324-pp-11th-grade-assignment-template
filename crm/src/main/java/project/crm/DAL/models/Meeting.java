package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskPoint;

@Entity
@Table(name = "Meetings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meeting extends BaseModel {

    @Embedded
    @AttributeOverride(name = "task_name", column = @Column(name = "meeting_title"))
    @AttributeOverride(name = "task_description", column = @Column(name = "description"))
    TaskPoint meeting;

}
