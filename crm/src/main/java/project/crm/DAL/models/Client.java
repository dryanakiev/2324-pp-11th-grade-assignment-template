package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;

@Entity
@Table(name = "Client")
public class Client extends BaseModel {

    public Client(Long id, boolean isDeleted, PersonalInfo personalInfo) {
        super(id, isDeleted);
        this.personalInfo = personalInfo;
    }

    public Client() {}

    @Embedded
    private PersonalInfo personalInfo;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private User user;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", personalInfo=" + personalInfo +
                '}';
    }
}
