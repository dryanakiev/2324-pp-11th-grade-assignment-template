package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.Junction;

@Entity
@Table(name = "ToDoResponsibles")
public class ToDoResponsibles extends BaseModel {

    public ToDoResponsibles(Long id, boolean isDeleted, Junction<User, ToDo> junction) {
        super(id, isDeleted);
        this.junction = junction;
    }

    public ToDoResponsibles() {

    }

    @Embedded
    @AttributeOverride(name = "entity1_id", column = @Column(name = "product_type_name"))
    @AttributeOverride(name = "entity2_id", column = @Column(name = "product_type_name"))
    private Junction<User, ToDo> junction;

    public Junction<User, ToDo> getJunction() {
        return junction;
    }

    public void setJunction(Junction<User, ToDo> junction) {
        this.junction = junction;
    }

    @Override
    public String toString() {
        return "ToDoResponsibles{" +
                "junction=" + junction +
                '}';
    }
}
