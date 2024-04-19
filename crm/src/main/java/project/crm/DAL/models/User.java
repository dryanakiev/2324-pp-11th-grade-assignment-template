package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.Authentication;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;


@Entity
@Table(name = "Users")
public class User extends BaseModel {

    public User(Long id, String firstName, String lastName, String email, String phone,
                String username, String password, boolean isDeleted) {
        super(id, isDeleted);
        this.authentication = new Authentication(username, password);
        this.personalInfo = new PersonalInfo(firstName, lastName, email, phone);
    }

    public User() {

    }

    @Embedded
    private Authentication authentication;

    @Embedded
    private PersonalInfo personalInfo;

}

