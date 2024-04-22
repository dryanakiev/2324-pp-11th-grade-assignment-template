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
    private Junction<User, ToDo> junction = new Junction<>();

    @AttributeOverrides({
            @AttributeOverride(name="entity1.id",
                    column=@Column(name="custom_user_id")),
            @AttributeOverride(name="entity2.id",
                    column=@Column(name="custom_to_do_id"))
    })

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
