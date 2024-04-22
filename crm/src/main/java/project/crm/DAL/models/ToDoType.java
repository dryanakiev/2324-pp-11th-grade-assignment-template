package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskType;

@Entity
@Table(name = "ToDoType")
public class ToDoType extends BaseModel {

    public ToDoType(Long id, boolean isDeleted, TaskType toDoType) {
        super(id, isDeleted);
        this.toDoType = toDoType;
    }

    public ToDoType() {
    }

    @Embedded
    @AttributeOverride(name = "type_name", column = @Column(name = "to_do_type"))
    private TaskType toDoType;

    public TaskType getToDoType() {
        return toDoType;
    }

    public void setToDoType(TaskType toDoType) {
        this.toDoType = toDoType;
    }

    @Override
    public String toString() {
        return "ToDoType{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", toDoType=" + toDoType +
                '}';
    }
}
