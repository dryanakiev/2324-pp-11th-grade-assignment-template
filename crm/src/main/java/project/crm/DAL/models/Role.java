package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "roles")
public class Role extends BaseModel {

    public Role(Long id, boolean isDeleted, String name) {
        super(id, isDeleted);
        this.name = name;
    }

    public Role() {

    }

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}