package project.crm.DAL.models;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;
import project.crm.DAL.models.components.SocialNetworks;

@Entity
@Table(name = "Customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseModel {
    @Embedded
    private PersonalInfo personalInfo;

    @Embedded
    private SocialNetworks socialNetworks;

}
