package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;

@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends BaseModel {

    @Embedded
    private PersonalInfo personalInfo;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private User user;

}
