package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TaskType {
    @Column(name = "type_name")
    private String typeName;
}
