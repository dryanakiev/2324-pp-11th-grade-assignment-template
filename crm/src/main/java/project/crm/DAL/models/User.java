package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.Authentication;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.PersonalInfo;


@Entity
@Table(name = "Users")
public class User extends BaseModel {

    public User(Long id, String firstName, String lastName, String email, String phone,
                String username, String password, Role role, boolean isDeleted) {
        super(id, isDeleted);
        this.authentication = new Authentication(username, password);
        this.personalInfo = new PersonalInfo(firstName, lastName, email, phone);
        this.role = role;
    }

    public User() {

    }

    @Embedded
    private Authentication authentication;

    @Embedded
    private PersonalInfo personalInfo;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", authentication=" + authentication +
                ", personalInfo=" + personalInfo +
                '}';
    }
}

