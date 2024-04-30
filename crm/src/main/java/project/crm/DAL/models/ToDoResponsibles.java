package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "ToDoResponsibles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoResponsibles extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private ToDo todo;

}
