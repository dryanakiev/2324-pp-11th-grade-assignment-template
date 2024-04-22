package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskType;

@Entity
@Table(name = "ToDoType")
public class ToDoType extends BaseModel {

    @Embedded
    @AttributeOverride(name = "type_name", column = @Column(name = "to_do_type"))
    private TaskType toDoType;
}
