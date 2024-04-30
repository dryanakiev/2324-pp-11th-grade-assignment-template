package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskPoint;
import project.crm.DAL.models.components.TaskType;

@Entity
@Table(name = "ToDo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo extends BaseModel {

    @Embedded
    @AttributeOverride(name = "date", column = @Column(name = "deadline"))
    private TaskPoint task;

    @ManyToOne
    @JoinColumn(name = "to_do_type_id", referencedColumnName = "id")
    private ToDoType toDoType;

}
