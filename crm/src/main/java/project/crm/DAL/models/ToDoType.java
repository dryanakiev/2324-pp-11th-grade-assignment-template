package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskType;

@Entity
@Table(name = "ToDoType")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoType extends BaseModel {

    @Embedded
    @AttributeOverride(name = "type_name", column = @Column(name = "to_do_type"))
    private TaskType toDoType;

}
