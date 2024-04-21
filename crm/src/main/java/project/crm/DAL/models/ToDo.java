package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.TaskPoint;

@Entity
@Table(name = "ToDo")
public class ToDo extends BaseModel {

    public ToDo(Long id, boolean isDeleted, TaskPoint task) {
        super(id, isDeleted);
        this.task = task;
    }

    public ToDo() {

    }

    @Embedded
    @AttributeOverride(name = "date", column = @Column(name = "deadline"))
    private TaskPoint task;

    public TaskPoint getTask() {
        return task;
    }

    public void setTask(TaskPoint task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + getId() +
                "isDeleted=" + isDeleted() +
                ", task=" + task +
                '}';
    }
}
