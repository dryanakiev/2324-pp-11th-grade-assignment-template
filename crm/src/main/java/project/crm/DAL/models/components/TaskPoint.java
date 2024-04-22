package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Timestamp;

@Embeddable
public class TaskPoint {

    public TaskPoint(String name, String description, Timestamp date, TaskType taskType) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public TaskPoint() {

    }

    @Column(name = "task_name")
    private String name;

    @Column(name = "task_description")
    private String description;

    @Column(name = "date")
    private Timestamp date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TaskPoint{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}