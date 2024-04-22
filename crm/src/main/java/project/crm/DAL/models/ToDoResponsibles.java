package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "ToDoResponsibles")
public class ToDoResponsibles extends BaseModel {

    public ToDoResponsibles(Long id, boolean isDeleted, User user, ToDo todo) {
        super(id, isDeleted);
        this.user = user;
        this.todo = todo;
    }

    public ToDoResponsibles() {
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private ToDo todo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ToDo getTodo() {
        return todo;
    }

    public void setTodo(ToDo todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "ToDoResponsibles{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", user=" + user +
                ", todo=" + todo +
                '}';
    }
}
