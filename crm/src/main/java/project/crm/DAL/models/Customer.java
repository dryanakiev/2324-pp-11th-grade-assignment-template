package project.crm.DAL.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;
import project.crm.DAL.models.components.SocialNetworks;

@Entity
@Table(name = "Customers")
public class Customer extends BaseModel {
    private PersonalInfo personalInfo;

    private SocialNetworks socialNetworks;

    public Customer(Long id, String firstName, String lastName, String email, String phone,
                    String facebookLink, String twitterLink, String linkedinLink, String instagramLink,
                    boolean isDeleted) {
        super(id, isDeleted);
        this.personalInfo = new PersonalInfo(firstName, lastName, email, phone);
        this.socialNetworks = new SocialNetworks(facebookLink, twitterLink, linkedinLink, instagramLink);
    }
}
